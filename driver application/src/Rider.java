
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
  public static void main(String[] args) {
	  Driver drivr=new Driver();
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
  	//Driver d=new Driver();
  	Rider r=new Rider();
	   r.register(a);
	   System.out.println("do you want to request a ride 1-yes 2=no");
	   choice=sc.next();
	   //if(choice.equals("1")) {
		   System.out.println("enter source and destination");
		   String src=sc.next();
		   String des=sc.next();
		   ride =new Ride(src,des);
		   r.requestRide(ride);
		   ride.notification(drivr.getDriverObject());
}

}