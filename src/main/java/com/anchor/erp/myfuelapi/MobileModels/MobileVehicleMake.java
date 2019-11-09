/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

import java.util.HashMap;

/**
 *
 * @author nbs
 */
public class MobileVehicleMake {
    
    private int id;
    private String vehiclemake;
    private HashMap<Integer,String> models;

    public MobileVehicleMake(int id, String vehiclemake, HashMap<Integer, String> models) {
        this.id = id;
        this.vehiclemake = vehiclemake;
        this.models = models;
    }

    public MobileVehicleMake() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehiclemake() {
        return vehiclemake;
    }

    public void setVehiclemake(String vehiclemake) {
        this.vehiclemake = vehiclemake;
    }

    public HashMap<Integer, String> getModels() {
        return models;
    }

    public void setModels(HashMap<Integer, String> models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "MobileVehicleMake{" + "id=" + id + ", vehiclemake=" + vehiclemake + ", models=" + models + '}';
    }
    
}
