package Prototype.Application;


public class ModifyDetails extends TeamDetails{
	ModifyDetails(Cricket c){
		super(c);
	}
	
	void whatModification() {
		outer:
		while(true) {
			System.out.println("\n\t\t\t     Editing Options");
			System.out.println("-----------------------" + date + "----------------------");
			System.out.println("\n1.Teams Modification");
			System.out.println("2.Tournaments Modification");
			System.out.println("3.Players Modification");

			System.out.print("\nWhich modification you need to perform (0 to exit): ");
			String modify = S.nextLine().toLowerCase().strip();
			switch(modify) {
			case "teams", "team", "1" -> { teamModify(); break; }
			case "tournaments", "tournament", "2" -> { tournamentModify(); }
			case "players", "player", "players profiles", "player profile", "players profile",
				"player profiles", "3" -> { playerProfileModify(); }
			case "0", "exit" ->{ break outer; }
			default -> { System.out.println("Enter Valid Option"); }
			}
		}
	}
	
//	Team modification
	public void teamModify() {
		Outer:
		while(true) {
			System.out.println("\n\t\t\t     Team Modifications");
			System.out.println("-----------------------" + date + "----------------------");
			System.out.println("\n1.Add details");
			System.out.println("2.Modify details");
			System.out.println("3.Remove details");
			System.out.print("\nEnter an option (0 to exit): ");
			String modifyOption = S.nextLine().toLowerCase().strip();
			
			switch(modifyOption) {
			case "0", "exit" ->{ break Outer; }
			case "1", "add", "add details" -> { whichDetailsToAdd(); }
			case "2", "modify", "modify details" -> { whichDetailsToModify(); }
			case "3", "remove", "remove details" -> { whichDetailsToRemove(); }
			default -> { System.err.println("\nEnter Valid Option!!"); break; }
			}
		}	
	}
	
//	Tournament Modification
	public void tournamentModify() {
//		 TODO
	}
	
//	Player profile modification
	public void playerProfileModify() {
//		TODO
	}
}
