package New;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Getdata {
	Statement stmt;
	Connection con;
	ResultSet rs;
	int i,j;
	public Getdata(Doctor dr[][]) {
		 try
	        {
	            //Load the driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            //Connecting with database clinic
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ clinicjava", "root", "");

	            //Creating object of statement class
	            stmt = con.createStatement();

	            //Executing the query
	            // from table clinic
	           ResultSet rs =  stmt.executeQuery("select * from clinic");
	           int i,j;
	           while(rs.next() == true)
	           {
	               i=rs.getInt(15);
	               j=rs.getInt(14);
	               
	               dr[i][j].setCname(rs.getString(1));
	               dr[i][j].setDname(rs.getString(2));
	               dr[i][j].setAddress(rs.getString(3));
	               dr[i][j].setEmail(rs.getString(4));
	               dr[i][j].setSpeciality(rs.getString(5));
	               dr[i][j].setOpen(rs.getString(6));
	               dr[i][j].setClose(rs.getString(7));
	               dr[i][j].setBstart(rs.getString(8));
	               dr[i][j].setBend(rs.getString(9));
	               dr[i][j].setDegree(rs.getString(10));
	               dr[i][j].setUsername(rs.getString(11));
	               dr[i][j].setPassword(rs.getString(12));
	               dr[i][j].setMobile(rs.getInt(13));
	               dr[i][j].setRegestrationNumber(rs.getInt(14));
	               dr[i][j].setArea(rs.getInt(15));
	          
	               	


	           }


	           con.close();



	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		
	}
}
