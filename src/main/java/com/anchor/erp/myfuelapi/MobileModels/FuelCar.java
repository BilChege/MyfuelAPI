/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

import com.anchor.erp.myfuelapi.MobileServices.DateAndTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbs
 */

@Repository
public class FuelCar {
    
    private int id;
    private double amount;
    @JsonDeserialize(using = DateAndTimeDeserializer.class)
    private Date dateFueled;
    private String stationid;
    private String feedBack;
    private MobileUser user;
    private MobileVehicle vehicle;
    private Balances balances;

    public FuelCar() {
    }

    public FuelCar(int id, double amount, Date dateFueled, String stationid, MobileUser user) {
        this.id = id;
        this.amount = amount;
        this.dateFueled = dateFueled;
        this.stationid = stationid;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public Balances getBalances() {
        return balances;
    }

    public void setBalances(Balances balances) {
        this.balances = balances;
    }    

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateFueled() {
        return dateFueled;
    }

    public MobileVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(MobileVehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    

    public void setDateFueled(Date dateFueled) {
        this.dateFueled = dateFueled;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public MobileUser getUser() {
        return user;
    }

    public void setUser(MobileUser user) {
        this.user = user;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }
    
    @Override
    public String toString() {
        return "FuelCar{" + "id=" + id + ", amount=" + amount + ", dateFueled=" + dateFueled + ", stationid=" + stationid + ", user=" + user + ", vehicle=" + vehicle + ", balances=" + balances + '}';
    }       
}
