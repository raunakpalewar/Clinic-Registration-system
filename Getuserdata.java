package New;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Getuserdata {
	Statement stmt;
	Connection con;
	ResultSet rs;
	int i,j;
	public Getuserdata(User ur[]) {
		 try
	        {
	            //Load the driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            //Connecting with database clinic
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ clinicjava", "root", "");

	            //Creating object of statement class
	            stmt = con.createStatement();

	            //Executing the query
	            // from table user
	           ResultSet rs =  stmt.executeQuery("select * from user");
	           int i;
	           while(rs.next() == true)
	           {
	               i=rs.getInt(9);
	               
	               ur[i].setName(rs.getString(1));
	               ur[i].setSex(rs.getString(2));
	               ur[i].setEmail(rs.getString(3));
	               ur[i].setAddress(rs.getString(4));
	               ur[i].setUsername(rs.getString(5));
	               ur[i].setPassword(rs.getString(6));
	               ur[i].setAge(rs.getInt(7));
	               ur[i].setContact(rs.getInt(8));
	               ur[i].setIndex(rs.getInt(9));
	               
	           }

	           con.close();

	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		
	}
}
