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
import java.io.IOException;
import java.util.List;
import java.util.Random;
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
    
    @RequestMapping(value = "/verifyphone/{phone_number}",method = RequestMethod.POST)
    public @ResponseBody String verifyphone(@PathVariable("phone_number") String phone) throws IOException{
        int code = (new Random().nextInt(1000000-100000))+100000;
        String formatted = null;
        AfricasTalking.initialize("NetrixDev","064a79e520ca34f82f7dddcebd7628fc2f13dbe78cdd766579e3e5cd4c7234a4");
        SmsService smsService = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);
        AfricasTalking.setLogger(new Logger() {
            @Override
            public void log(String string, Object... os) {
                System.out.println(string);
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        if (phone.substring(0,1).equals("0")) formatted = phone.replace(phone.substring(0, 1), "");
        List<Recipient> response  = smsService.send(String.valueOf(code), new String[]{"+254"+phone}, true);
        System.out.println(phone);
        for (Recipient r:response){
            System.out.println(r.status+" "+r.number+" "+r.messageId+" "+r.cost);
        }
        String _response = null;
        if (response!=null){
            _response = String.valueOf(code);
        }else{
            _response = "SMS Verification failure";
        }
        return _response;
    }
    
}
