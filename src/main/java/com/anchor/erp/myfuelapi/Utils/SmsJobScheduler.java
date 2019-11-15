/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.Utils;

import com.africastalking.AfricasTalking;
import com.africastalking.Logger;
import com.africastalking.SmsService;
import com.africastalking.sms.Recipient;
import com.anchor.erp.myfuelapi.Domain.Smsnotification;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.criterion.Restrictions;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

/**
 *
 * @author nbs
 */

@Service
public class SmsJobScheduler implements Job{
    

    @Resource(name = "smsnotificationService")
    private GenericService smsnotificationService;

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        String username = "nbs";
//        String apiKey = "e5c9051114d17d514aac908b34c42c336e64e40453ef9f6bff1bdebcb62adba8";
        String apiKey = "5bde0257d376a22ea4bc4ca41669206e1552d76bd669f7e74739ff9796729c21";
        String from = "NETRIXBIZ";

        // Create a new instance of our awesome gateway class
        AfricasTalking.initialize(username, apiKey);
        SmsService smsService = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);
        AfricasTalking.setLogger(new Logger() {
            @Override
            public void log(String string, Object... os) {
                System.out.println(string);
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
//        AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey); 

        /**
         * ***********************************************************************************
         * NOTE: If connecting to the sandbox:
         *
         * 1. Use "sandbox" as the username 2. Use the apiKey generated from
         * your sandbox application
         * https://account.africastalking.com/apps/sandbox/settings/key 3. Add
         * the "sandbox" flag to the constructor
         *
         * AfricasTalkingGateway gateway = new AfricasTalkingGateway(username,
         * apiKey, "sandbox");
         * ************************************************************************************
         */
        List<Smsnotification> pendingSMS = smsnotificationService.findByCriterion(Restrictions.eq("pending", Boolean.TRUE),
                Restrictions.eq("sent", Boolean.FALSE),
                Restrictions.eq("error", Boolean.FALSE));
        for (Smsnotification sms : pendingSMS) {
            System.out.println("@@@@@@@@@@@@@@@@@  SMS FOUND : "+sms.getId()+" Message "+sms.getMessage());
            // Specify the numbers that you want to send to in a comma-separated list
            // Please ensure you include the country code (+254 for Kenya in this case)
            String msgTo = sms.getMsgTo();
            if (msgTo != null && !msgTo.startsWith("+")) {
                msgTo = "+" + msgTo;
            }
            String[] recipients = new String[]{msgTo};
            // And of course we want our recipients to know what we really do
            String message = sms.getMessage();

            // Thats it, hit send and we'll take care of the rest. Any errors will
            // be captured in the Exception class below
            try {
                List<Recipient> results = smsService.send(message, from, recipients, false);

                for (Recipient rc : results) {
                    String status = rc.status;
                    String mmesageID = rc.messageId;

                    sms.setMessageid(mmesageID);
                    sms.setCallbackStatus(status);
                    sms.setSent(true);
                    smsnotificationService.merge(sms);
                }
            } catch (Exception e) {
                System.err.println("Encountered an error while sending sms");
                if (sms.getRetrycount() >= 3) {
                    sms.setError(true);
                    sms.setPending(false);
                } else {
                    sms.setError(false);
                    sms.setPending(true);
                }
                sms.setRetrycount(sms.getRetrycount() + 1);
                sms.setSent(false);
                sms.setErrormsg("Error sending email \n" + e.getMessage());
                smsnotificationService.merge(sms);
            }
        }
    }
    
}
