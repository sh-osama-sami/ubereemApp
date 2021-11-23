
import java.util.*;

public class Account {

   
    public Account() {
    }
    public Account(String s,String y ,String x) {
    	username=s;
    	phonenumber=y;
    	password=x;
    }
    
    public String username;

    
    public String phonenumber;

    
    public String password;

    public String email;



    
    public void setUsername(String name) {
        username=name;
    }

  
    public void setPass(String p) {
       password=p;
    }

   
    public void setEmail(String e) {
       email=e;
    }

}