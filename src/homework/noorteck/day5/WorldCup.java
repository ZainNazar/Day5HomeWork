package homework.noorteck.day5;

public class WorldCup {

	public static void main(String[] args) {

		char group = 'A';
		String team1 = "";
		String team2 = "";
		String team3 = "hjgjh";
		String team4 = "";
		boolean isGroupExists = false;
		String message = "NONE";

		if (group == 'A') {

			team1 = "Nethrland";
			team2 = "Sengal";
			team3 = "Ecudar";
			team4 = "qatar";
			//isGroupExists = true;

		}

		else if (group == 'B') {

			team1 = "England";
			team2 = "United States";
			team3 = "Iran";
			team4 = "Wales";
			isGroupExists = true;
		}

		else if (group == 'C') {

			team1 = "Argentina";
			team2 = "Mexico";
			team3 = "Poland";
			team4 = "Saudi Arabia";
			isGroupExists = true;

		} else {
			message = "Wrong Group";
			isGroupExists = false;

		}
		if (isGroupExists == true) {

			System.out.println("*********** Group" + group + "***********");
			System.out.println(team1);
			System.out.println(team2);
			System.out.println(team3);
			System.out.println(team4);

		} else {

			System.out.println("Wrong group");

		}

	}

}
