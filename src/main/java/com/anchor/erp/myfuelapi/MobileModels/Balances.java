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
public class Balances {
    
    private double bundle;
    private double account;
    private int points;

    public Balances(double bundle, double account) {
        this.bundle = bundle;
        this.account = account;
    }

    public Balances() {
    }
    
    public double getBundle() {
        return bundle;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }   

    public void setBundle(double bundle) {
        this.bundle = bundle;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Balances{" + "bundle=" + bundle + ", account=" + account + ", points=" + points + '}';
    }  
    
}
