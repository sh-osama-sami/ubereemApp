
import java.text.ParseException;
import java.util.*;


public class Driver implements subscriber {

    
    public Driver() {
    }

   
    public String ID;
    public Offer rideoffer;
  
    public License license=new License();
    public Balance balance;   
    public Ride ride[];//history
    public Ride favride[]=new Ride[100];
   
    public Area favArea[]=new Area[100];

   
    public Account account;
    public static Driver drvr=new Driver();
    public boolean verified=false;
    public static Ride ride22= new Ride();   
  /*  public void register(Account account, String ID, License license) {
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
        areaCount++;
     
    }*/

   
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

   
    public static void main(String[] args) throws ParseException {
    	while(true) {
    		System.out.println("DRIVER");
    	Admin admoon = new Admin();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your username-mobile number-password ");
    	String username=sc.next();
    	String mobile=sc.next();
    	String password=sc.next();
    	System.out.println("do you want to enter your email? 1-yes 2-no");
    	String choice=sc.next();
    	String email;
    	Account a = new Account(username,mobile,password) ;
    	if(choice.equals("1")) {
    		email=sc.next();
    		a.setEmail(email);
    	}
    	
    	Ride ride ;
    
    	 
    	   System.out.println("enter your licensenumber and expiry date (dd/MM/yyyy) and ID");
    	   String License=sc.next();
    	   String ed=sc.next();
    	   String Id=sc.next();
    	   License l= new License(License,ed);
  
    	   drvr.register(a, Id, l);
    	   admoon.setDriver(drvr);
    	   admoon.addPendingDriver(drvr);
    	   
    	   admoon.main(args);
    	 
    	 
    	   if(drvr.verified==false) {System.out.println("you need to get verified");break;}
    	   else
    	   {
    	   System.out.println("add fav area? 1-yea 2- nay");
    	   choice=sc.next();
    	   if(choice.equals("1")) {
    		   String fave = sc.next();
    		   Area area = new Area();
    		   area.setAreaName(fave);
    		   drvr.addFavouriteArea(area);
    	   }
    	   Rider r=new Rider();
    	   r.setDriver(drvr);
    	   r.main(args);
    	   System.out.println("list all rides with a fav source area? 1-yea 2- nay");
    	   choice=sc.next();
    	   if(choice.equals("1")) {
    		   drvr.listFavRides();
    	   }
    	   System.out.println("suggest a price? 1-yea 2- nay");
    	   choice=sc.next();
    	   if(choice.equals("1")) {
    		   float offer = sc.nextFloat();
    		   drvr.suggestPrice(offer);
    	   }
    	} 
    	}
       }
	
   

}