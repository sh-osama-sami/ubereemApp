
public class DriverController implements controller {
	
    public void register(Account account, String ID, License license) {
        this.account=account;
        this.ID=ID;
        this.license=license;
        //return true;
    }

   
    public boolean endRide() {
        return true;
    }

   
    public void addRideToHistory(Ride ride) {
        // TODO implement here
     
    }

   
    public void addFavouriteArea(Area favearea) {
    	
        /*favearea.favArea=true;
        favArea[areaCount]=favearea;
        areaCount++;*/
     
    }

   
    public void update(Ride r) {
        System.out.println("the requested ride is favourite");
        ride22=r;
        setFavRides(ride22);
    }

    
    public boolean isFavRide() {
    	/*for(int i=0;i<areaCount;i++) {
    		if(ride22.source.getAreaName().equals(favArea[i].getAreaName())  ) {
    			ride22.favRide=true;
    			break;
    		}
    		
    	}*/
    	return ride22.favRide;
    }
    public void setFavRides(Ride r) {
    	/*r.favRide=true;
    	favride[rideCount]=ride22;
    	rideCount++;*/
    }
    public void listFavRides( ) {

    	
    	/*for(int i=0;i<rideCount;i++)
    	{
    		
    			System.out.println(favride[i].source.getAreaName());
    			System.out.println(favride[i].dest.getAreaName());    			
    	}*/
    	
    	
    	
    }
    public void suggestPrice(Float f) {
    	rideoffer.price=f;
    	
    }
    public Offer suggestedOffer() {
    	return rideoffer;
    }
    public Driver getDriverObject()
    {
    	return drvr;
    }
    public static void setDriverObject(Driver d1)
    {
    	
    	drvr=d1;
    }
    public static void setRide(Ride d1)
    {
    	
    	ride22=d1;
    }


}
