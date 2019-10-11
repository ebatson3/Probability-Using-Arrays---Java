package ebatson3_lab06_q2; //Name of the package

import java.util.Scanner; // Importing scanner for user input

public class Main {
	public static void printHeader(int labNum, int questionNum, String fName, String lName, String mission) {
		int stars = 0;
		stars = mission.length();
		if ((fName.length() + lName.length()) > mission.length()) {
			stars = fName.length() + lName.length();
		}
		for (int j = 0; j <= stars; j++) {
			System.out.print("*");
		}
		System.out.print("\n");
		System.out.println(mission);
		for (int i = 0; i <= stars; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		System.out.println("Lab " + labNum);
		System.out.println("Question " + questionNum);
		System.out.println("Name: " + fName + " " + lName);

		for (int k = 0; k <= stars; k++) {
			System.out.print("*");
		}
		System.out.println("\n");
	}

	static Scanner input = new Scanner(System.in); // Naming the scanner

	public static void main(String[] args) {

		int numRolls = 0; // Declaring and initializing variables
		int sum = 0; // Declaring and initializing variables
		int mean = 0; // Declaring and initializing variables
		double standardDev = 0; // Declaring and initializing variables
		int total = 0; // Declaring and initializing variables

		printHeader(6, 2, "Evelyn", "Batson", "This program is a dice rolling game");
		System.out.println("How many times would you like to roll?"); // Asking user for input
		numRolls = input.nextInt(); // Stores this value

		int results[] = new int[6]; // Declaring results array

		int outcomes[] = new int[numRolls]; // Declaring outcomes array

		for (int i = 0; i < numRolls; i++) {
			outcomes[i] = rollDice(); // Assigning values to outcomes array

			if (outcomes[i] == 1) {
				results[0]++;
			}

			else if (outcomes[i] == 2) {
				results[1]++;
			}

			else if (outcomes[i] == 3) {
				results[2]++;
			}

			else if (outcomes[i] == 4) {
				results[3]++;
			}

			else if (outcomes[i] == 5) {
				results[4]++;
			}

			else if (outcomes[i] == 6) {
				results[5]++;
			}

		}

		total = (results[0] * 1 + results[1] * 2 * results[2] * 3 + results[3] * 4 + results[4] * 5 + results[5] * 6);
		mean = (int) total / numRolls;

		for (int j = 0; j < numRolls; j++) {
			standardDev = (outcomes[j] - (total - numRolls)) / numRolls;
			
			// standardDev =(int)standardDev;
		}

		System.out.println("These are the rolled statistics:");
		System.out.println("1's:" + results[0]);
		System.out.println("2's:" + results[1]);
		System.out.println("3's:" + results[2]);
		System.out.println("4's:" + results[3]);
		System.out.println("5's:" + results[4]);
		System.out.println("6's:" + results[5]);
		System.out.println("The Mean is:" + mean);
		System.out.println("The Standard Deviation is:" + standardDev);
	}

	public static int rollDice() {

		int dice = 0;
		dice = (int) ((Math.random() * 6) + 1);

		return dice;
	}

}
