
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
    public Driver[] listPendingDrivers()
    {
    	/*for(int i=0;i<driver.length;i++)
    	{
    		if(driver[i].verified==false)
    		{
    			System.out.println(driver[i]);
    		}
    			
    	}*/
    	return driver;
    }
    
   

}