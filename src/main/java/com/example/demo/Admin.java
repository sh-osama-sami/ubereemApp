
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class Admin {

	
	IDBSrvc dbsrvc =new DBSrvc();
    /**
     * Default constructor
     */
    public Admin() {
    	 
    }




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
    		dbsrvc.addaDriver(d);
    	System.out.println("verified");
    	return true;
    	}
    	else { System.out.println("access denied");
    	dbsrvc.addaDriver(d);
    	return false;}
    	
      
    }

    /**
     * @return
     */
    public ResultSet listPendingDrivers() {
       return dbsrvc.getallpendingDriver();
      
    }

    /**
     * @param Driver d
     */
   // public int addPendingDriver( Driver d) {
  //    return dbsrvc.addpendingDriver(d);
  //  }

    /**
     * @param args[] 
     * @return
     */
   

}