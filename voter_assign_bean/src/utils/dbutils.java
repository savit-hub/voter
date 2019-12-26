package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbutils {
	public static Connection getconnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/voter_tb";
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,"root","manager");
		
	}

}
