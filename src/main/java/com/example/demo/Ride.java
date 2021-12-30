package com.example.demo;


import java.util.*;

/**
 * 
 */
public class Ride  {

    /**
     * Default constructor
     */
    public Ride() {
    }

    /**
     * 
     */
    protected Area source;

    /**
     * 
     */
    protected Area dest;

    /**
     * 
     */
    public int rate;

    /**
     * 
     */
    public boolean requested;

    /**
     * 
     */
    public boolean favRide;

    /**
     * 
     */
    public float cost;

    public int id;
    public boolean ended = false;
    double distance;
    double eta;










    /**
     * @param Sting s 
     * @param String d
     */
    public Ride(String s ,String d){
    	source.areaName=s;
    	dest.areaName=d;
    }


    /**
     * @param r 
     * @return
     */
    public void setRate(int r) {
       rate=r;
    }

    /**
     * @param c 
     * @return
     */
    public void setCost(float c) {
       cost=c;
    }


    /**
     * @return
     */
    public float getCost() {
        return cost;
    }
    /**
     * @param Driver d 
     * @param Ride r 
     * @return
     */
   

}