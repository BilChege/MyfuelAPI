/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

/**
 *
 * @author nbs
 */
public class MobileDealers {
    
    private int id;
    private String name;
    private String stationid;
    private double latitude;
    private double longitude;

    public MobileDealers(int id, String name, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public MobileDealers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }   

    @Override
    public String toString() {
        return "MobileDealers{" + "id=" + id + ", name=" + name + ", stationid=" + stationid + ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }
    
}
