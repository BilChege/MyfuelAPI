/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileServices;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nbs
 */
public class DateAndTimeDeserializer extends JsonDeserializer<Date>{
    
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.ENGLISH);
    private SimpleDateFormat formatForfinal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        Date response = null;
        try {
            String str = jp.getValueAsString();
            System.out.println("INPUT DATE STRING IS :"+str);
            Date parsed = simpleDateFormat.parse(str);
            String forfinal = formatForfinal.format(parsed);
            response = formatForfinal.parse(forfinal);
            
            
        } catch (ParseException ex) {
            Logger.getLogger(DateAndTimeDeserializer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(response);
        return response;
    }
    
}
