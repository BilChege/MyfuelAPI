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
public class MobileUser {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String pin;
    private String accountPassword;
    private Balances balances;
    private Collection<MobileVehicle> vehicles;
    private Collection<MobilePurchase> purchases;
    private Collection<FuelCar> usages;

    public MobileUser() {
    }

    public MobileUser(int id, String firstName, String lastName, String phone, String email, String accountPassword) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.accountPassword = accountPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Collection<FuelCar> getUsages() {
        return usages;
    }

    public void setUsages(Collection<FuelCar> usages) {
        this.usages = usages;
    }

    public Balances getBalances() {
        return balances;
    }

    public void setBalances(Balances balances) {
        this.balances = balances;
    }   

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }   

    public Collection<MobileVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<MobileVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Collection<MobilePurchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Collection<MobilePurchase> purchases) {
        this.purchases = purchases;
    }    

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Override
    public String toString() {
        return "MobileUser{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + ", pin=" + pin + ", accountPassword=" + accountPassword + ", balances=" + balances + ", vehicles=" + vehicles + ", purchases=" + purchases + ", usages=" + usages + '}';
    }
        
}
