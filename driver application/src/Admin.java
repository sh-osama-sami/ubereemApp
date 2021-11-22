
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
     */
    public void verifyDriver(Driver d) {
    	
    	 
    	 Date limit = new Date(2020) ;
    	
    	if(d.license.getExpiryDate().before(limit))
    	{
    		d.verified=true;
    	}
      ;
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