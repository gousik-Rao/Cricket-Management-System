package Prototype.Application;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unused")
class TeamDetails extends GetPrompt{
//	Initial mens team details in a 2D string array
	static String[][] initialMensTeamDetails = {
			{"\nTeam_Name",			"Board_Name",						"Headquaters",						"CEO",							"Test Captain",			"ODI Captain",			"T20I Captain",				"Head Coach",				"Test Championship",	"ODI World Cup",	"T20I World Cup\n"},
			{"India",				"Board of Control for Cricket in India","Mumbai",						"Jay Shah",						"Rohit Sharma",			"Rohit Sharma",			"Hardik Pandya",			"Gautam Ghambir",			"Nil",					"2",				"2"},
			{"Australia",			"Cricket Australia",				"Melbourne",						"Nick Hockley",					"Pat Cummins",			"Pat Cummins",			"Mitchell Marsh",			"Andrew McDonald",			"1",					"5",				"2"},
			{"New Zealand",			"New Zealand Cricket",				"Auckland",							"Scott Weenik",					"TBA",					"TBA",					"TBA",						"Gary Stead",				"1",					"Nil",				"Nil"},
			{"South Africa",		"Cricket South Africa",				"Johannsburg, Gauteng",				"Pholetsi Moseki",				"Aiden Markram",		"Aiden Markram",		"Aiden Markram",			"Rob Walter",				"Nil",					"Nil",				"Nil"},
			{"Zimbabwe",			"Zimbabwe Cricket",					"Harare Sports Club",				"Jhonty Rhodes",				"Craig Ervine",			"Craig Ervine",			"Sikandar Raza",			"Justin Sammons",			"Nil",					"Nil",				"Nil"},
			{"West Indies",			"Cricket West Indies",				"St. John's, Antigua and Barbuda",	"Jhonny Grave",					"Kraigg Braithwaite",	"Shai Hope",			"Rovman Powell",			"Darren Sammy",				"Nil",					"2",				"1"},
			{"England",				"England and Wales Cricket Board",	"Lord's Cricket Ground",			"Richard Gould",				"Ben Stokes",			"Jos Buttler",			"Jos Buttler",				"Mathew Mott",				"Nil",					"1",				"1"},
			{"Afghanistan",			"Afghanistan Cricket Board",		"Kabul International Cricket Stadium","Naseeb Khan",				"Hashmatullah Shahidi",	"Hashmatullah Shahidi",	"Rashid Khan",				"Jonathan Trott",			"Nil",					"Nil",				"Nil"},
			{"Pakistan",			"Pakistan Cricket Board",			"Gaddafi International Stadium",	"Gary Kristen",					"Mohtashim Rasheed",	"Shan Masoodwaite",		"Babar Azam",				"Babar Azam",				"Nil",					"Nil",				"Nil"},
			{"Ireland",				"Cricket Ireland",					"Clontarf & Malahide, Dublin",		"Warren Deutrom",				"Andrew Balbirnie",		"Paul Stirling",		"Paul Stirling",			"Heinrich Malan",			"Nil",					"Nil",				"Nil"},
			{"Bangladesh",			"Banladesh Cricket Board",			"Sher-e-Bangla National Cricket Stadium","Nizam Uddin Chowdhury",	"Najmul Hossain Shanto","Najmul Hossain Shanto","Najmul Hossain Shanto",	"Chandika Hathurusingha",	"Nil",					"Nil",				"Nil"},
			{"Sri Lanka",			"Sri Lanka Cricket",				"Sinhalese Sports Club",			"Ashley de Silva",				"Dhananjaya De Silva",	"Kusal Mendis",			"Kusal Mendis",				"Sanath Jeyasuriya",		"Nil",					"1",				"1"},
	};
//	Initial womens team details in 2D string array
	static String[][] initialWomensTeamDetails = { // Need to be changed
			{"\nTeam_Name",			"Board_Name",						"Headquaters",						"CEO",							"Test Captain",			"ODI Captain",			"T20I Captain",				"Head Coach",				"ODI World Cup",	"T20I World Cup\n"},
			{"India",				"Board of Control for Cricket in India","Mumbai",						"Jay Shah",						"Harmanpreet Kaur",		"Harmanpreet Kaur",		"Harmanpreet Kaur",			"Gautam Ghambir",			"2",				"2"},
			{"Australia",			"Cricket Australia",				"Melbourne",						"Nick Hockley",					"Pat Cummins",			"Pat Cummins",			"Mitchell Marsh",			"Andrew McDonald",			"5",				"2"},
			{"New Zealand",			"New Zealand Cricket",				"Auckland",							"Scott Weenik",					"TBA",					"TBA",					"TBA",						"Gary Stead",				"Nil",				"Nil"},
			{"South Africa",		"Cricket South Africa",				"Johannsburg, Gauteng",				"Pholetsi Moseki",				"Aiden Markram",		"Aiden Markram",		"Aiden Markram",			"Rob Walter",				"Nil",				"Nil"},
			{"Zimbabwe",			"Zimbabwe Cricket",					"Harare Sports Club",				"Jhonty Rhodes",				"Craig Ervine",			"Craig Ervine",			"Sikandar Raza",			"Justin Sammons",			"Nil",				"Nil"},
			{"West Indies",			"Cricket West Indies",				"St. John's, Antigua and Barbuda",	"Jhonny Grave",					"Kraigg Braithwaite",	"Shai Hope",			"Rovman Powell",			"Darren Sammy",				"2",				"1"},
			{"England",				"England and Wales Cricket Board",	"Lord's Cricket Ground",			"Richard Gould",				"Ben Stokes",			"Jos Buttler",			"Jos Buttler",				"Mathew Mott",				"1",				"1"},
			{"Afghanistan",			"Afghanistan Cricket Board",		"Kabul International Cricket Stadium","Naseeb Khan",				"Hashmatullah Shahidi",	"Hashmatullah Shahidi",	"Rashid Khan",				"Jonathan Trott",			"Nil",				"Nil"},
			{"Pakistan",			"Pakistan Cricket Board",			"Gaddafi International Stadium",	"Gary Kristen",					"Mohtashim Rasheed",	"Shan Masoodwaite",		"Babar Azam",				"Babar Azam",				"Nil",				"Nil"},
			{"Ireland",				"Cricket Ireland",					"Clontarf & Malahide, Dublin",		"Warren Deutrom",				"Andrew Balbirnie",		"Paul Stirling",		"Paul Stirling",			"Heinrich Malan",			"Nil",				"Nil"},
			{"Bangladesh",			"Banladesh Cricket Board",			"Sher-e-Bangla National Cricket Stadium","Nizam Uddin Chowdhury",	"Najmul Hossain Shanto","Najmul Hossain Shanto","Najmul Hossain Shanto",	"Chandika Hathurusingha",	"Nil",				"Nil"},
			{"Sri Lanka",			"Sri Lanka Cricket",				"Sinhalese Sports Club",			"Ashley de Silva",				"Dhananjaya De Silva",	"Kusal Mendis",			"Kusal Mendis",				"Sanath Jeyasuriya",		"1",				"1"},
	};
//	Instance variables of type 2D ArrayList<String> used to store the team details
	ArrayList<ArrayList<String>> allMensTeamDetails;
	ArrayList<ArrayList<String>> allWomensTeamDetails;
//	Temporary array list to get the team details and then add it to the main array list
	ArrayList<ArrayList<String>> addedTeamDetails;
	
	// Default constructor
	public TeamDetails() { super(); }
	// Parameterized  constructor
	public TeamDetails(Cricket cricket) {
//		Aggregation
		this.addedTeamDetails = new ArrayList<>();
		this.allMensTeamDetails = new ArrayList<>();
		this.allWomensTeamDetails = new ArrayList<>();
//		Adding the string 2D array to a 2D array list
		for(String[] teams : initialMensTeamDetails) {
			ArrayList<String> teamList = new ArrayList<String>();
			for(String details : teams) { teamList.add(details); }
			allMensTeamDetails.add(teamList);
		}
		for(String[] teams : initialWomensTeamDetails) {
			ArrayList<String> teamList = new ArrayList<String>();
			for(String details : teams) { teamList.add(details); }
			allWomensTeamDetails.add(teamList);
		}
	}
//	Options display method
	public void teams() throws SQLException {
		String detailsOption;
		outer:
		do {
			System.out.print("\n1.Individual team details\n2.Show all team details\n3.Exit\n");
			System.out.print("\nEnter an option: ");
			detailsOption = S.nextLine().toLowerCase();
			System.out.println();
			
//			switch between individual and all team details method
			switch(detailsOption) {
			case "1" -> individualTeamDetails();
			case "2" -> allTeamDetails();
			case "3", "exit" -> { break; }
			default ->  { System.out.println("Enter valid option"); }
			}
		}while(! (detailsOption.equalsIgnoreCase("exit") || detailsOption.equalsIgnoreCase("3")));
	}
	
//	Individual team details
	public void individualTeamDetails() throws SQLException{
		loop:
		do {
			System.out.println("\n\t\t\tInternational Cricket Council Member Details");
			System.out.print("\nEnter ICC Full Member Nation (or 'exit'): ");
			teamName = S.nextLine();
			
			if(teamName.equalsIgnoreCase("exit")) {
				break loop;
			}
			
			ps = conn.prepareStatement("Select * from mens_teams where team_name = ?;");
			ps.setString(1, teamName);
			
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnSize = rsmd.getColumnCount();
			System.out.println();
			
			if(rs.next()) {
				for (int i = 1; i <= columnSize; i++) {
					String columnName = rsmd.getColumnName(i);
					Integer columnType = rsmd.getColumnType(i);
					
					switch(columnType) {
					case java.sql.Types.INTEGER -> {
						int intValue = rs.getInt(i);
						System.out.println(columnName + ": " + intValue);
					}
					case java.sql.Types.VARCHAR,
						 java.sql.Types.CHAR -> {
						String strValue = rs.getString(i);
						if(columnName.equalsIgnoreCase("format")) {
							switch(strValue) {
							case "Test" -> { System.out.println("World Test Championship"); break; }
							case "ODI" -> { System.out.println("Cricket World Cup"); break; }
							case "T20I" -> { System.out.println("t20I World Cup"); break; }
							default -> { System.out.println("Unknown Format"); }
							}
						} else {
							System.out.println(columnName + ": " + strValue);
						}
					}
					case java.sql.Types.DATE -> {
						System.out.println(columnName + ": " + rs.getDate(i));
					}
					case java.sql.Types.BOOLEAN -> {
						System.out.println(columnName + ": " + rs.getBoolean(i));
					}
					}
				}
				System.out.println();
			} else {
				System.out.println("No Team present in the name '" + teamName);
			}
		}while(! teamName.equalsIgnoreCase("exit"));
	}
	
	void dummy() throws SQLException{
		outerloop:
		while(true) {
			promptTeamType();
//			Exit statement
			if(teamType.equals("exit")) { break outerloop; }
//			All mens team details
			else if(teamType.equals("mens") || teamType.equals("men") || teamType.equals("m")) {
				ps = conn.prepareStatement("Select * from mens_teams");
			}
//			All womens team details
			else if(teamType.equals("womens") || teamType.equals("women") || teamType.equals("w")) {
				int[] columnWidths = getColumnWidth(initialWomensTeamDetails);
				printingWomensTeamDetails(columnWidths);
			}
		}
	}
	
//	All team details method
	public void allTeamDetails() {
		outerloop:
		while(true) {
			promptTeamType();
//			Exit statement
			if(teamType.equals("exit")) { break outerloop; }
//			All mens team details
			else if(teamType.equals("mens") || teamType.equals("men") || teamType.equals("m")) {
				int[] columnWidths = getColumnWidth(initialMensTeamDetails);
				printingMensTeamDetails(columnWidths);
			}
//			All womens team details
			else if(teamType.equals("womens") || teamType.equals("women") || teamType.equals("w")) {
				int[] columnWidths = getColumnWidth(initialWomensTeamDetails);
				printingWomensTeamDetails(columnWidths);
			}
		}
	}
//	Printing each column based on the column widths for mens teams
	public void printingMensTeamDetails(int[] columnWidths) {
		for(ArrayList<String> teams : allMensTeamDetails) {
			int j = 0;
			try{Thread.sleep(200);}
			catch(InterruptedException ie) {}
			for(String detail : teams) {
				System.out.printf("%-" + (columnWidths[j] + 4) + "s", detail); // '%' used as a placeholder, '-' used to align the output in the left for pretty look, 															   // 's' used to print strings
				j++;
			}
			System.out.println("\n");
		}
	}
//	Printing each column based on the column widths for womens team
	public void printingWomensTeamDetails(int[] columnWidths) {
		for(ArrayList<String> teams : allWomensTeamDetails) {
			int j = 0;
			try{Thread.sleep(200);}
			catch(InterruptedException ie) {}
			for(String detail : teams) {
				System.out.printf("%-" + (columnWidths[j] + 4) + "s", detail); // '%' used as a placeholder, '-' used to align the output in the left for pretty look,
				j++;   															   // 's' used to print strings
			}
			System.out.println("\n");
		}
	}
//	Getting each column width, which is used to print the details in a readable manner with proper spacing
	public int[] getColumnWidth(String[][] arrayDetails) {
		int[] maxColumnWidth = new int[arrayDetails[0].length];
		for(int i = 0; i < arrayDetails.length; i++) {
			for(int j = 0; j < arrayDetails[i].length; j++) {
				if(arrayDetails[i][j].length() > maxColumnWidth[j]) {
					maxColumnWidth[j] = arrayDetails[i][j].length();
				}
			}
		}
		return maxColumnWidth;
	}
//	Printing team details
	void gettingDetails(String teamName, ArrayList<String> row) {
		for(int col = 1; col <= 3; col++) { // Indices 1, 2, 3 correspond to the 2nd, 3rd, and 4th columns
			try{Thread.sleep(200);}
			catch(InterruptedException ie) {}
	        if(col == 1) {System.out.printf("%n%nBoard name: %s%n", row.get(col));
	        }else if(col == 2) {System.out.printf("Head Quaters: %s%n", row.get(col));
	        }else if(col == 3) {System.out.printf("Chief Executive Officer: %s%n", row.get(col));
	        }
	    }
		outerLoop:
		while(true) {
			promptTeamType();	
			if(teamType.equals("exit")) {break outerLoop;}
			else if(teamType.equals("mens") || teamType.equals("men")){
				innerLoop:
				while(true) {
					formatType();
					if(format.equals("exit")) {break outerLoop;}
					else if(format.equals("test") || format.equals("tests")){
						for(int col = 1, i = 4; col <= 3; col++) {
							try{Thread.sleep(200);}
							catch(InterruptedException ie) {}
							if(i == 4) {System.out.printf("%nTest Captain: %s%n", row.get(i)); i = 7;}
							else if(i == 7) {System.out.printf("Head Coach: %s%n", row.get(i)); i = 8;}
							else if(i == 8) {System.out.printf("World Test Championships: %s%n", row.get(i));}
						}
					}else if(format.equals("odi") || format.equals("one day international")) {
						for(int col = 1, i = 5; col <= 3; col++) {
							try{Thread.sleep(200);}
							catch(InterruptedException ie) {}
							if(i == 5) {System.out.printf("%nODI Captain: %s%n", row.get(i)); i = 7;}
							else if(i == 7) {System.out.printf("Head Coach: %s%n", row.get(i)); i = 9;}
							else if(i == 9) {System.out.printf("Cricket World Cups: %s%n", row.get(i));}
						}
					}else if(format.equals("t20i") || format.equals("t20 international") || format.equals("twenty 20 international") || 
							format.equals("twenty 20") || format.equals("t20")) {
						for(int col = 1, i = 6; col <= 3; col++) {
							try{Thread.sleep(200);}
							catch(InterruptedException ie) {}
							if(i == 6) {System.out.printf("%nt20I Captain: %s%n", row.get(i)); i = 7;}
							else if(i == 7) {System.out.printf("Head Coach: %s%n", row.get(i)); i = 10;}
							else if(i == 10) {System.out.printf("t20I World Cups: %s%n", row.get(i));}
						}
					}else {
						System.err.println("Enter valid format");
					}
				}
			}else if(teamType.equals("womens") || teamType.equals("women")) {
				innerLoop:
				while(true) {
					ArrayList<String> womensRow = new ArrayList<>();
					for(int j = 0; j < allWomensTeamDetails.size(); j++) {
						womensRow = allWomensTeamDetails.get(j);
						if(womensRow.contains(teamName)) {
							womensRow = allWomensTeamDetails.get(j);
							break;
						}
					}
					formatType(); // Calling the formatType() method in the get prompt class
					if(format.equals("exit")) {break outerLoop;}
					else if(format.equals("tests") || format.equals("test")){
						for(int col = 1, i = 4; col <= 3; col++) {
							try{Thread.sleep(200);}
							catch(InterruptedException ie) {}
							if(i == 4) {System.out.printf("%nTest Captain: %s%n", womensRow.get(i)); i = 7;}
							else if(i == 7) {System.out.printf("Head Coach: %s%n", womensRow.get(i));}
						}
					}else if(format.equals("odi") || format.equals("one day international")){
						for(int col = 1, i = 5; col <= 3; col++) {
							try{Thread.sleep(200);}
							catch(InterruptedException ie) {}
							if(i == 5) {System.out.printf("%nODI Captain: %s%n", womensRow.get(i)); i = 7;}
							else if(i == 7) {System.out.printf("Head Coach: %s%n", womensRow.get(i)); i = 8;}
							else if(i == 8) {System.out.printf("Cricket World Cups: %s%n%n", womensRow.get(i));}
						}
					}else if(format.equals("t20i") || format.equals("t20 international") || format.equals("twenty 20 international") || format.equals("twenty 20")){
						for(int col = 1, i = 6; col <= 3; col++) {
							try{Thread.sleep(200);}
							catch(InterruptedException ie) {}
							if(i == 6) {System.out.printf("%nT20I Captain: %s%n", womensRow.get(i)); i = 7;}
							else if(i == 7) {System.out.printf("Head Coach: %s%n", womensRow.get(i)); i = 9;}
							else if(i == 9) {System.out.printf("t20I World Cups: %s%n%n", womensRow.get(i));}
						}
					}else {
						System.err.println("Enter valid format");
					}
				}
			}else {
				System.out.println("Please enter valid Team type!");
			}
		}
	}
//	Select what details you want to enter
	public void whichDetailsToAdd(){
		outerLoop:
		while(true) {
			promptTeamType();
//			Exit statement
			if(teamType.equals("exit")) {
				System.out.println();
				break outerLoop;
			}
//			Adding mens team details
			else if(teamType.equals("mens") || teamType.equals("men") || teamType.equals("m")) {
				System.out.print("\nHow many Mens team details you want to add: ");
				int rows = S.nextInt(); S.nextLine(); // For consuming the character in the buffer
				noOfTeamsToRemoveLoop:
				for(int i = 1; i <= rows; i++) {
					System.out.print("\nEnter the team " + i + " name to check if it exists in the ICC teams list: ");
					String searchTeam = S.nextLine();
					boolean contains = false;
					System.out.print("Checking");
					iterateEachRowLoop:
					for(int j = 0; j < allMensTeamDetails.size(); j++) {
						try{ Thread.sleep(700); }
						catch(InterruptedException ie) {}
						System.out.print(".");
						ArrayList<String> row = allMensTeamDetails.get(j);
						if(row.get(0).equalsIgnoreCase(searchTeam)) {
							contains = true;
							break iterateEachRowLoop;
						}
					}
					if(!contains) {
						System.out.println("\n" + searchTeam  + " is not in the list ---> Proceed");
						addNewMensTeamDetails(1, searchTeam);
					}else {System.out.println("\n" + searchTeam + " already exists in the ICC teams list!!");}
				} // Removing womens team details
			}else if(teamType.equals("womens") || teamType.equals("women") || teamType.equals("w")) {
				System.out.print("How many Womens team details you want to add: ");
				int rows = S.nextInt(); S.nextLine(); // For consuming the character in the buffer
				noOfTeamsToRemoveLoop:
				for(int i = 1; i <= rows; i++) {
					System.out.println("\nEnter the team " + i + " name to check if it exists in the ICC teams list: ");
					String searchTeam = S.nextLine();
					boolean contains = false;
					System.out.print("Checking");
					iterateEachRowLoop:
					for(int j = 0; j < allWomensTeamDetails.size(); j++) {
						try{Thread.sleep(700);}
						catch(InterruptedException ie) {}
						System.out.print(".");
						ArrayList<String> row = allWomensTeamDetails.get(j);
						if(row.get(0).equalsIgnoreCase(searchTeam)) {
							contains = true;
							break iterateEachRowLoop;
						}
					}
					if(!contains) {
						System.out.println(searchTeam  + " team is not in the list ---> Proceed");
						addNewWomensTeamDetails(1, searchTeam);
					}else {System.out.println(searchTeam + " already exists in the ICC teams list!!");}
				}
			}
		}
	}
//	Enter additional team details for admin module
	public void addNewMensTeamDetails(int rows, String searchTeam) {
		int cols = 11;
//		S.nextLine(); // Clearing input buffer
		String[][] all = new String[rows][cols]; // Initialization after getting the rows value
		addedTeamDetails.clear(); // Clearing all details which are present in the array list
		for(int i=0; i < rows; i++) {
			int j = 0;
			System.out.printf("\nTeam name: %s%n", searchTeam);
			all[i][j++] = searchTeam;
			System.out.print("Enter Board name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter Team Headquaters: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter Test Captain name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter ODI Captain name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter T20I Captain name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter Head Coach name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter CEO name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter No.of Test Championship title: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter no.of ODI Worldcup title: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter no.of T20I Worldcup title: ");
			all[i][j] = S.nextLine();
			for(String[] teams : all) {
				ArrayList<String> teamList = new ArrayList<>(Arrays.asList(teams));
				addedTeamDetails.add(teamList);
			}
		}
//		Adding all the newly added team details into old array list
		allMensTeamDetails.addAll(addedTeamDetails);
		System.out.println("\nTeam Details Added Succefully at local time : " + date + "\n");
	}
//	Add womens team details-00
	public void addNewWomensTeamDetails(int rows, String searchTeam) {
		int cols = 10;
		S.nextLine(); // Clearing input buffer
		System.out.println();
		addedTeamDetails.clear(); // Clearing all the details which are present in the array list
		String[][] all = new String[rows][cols]; // Initialization after getting the rows value
		for(int i=0; i < rows; i++) {
			int j = 0;
			System.out.printf("\nTeam name: %s%n", searchTeam);
			all[i][j++] = searchTeam;
			System.out.print("Enter Board name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter Team Headquaters: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter Test Captain name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter ODI Captain name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter T20I Captain name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter Head Coach name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter CEO name: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter no.of ODI Worldcup title: ");
			all[i][j++] = S.nextLine();
			System.out.print("Enter no.of T20I Worldcup title: ");
			all[i][j] = S.nextLine();
			for(String[] teams : all) {
				ArrayList<String> teamList = new ArrayList<>(Arrays.asList(teams));
				addedTeamDetails.add(teamList);
			}
		}
//		Adding all the newly added team details into old array list
		allWomensTeamDetails.addAll(addedTeamDetails);
		System.out.println("\nTeam Details Added Succefully \t\t" + date + "\n");
	}
//	Which details to delete or remove
	public void whichDetailsToRemove() {
		Loop:
		while(true) {
			promptTeamType();
//			Exit statement
			if(teamType.equals("exit")) {
				System.out.println();
				break Loop;
			}
//			Removing mens team details
			else if(teamType.equals("mens") || teamType.equals("men") || teamType.equals("m")) {
				System.out.print("\nHow many Mens team details you want to remove: ");
				int rows = S.nextInt(); S.nextLine(); // For consuming the character in the buffer
				noOfTeamsToRemoveLoop:
				for(int i = 1; i <= rows; i++) {
					System.out.print("\nEnter the team " + i + " name: ");
					String searchTeam = S.nextLine();
					boolean contains = false;
					ArrayList<String> row = new ArrayList<>();
					iterateEachRowLoop:
					for(int j = 0; j < allMensTeamDetails.size(); j++) {
						row = allMensTeamDetails.get(j);
						if(row.get(0).equalsIgnoreCase(searchTeam)) {
							contains = true;
							row = allMensTeamDetails.get(j);
							break iterateEachRowLoop;
						}
					}
					if(contains) { removeMensTeamDetails(1, row); }
					else { System.out.println(searchTeam + " doesnot exists in the ICC teams list!!"); }
				} 
				System.out.println("\nTeams removed Successfully"); try { Thread.sleep(3000); } catch(InterruptedException ie) {}
				break Loop; 
//			Removing womens team details
			}else if(teamType.equals("womens") || teamType.equals("women") || teamType.equals("w")) {
				System.out.print("\nHow many Womens team details you want to remove: ");
				int rows = S.nextInt(); S.nextLine(); // For consuming the character in the buffer
				noOfTeamsToRemoveLoop:
				for(int i = 1; i <= rows; i++) {
					System.out.print("\nEnter the team " + i + " name: ");
					String searchTeam = S.nextLine();
					boolean contains = false;
					ArrayList<String> row = new ArrayList<>();
					iterateEachRowLoop:
					for(int j = 0; j < allWomensTeamDetails.size(); j++) {
						row = allWomensTeamDetails.get(j);
						if(row.get(0).equalsIgnoreCase(searchTeam)) {
							contains = true;
							break iterateEachRowLoop;
						}
					}
					if(contains) { removeWomensTeamDetails(1, row); }
					else { System.out.println(searchTeam + " doesnot exists in the ICC teams list!!"); }
				} 
				System.out.println("Teams removed Successfully \t\t" + date + "\n");
				break Loop;
			}
		}
	}
//	Removing details
	public void removeMensTeamDetails(int rows, ArrayList<String> removeRow) {
		System.out.print("\nConfirm removal (1 -> Proceed / 0 -> Cancel): ");
		int confirmOption = S.nextInt(); S.nextLine();
		int count = 0;
		if(confirmOption == 0) {
			System.err.println("\nOperation Cancelled");
		}else if(confirmOption == 1) {
			allMensTeamDetails.remove(removeRow);
			System.out.println("\nRow removed successfully");
		}else if(count <= 3){ 
			System.err.println("\nEnter valid Option!");
			removeMensTeamDetails(rows, removeRow);
		}else {
			System.err.println("Sorry! Multiple wrong attempts!!");
		}
	}
	public void removeWomensTeamDetails(int rows, ArrayList<String> removeRow) {
		System.out.print("Confirm removal (1 -> Proceed / 0 -> Cancel): ");
		int confirmOption = S.nextInt(); S.nextLine();
		int count = 0;
		if(confirmOption == 0) {
			System.err.println("\nOperation Cancelled");
		}else if(confirmOption == 1) {
			allWomensTeamDetails.remove(removeRow);
			System.out.println("Row removed successfully");
		}else if(count <= 3){ 
			System.err.println("\nEnter valid Option!"); count++;
			removeWomensTeamDetails(rows, removeRow);
		}else {
			System.err.println("Sorry! Multiple wrong attempts!!");
		}
	}
	void removeTeam(ArrayList<String> teamList, String searchTeam) {
//		TODO
	}
	
//	Modifying details methods
	public void whichDetailsToModify() {
		Outer:
		while(true) {
			promptTeamType();
			if(teamType.equals("exit")) {
				System.out.println();
				break Outer;
			}else if(teamType.equals("mens") || teamType.equals("men")) {
				
			}else if(teamType.equals("womens") || teamType.equals("women")) {
				
			}
		}
	}
}







