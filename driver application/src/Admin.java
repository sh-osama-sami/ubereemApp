
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Admin {

    
    public Admin() {
    }

    
    public static Driver driver[]=new Driver[100];
    public static Driver dr=new Driver();
    
    public static int dcount=0;
    
    public static boolean verifyDriver(Driver d) throws ParseException {
    	
    	SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");
    	Date limit = new Date();
    	limit =s.parse("01/01/2020");
    	
    	if(d.license.getExpiryDate().after(limit))
    	{
    		
    		d.verified=true;
    	System.out.println("verified");
    	return true;
    	}
    	else System.out.println("access denied");
    	return false;
      
    }
    
    public void addPendingDriver(Driver d)
    {
    	driver[dcount]=d;
    	dcount++;
    	
    }
    public static void listPendingDrivers()
    {
    	for(int i=0;i<dcount;i++)
    	{if(driver[i].verified==false) {
    		System.out.println(i+1+") driver number");
    		System.out.println("Username:"+driver[i].account.username);
    		System.out.println("mobile phone:"+driver[i].account.phonenumber);
    		if (driver[i].account.email!=null) {
    		System.out.println("email:"+driver[i].account.email);}
    		System.out.println("license number:"+driver[i].license.getLicenseNumber());
    		System.out.println("license expiry date:"+driver[i].license.getExpiryDate().toString());
    		System.out.println("national ID:"+driver[i].ID);
    		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");	
    		
    	}
    					
    	}
    
    }
    public static void setDriver(Driver d) {
    	dr=d;
    }
    
   public static void main(String[] args) throws ParseException {
		System.out.println("ADMIN");
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("do you want to verify a new driver 1-yea 2-no");
	   String ans = sc.next();
	   if(ans.equals("1")) {
		   verifyDriver(dr);
		  dr.setDriverObject(dr);
	   }
	   System.out.println("do you want to list pending drivers 1-yea 2-no");
	   ans = sc.next();
	   if(ans.equals("1")) {
		   listPendingDrivers();
	   }
	


	
	
	
	
}

}