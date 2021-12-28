
import java.util.*;

/**
 * 
 */
public class Ride implements publisher {

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












    /**
     * @param Sting s 
     * @param String d
     */
    public void Ride( String s,  String d) {
        // TODO implement here
    }

    /**
     * @param r 
     * @return
     */
    public void setRate(int r) {
        // TODO implement here
        
    }

    /**
     * @param c 
     * @return
     */
    public void setCost(float c) {
        // TODO implement here
       
    }

    /**
     * @return
     */
    public float getCost() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param Driver d 
     * @param Ride r 
     * @return
     */
    public  void notification( Driver d,  Ride r) {
	}

    /**
     * @param Rider r 
     * @return
     */
    public void notification( Rider r) {
        // TODO implement here
       
    }

}