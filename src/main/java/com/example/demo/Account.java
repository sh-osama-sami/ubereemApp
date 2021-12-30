package com.example.demo;


import java.util.*;

/**
 * 
 */
public class Account {

    /**
     * Default constructor
     */
    public Account() {
    }
    
    public Account(String s,String y ,String x) {
    	username=s;
    	phonenumber=y;
    	password=x;
    }

    /**
     * 
     */
    public String username;

    /**
     * 
     */
    public String phonenumber;

    /**
     * 
     */
    public String password;

    /**
     * 
     */
    public String email;





    /**
     * @param name
     */
    public void setUsername(String name) {
    	 username=name;
    }

    /**
     * @param p
     */
    public void setPass(String p) {
    	 password=p;
    }

    /**
     * @param e
     */
    public void setEmail(String e) {
    	 email=e;
    }

    /**
     * @param Sring s 
     * @param String y 
     * @param String x
     */
    

}