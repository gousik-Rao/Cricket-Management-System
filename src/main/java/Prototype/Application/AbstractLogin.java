package Prototype.Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import Prototype.DB.DBConnection;

abstract public class AbstractLogin {
	Connection conn;
	PreparedStatement ps;
//	Data hiding

//	user details
	private int UID;
	private String username, password, cPass, email;
	
//	Admin details
    private int adminID;
	private String adminUsername, adminPass;
	
	static Scanner S;
	static LoginMain log;
	static Cricket c;
	static LocalDateTime date;

//	Default constructor
	public AbstractLogin() {
		Cricket.S = new Scanner(System.in);
		Cricket.date = LocalDateTime.now(); // Child can access parents fields and behaviors so Cricket can access date;
		this.conn = DBConnection.getConnection();
	}
	public AbstractLogin(LoginMain log) { 
		this.conn = DBConnection.getConnection();
		LoginMain.log = log; 
	}
	
//	Populating database
	public void insertUserIntoDB() throws SQLException{
		PreparedStatement ps = conn.prepareStatement("insert into user_details values(?, ?, ?, ?, ?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setInt(3, UID);
		ps.setString(4, cPass);
		ps.setString(5, email);
//		Firing the query
		ps.executeUpdate();
	}
	public void insertAdminIntoDB() throws SQLException{
		PreparedStatement ps = conn.prepareStatement("insert into admin_details values(?, ?, ?)");
		ps.setString(1, adminUsername); ps.setString(2, adminPass); ps.setInt(3, adminID);
	}
	
//	Encapsulation methods we use here !!!
	
//	Getting user details
	public String userPasswordGetter() { return password; }
	public String userNameGetter() { return username; }
	public int userIDGetter() { return UID; }
	public String userEmailGetter() { return email; }
	
//	Getting admin details
	public String adminNameGetter() { return adminUsername; }
	public String adminPasswordGetter() { return adminPass; }
	public int adminIDGetter() { return adminID; }
	
//	User details setter method
	public void userDetailsSetter(int UID, String username, String password, String cPass, String email) throws SQLException{
		this.UID = UID;
		this.username = username;
		this.password = password;
		this.cPass = cPass;
		this.email = email;
		insertUserIntoDB();
	}
//	Admin details setter method
	public void adminDetailsSetter(String adminUsername, String adminPass, int adminID) {
		this.adminUsername = adminUsername;
		this.adminPass = adminPass;
	}
}

