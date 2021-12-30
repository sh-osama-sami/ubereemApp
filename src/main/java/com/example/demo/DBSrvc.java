package com.example.demo;

import java.sql.ResultSet;

public class DBSrvc implements IDBSrvc {
	Database db =new DatabaseSQL();
	@Override
	public int addaRider(Rider r) {
		return db.addaRider(r);
	}

	@Override
	public int addaDriver(Driver d) {
	 return	db.addaDriver(d);
	}

	@Override
	public int addpendingDriver(Driver d) {
		return	db.addpendingDriver(d);
	}

	@Override
	public int addanOffer(Offer o) {
		return	db.addanOffer(o);
	}

	@Override
	public int addanArea(Area o) {
		
		return	db.addanArea(o);
	}

	@Override
	public int addaRide(Ride r) {
		return db.addaRide(r);
	}

	@Override
	public int addnotification(Notification r) {
		return db.addnotification(r);
	}

	@Override
	public ResultSet getaRider(String username) {
		return db.getaRider(username);
	}

	@Override
	public ResultSet getaDriver(String username) {
		return db.getaDriver(username);
	}

	@Override
	public ResultSet getpendingDriver(String username) {
		return db.getpendingDriver(username);
	}

	@Override
	public ResultSet getanOffer(int id) {
		return db.getanOffer(id);
	}

	@Override
	public ResultSet getanArea(String name) {
		return db.getanArea(name);
	}

	@Override
	public ResultSet getaRide(int id) {
		return db.getaRide(id);
	}

	@Override
	public ResultSet getnotification(int id) {
		return db.getnotification(id);
	}

	@Override
	public int deleteaRider(String username) {
		return db.deleteaRider(username);
	}

	@Override
	public int deleteaDriver(String username) {
		return db.deleteaDriver(username);
	}

	@Override
	public int deleteanOffer(int id) {
		return db.deleteanOffer(id);
	}

	@Override
	public int deleteanArea(String name) {
		return db.deleteanArea(name);
	}

	@Override
	public int deleteaRide(int id) {
		return db.deleteaRide(id);
	}

	@Override
	public int deletenotification(int id) {
		return 0;
	}

	@Override
	public ResultSet getallRider() {
		return db.getallRider();
	}

	@Override
	public ResultSet getallDriver() {
		return db.getallDriver();
	}

	@Override
	public ResultSet getallpendingDriver() {
		return db.getallpendingDriver();
	}

	@Override
	public ResultSet getallOffer() {
		return db.getallOffer();
	}

	@Override
	public ResultSet getallRide() {
		return db.getallRide();
	}

	@Override
	public ResultSet getallfavRide() {
		return db.getallfavRide();
	}

	@Override
	public ResultSet getallArea() {
		return db.getallArea();
	}

	@Override
	public ResultSet getallridenotification() {
		return db.getallridenotification();
	}

	@Override
	public ResultSet getalloffernotification() {
		return db.getalloffernotification();
	}

	@Override
	public ResultSet getallacceptedoffernotification() {
		return db.getallacceptedoffernotification();
	}

	@Override
	public int UpdateaDriver(String username, Driver d) {
		return db.UpdateaDriver(username,d);
	}

	@Override
	public int UpdateanOffer(int id, Offer o) {
		return db.UpdateanOffer(id,o);
	}

	@Override
	public int UpdateaRide(int id, Ride r) {
		return db.UpdateaRide(id,r);
	}

	@Override
	public int UpdateanArea(String name, Area a) {
		return db.UpdateanArea(name,a);
	}

	@Override
	public int UpdateaRider(String username, Rider r) {
		return db.UpdateaRider(username,r);
	}

	@Override
	public int Updatenotification(int id, Notification r) {
		return db.Updatenotification(id,r);
	}

	
	
	
	
	
}
