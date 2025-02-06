package Prototype.Application;

public class Main {
//	Main Method, where everything starts
	public static void main(String[] agr) {
//		Object creation for LoginMain()
		LoginMain login = new LoginMain();
		
		try { login.login(login); }// Aggregation is used in this line to pass the object
		
		catch (Exception e) { e.printStackTrace(); }
	}
}
