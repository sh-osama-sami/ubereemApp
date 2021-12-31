package com.example.demo;


import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class RideController implements publisher {

	IDBSrvc dbsrvc =new DBSrvc();
  Notification notif = new Notification();
  Ride ride;
  Calculation distanceCalculatorsrvc = getStrategy();//srvc

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
    	
        return null;
    }
	@GetMapping("/ride/distance")
    public double clacdist(Location source,Location destination) {
    	ride.distance=distanceCalculatorsrvc.calcDistance(source,destination);
        return ride.distance;
    }
	@GetMapping("/ride/eta")
    public double claceta(Location source,Location destination) {
    	ride.eta=distanceCalculatorsrvc.ETA(source,destination);
        return ride.eta;
    }

	
    /**
     * @param Driver d 
     * @param Ride r 
     * @return
     */
   
}