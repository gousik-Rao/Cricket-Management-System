package Prototype.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/prototype";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "shisha";
	
	private static Connection conn;
	
	private DBConnection(){}
//  Singleton
	public static Connection getConnection() {
		if(conn == null) {
			try { conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); } 
			catch (SQLException e) { System.out.println("Database connection failed: " + e.getMessage()); }
		}
		return conn;
	}
}
