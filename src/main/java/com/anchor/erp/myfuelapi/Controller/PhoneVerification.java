/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.Controller;

import com.africastalking.AfricasTalking;
import com.africastalking.Logger;
import com.africastalking.SmsService;
import com.africastalking.sms.Recipient;
import com.anchor.erp.myfuelapi.Domain.Smsnotification;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author nbs
 */

@Controller
public class PhoneVerification {
    
    @Autowired
    @Qualifier("smsnotificationService")
    private GenericService smsnotificationService;
    
    @RequestMapping(value = "/verifyphone/{phone_number}",method = RequestMethod.POST)
    public @ResponseBody String verifyphone(@PathVariable("phone_number") String phone) throws IOException{
        int code = (new Random().nextInt(1000000-100000))+100000;
        Smsnotification smsnotification = new Smsnotification();
        smsnotification.setMsgTo("+254"+phone);
        smsnotification.setMessage(String.valueOf(code));
        smsnotification.setPending(true);
        smsnotification.setCreatedate(new Date());
        smsnotification.setSent(false);
        smsnotification.setError(false);
        smsnotification.setDelivered(false);
        smsnotification.setRetrycount(0);
        smsnotification.setRejected(false);
        Smsnotification savedSmsnotification = (Smsnotification) smsnotificationService.save(smsnotification);
        String _response = null;
        if (savedSmsnotification != null){
            _response = String.valueOf(code);
        }else{
            _response = "SMS Verification failure";
        }
        return _response;
    }
    
    @RequestMapping(value = "/mpesa",method = RequestMethod.POST)
    public void callback(){
        System.out.println("@@@@@@@@@@@@@@@@   CALLBACK INVOKED !!!!!!!!!!!  ");
    }
    
}
