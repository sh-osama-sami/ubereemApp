
import java.util.*;

/**
 * 
 */
public class RideController implements publisher, controller {

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
    public void notification1( Driver drvr,  Rider r) {///notify driver with fav ride
    	notif.driverusername =drvr.account.username;
    	notif.rideid=r.ride.id;
    	notif.riderusername=r.account.username;
        dbsrvc.addnotification(notif);
        
    }

    /**
     * @param Rider r 
     * @return
     */
    public void notification2( Driver d ,Rider r) {///notify rider with offer
    	notif.driverusername =d.account.username;
    	notif.offerid=d.offer.id;
    	notif.riderusername=r.account.username;
        dbsrvc.addnotification(notif);
       
    }

	@Override
	public void notification3(Driver d, Rider r) {/// notify driver with accepted offer
	
		notif.offeraccepted=d.offer.accepted;
		//dbsrvc.UpdateanOffer(d.offer.id, d.offer);
		dbsrvc.Updatenotification(d.offer.id, notif);
	}

	
    public Calculation getStrategy() {
    	
        return null;
    }
    public double clacdist(String source,String destination) {
    	ride.distance=distanceCalculatorsrvc.calcDistance(source,destination);
        return ride.distance;
    }
    public double claceta(String source,String destination) {
    	ride.eta=distanceCalculatorsrvc.ETA(source,destination);
        return ride.eta;
    }

	
    /**
     * @param Driver d 
     * @param Ride r 
     * @return
     */
   
}