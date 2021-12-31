package com.example.demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * 
 */
@RestController
public class RideController implements publisher {

	IDBSrvc dbsrvc =new DBSrvc();
  Notification notif = new Notification();
  Ride ride;
  Calculation distanceCalculatorsrvc = getStrategy();//srvc
  static int numofcalls=0;
    public RideController() {
    }



    /**
     * @param Driver drvr 
     * @param Ride r 
     * @return
     */
    @PostMapping("/ride/notification1")
    public void notification1(@RequestBody Driver drvr,@RequestBody  Rider r) {///notify driver with fav ride
    	notif.driverusername =drvr.account.username;
    	notif.rideid=r.ride.id;
    	notif.riderusername=r.account.username;
        dbsrvc.addridenotification(notif);
        
    }

    /**
     * @param Rider r 
     * @return
     */
    @PostMapping("/ride/notification2")
    public void notification2(@RequestBody Driver d ,@RequestBody Rider r) {///notify rider with offer
    	notif.driverusername =d.account.username;
    	notif.offerid=d.offer.id;
    	notif.riderusername=r.account.username;
        dbsrvc.addoffernotification(notif);
       
    }

	@Override
	@PutMapping("/ride/notification3")
	public void notification3(@RequestBody Driver d,@RequestBody Rider r) {/// notify driver with accepted offer
		d.offer.accepted=true;
		notif.offeraccepted=d.offer.accepted;
		//dbsrvc.UpdateanOffer(d.offer.id, d.offer);
		dbsrvc.addacceptednotification( notif);
	}

	@GetMapping("/ride/strategy")
    public Calculation getStrategy() {
    	
		if(numofcalls<500) {
			 return new harvsineWay();
		}
        return new GoogleAPI();
    }
	@GetMapping("/ride/distance")
    public String clacdistandETA(@RequestBody Location source ,@RequestBody Location destination) throws IOException {
		numofcalls++;
    return	ride.distance=distanceCalculatorsrvc.calcDistanceandETA(source,destination);
		
	
    }
	

	
    /**
     * @param Driver d 
     * @param Ride r 
     * @return
     */
   
}