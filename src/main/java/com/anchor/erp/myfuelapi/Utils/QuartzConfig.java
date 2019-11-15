/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.Utils;

/**
 *
 * @author user
 */
//import com.anchor.erp.Bean.Common.CloseContractJobSchedule;
import java.io.IOException;
import java.util.Properties;
import javax.annotation.PostConstruct;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfig {

    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        log.debug("QuartzConfig initialized.");
    }

    @Bean
    public SchedulerFactoryBean quartzScheduler() {
        SchedulerFactoryBean quartzScheduler = new SchedulerFactoryBean();
        quartzScheduler.setOverwriteExistingJobs(true);
        quartzScheduler.setSchedulerName("anchor-quartz-scheduler");
        // custom job factory of spring with DI support for @Autowired!
        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        quartzScheduler.setJobFactory(jobFactory);
        quartzScheduler.setQuartzProperties(quartzProperties());
        Trigger[] triggers = {procesoMQTrigger().getObject(), processSMSTrigger().getObject()};
        quartzScheduler.setTriggers(triggers);
        quartzScheduler.setStartupDelay(8);
        return quartzScheduler;
    }

    @Bean
    public JobDetailFactoryBean procesoMQJob() {
        JobDetailFactoryBean jobDetailFactory = new JobDetailFactoryBean();
        jobDetailFactory.setJobClass(EmailJobSchedule.class);
        jobDetailFactory.setGroup("notifications");
        jobDetailFactory.setName("EMAIL Notification Schedule");
        jobDetailFactory.setDurability(true);
        return jobDetailFactory;
    }

    @Bean
    public CronTriggerFactoryBean procesoMQTrigger() {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(procesoMQJob().getObject());
        cronTriggerFactoryBean.setCronExpression("0 0/2 * * * ?");
        cronTriggerFactoryBean.setGroup("notifications");
        return cronTriggerFactoryBean;
    }

    @Bean
    public JobDetailFactoryBean processSMSJob() {
        JobDetailFactoryBean jobDetailFactory = new JobDetailFactoryBean();
        jobDetailFactory.setJobClass(SmsJobScheduler.class);
        jobDetailFactory.setGroup("notifications");
        jobDetailFactory.setDurability(true);
        jobDetailFactory.setName("SMS Notification Schedule");
        return jobDetailFactory;
    }

    @Bean
    public CronTriggerFactoryBean processSMSTrigger() {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(processSMSJob().getObject());
        cronTriggerFactoryBean.setCronExpression("0 0/1 * * * ?");
        cronTriggerFactoryBean.setGroup("notifications");

        return cronTriggerFactoryBean;
    }

    @Bean
    public Properties quartzProperties() {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        Properties properties = null;
        try {
            propertiesFactoryBean.afterPropertiesSet();
            properties = propertiesFactoryBean.getObject();

        } catch (IOException e) {
            log.error("Cannot load quartz.properties.");
        }

        return properties;
    }
}
