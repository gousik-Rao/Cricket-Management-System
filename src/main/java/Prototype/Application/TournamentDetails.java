package Prototype.Application;

import java.util.ArrayList;

public class TournamentDetails extends TeamDetails{
	ArrayList<String> mensTournament;
	ArrayList<String> womensTournament;
	// Default constructor
	public TournamentDetails() {
		super();
		mensTournament = new ArrayList<>();
		womensTournament = new ArrayList<>();
	}

	// Mens Championships
	// Test championship Mens
	protected void testChampionship(String teamType) {
		loop:
		while(true) {
			
			edition = getEdition();
			S.nextLine();
			System.out.println();
			if(edition == 0 ) {
				break loop;
			}else if(edition < 0) {
				System.out.println("Enter valid edition number!");
				System.out.println();
			}
			else {
				switch(edition) {
				case 1 -> {
					System.out.println("Tournament Year: 2019 - 2021\n"
							+ "Winners : New Zealand\n"
							+ "Runner-up : India\n"
							+ "Teams Participated : 9\n"
							+ "Player of the Final Match : Kyle Jamieson\n"
							+ "Player of the Series : Kane Williamson\n"
							+ "Highest Run Getter : Kane Williamson (918 runs)\n"
							+ "Highest Wicket Getter : Ravichandran Ashwin (71 wickets)\n"
							+ "Emerging Player : Devon Conway\n"
							+ "Most Economical Bowler : Kyle Jamieson");
				}
				case 2 -> {
					System.out.println("Tournament Year: 2021 - 2023\n"
							+ "Winners : Australia\n"
							+ "Runner-up : India\n"
							+ "Teams Participated : 9\n"
							+ "Player of the Final Match : Kyle Jamieson\n"
							+ "Player of the Series : Kane Williamson\n"
							+ "Highest Run Getter : Kane Williamson (918 runs)\n"
							+ "Highest Wicket Getter : Ravichandran Ashwin (71 wickets)\n"
							+ "Emerging Player : Devon Conway\n"
							+ "Most Economical Bowler : Kyle Jamieson");
				}
				default -> {
					if(edition == 3) {
						System.out.println(edition + "rd edition will happen in the future");
					}else {
						System.out.println(edition + "th edition will happen in the future");
					}
				}
				}
			}	
		}	
	}
	
	// t20I World cup Mens
	protected void t20WorldCupMens(String teamType) {
		loop:
		while(true) {
		
			edition = getEdition();
			S.nextLine();
			if(edition == 0) {
				break loop;
			}else if(edition < 0) {
				System.out.println("Enter valid edition number!");
			}
			else {
				switch(edition) {
				case 1 -> {
					System.out.println("Tournament Year : 2007\n"
							+ "Winner: India\n"
							+ "Runner-up: Pakistan\n"
							+ "Teams Participated: 12\n"
							+ "Player of the Final Match: Irfan Pathan\n"
							+ "Player of the Series: Shahid Afridi\n"
							+ "Highest Run Getter: Matthew Hayden (265 runs)\n"
							+ "Highest Wicket Getter: Umar Gul (13 wickets)\n"
							+ "Emerging Player: Rohit Sharma\n"
							+ "Most Economical Bowler: Daniel Vettori");
				}
				case 2 -> {
					System.out.println("Tournament Year : 2009\n"
							+ "Winner: Pakistan\n"
							+ "Runner-up: Sri Lanka\n"
							+ "Teams Participated: 12\n"
							+ "Player of the Final Match: Shahid Afridi\n"
							+ "Player of the Series: Tillakaratne Dilshan\n"
							+ "Highest Run Getter: Tillakaratne Dilshan (317 runs)\n"
							+ "Highest Wicket Getter: Umar Gul (13 wickets)\n"
							+ "Emerging Player: Angelo Mathews\n"
							+ "Most Economical Bowler: Saeed Ajmal");
				}
				case 3 -> {
					System.out.println("Tournament year : 2010\n"
							+ "Winner: England\n"
							+ "Runner-up: Australia\n"
							+ "Teams Participated: 12\n"
							+ "Player of the Final Match: Craig Kieswetter\n"
							+ "Player of the Series: Kevin Pietersen\n"
							+ "Highest Run Getter: Mahela Jayawardene (302 runs)\n"
							+ "Highest Wicket Getter: Dirk Nannes (14 wickets)\n"
							+ "Emerging Player: Steven Smith\n"
							+ "Most Economical Bowler: Daniel Vettori");
				}
				case 4 -> {
					System.out.println("Tournament year : 2012\n"
							+ "Winner: West Indies\n"
							+ "Runner-up: Sri Lanka\n"
							+ "Teams Participated: 12\n"
							+ "Player of the Final Match: Marlon Samuels\n"
							+ "Player of the Series: Shane Watson\n"
							+ "Highest Run Getter: Shane Watson (249 runs)\n"
							+ "Highest Wicket Getter: Ajantha Mendis (15 wickets)\n"
							+ "Emerging Player: Sunil Narine\n"
							+ "Most Economical Bowler: Sunil Narine");
				}
				case 5 -> {
					System.out.println("Tournament year : 2014\n"
							+ "Winner: Sri Lanka\n"
							+ "Runner-up: India\n"
							+ "Teams Participated: 16\n"
							+ "Player of the Final Match: Kumar Sangakkara\n"
							+ "Player of the Series: Virat Kohli\n"
							+ "Highest Run Getter: Virat Kohli (319 runs)\n"
							+ "Highest Wicket Getter: Imran Tahir and Ahsan Malik (12 wickets each)\n"
							+ "Emerging Player: Kusal Perera\n"
							+ "Most Economical Bowler: Samuel Badree");
				}
				case 6 -> {
					System.out.println("Tournament year : 2016\n"
							+ "Winner: West Indies\n"
							+ "Runner-up: England\n"
							+ "Teams Participated: 16\n"
							+ "Player of the Final Match: Marlon Samuels\n"
							+ "Player of the Series: Virat Kohli\n"
							+ "Highest Run Getter: Tamim Iqbal (295 runs)\n"
							+ "Highest Wicket Getter: Mohammad Nabi (12 wickets)\n"
							+ "Emerging Player: Mustafizur Rahman\n"
							+ "Most Economical Bowler: Samuel Badree");
				}
				case 7 -> {
					System.out.println("Tournament year : 2021\n"
							+ "Winner: Australia\n"
							+ "Runner-up: New Zealand\n"
							+ "Teams Participated: 16\n"
							+ "Player of the Final Match: Mitchell Marsh\n"
							+ "Player of the Series: David Warner\n"
							+ "Highest Run Getter: Babar Azam (303 runs)\n"
							+ "Highest Wicket Getter: Wanindu Hasaranga (16 wickets)\n"
							+ "Emerging Player: Aiden Markram\n"
							+ "Most Economical Bowler: Rashid Khan");
				}
				case 8 -> {
					System.out.println("Tournament year : 2022\n"
							+ "Winner: England\n"
							+ "Runner-up: Pakistan\n"
							+ "Teams Participated: 16\n"
							+ "Player of the Final Match: Sam Curran\n"
							+ "Player of the Series: Sam Curran\n"
							+ "Highest Run Getter: Virat Kohli (296 runs)\n"
							+ "Highest Wicket Getter: Wanindu Hasaranga (15 wickets)\n"
							+ "Emerging Player: Harry Brook\n"
							+ "Most Economical Bowler: Shadab Khan");
				}
				case 9 -> {
					System.out.println("Tournament Year: 2024\n"
							+ "Winner : India\n"
							+ "Runner-up : South Africa\n"
							+ "Teams Participated : 20 (increased from 16)\n"
							+ "Player of the Final Match : Virat Kohli (India)\n"
							+ "Player of the Series : Unofficially reported to be Suryakumar Yadav (India) - official awards not yet announced (as of July 17, 2024)\n"
							+ "Highest Run Scorer : Information not yet available (official statistics haven't been compiled yet)\n"
							+ "Highest Wicket Taker : Information not yet available (official statistics haven't been compiled yet)\n"
							+ "Emerging Player : No official award for \"Emerging Player\"\n"
							+ "Most Economical Bowler : Information not yet available (official statistics haven't been compiled yet)");
				}
				default -> {
					System.out.println(edition + "th edition will happen in the future");
				}
				}
			}	
		}
	}
	
	// ODI world cup Mens
	protected void odiWorldCupMens(String teamType) {
		loop:
			while(true) {

				edition = getEdition();
				S.nextLine();
				if(edition == 0) {
					break loop;
				}else if(edition < 0) {
					System.out.println("Enter valid edition number!");
				}
				else {
					switch(edition) {
					case 1 -> {
						System.out.println("Tournament year: 1975\n"
								+ "Winner: West Indies\n"
								+ "Runner-up: Australia\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Clive Lloyd\n"
								+ "Player of the Series: (Not awarded)\n"
								+ "Highest Run Getter: Glenn Turner (333 runs)\n"
								+ "Highest Wicket Getter: Gary Gilmour (11 wickets)\n"
								+ "Emerging Player: (Not awarded)\n"
								+ "Most Economical Bowler: Keith Boyce");
					}
					case 2 -> {
						System.out.println("Tournament year: 1979\n"
								+ "Winner: West Indies\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Viv Richards\n"
								+ "Player of the Series: (Not awarded)\n"
								+ "Highest Run Getter: Gordon Greenidge (253 runs)\n"
								+ "Highest Wicket Getter: Mike Hendrick (10 wickets)\n"
								+ "Emerging Player: (Not awarded)\n"
								+ "Most Economical Bowler: Michael Holding");
					}
					case 3 -> {
						System.out.println("Tournament year: 1983\n"
								+ "Winner: India\n"
								+ "Runner-up: West Indies\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Mohinder Amarnath\n"
								+ "Player of the Series: (Not awarded)\n"
								+ "Highest Run Getter: David Gower (384 runs)\n"
								+ "Highest Wicket Getter: Roger Binny (18 wickets)\n"
								+ "Emerging Player: (Not awarded)\n"
								+ "Most Economical Bowler: Joel Garner");
					}
					case 4 -> {
						System.out.println("Tournament year: 1987\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: David Boon\n"
								+ "Player of the Series: (Not awarded)\n"
								+ "Highest Run Getter: Graham Gooch (471 runs)\n"
								+ "Highest Wicket Getter: Craig McDermott (18 wickets)\n"
								+ "Emerging Player: (Not awarded)\n"
								+ "Most Economical Bowler: Allan Border");
					}
					case 5 -> {
						System.out.println("Tournament year: 1992\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: David Boon\n"
								+ "Player of the Series: (Not awarded)\n"
								+ "Highest Run Getter: Graham Gooch (471 runs)\n"
								+ "Highest Wicket Getter: Craig McDermott (18 wickets)\n"
								+ "Emerging Player: (Not awarded)\n"
								+ "Most Economical Bowler: Allan Border");
					}
					case 6 -> {
						System.out.println("Tournament year: 1996\n"
								+ "Winner: Sri Lanka\n"
								+ "Runner-up: Australia\n"
								+ "Teams Participated: 12\n"
								+ "Player of the Final Match: Aravinda de Silva\n"
								+ "Player of the Series: Sanath Jayasuriya\n"
								+ "Highest Run Getter: Sachin Tendulkar (523 runs)\n"
								+ "Highest Wicket Getter: Anil Kumble (15 wickets)\n"
								+ "Emerging Player: Saeed Anwar\n"
								+ "Most Economical Bowler: Muttiah Muralitharan");
					}
					case 7 -> {
						System.out.println("Tournament year: 1999\n"
								+ "Winner: Australia\n"
								+ "Runner-up: Pakistan\n"
								+ "Teams Participated: 12\n"
								+ "Player of the Final Match: Shane Warne\n"
								+ "Player of the Series: Lance Klusener\n"
								+ "Highest Run Getter: Rahul Dravid (461 runs)\n"
								+ "Highest Wicket Getter: Geoff Allott (20 wickets)\n"
								+ "Emerging Player: Shoaib Akhtar\n"
								+ "Most Economical Bowler: Glenn McGrath");
					}
					case 8 -> {
						System.out.println("Tournament year: 2003\n"
								+ "Winner: Australia\n"
								+ "Runner-up: India\n"
								+ "Teams Participated: 14\n"
								+ "Player of the Final Match: Ricky Ponting\n"
								+ "Player of the Series: Sachin Tendulkar\n"
								+ "Highest Run Getter: Sachin Tendulkar (673 runs)\n"
								+ "Highest Wicket Getter: Chaminda Vaas (23 wickets)\n"
								+ "Emerging Player: Brett Lee\n"
								+ "Most Economical Bowler: Glenn McGrath");
					}
					case 9 -> {
						System.out.println("Tournament year: 2007\n"
								+ "Winner: Australia\n"
								+ "Runner-up: Sri Lanka\n"
								+ "Teams Participated: 16\n"
								+ "Player of the Final Match: Adam Gilchrist\n"
								+ "Player of the Series: Glenn McGrath\n"
								+ "Highest Run Getter: Matthew Hayden (659 runs)\n"
								+ "Highest Wicket Getter: Glenn McGrath (26 wickets)\n"
								+ "Emerging Player: Shaun Tait\n"
								+ "Most Economical Bowler: Muttiah Muralitharan");
					}
					case 10 -> {
						System.out.println("Tournament year: 2011\n"
								+ "Winner: India\n"
								+ "Runner-up: Sri Lanka\n"
								+ "Teams Participated: 14\n"
								+ "Player of the Final Match: MS Dhoni\n"
								+ "Player of the Series: Yuvraj Singh\n"
								+ "Highest Run Getter: Tillakaratne Dilshan (500 runs)\n"
								+ "Highest Wicket Getter: Zaheer Khan (21 wickets)\n"
								+ "Emerging Player: Virat Kohli\n"
								+ "Most Economical Bowler: Daniel Vettori");
					}
					case 11 -> {
						System.out.println("Tournament year: 2015\n"
								+ "Winner: Australia\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 14\n"
								+ "Player of the Final Match: James Faulkner\n"
								+ "Player of the Series: Mitchell Starc\n"
								+ "Highest Run Getter: Martin Guptill (547 runs)\n"
								+ "Highest Wicket Getter: Mitchell Starc (22 wickets)\n"
								+ "Emerging Player: Trent Boult\n"
								+ "Most Economical Bowler: Mitchell Starc");
					}
					case 12 -> {
						System.out.println("Tournament year: 2019\n"
								+ "Winner: England\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 10\n"
								+ "Player of the Final Match: Ben Stokes\n"
								+ "Player of the Series: Kane Williamson\n"
								+ "Highest Run Getter: Rohit Sharma (648 runs)\n"
								+ "Highest Wicket Getter: Mitchell Starc (27 wickets)\n"
								+ "Emerging Player: Jofra Archer\n"
								+ "Most Economical Bowler: Jasprit Bumrah");
					}
					case 13 -> {
						System.out.println("Tournament year: 2023\n" 
								+ "Winner: Australia\n"
								+ "Runner-up: Indian"
								+ "Team Participated: 10"
								+ "Player of the Final Match: Travis Head\n"
								+ "Player of the Series: Virat Kohli\n"
								+ "Highest Run Getter: Virat Kohli\n"
								+ "Highest Wicket Getter: \n"
								+ "Emerging Player: \n"
								+ "Most Economical Bowler: ");
					}
					default -> {
						System.out.println(edition + "th edition will happen in the future");
					}
					}
				}
			}
	}
	// Womens championships
	// t20I world cup Womens
	protected void t20WorldCupWomens(String teamType) {
		loop:
			while(true) {

				edition = getEdition();
				S.nextLine();
				System.out.println();
				if(edition == 0) {
					break loop;
				}else if(edition < 0) {
					System.out.println("Enter valid edition number!");
				}
				else {
					switch(edition) {
					case 1 -> {
						System.out.println("Tournament Year : 2009\n" 
								+ "Winner: England\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Katherine Brunt (England)\n"
								+ "Player of the Series: Claire Taylor (England)\n"
								+ "Highest Run Scorer: Claire Taylor (England)\n"
								+ "Highest Wicket Taker: Holly Colvin (England)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Holly Colvin (England)");
					}
					case 2 -> {
						System.out.println("Tournament Year : 2010\n"
								+ "Winner: Australia\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Ellyse Perry (Australia)\n"
								+ "Player of the Series: Nicola Browne (New Zealand)\n"
								+ "Highest Run Scorer: Nicola Browne (New Zealand)\n"
								+ "Highest Wicket Taker: Ellyse Perry (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Nicola Browne (New Zealand)");
					}
					case 3 -> {
						System.out.println("Tournament year : 2012\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Jess Jonassen (Australia)\n"
								+ "Player of the Series: Charlotte Edwards (England)\n"
								+ "Highest Run Scorer: Charlotte Edwards (England)\n"
								+ "Highest Wicket Taker: Julie Hunter (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Julie Hunter (Australia)");
					}
					case 4 -> {
						System.out.println("Tournament year : 2014\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 10\n"
								+ "Player of the Final Match: Meg Lanning (Australia)\n"
								+ "Player of the Series: Anya Shrubsole (England)\n"
								+ "Highest Run Scorer: Meg Lanning (Australia)\n"
								+ "Highest Wicket Taker: Anya Shrubsole (England)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Anya Shrubsole (England)");
					}
					case 5 -> {
						System.out.println("Tournament year : 2016\n"
								+ "Winner: West Indies\n"
								+ "Runner-up: Australia\n"
								+ "Teams Participated: 10\n"
								+ "Player of the Final Match: Hayley Matthews (West Indies)\n"
								+ "Player of the Series: Stafanie Taylor (West Indies)\n"
								+ "Highest Run Scorer: Stafanie Taylor (West Indies)\n"
								+ "Highest Wicket Taker: Anya Shrubsole (England)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Anya Shrubsole (England)");
					}
					case 6 -> {
						System.out.println("Tournament year : 2018\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 10\n"
								+ "Player of the Final Match: Ashleigh Gardner (Australia)\n"
								+ "Player of the Series: Alyssa Healy (Australia)\n"
								+ "Highest Run Scorer: Alyssa Healy (Australia)\n"
								+ "Highest Wicket Taker: Megan Schutt (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Megan Schutt (Australia)");
					}
					case 7 -> {
						System.out.println("Tournament year : 2020\n"
								+ "Winner: Australia\n"
								+ "Runner-up: India\n"
								+ "Teams Participated: 10\n"
								+ "Player of the Final Match: Beth Mooney (Australia)\n"
								+ "Player of the Series: Beth Mooney (Australia)\n"
								+ "Highest Run Scorer: Beth Mooney (Australia)\n"
								+ "Highest Wicket Taker: Megan Schutt (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Megan Schutt (Australia)");
					}
					case 8 -> {
						System.out.println("Tournament year : 2023\n"
								+ "Winner: Australia\n"
								+ "Runner-up: South Africa\n"
								+ "Teams Participated: 10\n"
								+ "Player of the Final Match: Beth Mooney (Australia)\n"
								+ "Player of the Series: Sophie Devine (New Zealand)\n"
								+ "Highest Run Scorer: Beth Mooney (Australia)\n"
								+ "Highest Wicket Taker: Amelia Kerr (New Zealand)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Deepti Sharma (India)");
					}
					default -> {
						System.out.println(edition + "th edition will happen in the future");
					}
					}
				}	
			}
	}
	
	// ODI world cup Womens
	protected void odiWorldCupWomens(String teamType) {
		loop:
			while(true) {
				
				edition = getEdition();
				S.nextLine();
				System.out.println();
				if(edition == 0) {
					break loop;
				}else if(edition < 0) {
					System.out.println("Enter valid edition number!");
				}
				else {
					switch(edition) {
					case 1 -> {
						System.out.println("Tournament Year: 1973\n" 
								+ "Winner: England\n"
								+ "Runner-up: Australia\n"
								+ "Teams Participated: 7\n"
								+ "Player of the Final Match: Rachael Heyhoe-Flint (England)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Enid Bakewell (England)\n"
								+ "Highest Wicket Taker: Rosalind Heggs (England)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Rosalind Heggs (England)");
					}
					case 2 -> {
						System.out.println("Tournament Year: 1978"
								+ "\n" + "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 4\n"
								+ "Player of the Final Match: Margaret Jennings (Australia)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Not available\n"
								+ "Highest Wicket Taker: Not available\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Not available");
					}
					case 3 -> {
						System.out.println("Tournament year : 1982\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 5\n"
								+ "Player of the Final Match: Lyn Fullston (Australia)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Janette Brittin (England)\n"
								+ "Highest Wicket Taker: Lyn Fullston (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Lyn Fullston (Australia)");
					}
					case 4 -> {
						System.out.println("Tournament year : 1988\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 5\n"
								+ "Player of the Final Match: Lyn Larsen (Australia)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Lindsay Reeler (Australia)\n"
								+ "Highest Wicket Taker: Lyn Fullston (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Lyn Fullston (Australia)");
					}
					case 5 -> {
						System.out.println("Tournament year : 1993\n"
								+ "Winner: England\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Jan Brittin (England)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Jan Brittin (England)\n"
								+ "Highest Wicket Taker: Karen Smithies (England)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Karen Smithies (England)");
					}
					case 6 -> {
						System.out.println("Tournament year : 1997\n"
								+ "Winner: Australia\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 11\n"
								+ "Player of the Final Match: Belinda Clark (Australia)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Debbie Hockley (New Zealand)\n"
								+ "Highest Wicket Taker: Katrina Keenan (New Zealand)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Karen Smithies (England)");
					}
					case 7 -> {
						System.out.println("Tournament year : 2000\n"
								+ "Winner: New Zealand\n"
								+ "Runner-up: Australia\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Emily Drumm (New Zealand)\n"
								+ "Player of the Series: Not awarded\n"
								+ "Highest Run Scorer: Karen Rolton (Australia)\n"
								+ "Highest Wicket Taker: Charmaine Mason (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Charmaine Mason (Australia)");
					}
					case 8 -> {
						System.out.println("Tournament year : 2005\n"
								+ "Winner: Australia\n"
								+ "Runner-up: India\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Karen Rolton (Australia)\n"
								+ "Player of the Series: Karen Rolton (Australia)\n"
								+ "Highest Run Scorer: Karen Rolton (Australia)\n"
								+ "Highest Wicket Taker: Neetu David (India)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Katherine Brunt (England)");
					}
					case 9 -> {
						System.out.println("Tournament Year: 2009\n"
								+ "Winner: England\n"
								+ "Runner-up: New Zealand\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Claire Taylor (England)\n"
								+ "Player of the Series: Claire Taylor (England)\n"
								+ "Highest Run Scorer: Claire Taylor (England)\n"
								+ "Highest Wicket Taker: Laura Marsh (England)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Laura Marsh (England)");
					}
					case 10 -> {
						System.out.println("Tournament Year: 2013\n"
								+ "Winner: Australia\n"
								+ "Runner-up: West Indies\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Jess Cameron (Australia)\n"
								+ "Player of the Series: Suzie Bates (New Zealand)\n"
								+ "Highest Run Scorer: Suzie Bates (New Zealand)\n"
								+ "Highest Wicket Taker: Megan Schutt (Australia)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Megan Schutt (Australia)");
					}
					case 11 -> {
						System.out.println("Tournament Year: 2017\n"
								+ "Winner: England\n"
								+ "Runner-up: India\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Anya Shrubsole (England)\n"
								+ "Player of the Series: Tammy Beaumont (England)\n"
								+ "Highest Run Scorer: Tammy Beaumont (England)\n"
								+ "Highest Wicket Taker: Dane van Niekerk (South Africa)\n"
								+ "Emerging Player: Not awarded\n"
								+ "Most Economical Bowler: Ekta Bisht (India)");
					}
					case 12 -> {
						System.out.println("Tournament Year: 2022\n"
								+ "Winner: Australia\n"
								+ "Runner-up: England\n"
								+ "Teams Participated: 8\n"
								+ "Player of the Final Match: Alyssa Healy (Australia)\n"
								+ "Player of the Series: Alyssa Healy (Australia)\n"
								+ "Highest Run Scorer: Alyssa Healy (Australia)\n"
								+ "Highest Wicket Taker: Sophie Ecclestone (England)\n"
								+ "Emerging Player: Shafali Verma (India)\n"
								+ "Most Economical Bowler: Marizanne Kapp (South Africa)");
					}
					default -> {
						System.out.println(edition + "th edition will happen in the future");
					}
					}
				}	
			}
	}
	// Tournament details
	public void tournaments() {
		System.out.println("\n\t\tInternational Cricket Council Tournament Details");
		outerLoop :
			while(true) {
				teamType =  promptTeamType();
				if(teamType.equals("exit")) {
					System.out.println("Thank You\n");
					break outerLoop;
				}
				// Mens 
				if(teamType.equals("mens") || teamType.equals("men")) {
					while(true) {
						format = formatType();
						if(format.equals("exit")) {
							System.out.println("Thank You\n");
							break outerLoop;
						}
						switch(format) {
						case "test", "tests" -> testChampionship(teamType);
						case "t20i", "t20", "t20 international" -> t20WorldCupMens(teamType);
						case "odi", "one day international" -> odiWorldCupMens(teamType);
						
						default -> {
							System.out.println("Enter correct format");
						}
						}
					}
				// Womens
				}else if(teamType.equals("womens") || teamType.equals("women")) {
					while(true) {
						format = formatType1();
						if(format.equals("exit")) {
							System.out.println();
							break outerLoop;
						}
						switch(format) {
						case "odi", "one day international" -> odiWorldCupWomens(teamType); // Calls odiWorldCupWomens() method 
						case "t20i", "t20 international" -> t20WorldCupWomens(teamType); // Calls t20WorldCupWomens() method 
						default -> {
							System.out.println("Enter correct format");
						}
						}
					}
				}
			}
	}
	
}
