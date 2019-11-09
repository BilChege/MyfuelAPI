/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileServices;

import com.anchor.erp.myfuelapi.Domain.Costcenter;
import com.anchor.erp.myfuelapi.Domain.Dealer;
import com.anchor.erp.myfuelapi.Domain.FuelUsage;
import com.anchor.erp.myfuelapi.Domain.PackagePurchase;
import com.anchor.erp.myfuelapi.Domain.UserRedemptions;
import com.anchor.erp.myfuelapi.Domain.Users;
import com.anchor.erp.myfuelapi.Domain.Vehicle;
import com.anchor.erp.myfuelapi.Domain.Vehiclemake;
import com.anchor.erp.myfuelapi.Domain.Vehiclemodel;
import com.anchor.erp.myfuelapi.MobileModels.Balances;
import com.anchor.erp.myfuelapi.MobileModels.FuelCar;
import com.anchor.erp.myfuelapi.MobileModels.MobileVehicle;
import com.anchor.erp.myfuelapi.MobileModels.MobileVehicleMake;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bilchege
 */

@Service
public class MobileVehicleService {
    
    @Autowired
    @Qualifier("vehicleService")
    private GenericService vehicleService;
    
    @Autowired
    @Qualifier("usersService")
    private GenericService usersService;
        
    @Autowired
    @Qualifier("fuelUsageService")
    private GenericService fuelUsageService;
    
    @Autowired
    @Qualifier("dealerService")
    private GenericService dealerService;
    
    @Autowired
    @Qualifier("costcenterService")
    private GenericService costcenterService;
    
    @Autowired
    @Qualifier("vehiclemakeService")
    private GenericService vehiclemakeService;
    
    @Autowired
    @Qualifier("vehiclemodelService")
    private GenericService vehiclemodelService;
    
    @Autowired
    private MobilePackageService mobilePackageService;
               
    public MobileVehicle addVehicle(MobileVehicle mobileVehicle){
        
        Vehicle vehicle = new Vehicle();
        vehicle.setUsersByCreatedby((Users) usersService.findbyId(mobileVehicle.getOwner().getId()));
        vehicle.setRegno(mobileVehicle.getRegno());
        vehicle.setMake(mobileVehicle.getMake());
        vehicle.setEngineType(mobileVehicle.getEngineType());
        vehicle.setCreatedate(new java.util.Date());
        vehicle.setTxndate(new Date());
        vehicle.setVehiclemake((Vehiclemake) vehiclemakeService.findbyId(mobileVehicle.getMakeid()));
        vehicle.setVehiclemodel((Vehiclemodel) vehiclemodelService.findbyId(mobileVehicle.getModelid()));
        vehicle.setCcs(Integer.parseInt(mobileVehicle.getCCs()));
        vehicle.setApproved(true);
        vehicle.setActive(true);
        
        System.out.println("Cubic Centimetres of Engine for Vehicle inserted @@@@@@@@@@@@@@@@@@       "+mobileVehicle.getCCs());
        
        Vehicle savedVehicle = (Vehicle) vehicleService.save(vehicle);
        
        
        MobileVehicle response = new MobileVehicle();
        if (savedVehicle != null){            
            response.setId(savedVehicle.getId());
            response.setMake(savedVehicle.getMake());
            response.setRegno(savedVehicle.getRegno());
            response.setMakeid(savedVehicle.getVehiclemake().getId());
            response.setModelid(savedVehicle.getVehiclemodel().getId());
            response.setCCs(String.valueOf(savedVehicle.getCcs()));
            response.setEngineType(savedVehicle.getEngineType());
            response.setOwner(mobileVehicle.getOwner());
            response.setActive(savedVehicle.isActive());
        }
        return response;
    }
    
    public MobileVehicle updateVehicle(MobileVehicle mobileVehicle){
        Vehicle vehicle = (Vehicle) vehicleService.findbyId(mobileVehicle.getId());
        MobileVehicle mobileVehicle1 = new MobileVehicle();
        vehicle.setRegno(mobileVehicle.getRegno());
        vehicle.setMake(mobileVehicle.getMake());
        vehicle.setEngineType(mobileVehicle.getEngineType());
        vehicle.setTxndate(new Date());
        vehicle.setVehiclemake((Vehiclemake) vehiclemakeService.findbyId(mobileVehicle.getMakeid()));
        vehicle.setVehiclemodel((Vehiclemodel) vehiclemodelService.findbyId(mobileVehicle.getModelid()));
        vehicle.setCcs(Integer.parseInt(mobileVehicle.getCCs()));
        if(!vehicle.isActive() && mobileVehicle.isActive()){
            Users user = (Users) usersService.findbyId(mobileVehicle.getOwner().getId());
            vehicle.setUsersByCreatedby(user);
        }
        vehicle.setActive(mobileVehicle.isActive());
        Vehicle updatedVehicle = (Vehicle) vehicleService.merge(vehicle);
        if (updatedVehicle != null) {            
            mobileVehicle1.setId(updatedVehicle.getId());
            mobileVehicle1.setMake(updatedVehicle.getMake());
            mobileVehicle1.setRegno(updatedVehicle.getRegno());
            mobileVehicle1.setMakeid(updatedVehicle.getVehiclemake().getId());
            mobileVehicle1.setModelid(updatedVehicle.getVehiclemodel().getId());
            mobileVehicle1.setCCs(String.valueOf(updatedVehicle.getCcs()));
            mobileVehicle1.setEngineType(updatedVehicle.getEngineType());
            mobileVehicle1.setOwner(mobileVehicle.getOwner());
            mobileVehicle1.setActive(updatedVehicle.isActive());
        }
        return mobileVehicle1;
    }
    
    public FuelCar fuelCar(FuelCar fuelCar){
        
        FuelUsage fuelUsage = new FuelUsage();
        fuelUsage.setVehicle((Vehicle) vehicleService.findbyId(fuelCar.getVehicle().getId()));
        fuelUsage.setUsersByUserId((Users) usersService.findbyId(fuelCar.getUser().getId()));
        fuelUsage.setTxndate(new Date());
        fuelUsage.setCreatedate(new Date());
        String hql = "select d from Dealer d where d.stationid = '"+fuelCar.getStationid()+"'";
        List<Dealer> d = (List<Dealer>) dealerService.findByQuery(hql);
        Dealer dc = d.get(0);
        fuelUsage.setDealer(dc);
        Costcenter c = (Costcenter) costcenterService.findbyId(dc.getId());
        fuelUsage.setAmount(fuelCar.getAmount());
        fuelUsage.setCostcenter(c);
        FuelUsage savedUsage = (FuelUsage) fuelUsageService.save(fuelUsage);
        Users u = (Users) usersService.findbyId(fuelCar.getUser().getId());
        
        FuelCar response = new FuelCar();
        Balances b = mobilePackageService.getBalances(fuelCar.getUser().getId());
        response.setBalances(b);
        return response;
    }
    
    public List<FuelCar> allusages(int userid){
        String hql = "select u from FuelUsage u LEFT JOIN u.usersByUserId us where us.id = "+userid;
        List<FuelUsage> usages = (List<FuelUsage>) fuelUsageService.findByQuery(hql);
        List<FuelCar> fcs = new ArrayList<>();
        
        for (FuelUsage usage: usages){
            FuelCar fc = new FuelCar();
            fc.setId(usage.getId());
            fc.setAmount(usage.getAmount());
            fc.setStationid(usage.getDealer().getStationid());
            MobileVehicle vehicle = new MobileVehicle();
            vehicle.setId(usage.getVehicle().getId());
            vehicle.setRegno(usage.getVehicle().getRegno());
            vehicle.setMake(usage.getVehicle().getMake());
            vehicle.setCCs(String.valueOf(usage.getVehicle().getCcs()));
            fc.setVehicle(vehicle);
            fcs.add(fc);
        }
        
        return fcs;
    }
    
    public List<MobileVehicleMake> allVehiclemakes(){
        List<Vehiclemake> vehiclemakes = (List<Vehiclemake>) vehiclemakeService.findAll();
        List<MobileVehicleMake> makes = new ArrayList<>();
        for (Vehiclemake vehiclemake: vehiclemakes){
            HashMap<Integer,String> models = new HashMap<>();
            Set<Vehiclemodel> vehiclemodels = vehiclemake.getVehiclemodels();
            for (Vehiclemodel vehiclemodel: vehiclemodels){
                models.put(vehiclemodel.getId(), vehiclemodel.getVehiclemodel());
            }
            
            MobileVehicleMake make = new MobileVehicleMake();
            make.setId(vehiclemake.getId());
            make.setVehiclemake(vehiclemake.getVehiclemake());
            make.setModels(models);
            makes.add(make);
        }
        return makes;
    }
    
}
