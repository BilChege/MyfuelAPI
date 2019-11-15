/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

import com.anchor.erp.myfuelapi.MobileServices.DateAndTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;

/**
 *
 * @author Bilchege
 */
public class MobileRedemption {
    
    private int id;
    private OffersForMobile offer;
    private MobileUser user;
    private String stationId;
    @JsonDeserialize(using = DateAndTimeDeserializer.class)
    @JsonProperty("datepurchased")
    private Date datepurchased;

    public MobileRedemption(int id, OffersForMobile offer, MobileUser user, Date datepurches) {
        this.id = id;
        this.offer = offer;
        this.user = user;
        this.datepurchased = datepurches;
    }

    public MobileRedemption() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OffersForMobile getOffer() {
        return offer;
    }

    public void setOffer(OffersForMobile offer) {
        this.offer = offer;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Date getDatepurchased() {
        return datepurchased;
    }

    public void setDatepurchased(Date datepurchased) {
        this.datepurchased = datepurchased;
    }
    
    public MobileUser getUser() {
        return user;
    }

    public void setUser(MobileUser user) {
        this.user = user;
    }

    public Date getDatepurches() {
        return datepurchased;
    }

    public void setDatepurches(Date datepurches) {
        this.datepurchased = datepurches;
    }    

    @Override
    public String toString() {
        return "MobileRedemption{" + "id=" + id + ", offer=" + offer + ", user=" + user + ", datepurchased=" + datepurchased + '}';
    }
    
}
