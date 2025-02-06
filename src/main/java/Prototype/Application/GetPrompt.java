package Prototype.Application;

import java.util.InputMismatchException;

class GetPrompt extends Cricket{

//	Team type selection
	public String promptTeamType() {
	    System.out.print("\nSelect team type (Mens/Womens) or exit : ");
        teamType = S.nextLine().toLowerCase().trim(); // trim() to remove leading space
        return teamType;
    }
//	Format type selection
	public String formatType() {
		System.out.print("\nEnter format (Test/ODI/t20I) or exit: ");
		format = S.nextLine().toLowerCase().strip(); // strip() to remove leading space
		return format;
	}
//	Format selection for womens team since womens don't have test championship
	public String formatType1() {
		System.out.print("\nEnter format (ODI/t20I) or exit: ");
		format = S.nextLine().toLowerCase().strip();
		return format;
	}
//	Getting the world cup edition to display it
	public int getEdition() {
		switch (format) {
//		Test
		case "test", "tests" -> {
			while(true) {
				System.out.print("\nEnter the edition of " + teamType + " Test Championship you want (0 to exit):  ");
				return input();
			}
		}
//		ODI
		case "odi", "one day international" -> {
			System.out.print("\nEnter the edition of " + teamType + " ODI World Cup you want (0 to exit):  ");
			return input();
		}
//		T20I
		case "t20i", "t20", "t20 international" -> {
			System.out.print("\nEnter the edition of " + teamType + " t20I World Cup you want (0 to exit):  ");
			return input();
		}
		default -> { return -1; }
		}
	}
	private int input() {
		do {
			try { return S.nextInt(); }
			catch(InputMismatchException e) {
				System.err.println("Enter correct option!");
				S.nextLine();
				continue;
			}
		}while(true);
	}
}
