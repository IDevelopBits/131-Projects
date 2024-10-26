package programs;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Grab an integer from user input
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		// Checks if the number is less than 0 (meaning negative) otherwise non-negative
		if (num < 0) {
			System.out.println("The number is negative.");
		} else {
			System.out.println("The number is non-negative.");
		}

		// Looks for a remainder (R=0 equals even, R>0 equals odd)
		if (num % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		scanner.close();
	}
}
