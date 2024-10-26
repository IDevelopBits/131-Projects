package programs;

import java.util.Scanner;

public class Access {

	public static void main(String[] args) {
		String password = "";
		int number = 0;
		int currentAttempts = 1;
		int maxAttempts = 3;
		Scanner input = new Scanner(System.in);

		while (currentAttempts <= maxAttempts) {
			System.out.print("Enter password: ");
			// So the case of the password doesn't matter
			password = input.nextLine().toLowerCase();

			if (password.equals("quit")) {
				System.out.println("Access Denied");
				currentAttempts = 4; // attempts is set to 4 to break the loop
			} else {
				System.out.print("Enter number: ");
				number = input.nextInt();

				// checks for correct credentials
				if (password.equals("terps") && number == 1856) {
					System.out.println("Access Granted");
					currentAttempts = 4;
				} else if (currentAttempts == 3) {
					System.out.println("Wrong credentials");
					System.out.println("Access Denied");
					currentAttempts = 4;
				} else {
					System.out.println("Wrong credentials");
					currentAttempts++;

					input.nextLine();
				}
			}
		}
		input.close();
	}
}