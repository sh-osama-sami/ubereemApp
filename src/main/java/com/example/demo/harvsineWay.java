package com.example.demo;


import java.util.*;

/**
 * 
 */
public class harvsineWay implements Calculation{
	///service
    /**
     * Default constructor
     */
    public harvsineWay() {
   
    	
    }
public String calcDistanceandETA(Location l1,Location l2)
{
		// distance between latitudes and longitudes
		double dLat = Math.toRadians(l2.lat - l1.lat);
		double dLon = Math.toRadians(l2.lon - l1.lon);
		
		// convert to radians
		l1.lat = Math.toRadians(l1.lat);
		l2.lat = Math.toRadians(l2.lat);
		
		// apply formulae
		double a = Math.pow(Math.sin(dLat / 2), 2) +
		   Math.pow(Math.sin(dLon / 2), 2) *
		   Math.cos(l1.lat) *
		   Math.cos(l2.lat);
		double rad = 6371;
		double c = 2 * Math.asin(Math.sqrt(a));
		double res =rad * c/60;
		String r=""+res+"";
		return r;
}

    /**
     * 
     */
   
    /*public double ETA(Location src,Location dest) {
        double eta =calcDistance(src, dest)/60;
		return eta;
       
    }*/

    /**
     * 
     */
    
    
    

}