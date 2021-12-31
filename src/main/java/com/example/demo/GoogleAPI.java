package com.example.demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
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
     * @throws IOException
     * 
     */
    public String calcDistanceandETA(Location src,Location dest) throws IOException {
    	URL url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=40.6655101%2C-73.89188969999998&destinations=40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626&key=AIzaSyCJ9fjH9z45BLmUZ9tTvenbUPRgiHccaYA");
			URLConnection connection = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			String jsonResult = "";
			while ((inputLine = in.readLine()) != null) {
			    jsonResult += inputLine;
			}
			in.close();
			return jsonResult;
		
        }

    /**
     * 
     */
 
    /**
     * 
     */
   

   

}