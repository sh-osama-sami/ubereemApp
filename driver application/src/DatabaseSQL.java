
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
///service///
/**
 * 
 */
public class DatabaseSQL implements Database{

    /**
     * Default constructor
     */
    public DatabaseSQL() {
    
    }
	public static java.sql.Connection connect() {
        java.sql.Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:try.db";
            conn = DriverManager.getConnection(url);
           // System.out.println("aaaaaaaaaa");
        } catch (SQLException e) {
            System.out.println("Wrong!!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Wrong2!!!");
        }
        return conn;
    }
	public static void SelectALL()
    {
     // Person person;
   //     List<Person> persons = new ArrayList<Person>();
        java.sql.Connection conn = connect();
        String sql = "select* from  Person ; ";
        try
        {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next())
            {
                System.out.println(res.getString("Name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
	/////////////////////////////////////////////////////////////////////
	@Override
	public int addaRider(Rider r) {
		
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO Rider (username,password,email,phonenumber) " +"VALUES ('" +r.account.username+ "'," +r.account.password+","+r.account.email+","+r.account.phonenumber+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
	}
	@Override
	public int addaDriver(Driver d) {
		d.verified=true;
		java.sql.Connection conn = connect();
		 String sql = "INSERT INTO Driver (balance,username,phonenumber,password,email,verified) " +"VALUES ('" +d.balance+ "'," +d.account.username+ ","+d.account.phonenumber +","+d.account.password+","+d.account.email+","+d.verified+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public int addanOffer(Offer o) {
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO Offer (price,accepted,id) " +"VALUES ('" +o.price+ "'," +o.accepted+","+o.id+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
		
	}
	@Override
	public int addaRide(Ride r) {
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO Ride (areaname,destination,rate,cost,requested,fav,id) " +"VALUES ('" +r.source+ "'," +r.dest  +"," + r.rate+"," + r.cost+"," + r.requested+"," + r.favRide+"," + r.id+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	
		
	}
	
	
/////////////////////////////////////////////////////////////////////
	@Override
	public ResultSet getaRider(String username) {
		java.sql.Connection conn = connect();
        String sql = "select* from  Rider where Rider.username =" +username   ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public ResultSet getaDriver(String username) {
		java.sql.Connection conn = connect();
        String sql = "select* from  Driver where Driver.username =" +username   ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
	}
	@Override
	public ResultSet getanOffer(int id) {
		java.sql.Connection conn = connect();
        String sql = "select* from  Offer where Offer.id =" +id   ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
	}
	@Override
	public ResultSet getaRide(int id) {
		java.sql.Connection conn = connect();
        String sql = "select* from  Ride where Ride.id =" +id   ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
	}
	
	
/////////////////////////////////////////////////////////////////////
	@Override
	public int deleteaRider(String username) {
		
		java.sql.Connection conn = connect();
        String sql = "delete from  Rider where Rider.username =" +username;
        int res = 0;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public int deleteaDriver(String username) {
		java.sql.Connection conn = connect();
        String sql = "delete from  Driver where Driver.username =" +username;
        int res = 0;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
	}
	@Override
	public int deleteanOffer(int id) {
		java.sql.Connection conn = connect();
        String sql = "delete from  Offer where Offer.id =" +id;
        int res = 0;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
		
	}
	@Override
	public int deleteaRide(int id) {
		java.sql.Connection conn = connect();
        String sql = "delete from  Ride where Ride.id =" +id;
        int res = 0;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
		
	}
	
/////////////////////////////////////////////////////////////////////

	@Override
	public int UpdateaRider(String username,Rider r) {
		java.sql.Connection conn = connect();
        String sql =  "UPDATE Rider SET password = '"+ r.account.password + "',email=" + r.account.email +",phonenumber=" + r.account.phonenumber +" WHERE username=" +username ;
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
		
	}
	
	@Override
	public int UpdateaDriver(String username,Driver d) {
		java.sql.Connection conn = connect();
        String sql =  "UPDATE Driver SET balance = '"+ d.balance+ "',username=" + d.account.username +",phonenumber=" + d.account.phonenumber +",password=" + d.account.password+",email=" + d.account.email+" WHERE username=" +username ;
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
		
	}
	
	@Override
	public int UpdateanOffer(int id,Offer o) {
		java.sql.Connection conn = connect();
        String sql =  "UPDATE Offer SET price = '"+ o.price+ "',accepted="+o.accepted  +" WHERE id=" +id;
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
		
	}
	
	@Override
	public int UpdateaRide(int id,Ride r) {
		java.sql.Connection conn = connect();
        String sql =  "UPDATE Ride SET areaname = '"+ r.source + "',destination=" + r.dest +",rate=" + r.rate+",cost=" + r.cost+",requested=" + r.requested+",fav=" + r.favRide+" WHERE r.id=" +id;
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
		
	}
	
/////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
/*	public int getRideNextId() {
	
		return 0;
	}*/
	
	/*public int getOfferNextId() {
	
		return 0;
	}*/
/////////////////////////////////////////////////////////////////////
	@Override
	public ResultSet getallRider() {
		 java.sql.Connection conn = connect();
	        String sql = "select* from  Rider ; ";
	        ResultSet res = null ;
	        try
	        {
	            Statement stat = conn.createStatement();
	             res = stat.executeQuery(sql);
	           
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }       return res;
		
	}
	@Override
	public ResultSet getallDriver() {
		 java.sql.Connection conn = connect();
	        String sql = "select* from  Driver where driver.verified ="+true;
	        ResultSet res = null ;
	        try
	        {
	            Statement stat = conn.createStatement();
	             res = stat.executeQuery(sql);
	          
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }       return res;
		
	}
	@Override
	public ResultSet getallOffer() {
		 java.sql.Connection conn = connect();
	        String sql = "select* from  Offer ; ";
	        ResultSet res = null ;
	        try
	        {
	            Statement stat = conn.createStatement();
	             res = stat.executeQuery(sql);
	           
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }       return res;
		
	}
	@Override
	public ResultSet getallRide() {
		 java.sql.Connection conn = connect();
	        String sql = "select* from  Ride ; ";
	        ResultSet res = null ;
	        try
	        {
	            Statement stat = conn.createStatement();
	             res = stat.executeQuery(sql);
	           
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }       return res;
		
	}
	@Override
	public int addpendingDriver(Driver d) {
		d.verified=false;
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO Driver (balance,username,phonenumber,password,email,verified) " +"VALUES ('" +d.balance+ "'," +d.account.username+ ","+d.account.phonenumber +","+d.account.password+","+d.account.email+","+d.verified+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public ResultSet getpendingDriver(String username) {
		java.sql.Connection conn = connect();
        String sql = "select* from  Driver where Driver.username =" +username+ "where Driver.verified ="+false  ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	
	@Override
	public ResultSet getallpendingDriver() {
		java.sql.Connection conn = connect();
        String sql = "select* from  Driver where Driver.verified ="+false;
        ResultSet res = null ;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeQuery(sql);
          
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }       return res;
	
	}
	@Override
	public int addnotification(Notification r) {
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO notifications (id,riderusername,rideid,driverusername,offerid) " +"VALUES ('" +r.id+ "'," +r.riderusername+","+r.rideid+","+r.driverusername+","+r.offerid+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public ResultSet getnotification(int id) {
		java.sql.Connection conn = connect();
        String sql = "select* from  notification where notification.id =" +id   ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
		
	}
	@Override
	public int deletenotification(int id) {
		java.sql.Connection conn = connect();
        String sql = "delete from  notification where notification.id =" +id;
        int res = 0;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public ResultSet getallridenotification() {
		java.sql.Connection conn = connect();
        String sql = "select* from  notification where rideid != null";
        ResultSet res = null ;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeQuery(sql);
          
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }       return res;
	}
	@Override
	public int Updatenotification(int id, Notification r) {
		java.sql.Connection conn = connect();
        String sql =  "UPDATE notification SET id = '"+ r.id + "',riderusername=" + r.riderusername +",rideid=" + r.rideid+",driverusername=" + r.driverusername+",offerid=" + r.offerid+" WHERE r.id=" +id;
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
	}
	@Override
	public ResultSet getalloffernotification() {
		java.sql.Connection conn = connect();
        String sql = "select* from  notification where offerid != null";
        ResultSet res = null ;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeQuery(sql);
          
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }       return res;
	}
	public ResultSet getallacceptedoffernotification() {
		java.sql.Connection conn = connect();
        String sql = "select* from  notification where offerid != null and offeraccepted=true";
        ResultSet res = null ;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeQuery(sql);
          
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }       return res;
	}
	@Override
	public int addanArea(Area o) {
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO area (areaname,fav) " +"VALUES ('" +o.areaName+ "'," +o.favArea+ ")";
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public ResultSet getanArea(String name) {
		java.sql.Connection conn = connect();
        String sql = "select* from  area where area.areaname =" +name   ;
        ResultSet res = null;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeQuery(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public int deleteanArea(String name) {
		java.sql.Connection conn = connect();
        String sql = "delete from  area where area.areaname =" +name;
        int res = 0;
        
        try
        {
            Statement stat = conn.createStatement();
            res = stat.executeUpdate(sql);
           
              //  System.out.println(res.getString("Name"));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
	}
	@Override
	public ResultSet getallArea() {
		 java.sql.Connection conn = connect();
	        String sql = "select* from  area where area.fav ="+true;
	        ResultSet res = null ;
	        try
	        {
	            Statement stat = conn.createStatement();
	             res = stat.executeQuery(sql);
	          
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }       return res;
		
	}
	@Override
	public int UpdateanArea(String name, Area a) {
		java.sql.Connection conn = connect();
        String sql =  "UPDATE area SET fav= '"+ a.favArea +" WHERE areaname=" +a.areaName;
        int res = 0;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeUpdate(sql);
            
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		return res;
	}
	@Override
	public ResultSet getallfavRide() {
		java.sql.Connection conn = connect();
        String sql = "select* from  Ride where fav ="+true;
        ResultSet res = null ;
        try
        {
            Statement stat = conn.createStatement();
             res = stat.executeQuery(sql);
           
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }       return res;
	}
	
	


}