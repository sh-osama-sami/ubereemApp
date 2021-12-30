
import java.sql.ResultSet;
import java.util.*;

/**
 * 
 */
public class DriverController implements controller, subscriber {
	  Driver driver;
	  IDBSrvc dbsrvc =new DBSrvc();
    /**
     * Default constructor
     */
    public DriverController() {
    }




    /**
     * @param account 
     * @param ID 
     * @param license 
     * @return
     */
    public void register(Account account, String ID, License license) {
       driver.account=account;
       driver.license=license;
       driver.ID=ID;
       dbsrvc.addpendingDriver(driver);
        
    }

    /**
     * @return
     */
    public boolean endRide(Ride r) {
      r.ended=true;
      driver.balance=r.cost;
     dbsrvc.UpdateaRide(r.id, r);
     return r.ended;
    }

    /**
     * @param ride 
     * @return
     */
    public void addRideToHistory(Ride ride) {
        dbsrvc.addaRide(ride);
       
    }

    /**
     * @param favearea 
     * @return
     */
    public void addFavouriteArea(Area favearea) {
    	favearea.favArea=true;
       dbsrvc.addanArea(favearea);       
    }

    /**
     * @param r 
     * @return 
     * @return
     */
    public ResultSet update1() {
     return dbsrvc.getallridenotification();
       
    }
    public ResultSet update2() {
        return dbsrvc.getalloffernotification();
          
       }
    /**
     * @param source 
     * @return
     */
    public ResultSet listFavRides() {
    	return dbsrvc.getallfavRide();
        
    }

    /**
     * @param p 
     * @return
     */
    public void suggestPrice(float p,int rideid) {
       driver.offer.price=p;
       driver.offer.id=rideid;
       dbsrvc.addanOffer(driver.offer);
        
    }

    /**
     * @return
     */
    public boolean isFavRide(Ride r) {
      //  ResultSet getallArea = dbsrvc.getallArea();
		if(r.source.equals(dbsrvc.getanArea(r.source.areaName))) {
        	
        	return true;
        }else return false;
        
    }

    /**
     * 
     */
    public void setFavRides(Ride r) {
    	if(isFavRide(r)) {
    	r.favRide=true;
    	dbsrvc.UpdateaRide(r.id, r);	
    	}
    	
    }
    public void login(Account a) {
    	dbsrvc.getaDriver(a.username);
    }

    /**
     * @param Ride r 
     * @return
     */
    

}