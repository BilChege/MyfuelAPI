/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileServices;

import com.anchor.erp.myfuelapi.Domain.FuelUsage;
import com.anchor.erp.myfuelapi.Domain.PackagePurchase;
import com.anchor.erp.myfuelapi.Domain.Promotion;
import com.anchor.erp.myfuelapi.Domain.Roles;
import com.anchor.erp.myfuelapi.Domain.UserRedemptions;
import com.anchor.erp.myfuelapi.Domain.Users;
import com.anchor.erp.myfuelapi.Domain.Vehicle;
import com.anchor.erp.myfuelapi.MobileModels.Balances;
import com.anchor.erp.myfuelapi.MobileModels.MobileRedemption;
import com.anchor.erp.myfuelapi.MobileModels.MobileUser;
import com.anchor.erp.myfuelapi.MobileModels.MobileVehicle;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author nbs
 */

@Service
public class MobileUserService {
    
    @Autowired
    @Qualifier("usersService")
    private GenericService usersService;
    
    @Autowired
    @Qualifier("rolesService")
    private GenericService rolesService;
    
    @Autowired
    @Qualifier("packagePurchaseService")
    private GenericService packagePurchaseService;
    
    @Autowired
    @Qualifier("fuelUsageService")
    private GenericService fuelUsageService;
    
    @Autowired
    @Qualifier("userRedemptionsService")
    private GenericService userRedemptionsService;
    
    @Autowired
    @Qualifier("promotionService")
    private GenericService promotionService;
    
    @Autowired
    private MobilePackageService mobilePackageService;
    
    public MobileUser adduser (MobileUser user){
        
        Users dbuser = new Users();
        dbuser.setFullname(user.getFirstName()+" "+user.getLastName());
        dbuser.setEmail(user.getEmail());
        dbuser.setUserpass(user.getAccountPassword());
        dbuser.setActive(true);
        dbuser.setPin(user.getPin());
        dbuser.setApproved(true);
        dbuser.setApprovedate(new Date());
        dbuser.setUsername(user.getEmail());
        dbuser.setEncrypted(false);
        dbuser.setPhone(user.getPhone());
        dbuser.setFinanceHod(false);
        dbuser.setCreatedate(new Date());
        dbuser.setIntrash(false);
        dbuser.setLocked(false);
        dbuser.setStoresHod(false);
        dbuser.setRoles((Roles) rolesService.findbyId(2));
        dbuser.setPurchasesHod(false);
        dbuser.setSalesHod(false);
        Users savedUser = (Users) usersService.save(dbuser);
        MobileUser response = new MobileUser();
        
        if (savedUser != null && !savedUser.equals(null)){
            
            
            response.setId(savedUser.getId());
            String[] names = savedUser.getFullname().split("\\s+");
            response.setFirstName(names[0]);
            response.setLastName(names[1]);
            response.setPin(savedUser.getPin());
            response.setEmail(savedUser.getEmail());
            response.setAccountPassword(savedUser.getUserpass());
            
        }
        
        return response;
        
    }
    
    public MobileUser signupbyemail(String username){
        
        System.out.println("Email Input at Service !!!!!!!!!!!      @@@@@@@@@@@@        "+username);
        
        String hql = "select u from Users u where u.email = '"+username+"'";
        List<Users> requested = (List<Users>) usersService.findByQuery(hql);
        Users requesteduser = requested.get(0);
        MobileUser response = new MobileUser();
        response.setId(requesteduser.getId());
        String[] names = requesteduser.getFullname().split("\\s+");
        response.setFirstName(names[0]);
        response.setLastName(names[1]);
        response.setEmail(requesteduser.getEmail());
        response.setAccountPassword(requesteduser.getUserpass());
        response.setPhone(requesteduser.getPhone());
        response.setPin(requesteduser.getPin());
        Set<Vehicle> vehicles = requesteduser.getVehiclesForCreatedby();      
        
        List<MobileVehicle> mobileVehicles = new ArrayList<>();
        for (Vehicle v: vehicles){
            
            MobileVehicle vehicle = new MobileVehicle();
            vehicle.setId(v.getId());
            vehicle.setRegno(v.getRegno());
            vehicle.setEngineType(v.getEngineType());
            vehicle.setActive(v.isActive());
            if (v.getVehiclemake() != null) {
                vehicle.setMakeid(v.getVehiclemake().getId());
            }
            if (v.getVehiclemodel() != null) {
                vehicle.setModelid(v.getVehiclemodel().getId());
            }
            vehicle.setCCs(String.valueOf(v.getCcs()));
            vehicle.setMake(v.getMake());
            mobileVehicles.add(vehicle);
        }
        response.setVehicles(mobileVehicles);
        response.setBalances(mobilePackageService.getBalances(requesteduser.getId()));
        return response;    
        
    }
    
    public MobileUser updateuserdetails (MobileUser mobileUser){
        Users user = (Users) usersService.findbyId(mobileUser.getId());
        user.setId(mobileUser.getId());
        user.setUserpass(mobileUser.getAccountPassword());
        user.setPin(mobileUser.getPin());
        
        Users updateduser = (Users) usersService.merge(user);
        MobileUser response = new MobileUser();
        if (updateduser != null){
            
            response.setId(updateduser.getId());
            String [] names = updateduser.getFullname().split("\\s+");
            response.setFirstName(names [0]);
            response.setLastName(names [1]);
            response.setEmail(updateduser.getEmail());
            response.setPhone(updateduser.getPhone());
            response.setAccountPassword(updateduser.getUserpass());
            response.setPin(updateduser.getPin());
        }
        return response; 
    }
    
    public Balances redeempointsforpromo(MobileRedemption mobileRedemption){
        System.out.println("Offer ID of offer recieved: ######## @@@@@@@  "+mobileRedemption.getOffer().getId());
        UserRedemptions redemption = new UserRedemptions();
        redemption.setPromotion((Promotion) promotionService.findbyId(mobileRedemption.getOffer().getId()));        
        redemption.setUsers((Users) usersService.findbyId(mobileRedemption.getUser().getId()));
        redemption.setDateRedeemed(mobileRedemption.getDatepurches());
        
        UserRedemptions saveUserRedemption = (UserRedemptions) userRedemptionsService.save(redemption);
        Users u = (Users) usersService.findbyId(mobileRedemption.getUser().getId());
        Set<PackagePurchase> purchases = (Set<PackagePurchase>) u.getPackagePurchases();
        Set<FuelUsage> usages = (Set<FuelUsage>) u.getFuelUsagesForUserId();
        Set<UserRedemptions> redemptionses = (Set<UserRedemptions>) u.getUserRedemptionses();
        
        Balances b = null;
        if (saveUserRedemption != null){
            b = new Balances();
            
            double totalbundlepurchase = 0;
            double totalcashpurchases = 0;
            int totalpointspurchased = 0;
            for (PackagePurchase p: purchases){
                totalbundlepurchase += Double.parseDouble(p.getBundle().getBundlename());
                totalcashpurchases += p.getBundle().getBundlevalue();
                totalpointspurchased += p.getBundle().getPoints();
            }
            
            double totalbundleusages = 0;
            double totalcashusages = 0;            
            for (FuelUsage fu:usages){
                totalcashusages += fu.getAmount();
                totalbundleusages += fu.getAmount()/10;
            }           
            int totalpointsused = 0;
            for (UserRedemptions ur: redemptionses){
                totalpointsused += ur.getPromotion().getPoints();
            }
            b.setBundle(totalbundlepurchase - totalbundleusages);
            b.setAccount(totalcashpurchases - totalcashusages);
            b.setPoints(totalpointspurchased - totalpointsused);
        }
        return b;
    }
    
    public Balances getUserBalances(int id){        
        return mobilePackageService.getBalances(id);
    }
    
    public MobileUser verifySystemUser(String phone){
        String query = "select u.* from users u where u.phone = '"+phone+"'";
        List<Users> userses = usersService.findbySqlQuery(query);
        Users user = null;
        MobileUser mobileUser = new MobileUser();
        if (!userses.isEmpty()) {
           user = userses.get(0);
        }
        if (user != null) {            
            mobileUser.setId(user.getId());
            String name = user.getFullname();
            String[] names = name.split("\\s+");
            mobileUser.setFirstName(names[0]);
            mobileUser.setLastName(names[0]);
            mobileUser.setEmail(user.getEmail());
        }
        return mobileUser;
    }
    
}
