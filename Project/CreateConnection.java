package Project;


import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection
{	
	private CreateConnection() {}
	
	public static Connection connect()
	{
		Connection con=null;
		
		try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","");
    	}
		catch(Exception e) {e.printStackTrace();}
		
		return con;
	}
		
}
