
import java.sql.ResultSet;
import java.util.*;

/**
 * 
 */
public class RiderController implements controller, subscriber {
	
	
    IDBSrvc dbsrvc =new DBSrvc();
   // Ride ride =new Ride();
    Rider rider =new Rider();
    
    
    public RiderController() {
    }





    /**
     * @param account 
     * @return
     */
    public void register(Account account) {
       rider.account=account;
       dbsrvc.addaRider(rider);
      
    }

    /**
     * @param ride 
     * @return
     */
    public void requestRide(Ride ride) {
    	rider.ride=ride;
    	rider.ride.requested=true;
    	dbsrvc.addaRide(rider.ride);
    }

    /**
     * @return
     */
    public ResultSet ListRideOffers() {
      return  dbsrvc.getallOffer();
    }

    /**
     * @param driver 
     * @return
     */
    public void viewDriverDetails(Driver driver) {
      dbsrvc.getaDriver(driver.account.username);
      
    }

    /**
     * @param ride
     */
    public ResultSet listridehistory() {
    	return dbsrvc.getallRide();
    }
    public void rateRide(Ride ride,int rate) {
    ride.rate=rate;
    dbsrvc.UpdateaRide(ride.id, ride);
    	
    }

    /**
     * @param Ride r 
     * @return
     */
    public ResultSet update1() {
		return dbsrvc.getalloffernotification();
        
    }
    @Override
	public ResultSet update2() {
    	return dbsrvc.getallacceptedoffernotification();
		
	}

    /**
     * @param rideoffer 
     * @return
     */
    public boolean acceptPrice(Driver d) {
       d.offer.accepted=true;
       dbsrvc.UpdateanOffer(d.offer.id, d.offer);
        return true;
    }
    public void login(Account a) {
    	dbsrvc.getaRider(a.username);
    }

	

    /**
     * @param Ride r 
     * @return
     */
    

}