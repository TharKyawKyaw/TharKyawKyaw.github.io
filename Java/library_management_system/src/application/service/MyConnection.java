package application.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection getConnection() throws SQLException {
		
		Connection con  = DriverManager.getConnection("jdbc:mariadb://localhost:3306/library_management_system" , "root" , "");
		return con;
	}

}
