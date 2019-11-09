/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.MobileServices;

import com.anchor.erp.myfuelapi.Domain.Bundle;
import com.anchor.erp.myfuelapi.Domain.FuelUsage;
import com.anchor.erp.myfuelapi.Domain.PackagePurchase;
import com.anchor.erp.myfuelapi.Domain.Promotion;
import com.anchor.erp.myfuelapi.Domain.Sambaza;
import com.anchor.erp.myfuelapi.Domain.UserRedemptions;
import com.anchor.erp.myfuelapi.Domain.Users;
import com.anchor.erp.myfuelapi.MobileModels.Balances;
import com.anchor.erp.myfuelapi.MobileModels.FuelPackage;
import com.anchor.erp.myfuelapi.MobileModels.MobilePurchase;
import com.anchor.erp.myfuelapi.MobileModels.MobileUser;
import com.anchor.erp.myfuelapi.MobileModels.OffersForMobile;
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
public class MobilePackageService {
    
    @Autowired
    @Qualifier("bundleService")
    private GenericService bundleService;
    
    @Autowired
    @Qualifier("packagePurchaseService")
    private GenericService packagePurchaseService;
    
    @Autowired
    @Qualifier("usersService")
    private GenericService usersService;
        
    @Autowired
    @Qualifier("promotionService")
    private GenericService promotionService;
    
    @Autowired
    @Qualifier("sambazaService")
    private GenericService sambazaService;
    
    public List<FuelPackage> allPackages(){
        List<Bundle> bundles = (List<Bundle>) bundleService.findAll();
        List<FuelPackage> fuelPackages = new ArrayList<>();
        for (Bundle b:bundles){
            FuelPackage f = new FuelPackage();
            f.setId(b.getId());
            f.setAmount(Double.valueOf(b.getBundlename()));
            f.setExpirydays(b.getExpirydays());
            f.setPriceOfPackage(Double.valueOf(b.getBundlevalue()));
            f.setTypeOfPackage(b.getDivision().getDivisionname());
            f.setPoints(b.getPoints());
            fuelPackages.add(f);
        }
        return fuelPackages;
    }
    
    public MobilePurchase addpurchase(MobilePurchase purchase){
        
        System.out.println("THIS IS THE ID OF THE SELECTED PACKAGE :"+purchase.getApackage().getId());
        
        MobileUser mobilebuyer = purchase.getUser();
        Users user = (Users) usersService.findbyId(mobilebuyer.getId());
        PackagePurchase purchasetosave = new PackagePurchase();
        Bundle choicefromuser = (Bundle) bundleService.findbyId(purchase.getApackage().getId());
        purchasetosave.setBundle(choicefromuser);
        purchasetosave.setUsers(user);
        purchasetosave.setDateofpurchase(purchase.getDatePurchased());
        purchasetosave.setExpirydate(purchase.getExpiryDate());
        PackagePurchase savedPurchase = (PackagePurchase) packagePurchaseService.save(purchasetosave);
        MobilePurchase response = new MobilePurchase();       
        if (savedPurchase != null && !savedPurchase.equals(null)){
            FuelPackage fp = new FuelPackage();
            fp.setAmount(Double.parseDouble(choicefromuser.getBundlename()));
            fp.setPriceOfPackage(choicefromuser.getBundlevalue());
            fp.setPoints(choicefromuser.getPoints());
            response.setId(savedPurchase.getId());
            response.setApackage(fp);
            response.setUser(purchase.getUser());
//            response.setDatePurchased(savedPurchase.getDateOfPurchase());
//            response.setExpiryDate(savedPurchase.getExpiryDate());
       
            Balances b = getBalances(mobilebuyer.getId());
            response.setBalances(b);
            
            }       
        return  response;
    }
    
    public List<OffersForMobile> getAllOffers(){
        List<Promotion> promotions = (List<Promotion>) promotionService.findAll();
        List<OffersForMobile> ofms = new ArrayList<>();
        for (Promotion p: promotions){
            OffersForMobile mobile = new OffersForMobile();
            mobile.setId(p.getId());
            mobile.setPromodesc(p.getPromotiondesc());
            mobile.setPromoname(p.getPromotionname());
            mobile.setPoints(p.getPoints());
            mobile.setExpiry(p.getExpirydate());
            ofms.add(mobile);
        }
        return ofms;
    }
    
    public Balances sambazaPackage(int sentfrom,String sentto,double amountSent){
        Users sender = (Users) usersService.findbyId(sentfrom);
        String query = "select u.* from users u where u.phone = '"+sentto+"'";
        List<Users> userses = usersService.findbySqlQuery(query);
        Users reciever = null;
        if (!userses.isEmpty()) {
            reciever = userses.get(0);
        }
        Sambaza sambaza = new Sambaza();
        sambaza.setUsersBySentFrom(sender);
        sambaza.setUsersBySentTo(reciever);
        sambaza.setTxnDate(new Date());
        sambaza.setAmtSent(amountSent);
        Sambaza savedSambaza = (Sambaza) sambazaService.save(sambaza);
        Balances balances = null;
        if (savedSambaza != null) {
            balances = getBalances(sentfrom);
        }
        return balances;
    }

    public Balances getBalances(int id) {
        Users user = (Users) usersService.findbyId(id);
        Set<PackagePurchase> purchases = user.getPackagePurchases();
        Set<FuelUsage> usages = user.getFuelUsagesForUserId();
        Set<UserRedemptions> redemptionses = user.getUserRedemptionses();
        double totalbundlepurchases = 0;
        double totalcashpurchases = 0;
        int totalpoints = 0;
        if (purchases != null){
            for (PackagePurchase p: purchases){
                totalcashpurchases += p.getBundle().getBundlevalue();
                totalbundlepurchases += Double.parseDouble(p.getBundle().getBundlename());
                totalpoints += p.getBundle().getPoints();
            }
        }        
        double totalrate = totalcashpurchases/totalbundlepurchases;
        double totalcashusage = 0;
        double totalbundleusage = 0;
        if (usages != null){
            for (FuelUsage fu:usages){
                totalcashusage += fu.getAmount();                
                }
                totalbundleusage = totalcashusage/10;
            }
            
        int totalpointsused = 0;
        for (UserRedemptions ur: redemptionses){
            totalpointsused += ur.getPromotion().getPoints();
        }
        double totalsambazasent = 0;
        Set<Sambaza> sent = user.getSambazasForSentFrom();
        if (!sent.isEmpty()) {
            for (Sambaza sambaza : sent) {
                totalsambazasent += sambaza.getAmtSent();
            }
        }
        double totalsambazarecieved = 0;
        Set<Sambaza> recieved = user.getSambazasForSentTo();
        if (!recieved.isEmpty()) {
            for (Sambaza sambaza : recieved) {
                totalsambazarecieved += sambaza.getAmtSent();
            }
        }
        
        Balances b = new Balances();
        b.setAccount(totalcashpurchases - totalcashusage);
        b.setBundle((totalbundlepurchases + totalsambazarecieved) - (totalbundleusage + totalsambazasent));
        b.setPoints(totalpoints - totalpointsused);
        return b;            
    }    
}
