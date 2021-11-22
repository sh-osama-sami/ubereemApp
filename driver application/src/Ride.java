
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
    public Offer[] rideoffer;
    protected boolean favRide=false;
    protected Area source;
    protected Area dest;

    /**
     * 
     */
   // protected Area dest;
    public float cost;
    public int rate;
    protected boolean requested=false;

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
    public boolean notification() {
        // TODO implement here
        return true;
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
    public void setRideOffers(Driver[] d) {
    	for(int i=0;i<subscribers.length;i++) {
    		rideoffer[i]=d[i].suggestedOffer();
    	}
    }
    
   

    /**
     * @return
     */
   

}