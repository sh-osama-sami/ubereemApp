
import java.util.*;

/**
 * 
 */
public class Driver implements subscriber {

    /**
     * Default constructor
     */
    public Driver() {
    }

    /**
     * 
     */
    public String ID;
    public Offer rideoffer;
    /**
     * 
     */
    public License license;

    /**
     * 
     */
    public Balance balance;

    /**
     * 
     */
    public Ride ride[];//history
    public Ride favride[]=new Ride[100];
    /**
     * 
     */
    public Area favArea[]=new Area[100];

    /**
     * 
     */
    public Account account;
    public boolean verified=false;
    protected int areaCount=0;
    protected int rideCount=0;










    /**
     * @param account 
     * @param ID 
     * @param license 
     * @return
     */
    public void register(Account account, String ID, License license) {
        this.account=account;
        this.ID=ID;
        this.license=license;
        //return true;
    }

    /**
     * @return
     */
    public boolean endRide() {
        // TODO implement here
        return true;
    }

    /**
     * @param ride 
     * @return
     */
    public void addRideToHistory(Ride ride) {
        // TODO implement here
     
    }

    /**
     * @param favearea 
     * @return
     */
    public void addFavouriteArea(Area favearea) {
    	
        favearea.favArea=true;
        favArea[areaCount]=favearea;
        areaCount++;
     
    }

    /**
     * @return
     */
    public void update(Ride r) {
        System.out.println("the requested ride is favourit");
        setFavRides(r);
    }

    /**
     * @param source 
     * @return
     */
    public void setFavRides(Ride r) {
    	r.favRide=true;
    	favride[rideCount]=r;
    	rideCount++;
    }
    public void listFavRides( ) {

    	
    	for(int i=0;i<rideCount;i++)
    	{
    		
    			System.out.println(favride[i]);
    			//bosbos
    		
    			
    	}
    	
    	
    	
    }
    public void suggestPrice(Float f) {
    	rideoffer.price=f;
    	
    }
    public Offer suggestedOffer() {
    	return rideoffer;
    }

    /**
     * @return
     */
   

}