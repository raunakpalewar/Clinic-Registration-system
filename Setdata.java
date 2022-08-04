package New;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Setdata {
	Statement stmt;
	Connection con;
	ResultSet rs;
	int i,j;
	public Setdata(Doctor demo) {
		 try
	        {
			 // insert query for table clinic
	           String insertQuery = "insert into clinic "+"values('"+demo.getCname()
	                                                              +"','"+demo.getDname()
	                                                              +"','"+demo.getAddress()
	                                                              +"','"+demo.getEmail()
	                                                              +"','"+demo.getSpeciality()
	                                                              +"','"+demo.getOpen()
	                                                              +"','"+demo.getClose()
	                                                              +"','"+demo.getBstart()
	                                                              +"','"+demo.getBend()
	                                                              +"','"+demo.getDegree()
	                                                              +"','"+demo.getUsername()
	                                                              +"','"+demo.getPassword()
	                                                              +"','" +demo.getMobile()
	                                                              +"','"+demo.getRegestrationNumber()
	                                                              +"','"+demo.getArea()+"')";

	           
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
