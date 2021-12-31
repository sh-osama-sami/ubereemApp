package com.example.demo;


import java.util.*;
//import okhttp3.OkHttpClient;
//import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;


import com.google.maps.GeoApiContext;
//import com.squareup.okhttp.Request;

import okhttp3.OkHttpClient;
//import org.apache.catalina.connector.Response;
import org.apache.catalina.connector.Request;
/**
 * 
 */
public class GoogleAPI implements Calculation {
///service
	  String url="https://maps.googleapis.com/maps/api/distancematrix/json";

    public GoogleAPI() {
    }

    /**
     * 
     */
    public double calcDistance(Location src,Location dest) {
    	
    	
    	
		return 0;
		
        }

    /**
     * 
     */
 
    /**
     * 
     */
    public double ETA(Location src,Location dest) {
		return 0;
        // TODO implement here
    }

   

}