package New;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Setuserdata {
	Statement stmt;
	Connection con;
	ResultSet rs;
	int i,j;
	public Setuserdata(User demo) {
		 try
	        {
			   // insert query for table user 
	           String insertQuery = "insert into user "+"values('"+demo.getName()
	                                                              +"','"+demo.getSex()
	                                                              +"','"+demo.getEmail()
	                                                              +"','"+demo.getAddress()
	                                                              +"','"+demo.getUsername()
	                                                              +"','"+demo.getPassword()
	                                                              +"','"+demo.getAge()
	                                                              +"','"+demo.getContact()
	                                                              +"','"+demo.getIndex()+"')";

	           
	            //Load the driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            //Connecting with database clinic
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ clinicjava", "root", "");

	            //Creating object of statement class
	           stmt = con.createStatement();

	            //Executing the query
	           
	            int n = stmt.executeUpdate(insertQuery);
				
				if(n > 0)
	            {
	               System.out.println("success");
	            }
	            else
	            {
	                System.out.println("fail");
	            }
	           
	           con.close();



	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		
	}
}
