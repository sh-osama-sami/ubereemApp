
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

}