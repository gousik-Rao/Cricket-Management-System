package Prototype.Application;

import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class LoginMain extends AbstractLogin {
	
    int generatedOTP, givenUserUID;
	String givenUsername, givenUserPass, cPass, email, gnAdminPass, gnAdminUname;
	long otpGenerationTime;
	
	// Default constructor
	public LoginMain() {
		super();
	}

	public void login(LoginMain login) throws SQLException {
//		Overriding the run method in Runnable using Lambda function
		Runnable run = () -> { c = new Cricket(login); c.initialization(); }; // Overriding run() method using Lambda Expression
		Thread th = new Thread(run);
		th.start();
		
		outer:
		while(true) {
			System.out.println("\n\t\t\t\t\t\t  Welcome Folks");
			System.out.println("-----------------------------------------" + date + "------------------------------------------\n");
			System.out.println("\t\t\t  Login Module");
			System.out.print("\n1.Admin Login\n2.User Login\n\nSelect an option: ");
			int loginOption = 0;
			try { loginOption = S.nextInt(); S.nextLine(); } // for clearing the input buffer
			catch(InputMismatchException im) {
				System.err.println("Enter correct option!");
				S.nextLine(); // For clearing the input buffer
				continue outer;
			}
			boolean b = false;
			inner:
			while(!b) {
				switch(loginOption) {
//				Admin login
				case 1 -> {
					int adminID = adminLogin();
					if(!(adminID == -11)) {
						if(checkingAdmin(adminID)) {
							b = true;
							System.out.println("\n`Welcome Admin`");
//							Calls the admin options method to display the admin functionalities
							c.adminOptions();
						}else { System.err.println("Entered details are incorrect\n"); }
					}else { break inner; }
				}
//				User login
				case 2 -> {
					int choice = userLogin();
					if(choice == 1) {
						b = true;
						if(checkingUser()) {
//							Calls the otpGeneration method
							otpGeneration();
							System.out.print("\nEnter OTP : ");
							int enteredOTP = S.nextInt(); S.nextLine(); // Consume the newLine character from the nextInt().
//							Calls the options() method in Cricket class if true
							if(OtpVerification(enteredOTP)) {
								System.out.println("Login Successful\n");
//								Setting the admin username and password declared in the AbstractLogin class
								c.userOptions();	
							} else {
								System.err.println("OTP not valid\n");
								otpGeneration();
							}
						} else {
							System.err.println("No match found");
							userLogin();
						}
					}else if(choice == 2){
						userLogin();
					}else if(choice == 0)
						break inner;
				}
				default -> {
					System.err.println("Enter correct option!");
					break inner;}
				}
			}
		}
	}
//	Admin Login
	public int adminLogin() {
		while(true) {
			System.out.println("\t\t\tAdmin Login Page ---> Welcome\n");
//			Admin username
			System.out.print("Admin username (0 to exit): ");
			gnAdminUname = S.nextLine().toLowerCase();
			if(gnAdminUname.equals("zero") || gnAdminUname.equals("0"))
				return -11;
//			Admin password
			System.out.print("\nAdmin password: ");
			gnAdminPass = S.nextLine();
			inner:
			while(true) {
				int adminID;
				try {
					System.out.print("\nEnter Admin ID: ");
					adminID = S.nextInt(); S.nextLine(); // For clearing the input buffer
					return adminID;
				}catch(InputMismatchException im) {
					System.err.println("Enter valid UID!!\n"); S.nextLine(); // For clearing the input buffer
					continue inner;
				}
			}
		}
	}
//	Admin signup
	public void adminSignup() {
//		TODO
	}
	
//	Checking admin is present or not
	private boolean checkingAdmin(int adminID) throws SQLException{
		ps = conn.prepareStatement("Select * from admin_details where admin_name = ? and password = ?;");
		ps.setString(1, gnAdminUname); ps.setString(2, gnAdminPass);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int ID = rs.getInt("admin_ID");
			if(ID == adminID) {
				return true;
			}
		}
		return false;
	}
	
//	User login
	public int userLogin() throws SQLException{
		while(true) {
			System.out.println("\t\t\tUser Login Page ---> Welcome\n");
			System.out.print("1.Login User\n2.Sign Up or Register New User\n\nEnter option (0 to exit): ");
			try { 
				int option = S.nextInt(); S.nextLine();
				switch(option) {
				case 0 -> { return 0; }
				case 1 -> { loginUser(); return 1; }
				case 2 -> { signupUser(); return 2; }
				default -> { System.err.println("Enter valid option\n"); }
				}
			}
			catch(InputMismatchException ie) { System.err.println("Enter valid option\n"); S.nextLine(); }
		}
	}
	
	private void loginUser() {
//		User name
		System.out.print("\nEnter Username: ");
		givenUsername = S.nextLine().toLowerCase();
//		Password
		System.out.print("\nEnter Password: ");
		givenUserPass = S.nextLine();
		while(true) {
			try {
				System.out.print("\nEnter 4 digit UID number: ");
				givenUserUID = S.nextInt(); S.nextLine(); // Clearing the input buffer
				int digits = String.valueOf(givenUserUID).length();	
				
				if(digits == 4 && ! String.valueOf(givenUserUID).contains("0")) { break; }
				else { System.err.println("Enter number in correct form!\n"); }
				
			} catch(InputMismatchException e) {
				System.err.println("Enter number in correct form!\n"); S.nextLine(); // For clearing the input buffer
			}
		}
	}
	
	private void signupUser() throws SQLException{
//		User name
		System.out.print("\nEnter Username: ");
		givenUsername = S.nextLine().toLowerCase();
//		Password
		System.out.print("\nEnter Password: ");
		givenUserPass = S.nextLine();
		cPass = passwordConfirm(); // Confirming password
		email = emailVerify(); // Getting email

		while(true) {
			try {
				System.out.print("\nEnter 4 digit UID number (avoid 0): ");
				givenUserUID = S.nextInt();
				S.nextLine(); // Clearing the input buffer
				int digits = String.valueOf(givenUserUID).length();	
				
				if(digits == 4 && ! String.valueOf(givenUserUID).contains("0")) { break; }
				else { System.err.println("\nEnter number in correct form!\n"); }
				
			} catch(InputMismatchException e) {
				System.err.println("\nEnter number in correct form!\n"); S.nextLine(); // For clearing the input buffer
			}
		}
		
		if(! checkingUser()) {
			c.userDetailsSetter(givenUserUID, givenUsername, givenUserPass, cPass, email);
			System.out.println("Sign Up Successful");
		} else {
			System.out.println("User already exist");
		}
	}
	private String passwordConfirm() {
		System.out.print("Confirm Password: ");
		String cPass = S.nextLine();
		
		return cPass;
	}
	private String emailVerify() {
		System.out.print("Enter e-mail: ");
		String email = S.nextLine();
		
		return email;
	}
	
//	Checking whether the user is present or not in database
	public boolean checkingUser() throws SQLException {
		ps = conn.prepareStatement("select * from user_details where username = ? and UID = ?;");
		ps.setString(1, givenUsername); ps.setInt(2, givenUserUID);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String pass = rs.getString("password");			
			if(givenUserPass.equals(pass)) {
				return true;
			}
		}
		System.out.println("Details entered are incorrect\n");
		return false;
	}
	
//	User login details
	public void userDetails() {
		System.out.print("Do you want to display password?: ");
		String yesOrNo = S.nextLine().toLowerCase();
		
		if(yesOrNo.equals("yes") || yesOrNo.equals("s")) {
			userDetailsGetter();
			System.out.println("\nPassword: " + userPasswordGetter() + "\n");
			
		}else if(yesOrNo.equals("no") || yesOrNo.equals("no bro")) {
			System.out.println("Okay! Your password is Safe!!");
			userDetailsGetter();
		}
	}
//	Admin login details
	public void adminDetails() {
		System.out.print("Do you want to display password?: ");
		String yesOrNo = S.nextLine().toLowerCase();
		
		if(yesOrNo.equals("yes") || yesOrNo.equals("s")) { adminDetailsGetter(); System.out.print("\nPassword: "); System.err.println(adminPasswordGetter() + "\n"); }
		else if(yesOrNo.equals("no") || yesOrNo.equals("no bro")) { System.out.println("Okay! Admin Your password is Safe!!"); adminDetailsGetter(); }
	}
//	OTP Generation
	protected void otpGeneration() {
		SecureRandom ran = new SecureRandom();
		generatedOTP = (100000 + ran.nextInt(900000)); // Generates 6 digit random number
		otpGenerationTime = System.currentTimeMillis(); // Gets the otp generated time
		System.out.println("Your OTP : " + generatedOTP);
	}
	
//	User details getter method
	public void userDetailsGetter() { System.out.println("\nUsername: " + userNameGetter() + "\nUnique Identity Number: " + userIDGetter() + "\n"); }
//	Admin details getter method
	public void adminDetailsGetter() { System.out.println("\nAdmin username: " + adminNameGetter() + "\nAdmin ID: " + adminIDGetter() + "\n"); }
	
//	OTP Verification
	protected boolean OtpVerification(int enteredOTP) {
		if(System.currentTimeMillis() - otpGenerationTime > 60000) { // Checks if the OTP crossed 1 minute post generation
			System.out.println("OTP Expired");
			return false;
		}
		return enteredOTP == generatedOTP; 
	}
}
