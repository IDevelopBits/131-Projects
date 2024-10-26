package programs;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// User enters text
		System.out.print("Enter a string: ");
		String word = scanner.nextLine();

		System.out.println("Original string: " + word);

		// Removes whitespace
		String trimmedWord = word.trim();
		System.out.println("Trimmed string: " + trimmedWord);

		// Makes an uppercase and lowercase copy of the original word
		String upperWord = trimmedWord.toUpperCase();
		System.out.println("Uppercase: " + upperWord);
		String lowerWord = trimmedWord.toLowerCase();
		System.out.println("Lowercase: " + lowerWord);

		// Gets length of trimmed word
		int trimWordLen = trimmedWord.length();
		System.out.println("Length: " + trimWordLen);

		String replacedWord = trimmedWord.replace('a', 'o');
		System.out.println("Replaced 'a' with 'o': " + replacedWord);

		String substringWord = trimmedWord.substring(1, trimWordLen - 1);
		if (trimWordLen > 2) {
			System.out.println("Substring (excluding first and last character):" + " " + substringWord);
		} else {
			System.out.println("Substring (excluding first and last character):" + " " + trimmedWord);
		}

		System.out.println();
		scanner.close();
	}

}
