package com.example.demo;


import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class AdminController {

	
	IDBSrvc dbsrvc =new DBSrvc();
    /**
     * Default constructor
     */
    public AdminController() {
    	 
    }




    /**
     * @param d 
     * @return
     * @throws ParseException 
     */
    @PostMapping("admin/verify")
    public boolean verifyDriver(@RequestBody Driver d) throws ParseException {
    	SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");
    	Date limit = new Date();
    	limit =s.parse("01/01/2020");
    	
    	if(d.license.getExpiryDate().after(limit))
    	{
    		
    		d.verified=true;
    		dbsrvc.addaDriver(d);
    	System.out.println("verified");
    	return true;
    	}
    	else { System.out.println("access denied");
    	dbsrvc.addpendingDriver(d);
    	return false;}
    	
      
    }

    /**
     * @return
     */
    @GetMapping("admin/drivers")
    public List<Driver> listPendingDrivers() {
       return dbsrvc.getallpendingDriver();
      
    }

    /**
     * @param Driver d
     */
   // public int addPendingDriver( Driver d) {
  //    return dbsrvc.addpendingDriver(d);
  //  }

    /**
     * @param args[] 
     * @return
     */
   

}