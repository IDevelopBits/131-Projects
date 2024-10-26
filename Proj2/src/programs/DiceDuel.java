package programs;

import java.util.Random;
import java.util.Scanner;

public class DiceDuel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int currentRound = 1; // shows current round
		int dice1;
		int dice2;
		int rounds;
		int player1Score = 0;
		int player2Score = 0;

		System.out.print("How many rounds? ");

		// plays the number of rounds input by the user
		rounds = input.nextInt();
		Random random = new Random(rounds);

		while (currentRound <= rounds) {
			System.out.println("Round " + currentRound);

			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			player1Score = player1Score + dice1 + dice2;

			System.out.println("Player 1 rolled: " + dice1 + " and " + dice2);

			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			player2Score = player2Score + dice1 + dice2;

			System.out.println("Player 2 rolled: " + dice1 + " and " + dice2);

			// Displays total score after each round
			System.out.println("Player 1 score: " + player1Score);
			System.out.println("Player 2 score: " + player2Score);

			currentRound++;

		}

		System.out.println("Final Score:");
		System.out.println("Player 1: " + player1Score);
		System.out.println("Player 2: " + player2Score);

		if (player1Score > player2Score) {
			System.out.println("Player 1 wins!");
		} else if (player2Score > player1Score) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("It's a tie!");
		}

		input.close();

	}
}
