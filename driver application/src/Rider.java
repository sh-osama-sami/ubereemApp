
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
   // public Offer rideoffer;

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
    public void ListRideOffers(Ride r) {
    	for(int i=0;i<r.offercount;i++)
    	{
    		
    			System.out.println(r.rideoffer[i]);
    			//bosbos
    		
    			
    	}
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
    public void update(Ride r) {
    	 System.out.println("a new offer has been added");
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