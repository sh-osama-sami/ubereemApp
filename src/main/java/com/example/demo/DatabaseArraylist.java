package com.example.demo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class DatabaseArraylist implements Database {
	
	
 private static ArrayList<Ride> rides =new ArrayList<Ride>();
 private static ArrayList<Ride> favrides =new ArrayList<Ride>();
 
 private static ArrayList<Offer> offers =new ArrayList<Offer>();
 
 private static ArrayList<Driver> drivers=new ArrayList<Driver>();
 private static ArrayList<Driver> pendingdrivers=new ArrayList<Driver>();
 
 private static ArrayList<Area> areas =new ArrayList<Area>();///fav
 
 private static ArrayList<Rider> riders =new ArrayList<Rider>();
 
 private static ArrayList<Notification> ridenotifs =new ArrayList<Notification>();
 private static ArrayList<Notification> offernotifs =new ArrayList<Notification>();
 private static ArrayList<Notification> acceptedoffernotifs =new ArrayList<Notification>();

	
	public int getNextId() {
        return rides.size();
    }
	public int addaRider(Rider r) {
		riders.add(r);
		return 1; 
	}

	@Override
	public int addaDriver(Driver d) {
		drivers.add(d);
		return 1; 
	}

	@Override
	public int addpendingDriver(Driver d) {
		pendingdrivers.add(d);
			return 1; 
	}

	@Override
	public int addanOffer(Offer o) {
		 offers.add(o);
			return 1; 
	}

	@Override
	public int addanArea(Area o) {
		 areas.add(o);
			return 1; 
	}

	@Override
	public int addaRide(Ride r) {
		 rides.add(r);
		return 1; 
	}
	@Override
	public int addfavRide(Ride r) {////set fav rides
		 favrides.add(r);
		return 1; 
	}

	@Override
	public int addridenotification(Notification r) {
		ridenotifs.add(r);
		return 1; 
	}
	public int addoffernotification(Notification r) {
		offernotifs.add(r);
		return 1; 
	}
	public int addacceptednotification(Notification r) {
		acceptedoffernotifs.add(r);
		return 1; 
	}

	@Override
	public Rider getaRider(String username) {
		for (Rider rider : riders) {
            if (rider.account.username== username) {
                return rider;
            }
        }

        return null;
	}

	@Override
	public Driver getaDriver(String username) {
		for (Driver driver : drivers) {
            if (driver.account.username == username) {
                return driver;
            }
        }

        return null;
	}

	@Override
	public Driver getpendingDriver(int id) {
		
		for (Driver driver : pendingdrivers) {
            if (driver.ID == id) {
                return driver;
            }
        }

        return null;
	}

	@Override
	public Offer getanOffer(int id) {
		for (Offer o: offers) {
            if (o.id == id) {
                return o;
            }
        }

        return null;
	}

	@Override
	public Area getanArea(int id) {
		for (Area a : areas) {
            if (a.id == id) {
                return a;
            }
        }

        return null;
	}

	@Override
	public Ride getaRide(int id) {
		for (Ride a : rides) {
            if (a.id == id) {
                return a;
            }
        }

        return null;
	}

	@Override
	public Notification getridenotification(int id) {
		for (Notification a : ridenotifs) {
            if (a.id == id) {
                return a;
            }
        }

        return null;
	}
	public Notification getoffernotification(int id) {
		for (Notification a : offernotifs) {
            if (a.id == id) {
                return a;
            }
        }

        return null;
	}
	public Notification getacceptednotification(int id) {
		for (Notification a : acceptedoffernotifs) {
            if (a.id == id) {
                return a;
            }
        }

        return null;
	}
	@Override
	public boolean deleteaRider(int id) {
		 for (Rider rider : riders) {
	            if (rider.id == id) {
	                return riders.remove(rider);
	            }
	        }

	        return false;
	}

	@Override
	public boolean deleteaDriver(int id) {
		 for (Driver d : drivers) {
	            if (d.ID == id) {
	                return drivers.remove(d);
	            }
	        }

	        return false;
	}

	@Override
	public boolean deleteanOffer(int id) {
		 for (Offer o: offers) {
	            if (o.id == id) {
	                return offers.remove(o);
	            }
	        }

	        return false;
	}

	@Override
	public boolean deleteanArea(int id) {
		 for (Area o: areas) {
	            if (o.id == id) {
	                return areas.remove(o);
	            }
	        }

	        return false;
	}

	@Override
	public boolean deleteaRide(int id) {
		 for (Ride o: rides) {
	            if (o.id == id) {
	                return rides.remove(o);
	            }
	        }

	        return false;
	}

	@Override
	public boolean deleteridenotification(int id) {
		 for (Notification o: ridenotifs) {
	            if (o.id == id) {
	                return ridenotifs.remove(o);
	            }
	        }

	        return false;
	}
	public boolean deleteoffernotification(int id) {
		 for (Notification o: offernotifs) {
	            if (o.id == id) {
	                return ridenotifs.remove(o);
	            }
	        }

	        return false;
	}
	public boolean deleteacceptednotification(int id) {
		 for (Notification o: acceptedoffernotifs) {
	            if (o.id == id) {
	                return ridenotifs.remove(o);
	            }
	        }

	        return false;
	}

	@Override
	public List<Rider> getallRider() {
		// TODO Auto-generated method stub
		return riders;
	}

	@Override
	public  List<Driver> getallDriver() {
		// TODO Auto-generated method stub
		return drivers;
	}

	@Override
	public List<Driver> getallpendingDriver() {
		// TODO Auto-generated method stub
		return pendingdrivers;
	}

	@Override
	public List<Offer> getallOffer() {
		// TODO Auto-generated method stub
		return offers;
	}

	@Override
	public List<Ride> getallRide() {
		// TODO Auto-generated method stub
		return rides;
	}

	@Override
	public List<Ride> getallfavRide() {
		// TODO Auto-generated method stub
		return favrides;
	}

	@Override
	public List<Area> getallArea() {
		// TODO Auto-generated method stub
		return areas;
	}

	@Override
	public List<Notification> getallridenotification() {
		// TODO Auto-generated method stub
		return ridenotifs;
	}

	@Override
	public List<Notification> getalloffernotification() {
		// TODO Auto-generated method stub
		return offernotifs;
	}

	@Override
	public List<Notification> getallacceptedoffernotification() {
		// TODO Auto-generated method stub
		return acceptedoffernotifs;
	}

	@Override
	public int UpdateaDriver(int id, Driver d) {
		for (Driver oo: drivers) {
            if (oo.ID == id) {
                oo=d;
                return 1;
            }
        }

        return 0;
	}

	@Override
	public int UpdateanOffer(int id, Offer o) {
		for (Offer oo: offers) {
            if (oo.id == id) {
                oo=o;
                return 1;
            }
        }

        return 0;
	}

	@Override
	public int UpdateaRide(int id, Ride r) {////set fav ride
		for (Ride ride : rides) {
            if (ride.id == id) {
                ride=r;
                return 1;
            }
        }

        return 0;
	}

	@Override
	public int UpdateanArea(int id, Area a) {
		for (Area ar : areas) {
            if (ar.id == id) {
                ar=a;
                return 1;
            }
        }

        return 0;
	}

	@Override
	public int UpdateaRider(int id, Rider r) {
		for (Rider rider : riders) {
            if (rider.id == id) {
                rider=r;
                return 1;
            }
        }

        return 0;
	}
	@Override
	public int Updateridenotification(int id, Notification r) {
		for (Notification o: ridenotifs) {
            if (o.id == id) {
                o=r;
                return 1;
            }
        }

        return 0;
	}
	@Override
	public int Updateoffernotification(int id, Notification r) {
		for (Notification o: offernotifs) {
            if (o.id == id) {
                o=r;
                return 1;
            }
        }

        return 0;
	}
	@Override
	public int Updateacceptednotification(int id, Notification r) {
		for (Notification o: acceptedoffernotifs) {
            if (o.id == id) {
                o=r;
                return 1;
            }
        }

        return 0;
	}

	
	

}
