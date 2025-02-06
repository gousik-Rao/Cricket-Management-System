package Prototype.Application;

import java.sql.SQLException;

class Cricket extends AbstractLogin{
		
	protected String teamName, teamType, format;
	protected int edition;
	
	private ModifyDetails md;
	private TournamentDetails tmd;
	private PlayerProfiles pr;
	
//	Default constructor
	public Cricket() { super(); }
//	Copy constructor
	public Cricket(LoginMain login) { super(login); }
//	Initialization method
	void initialization() {
		md = new ModifyDetails(this);
		tmd = new TournamentDetails();
		pr = new PlayerProfiles();
	}
	public void userOptions() throws SQLException{
		loop:
		while(true) {
			System.out.println("\t\t\tMarylebone Cricket Council (MCC) in control with ICC\n");
			System.out.println("------------------------------" + date + "--------------------------");
			System.out.println("\n1.Team Details");
			System.out.println("2.ICC Tournament Details");
			System.out.println("3.Player Profiles");
			System.out.println("4.User Login Details");
			System.out.println("5.Logout\n");
			System.out.print("Select an option: ");
			int option = S.nextInt();
			S.nextLine(); // Consume the new line character
			switch (option) {
			case 1 -> { md.teams(); }
			case 2 -> { tmd.tournaments(); }
			case 3 -> { pr.playerProfiles(); }
			case 4 -> { log.userDetails(); }
			case 5 -> {
				System.out.println("Logged Out\n");
				break loop;
			}
			default -> { System.out.println("Select valid option !!!\n"); }
			}		
		}
	}
//	Admin options method
	public void adminOptions() throws SQLException{
		loop:
		while(true) {
			System.out.println("\n\t\tMarylebone Cricket Council (MCC) in control with ICC\n");
			System.out.println("------------------------------" + date + "--------------------------");
			System.out.println("\n1.ICC Team Details");
			System.out.println("2.ICC Tournament Details");
			System.out.println("3.Player Profiles");
			System.out.println("4.Edit Details");
			System.out.println("5.Admin Details");
			System.out.println("6.Logout\n");
			System.out.print("Select an option: ");
			int option = S.nextInt();
			S.nextLine(); // Consume the new line character
			switch (option) {
//			To view team details
			case 1 -> { md.teams(); }
//			To view tournament details
			case 2 -> { tmd.tournaments(); }
//			To view player profiles
			case 3 -> { pr.playerProfiles(); }
//			To modify details
			case 4 -> { md.whatModification(); }
//			To view admin details
			case 5 -> { log.adminDetails(); }
			case 6 -> {
				System.out.println("Logged Out\n");
				break loop;
			}
			default -> { System.out.println("Select valid option !!!\n"); }
			}		
		}
	}
}
