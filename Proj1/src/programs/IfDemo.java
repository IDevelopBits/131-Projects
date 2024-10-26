package programs;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Display the menu

		System.out.println("Choose an option:");
		System.out.println("1. Check if a string is a palindrome");
		System.out.println("2. Sum the digits of an integer");
		System.out.println("3. Convert a string to uppercase and reverse it");
		System.out.println("4. Exit");
		System.out.print("Input? ");

		// Read user choice
		int choice = scanner.nextInt();
		scanner.nextLine(); // Consume newline left-over

		// FINISH THE CODE IN MAIN
		if (choice == 1) {
			System.out.print("Enter a string: ");
			String word = scanner.nextLine();
			String reversedWord = reverseString(word);

			if (word.equals(reversedWord)) {
				System.out.println(word + " is a palindrome.");
			} else {
				System.out.println(word + " is not a palindrome.");
			}
		} else if (choice == 2) {
			System.out.print("Enter an integer: ");
			int num = scanner.nextInt();

			// Grabs the last two digits from the integer
			int lastDigits = num % 100;

			// Grabs the last and second to last digits
			int firstDigit = lastDigits % 10;
			int secondDigit = (lastDigits / 10) % 10;

			int addedDigits = firstDigit + secondDigit;

			System.out.println("The sum of the digits is: " + addedDigits);
		} else if (choice == 3) {
			System.out.print("Enter a string: ");

			String word = scanner.nextLine();
			String upperWord = word.toUpperCase();

			System.out.println("Uppercase: " + upperWord);
			System.out.println("Reversed: " + reverseString(upperWord));
		} else if (choice == 4) {
			System.out.println("Exiting program. Have a great day!");
		} else {
			System.out.println("Invalid choice.");
		}

		scanner.close();
	}

	// Method to manually reverse a string
	// You can call it like this: String str = reverseString("hi") to get ih in str
	private static String reverseString(String input) {
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		return reversed;
	}
}
