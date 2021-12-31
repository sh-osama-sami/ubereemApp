package com.example.demo;

import java.sql.ResultSet;
import java.util.List;

public interface IDBSrvc {

	public  int addaRider(Rider r) ;
    public  int addaDriver(Driver d) ;
    public  int addpendingDriver(Driver d) ;
    public  int addanOffer(Offer o) ;
    public  int addanArea(Area o) ;
    
	public  int addaRide(Ride r) ;
	public  int addfavRide(Ride r) ;
	
	public  int addridenotification(Notification r) ;
	public  int addoffernotification(Notification r) ;
	public  int addacceptednotification(Notification r) ;
	
	
	public  Rider getaRider(String username) ;
    public  Driver getaDriver(String username) ;
    public  Driver getpendingDriver(int id) ;
    public  Offer getanOffer(int id) ;
    public  Area getanArea(int id) ;
	public  Ride getaRide(int id) ;
	
	public  Notification getridenotification(int id) ;
	public  Notification getoffernotification(int id) ;
	public  Notification getacceptednotification(int id) ;
	
	
	public  boolean deleteaRider(int id) ;
    public  boolean deleteaDriver(int id) ;
   // public  int deletependingDriver(String username) ;
    public  boolean deleteanOffer(int id) ;
    public  boolean deleteanArea(int id) ;
	public  boolean deleteaRide(int id) ;
	
	public  boolean deleteridenotification(int id) ;
	public  boolean deleteoffernotification(int id) ;
	public  boolean deleteacceptednotification(int id) ;
	
	
	public  List<Rider> getallRider() ;
    public  List<Driver> getallDriver() ;
    public  List<Driver> getallpendingDriver() ;
    public  List<Offer> getallOffer() ;
	public  List<Ride> getallRide() ;
	public  List<Ride> getallfavRide() ;
	public  List<Area> getallArea() ;
	
	public  List<Notification> getallridenotification() ;
	public  List<Notification> getalloffernotification() ;
	public  List<Notification> getallacceptedoffernotification();
	
	public int UpdateaDriver(int id,Driver d);
	//public int UpdatependingDriver(String username,Driver d);
	public int UpdateanOffer(int id,Offer o);
	public int UpdateaRide(int id,Ride r);
	public int UpdateanArea(int id , Area a) ;
	public int UpdateaRider(int id,Rider r);
	
	public int Updateridenotification(int id,Notification r);
	public int Updateoffernotification(int id,Notification r);
	public int Updateacceptednotification(int id,Notification r);


}
