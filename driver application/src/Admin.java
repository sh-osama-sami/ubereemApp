
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
    
    public void listPendingDrivers(Driver[] d)
    {
    	for(int i=0;i<d.length;i++)
    	{
    		if(d[i].verified==false)
    		{
    			System.out.println(d[i]);
    		}
    			
    	}
    }
    
   

}