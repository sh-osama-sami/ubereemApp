
import java.text.ParseException;
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
    public License license=new License();

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
    public Driver drvr;
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
    		
    			System.out.println(favride[i].source.getAreaName());
    			System.out.println(favride[i].dest.getAreaName());    			
    	}
    	
    	
    	
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
    public void setDriverObject(Driver d1)
    {
    	drvr=new Driver();
    	drvr=d1;
    }

    /**
     * @return
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
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
    	Driver d=new Driver();
    	
    	Driver d76=new Driver();
    	d76.setDriverObject(d);
    	//Rider r=new Rider();
    	
/////////Driver
    	 
    	   System.out.println("enter your licensenumber and expiry date (dd/MM/yyyy) and ID");
    	   String License=sc.next();
    	   String ed=sc.next();
    	   String Id=sc.next();
    	   License l= new License(License,ed);
  
    	   d.register(a, Id, l);
    	   admoon.setDriver(d);
    	   admoon.addPendingDriver(d);
    	   admoon.main(args);
    	  /* if( ad.verifyDriver(d)==false) {
    		   System.out.println("you cant access the app unless you are verified");
    		   break;
    	   }*/
    	  
    	   
    	   System.out.println("add fav area? 1-yea 2- nay");
    	   choice=sc.next();
    	   if(choice.equals("1")) {
    		   String fave = sc.next();
    		   Area area = new Area();
    		   area.setAreaName(fave);
    		  d.addFavouriteArea(area);
    	   }
    	   Rider r=new Rider();
    	   r.setDriver(d);
    	   r.main(args);
    	   System.out.println("list all rides with a fav source area? 1-yea 2- nay");
    	   choice=sc.next();
    	   if(choice.equals("1")) {
    		   d.listFavRides();
    	   }
    	   System.out.println("suggest a price? 1-yea 2- nay");
    	   choice=sc.next();
    	   if(choice.equals("1")) {
    		   float offer = sc.nextFloat();
    		   d.suggestPrice(offer);
    	   }
    	   
       }
	
   

}