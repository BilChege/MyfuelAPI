/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

import java.util.Collection;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbs
 */

@Repository
public class FuelPackage {
    
    private int id;
    private double amount;
    private int expirydays;
    private int points;
    private double priceOfPackage;
    private String typeOfPackage;
    private Collection<MobilePurchase> purchases;

    public FuelPackage() {
    }

    public FuelPackage(int id, double amount, double priceOfPackage, String typeOfPackage) {
        this.id = id;
        this.amount = amount;
        this.priceOfPackage = priceOfPackage;
        this.typeOfPackage = typeOfPackage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    

    public int getExpirydays() {
        return expirydays;
    }

    public void setExpirydays(int expirydays) {
        this.expirydays = expirydays;
    }   

    public double getAmount() {
        return amount;
    }

    public Collection<MobilePurchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Collection<MobilePurchase> purchases) {
        this.purchases = purchases;
    }
    
    

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPriceOfPackage() {
        return priceOfPackage;
    }

    public void setPriceOfPackage(double priceOfPackage) {
        this.priceOfPackage = priceOfPackage;
    }

    public String getTypeOfPackage() {
        return typeOfPackage;
    }

    public void setTypeOfPackage(String typeOfPackage) {
        this.typeOfPackage = typeOfPackage;
    }    

    @Override
    public String toString() {
        return "FuelPackage{" + "id=" + id + ", amount=" + amount + ", expirydays=" + expirydays + ", points=" + points + ", priceOfPackage=" + priceOfPackage + ", typeOfPackage=" + typeOfPackage + ", purchases=" + purchases + '}';
    }  
    
}
