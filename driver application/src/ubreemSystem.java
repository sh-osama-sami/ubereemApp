
import java.text.ParseException;
import java.util.*;

/**
 * 
 */
public class ubreemSystem {

    /**
     * Default constructor
     */
    public ubreemSystem() {
    }







    /**
     * @param args[] 
     * @return
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
    	
    	Admin ad=new Admin(); 
    	
    	do {
    		
    		Scanner sc=new Scanner(System.in);
        	System.out.println("enter your username-mobilenumber-password ");
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
        	Rider r=new Rider();
        	
           System.out.println("1-Driver or 2-Rider?");
           String ans=sc.next();
           if(ans.equals("1")) {/////////Driver
        	 
        	   System.out.println("enter your licensenumber and expiry date (dd/MM/yyyy) and ID");
        	   String License=sc.next();
        	   String ed=sc.next();
        	   String Id=sc.next();
        	   License l= new License(License,ed);
      
        	   d.register(a, Id, l);
        	   
        	   if( ad.verifyDriver(d)==false) {
        		   System.out.println("you cant access the app unless you are verified");
        		   break;
        	   }
        	  
        	   
        	   System.out.println("add fav area? 1-yea 2- nay");
        	   choice=sc.next();
        	   if(choice.equals("1")) {
        		   String fave = sc.next();
        		   Area area = new Area();
        		   area.setAreaName(fave);
        		  d.addFavouriteArea(area);
        	   }
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
           
           
           else if(ans.equals("2")) {/////////Rider
        	  
        	   
        	   r.register(a);
        	   System.out.println("do you want to request a ride 1-yes 2=no");
        	   choice=sc.next();
        	   if(choice.equals("1")) {
        		   System.out.println("enter source and destination");
        		   String src=sc.next();
        		   String des=sc.next();
        		   ride =new Ride(src,des);
        		   r.requestRide(ride);
        		   ride.notification(d);
        	   }
        	   
           }
           else if(ans.equals("3")) {
        	   System.exit(0);
           }
        	
    		
    	}while(true);
    	
    
    }

    /**
     * @return
     */
    public int numberOfCalls() {
        // TODO implement here
        return 0;
    }

}