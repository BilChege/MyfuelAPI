package com.anchor.erp.myfuelapi.Utils;

import com.anchor.erp.myfuelapi.Services.GenericService;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.MultiAction;

@Component
public class EmailJobSchedule extends MultiAction implements Job {

    Logger log = LoggerFactory.getLogger(EmailJobSchedule.this.getClass());
    
    @Autowired
    @Qualifier("sendEmailProtocal")        
    private SendEmailProtocal sendEmailProtocal;
    
    @Resource(name = "emailnotificationService")
    private GenericService emailnotificationService;

    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {

        sendEmailProtocal.sendMail();

    }

    @PostConstruct
    public void init() { 
    }
}
