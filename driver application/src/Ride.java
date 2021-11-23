
import java.util.*;

public class Ride implements publisher {

    
    public Ride() {
    }

    
 
    public Offer[] rideoffer= new Offer[100];
    protected boolean favRide=false;
    protected Area source=new Area();
    protected Area dest=new Area();

    
    public float cost;
    public int rate;
    protected boolean requested=false;
    public int offercount=0;
    
public Ride(String s ,String d){
	source.areaName=s;
	dest.areaName=d;
}


    public void setRate(int r) {
        // TODO implement here
       rate=r;
    }

    
    public void notification(Driver drvr,Ride r) {
    
    	for (Area a:drvr.favArea)
    	{
    		a=new Area();
    		if (this.source.getAreaName().equals(a.getAreaName()))
    		{
    			drvr.update(r);
    			
    			break;
    		}
    	}
    
       
    }
public void notification(Rider rider) {
    	rider.update(this);
	
    }

   
    public void setCost(float c) {
        // TODO implement here
       cost=c;
    }

   
    public float getCost() {
        // TODO implement here
        return cost;
    }
    public void setRideOffers(Offer o) {
    	
    		rideoffer[offercount]=o;
    		offercount++;
    	
    }
    
   

   
   

}