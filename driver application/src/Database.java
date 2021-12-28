
import java.sql.ResultSet;
import java.util.*;

/**
 * 
 */
public interface Database {
	
	public int getRideNextId();
	public int getOfferNextId();
	
	public  int addaRider(Rider r) ;
    public  int addaDriver(Driver d) ;
    public  int addanOffer(Offer o) ;
	public  int addaRide(Ride r) ;
	
	
	public  ResultSet getaRider(String username) ;
    public  ResultSet getaDriver(String username) ;
    public  ResultSet getanOffer(int id) ;
	public  ResultSet getaRide(int id) ;
	
	public  int deleteaRider(String username) ;
    public  int deleteaDriver(String username) ;
    public  int deleteanOffer(int id) ;
	public  int deleteaRide(int id) ;
	
	public   ResultSet getallRider() ;
    public  ResultSet getallDriver() ;
    public  ResultSet getallOffer() ;
	public  ResultSet getallRide() ;
	
	public int UpdateaDriver(String username,Driver d);
	public int UpdateanOffer(int id,Offer o);
	public int UpdateaRide(int id,Ride r);
	public int UpdateaRider(String username,Rider r);


}