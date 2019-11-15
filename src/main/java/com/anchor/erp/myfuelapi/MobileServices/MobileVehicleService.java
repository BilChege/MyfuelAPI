/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileServices;

import com.anchor.erp.myfuelapi.Domain.Costcenter;
import com.anchor.erp.myfuelapi.Domain.Dealer;
import com.anchor.erp.myfuelapi.Domain.FuelUsage;
import com.anchor.erp.myfuelapi.Domain.Smsnotification;
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
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bilchege
 */
@Transactional
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
    @Qualifier("smsnotificationService")
    private GenericService smsnotificationService;
    
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
        if (savedUsage != null) {
            Balances b = mobilePackageService.getBalances(fuelCar.getUser().getId());
            response.setBalances(b);            
            String attendanttel = null;
            if (dc.getAttendanttel() != null) {
                attendanttel = dc.getAttendanttel();
            } else if (dc.getAttendanttel1() != null) {
                attendanttel = dc.getAttendanttel1();
            } else if (dc.getAttendanttel2() != null) {
                attendanttel = dc.getAttendanttel2();
            }
            if (attendanttel != null) {
                Smsnotification smsnotification1 = new Smsnotification();
                smsnotification1.setCreatedate(new Date());
                smsnotification1.setMsgTo(attendanttel);
                smsnotification1.setMessage("Transaction Confirmed:\n Payment for fuel for vehicle "+savedUsage.getVehicle().getRegno()+" worth amount "+savedUsage.getAmount()+" Ksh has been recieved through MyFuel prepay Account for User "+u.getFullname());
                smsnotification1.setPending(true);
                smsnotification1.setCreatedate(new Date());
                smsnotification1.setSent(false);
                smsnotification1.setError(false);
                smsnotification1.setDelivered(false);
                smsnotification1.setRetrycount(0);
                smsnotification1.setRejected(false);
                smsnotificationService.save(smsnotification1);
            }
            Smsnotification smsnotification = new Smsnotification();
            smsnotification.setMsgTo("+254"+u.getPhone());
            smsnotification.setMessage("Transaction Confirmed: \nYou have Successfully refuelled vehicle : "+savedUsage.getVehicle().getRegno()+"\n with fuel worth amount "+savedUsage.getAmount()+" Ksh\n At Station : "+dc.getDealername()+"\n From your MyFuel prepay Account.");
            smsnotification.setPending(true);
            smsnotification.setCreatedate(new Date());
            smsnotification.setSent(false);
            smsnotification.setError(false);
            smsnotification.setDelivered(false);
            smsnotification.setRetrycount(0);
            smsnotification.setRejected(false);
            smsnotificationService.save(smsnotification);
        }       
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
    
    public FuelCar giveUserFeeBack(FuelCar fuelCar){
        FuelUsage fuelUsage = (FuelUsage) fuelUsageService.findbyId(fuelCar.getId());
        fuelUsage.setCustomerFeedback(fuelCar.getFeedBack());
        fuelUsage.setTxndate(new Date());
        FuelUsage updated = (FuelUsage) fuelUsageService.merge(fuelUsage);
        FuelCar response = new FuelCar();
        if (updated != null) {
            response.setId(updated.getId());
        }
        return response;
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
    
    public List<FuelCar> getUserUsages(int userid){
        Users users = (Users) usersService.findbyId(userid);
        List<FuelCar> fuelCars = new ArrayList<>();
        Set<FuelUsage> fuelUsages = users.getFuelUsagesForUserId();
        if (fuelUsages.size() > 0) {
            for (FuelUsage fuelUsage : fuelUsages) {
                FuelCar fuelCar = new FuelCar();
                fuelCar.setId(fuelUsage.getId());
                fuelCar.setAmount(fuelUsage.getAmount());
                fuelCar.setBalances(mobilePackageService.getBalances(userid));
                fuelCar.setDateFueled(fuelUsage.getCreatedate());
                fuelCar.setStationid(fuelUsage.getDealer().getStationid()+" ("+fuelUsage.getDealer().getDealername()+")");
                Vehicle vehicle = fuelUsage.getVehicle();
                MobileVehicle mobileVehicle = new MobileVehicle();
                mobileVehicle.setId(vehicle.getId());
                mobileVehicle.setRegno(vehicle.getRegno());
                fuelCar.setVehicle(mobileVehicle);
                fuelCars.add(fuelCar);
            }
        }
        return fuelCars;
    }
}
