
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 
 */
public class Admin {

    /**
     * Default constructor
     */
    public Admin() {
    }

    /**
     * 
     */
    public Driver driver[];
    //driver.(type[]) collection.toArray(new type[collection.size()])
    //public boolean check;

    /**
     * @param d 
     * @return
     * @throws ParseException 
     */
    public boolean verifyDriver(Driver d) throws ParseException {
    	
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
    	driver[driver.length]=d;
    	
    }
    public void listPendingDrivers()
    {
    	for(int i=0;i<driver.length;i++)
    	{
    			System.out.println(i+") driver number");
        		System.out.println("Username:"+driver[i].account.username);
        		System.out.println("mobile phone:"+driver[i].account.phonenumber);
        		if (driver[i].account.email!=null) {
        		System.out.println("email:"+driver[i].account.email);}
        		System.out.println("license number:"+driver[i].license.getLicenseNumber());
        		System.out.println("license expiry date:"+driver[i].license.getExpiryDate().toString());
        		System.out.println("national ID:"+driver[i].ID);
        		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");			
    	}
    	/*for (Driver d:driver)
    	{
    		System.out.println("Username:"+d.account.username);
    		System.out.println("mobile phone:"+d.account.phonenumber);
    		if (d.account.email!=null) {
    		System.out.println("email:"+d.account.email);}
    		System.out.println("license number:"+d.license.getLicenseNumber());
    		System.out.println("license expiry date:"+d.license.getExpiryDate().toString());
    		System.out.println("national ID:"+d.ID);
    		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    	}*/
    	//return driver;
    }
    
   

}