/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

import com.anchor.erp.myfuelapi.MobileServices.DateAndTimeDeserializer;
import com.anchor.erp.myfuelapi.MobileServices.DateAndTimeSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;

/**
 *
 * @author nbs
 */
public class OffersForMobile {
    
    private int id;
    private String promoname;
    private String promodesc;
    private int points;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expiry;

    public OffersForMobile() {
    }

    public OffersForMobile(int id, String promoname, String promodesc, int points, Date expiry) {
        this.id = id;
        this.promoname = promoname;
        this.promodesc = promodesc;
        this.points = points;
        this.expiry = expiry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromoname() {
        return promoname;
    }

    public void setPromoname(String promoname) {
        this.promoname = promoname;
    }

    public String getPromodesc() {
        return promodesc;
    }

    public void setPromodesc(String promodesc) {
        this.promodesc = promodesc;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "OffersForMobile{" + "id=" + id + ", promoname=" + promoname + ", promodesc=" + promodesc + ", points=" + points + ", expiry=" + expiry + '}';
    }
    
}
