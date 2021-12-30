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
public class RiderController implements  subscriber {
	
	
    IDBSrvc dbsrvc =new DBSrvc();
   // Ride ride =new Ride();
    Rider rider =new Rider();
    
    
    public RiderController() {
    }





    /**
     * @param account 
     * @return
     */
    @PostMapping("/rider/register")
    public int register(@RequestBody Account account) {
       rider.account=account;
       return dbsrvc.addaRider(rider);
      
    }

    /**
     * @param ride 
     * @return
     */
    @PostMapping("/rider/requestRide")
    public int requestRide(@RequestBody Ride ride) {
    	rider.ride=ride;
    	rider.ride.requested=true;
    	return dbsrvc.addaRide(rider.ride);
    }

    /**
     * @return
     */
    @GetMapping("rider/offers")
    public ResultSet ListRideOffers() {
      return  dbsrvc.getallOffer();
    }

    /**
     * @param driver 
     * @return
     */
    @GetMapping("rider/driver/{driver}")
    public ResultSet viewDriverDetails(@PathVariable Driver driver) {
      return dbsrvc.getaDriver(driver.account.username);
      
    }

    /**
     * @param ride
     */
    @GetMapping("rider/rides")
    public ResultSet listridehistory() {
    	return dbsrvc.getallRide();
    }
    
    @PutMapping("/rider/rateRide")
    public int rateRide(@RequestBody Ride ride,@RequestBody int rate) {
    ride.rate=rate;
    return dbsrvc.UpdateaRide(ride.id, ride);
    	
    }

    /**
     * @param Ride r 
     * @return
     */
    @GetMapping("rider/offernotifications")
    public ResultSet update1() {
		return dbsrvc.getalloffernotification();
        
    }
    
    /*@Override
    @GetMapping("acceptedoffernotifications")
	public ResultSet update2() {
    	return dbsrvc.getallacceptedoffernotification();
		
	}

    /**
     * @param rideoffer 
     * @return
     */
    @PutMapping("rider/acceptPrice")
    public boolean acceptPrice(Driver d) {
       d.offer.accepted=true;
       dbsrvc.UpdateanOffer(d.offer.id, d.offer);
        return true;
    }
    @GetMapping("rider/{a}")
    public ResultSet login(@PathVariable Account a) {
    	return dbsrvc.getaRider(a.username);
    }





	

	

    /**
     * @param Ride r 
     * @return
     */
    

}