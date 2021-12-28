
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

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
		java.sql.Connection conn = connect();
        String sql = "INSERT INTO Driver (balance,username,phonenumber,password,email) " +"VALUES ('" +d.balance+ "'," +d.account.username+ ","+d.account.phonenumber +","+d.account.password+","+d.account.email+ ")";
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
        String sql = "select* from  Driver where Rider.username =" +username   ;
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
        String sql =  "UPDATE Offer SET price = '"+ o.price+ "',accepted="  +" WHERE id=" +id;
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
	
	
	
	
	
	@Override
	public int getRideNextId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getOfferNextId() {
		// TODO Auto-generated method stub
		return 0;
	}
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
	        String sql = "select* from  Driver ; ";
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

	


}