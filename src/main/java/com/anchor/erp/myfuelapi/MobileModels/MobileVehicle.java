/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileModels;

//import com.anchor.erp.myfuelapi.Domain.Mileage;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbs
 */

@Repository
public class MobileVehicle {
    
    private int id;
    @JsonProperty("regno")
    private String regno;
    @JsonProperty("make")
    private String make;
    @JsonProperty("owner")
    private MobileUser owner;
    @JsonProperty("CCs")
    private String CCs;
    private int makeid;
    private int modelid;
    @JsonProperty("enginetype")
    private String enginetype;
    private boolean active;
    private Collection<FuelCar> fuelingInstances;

    public MobileVehicle(int id, String regno, String make, MobileUser owner, String CCs, String engineType, Collection<FuelCar> fuelingInstances) {
        this.id = id;
        this.regno = regno;
        this.make = make;
        this.owner = owner;
        this.CCs = CCs;
        this.enginetype = engineType;
        this.fuelingInstances = fuelingInstances;
    }

    

    public MobileVehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCCs() {
        return CCs;
    }

    public int getMakeid() {
        return makeid;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    

    public void setMakeid(int makeid) {
        this.makeid = makeid;
    }

    public int getModelid() {
        return modelid;
    }

    public void setModelid(int modelid) {
        this.modelid = modelid;
    }
    
    

    public void setCCs(String CCs) {
        this.CCs = CCs;
    }   

    public String getRegno() {
        return regno;
    }

    public String getEngineType() {
        return enginetype;
    }

    public void setEngineType(String engineType) {
        this.enginetype = engineType;
    }
    
    

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public MobileUser getOwner() {
        return owner;
    }

    public void setOwner(MobileUser owner) {
        this.owner = owner;
    }

    public Collection<FuelCar> getFuelingInstances() {
        return fuelingInstances;
    }

    public void setFuelingInstances(Collection<FuelCar> fuelingInstances) {
        this.fuelingInstances = fuelingInstances;
    }

    @Override
    public String toString() {
        return "MobileVehicle{" + "id=" + id + ", regno=" + regno + ", make=" + make + ", owner=" + owner + ", CCs=" + CCs + ", makeid=" + makeid + ", modelid=" + modelid + ", enginetype=" + enginetype + ", active=" + active + ", fuelingInstances=" + fuelingInstances + '}';
    }  

}
