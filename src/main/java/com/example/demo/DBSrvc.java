package com.example.demo;

import java.sql.ResultSet;
import java.util.List;

public class DBSrvc implements IDBSrvc {
	Database db =new DatabaseArraylist();
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
	public int addridenotification(Notification r) {
		return db.addridenotification(r);
	}

	@Override
	public Rider getaRider(String username) {
		return db.getaRider(username);
	}

	@Override
	public Driver getaDriver(String username) {
		return db.getaDriver(username);
	}

	@Override
	public Driver getpendingDriver(int id) {
		return db.getpendingDriver(id);
	}

	@Override
	public Offer getanOffer(int id) {
		return db.getanOffer(id);
	}

	@Override
	public Area getanArea(int id) {
		return db.getanArea(id);
	}

	@Override
	public Ride getaRide(int id) {
		return db.getaRide(id);
	}

	@Override
	public Notification getridenotification(int id) {
		return db.getridenotification(id);
	}

	@Override
	public boolean deleteaRider(int id) {
		return db.deleteaRider(id);
	}

	@Override
	public boolean deleteaDriver(int id) {
		return db.deleteaDriver(id);
	}

	@Override
	public boolean deleteanOffer(int id) {
		return db.deleteanOffer(id);
	}

	@Override
	public boolean deleteanArea(int id) {
		return db.deleteanArea(id);
	}

	@Override
	public boolean deleteaRide(int id) {
		return db.deleteaRide(id);
	}

	@Override
	public boolean deleteridenotification(int id) {
		return db.deleteridenotification(id);
	}

	@Override
	public List<Rider> getallRider() {
		return db.getallRider();
	}

	@Override
	public List<Driver> getallDriver() {
		return db.getallDriver();
	}

	@Override
	public List<Driver> getallpendingDriver() {
		return db.getallpendingDriver();
	}

	@Override
	public List<Offer> getallOffer() {
		return db.getallOffer();
	}

	@Override
	public List<Ride> getallRide() {
		return db.getallRide();
	}

	@Override
	public List<Ride> getallfavRide() {
		return db.getallfavRide();
	}

	@Override
	public List<Area> getallArea() {
		return db.getallArea();
	}

	@Override
	public List<Notification> getallridenotification() {
		return db.getallridenotification();
	}

	@Override
	public List<Notification> getalloffernotification() {
		return db.getalloffernotification();
	}

	@Override
	public List<Notification> getallacceptedoffernotification() {
		return db.getallacceptedoffernotification();
	}

	@Override
	public int UpdateaDriver(int id, Driver d) {
		return db.UpdateaDriver(id,d);
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
	public int UpdateanArea(int id, Area a) {
		return db.UpdateanArea(id,a);
	}

	@Override
	public int UpdateaRider(int id, Rider r) {
		return db.UpdateaRider(id,r);
	}

	@Override
	public int Updateridenotification(int id, Notification r) {
		return db.Updateridenotification(id,r);
	}

	@Override
	public int addoffernotification(Notification r) {
		return db.addoffernotification(r);
	}

	@Override
	public int addacceptednotification(Notification r) {
		return db.addacceptednotification(r);
	}

	@Override
	public Notification getoffernotification(int id) {
		return db.getoffernotification(id);
	}

	@Override
	public Notification getacceptednotification(int id) {
		return db.getacceptednotification(id);
	}

	@Override
	public boolean deleteoffernotification(int id) {
		return db.deleteoffernotification(id);
	}

	@Override
	public boolean deleteacceptednotification(int id) {
		return db.deleteacceptednotification(id);
	}

	@Override
	public int Updateoffernotification(int id, Notification r) {
		return db.Updateoffernotification(id, r);
	}

	@Override
	public int Updateacceptednotification(int id, Notification r) {
		return db.Updateacceptednotification(id, r);
	}

	@Override
	public int addfavRide(Ride r) {
		return db.addfavRide(r);
	}

	
	
	
	
	
}
