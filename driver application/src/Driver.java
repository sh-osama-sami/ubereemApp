
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
    public Ride ride[];
   // public Ride favride[];
    /**
     * 
     */
    public Area favArea[];

    /**
     * 
     */
    public Account account;
    public boolean verified=false;
    //protected int driverCount=0;









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
    	
        //favearea.favArea=true;
        favArea[favArea.length]=favearea;
        //driverCount++;
     
    }

    /**
     * @return
     */
    public void update() {
        // TODO implement here
    
    }

    /**
     * @param source 
     * @return
     */
    public void setFavRides(Ride r) {
    			ride[ride.length]=r;
    }
    public void listFavRides( ) {
    //	if()
    	
    	for(int i=0;i<ride.length;i++)
    	{
    		if(ride[i].favRide==true)
    		{
    			System.out.println(ride[i]);
    			//bosbos
    		}
    			
    	}
    	
    	
    	
    }
    public float suggestPrice(Float f) {
    	rideoffer.price=f;
    	return rideoffer.price;
    }
    public Offer suggestedOffer() {
    	return rideoffer;
    }

    /**
     * @return
     */
   

}