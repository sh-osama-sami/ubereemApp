
import java.util.*;

/**
 * 
 */
public class Rider implements subscriber {

    /**
     * Default constructor
     */
    public Rider() {
    }

    /**
     * 
     */
   // public Ride rideOffers[];
    public Offer rideoffer;

    /**
     * 
     */
    public Account account;



    /**
     * @param account 
     * @return
     */
    public void register(Account account) {

    	this.account=account;       
    	
    }
    public void requestRide(Ride ride) {
       ride.requested=true;
    }

    /**
     * @return
     */
    public Ride ListRideOffers() {
        // TODO implement here
        return null;
    }

    /**
     * @param driver 
     * @return
     */
    public void viewDriverDetails(Driver driver) {
        // TODO implement here
       // return null;
    }

    /**
     * @param ride
     */
    public void rateRide(Ride ride) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void update() {
        // TODO implement here
       // return null;
    }

    /**
     * @param rideoffer 
     * @return
     */
    public boolean acceptPrice(Ride rideoffer) {
        // TODO implement here
        return true;
    }

    /**
     * @return
     */
  

}