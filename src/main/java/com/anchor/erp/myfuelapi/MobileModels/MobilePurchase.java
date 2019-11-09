/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

import com.anchor.erp.myfuelapi.MobileServices.DateAndTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbs
 */

@Repository
public class MobilePurchase {
    
    private int id;
    private MobileUser user;
    @JsonProperty("aPackage")
    private FuelPackage aPackage;
    @JsonDeserialize(using = DateAndTimeDeserializer.class)
    private Date datePurchased;
    @JsonDeserialize(using = DateAndTimeDeserializer.class)
    private Date expiryDate;
    private Balances balances;

    public MobilePurchase() {
    }

    public MobilePurchase(int id, MobileUser user, FuelPackage apackage, Date datePurchased, Date expiryDate) {
        this.id = id;
        this.user = user;
        this.aPackage = apackage;
        this.datePurchased = datePurchased;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MobileUser getUser() {
        return user;
    }

    public Balances getBalances() {
        return balances;
    }

    public void setBalances(Balances balances) {
        this.balances = balances;
    }   

    public void setUser(MobileUser user) {
        this.user = user;
    }

    public FuelPackage getApackage() {
        return aPackage;
    }

    public void setApackage(FuelPackage apackage) {
        this.aPackage = apackage;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "MobilePurchase{" + "id=" + id + ", user=" + user + ", aPackage=" + aPackage + ", datePurchased=" + datePurchased + ", expiryDate=" + expiryDate + ", balances=" + balances + '}';
    }
        
}
