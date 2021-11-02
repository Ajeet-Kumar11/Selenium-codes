package seleniumCoreFeature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnection
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://md2qjhdc:1433/DsServer","sa","Q7+r%K2!EGD+R1CQOR?G");
		System.out.println("Connected to my sql DB");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from selenium user");
		while(rs.next()) 
		{
			String firstname=rs.getString("firstname");
			System.out.println("Database record is "+firstname);// it will display all the first names
			String emailAddress=rs.getString("email");
			System.out.println("Database record is "+emailAddress);
			
		}
	}

}
