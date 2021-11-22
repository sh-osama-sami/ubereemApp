
import java.util.*;

/**
 * 
 */
public class Ride implements publisher {

    /**
     * Default constructor
     */
    public Ride() {
    }

    /**
     * 
     */
    public subscriber [] subscribers;
    public Offer[] rideoffer= new Offer[100];
    protected boolean favRide=false;
    protected Area source=new Area();
    protected Area dest=new Area();

    /**
     * 
     */
   // protected Area dest;
    public float cost;
    public int rate;
    protected boolean requested=false;
    public int offercount=0;
    
public Ride(String s ,String d){
	source.areaName=s;
	dest.areaName=d;
}


    /**
     * @param src 
     * @return
     */
   
    /*public void setSource(Area src) {
        // TODO implement here
        source=src;
    }*/

    /**
     * @param dest 
     * @return
     
    public void setDestination(Area dest) {
        // TODO implement here
        this.dest=dest;
    }

    /**
     * @param r 
     * @return
     */
    public void setRate(int r) {
        // TODO implement here
       rate=r;
    }

    /**
     * @return
     */
   

    /**
     * @return
     */
    public void notification(Driver drvr) {
    	
    	for (Area a:drvr.favArea)
    	{
    		if (this.source.getAreaName().equals(a.getAreaName()))
    		{
    			drvr.update(this);
    			
    			break;
    		}
    	}
    
       
    }
public void notification(Rider rider) {
    	rider.update(this);
	
    }

    /**
     * @param c 
     * @return
     */
    public void setCost(float c) {
        // TODO implement here
       cost=c;
    }

    /**
     * @return
     */
    public float getCost() {
        // TODO implement here
        return cost;
    }
    public void setRideOffers(Offer o) {
    	
    		rideoffer[offercount]=o;
    		offercount++;
    	
    }
    
   

    /**
     * @return
     */
   

}