/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.Controller;

import com.anchor.erp.myfuelapi.Domain.Dealer;
import com.anchor.erp.myfuelapi.MobileModels.Balances;
import com.anchor.erp.myfuelapi.MobileModels.FuelCar;
import com.anchor.erp.myfuelapi.MobileModels.FuelPackage;
import com.anchor.erp.myfuelapi.MobileModels.MobileDealers;
import com.anchor.erp.myfuelapi.MobileModels.MobilePurchase;
import com.anchor.erp.myfuelapi.MobileModels.MobileRedemption;
import com.anchor.erp.myfuelapi.MobileModels.MobileUser;
import com.anchor.erp.myfuelapi.MobileModels.MobileVehicle;
import com.anchor.erp.myfuelapi.MobileModels.MobileVehicleMake;
import com.anchor.erp.myfuelapi.MobileModels.OffersForMobile;
import com.anchor.erp.myfuelapi.MobileServices.MobileDealerService;
import com.anchor.erp.myfuelapi.MobileServices.MobilePackageService;
import com.anchor.erp.myfuelapi.MobileServices.MobileUserService;
import com.anchor.erp.myfuelapi.MobileServices.MobileVehicleService;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.web.header.Header;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author nbs
 */

@Controller
public class MobileController {
    
    @Autowired
    private MobilePackageService mobilePackageService;
    
    @Autowired
    private MobileUserService mobileUserService;
    
    @Autowired
    private MobileVehicleService mobileVehicleService;
    
    @Autowired
    @Qualifier("dealerService")
    private GenericService dealerService;
    
    @Autowired
    private MobileDealerService mobileDealerService;
    
    @RequestMapping(value = "/login/{email}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE,headers = "Accept=*")
    public @ResponseBody MobileUser login(@PathVariable("email") String email){
        String fString = email+".com";
        System.out.println("LOGIN EMAIL INPUT ################   @@@@@@@@@@@@@@@@@     AT CONTROLLER:   "+fString);
        return mobileUserService.signupbyemail(fString);
    }
    
    @RequestMapping(value = "/allpackages",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public @ResponseBody List<FuelPackage> allPackages(){
        return mobilePackageService.allPackages();
    }
    
    @RequestMapping(value = "/updateuserdetails",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobileUser updateuserdetails (@RequestBody MobileUser mobileUser){
        return mobileUserService.updateuserdetails(mobileUser);
    }
    
    @RequestMapping(value = "/signupmobileuser",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobileUser adduser (@RequestBody MobileUser mobileUser){
        return mobileUserService.adduser(mobileUser);
    }
    
    @RequestMapping(value = "/makepurchase",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobilePurchase makepurchase(@RequestBody MobilePurchase purchase){
        System.out.println("REQUEST BODY :"+purchase);
        System.out.println("PURCHASE ID IS :"+purchase.getId());
        System.out.println("EXPIRY DATE IS : "+purchase.getExpiryDate());
        System.out.println("DATE OF PURCHASE IS :"+purchase.getDatePurchased());
        System.out.println("USER ID OF BUYER IS "+purchase.getUser().getId());
        System.out.println("ID OF PACKAGE BOUGHT IS :"+purchase.getApackage().getId());
        return mobilePackageService.addpurchase(purchase);
    }
    
    @RequestMapping(value = "/addvehicle",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobileVehicle addvVehicle(@RequestBody MobileVehicle mobileVehicle){
        return mobileVehicleService.addVehicle(mobileVehicle);
    }
    
    @RequestMapping(value = "/fuelcar",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FuelCar fuelCar(@RequestBody FuelCar fuelCar){
        return mobileVehicleService.fuelCar(fuelCar);
    }
    
    @RequestMapping(value = "/dealers",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Dealer> dealers(){
        return (List<Dealer>) dealerService.findAll();
    }
    
    @RequestMapping(value = "/balancesfor/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Balances getBalances(@PathVariable("id") int id){
        return mobileUserService.getUserBalances(id);
    }
    
    @RequestMapping(value = "/allusages/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<FuelCar> getUsages(@PathVariable("id")int userid){
        return mobileVehicleService.allusages(userid);
    }
    
    @RequestMapping(value = "/alloffers",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<OffersForMobile> alloffers(){
        return mobilePackageService.getAllOffers();
    }
    
    @RequestMapping(value = "/redeempointsforpromo",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Balances redeempointsforpromo (@RequestBody MobileRedemption redemption){
        return mobileUserService.redeempointsforpromo(redemption);
    }
    
    @RequestMapping(value = "/allmakes",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<MobileVehicleMake> allmakes(){
        return mobileVehicleService.allVehiclemakes();
    }
    
    @RequestMapping(value = "/alldealers",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<MobileDealers> allDealers(){
        return mobileDealerService.allDealers();
    }
    
    @RequestMapping(value = "/updatevehicle",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobileVehicle updateVehicle(@RequestBody MobileVehicle mobileVehicle){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@ "+mobileVehicle.toString());
        MobileVehicle mobileVehicle1 = mobileVehicleService.updateVehicle(mobileVehicle);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@ RESPONSE: "+mobileVehicle1.toString());
        return mobileVehicle1;
    }
    
    @RequestMapping(value = "/sambaza",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Balances sambazaPackage(@RequestParam("sentfrom") String sentfrom,@RequestParam("recipientphone") String recipientphone,@RequestParam("amount") String amount) throws UnsupportedEncodingException{
        String id = URLDecoder.decode(sentfrom, "UTF-8");
        String phone = URLDecoder.decode(recipientphone, "UTF-8");
        String amt = URLDecoder.decode(amount, "UTF-8");
        Balances balances = mobilePackageService.sambazaPackage(Integer.parseInt(sentfrom), phone, Double.parseDouble(amount));
        System.out.println("@@@@@@@@ Response: "+balances.toString());
        return balances;
    }
    
    @RequestMapping(value = "/verifyuser",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobileUser verifySystemUser(@RequestParam("phone") String phone) throws UnsupportedEncodingException{
        String mobile = URLDecoder.decode(phone, "UTF-8");
        System.out.println("@@@@@@@@@@@@ REQUESTED USER PHONE : "+mobile);
        MobileUser mobileUser = mobileUserService.verifySystemUser(phone);
        System.out.println("@@@@@@@@@@@@ RESPONSE : "+mobileUser.toString());
        return mobileUser;
    }
}
