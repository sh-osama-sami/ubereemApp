package com.example.demo;


public class Notification {

	int id;
	int offerid;
	int rideid;
	String driverusername;
	String riderusername;
	boolean offeraccepted;
	
	Notification(){
		
	}
	
	Notification(int i,int o,int r,String d,String rider){
		int id=i;
		int offerid=o;
		int rideid=r;
		String driverusername=d;
		String riderusername=rider;
		
	}
	
}
