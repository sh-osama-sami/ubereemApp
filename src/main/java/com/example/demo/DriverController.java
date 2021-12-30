package com.example.demo;


import java.sql.ResultSet;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class DriverController implements  subscriber {
	  Driver driver;
	  IDBSrvc dbsrvc =new DBSrvc();
    /**
     * Default constructor
     */
    public DriverController() {
    }




    /**
     * @param account 
     * @param ID 
     * @param license 
     * @return
     */
    @PostMapping("/driver/register")
    public int register(@RequestBody Account account,@RequestBody String ID,@RequestBody License license) {
       driver.account=account;
       driver.license=license;
       driver.ID=ID;
      return dbsrvc.addpendingDriver(driver);
        
    }

    /**
     * @return
     */
    @PutMapping("driver/endride")
    public boolean endRide(@RequestBody Ride r) {
      r.ended=true;
      driver.balance=r.cost;
     dbsrvc.UpdateaRide(r.id, r);
     return r.ended;
    }

    /**
     * @param ride 
     * @return
     */
    @PostMapping("driver/addridetohistory")
    public int addRideToHistory(@RequestBody Ride ride) {
        return dbsrvc.addaRide(ride);
       
    }

    /**
     * @param favearea 
     * @return
     */
    @PostMapping("driver/addFavouriteArea")
    public int addFavouriteArea(@RequestBody Area favearea) {
    	favearea.favArea=true;
      return dbsrvc.addanArea(favearea);       
    }

    /**
     * @param r 
     * @return 
     * @return
     */
    @GetMapping("driver/ridenotifications")
    public ResultSet update1() {
     return dbsrvc.getallridenotification();
       
    }
   
    @GetMapping("driver/acceptedoffernotifications")
    public ResultSet update1(@RequestBody String dummy) {
        return dbsrvc.getallacceptedoffernotification();
          
       }
    /**
     * @param source 
     * @return
     */
    @GetMapping("driver/faverides")
    public ResultSet listFavRides() {
    	return dbsrvc.getallfavRide();
        
    }

    /**
     * @param p 
     * @return
     */
    @PostMapping("driver/suggestprice")
    public int suggestPrice(@RequestBody float p,@RequestBody int rideid) {
       driver.offer.price=p;
       driver.offer.id=rideid;
       return dbsrvc.addanOffer(driver.offer);
        
    }

    /**
     * @return
     */
    @GetMapping("driver/isfavride/{r}")
    public boolean isFavRide(@PathVariable Ride r) {
      //  ResultSet getallArea = dbsrvc.getallArea();
		if(r.source.equals(dbsrvc.getanArea(r.source.areaName))) {
        	
        	return true;
        }else return false;
        
    }

    /**
     * 
     */
    @PutMapping("driver/setfavrides")
    public int setFavRides(@RequestBody Ride r) {
    	
    	r.favRide=true;
    	return dbsrvc.UpdateaRide(r.id, r);	    	
    	
    }
    @GetMapping("driver/login/{a}")
    public ResultSet login(@PathVariable Account a) {
    	return dbsrvc.getaDriver(a.username);
    }




	

    /**
     * @param Ride r 
     * @return
     */
    

}