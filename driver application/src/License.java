
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class License {

    /**
     * Default constructor
     */
    public License() {
    }

    
    public License(String ln,String ed) throws ParseException {
    	SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");
    	expirydate=s.parse(ed);
    	licenseNumber=ln;
    	
    }
    /**
     * 
     */
    public Date expirydate;

    /**
     * 
     */
    public String licenseNumber;



    /**
     * @param d 
     * @return
     */
    public License(String ln) {
    	licenseNumber=ln;
    }
    public void setExpiryDate(Date d) {
    	expirydate=d;
    	
    }
    public void setLicenseNumber(String d) {
    	licenseNumber=d;
    	
    }
    public Date getExpiryDate() {
    	return expirydate;
    	
    }
    public String getLicenseNumber() {
    	return licenseNumber;
    	
    }

}