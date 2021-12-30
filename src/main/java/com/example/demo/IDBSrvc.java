package com.example.demo;

import java.sql.ResultSet;

public interface IDBSrvc {

	public  int addaRider(Rider r) ;
    public  int addaDriver(Driver d) ;
    public  int addpendingDriver(Driver d) ;
    public  int addanOffer(Offer o) ;
    public  int addanArea(Area o) ;
	public  int addaRide(Ride r) ;
	public  int addnotification(Notification r) ;
	
	
	public  ResultSet getaRider(String username) ;
    public  ResultSet getaDriver(String username) ;
    public  ResultSet getpendingDriver(String username) ;
    public  ResultSet getanOffer(int id) ;
    public  ResultSet getanArea(String name) ;
	public  ResultSet getaRide(int id) ;
	public  ResultSet getnotification(int id) ;
	
	
	public  int deleteaRider(String username) ;
    public  int deleteaDriver(String username) ;
   // public  int deletependingDriver(String username) ;
    public  int deleteanOffer(int id) ;
    public  int deleteanArea(String name) ;
	public  int deleteaRide(int id) ;
	public  int deletenotification(int id) ;
	
	
	public  ResultSet getallRider() ;
    public  ResultSet getallDriver() ;
    public  ResultSet getallpendingDriver() ;
    public  ResultSet getallOffer() ;
	public  ResultSet getallRide() ;
	public  ResultSet getallfavRide() ;
	public  ResultSet getallArea() ;
	public  ResultSet getallridenotification() ;
	public  ResultSet getalloffernotification() ;
	public ResultSet getallacceptedoffernotification();
	
	public int UpdateaDriver(String username,Driver d);
	//public int UpdatependingDriver(String username,Driver d);
	public int UpdateanOffer(int id,Offer o);
	public int UpdateaRide(int id,Ride r);
	public int UpdateanArea(String name , Area a) ;
	public int UpdateaRider(String username,Rider r);
	public int Updatenotification(int id,Notification r);
}
