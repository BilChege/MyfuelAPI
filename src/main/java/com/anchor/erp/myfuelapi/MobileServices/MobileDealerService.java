/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileServices;

import com.anchor.erp.myfuelapi.Domain.Dealer;
import com.anchor.erp.myfuelapi.MobileModels.MobileDealers;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author nbs
 */

@Service
public class MobileDealerService {
    
    @Autowired
    @Qualifier("dealerService")
    private GenericService dealerService;
    
    public List<MobileDealers> allDealers(){
        
        List<Dealer> dealers = (List<Dealer>) dealerService.findAll();
        List<MobileDealers> response = new ArrayList<>();
        for (Dealer d: dealers){
            MobileDealers mobileDealer = new MobileDealers();
            mobileDealer.setId(d.getId());
            mobileDealer.setName(d.getDealername());
            String [] coordinates = d.getGps().split(",");
            mobileDealer.setLatitude(Double.parseDouble(coordinates[0]));
            mobileDealer.setLongitude(Double.parseDouble(coordinates[1]));
            response.add(mobileDealer);
        }
        return response;
    }
    
}
