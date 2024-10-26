package programs;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		int orginialNumber = 0;
		int base = 0;
		String convertedNumber = ""; // number in the new base (it's reversed)
		String result;
		Scanner input = new Scanner(System.in);

		// loops while the user inputs a negative number
		do {
			System.out.print("Enter base 10 number: ");
			orginialNumber = input.nextInt();
		} while (orginialNumber < 0);
		// loops while the user puts a base < 2 or base > 9
		do {
			System.out.print("Enter new base: ");
			base = input.nextInt();
		} while (base < 2 || base > 9);

		if (orginialNumber != 0) {
			while (orginialNumber > 0) {
				convertedNumber += orginialNumber % base;
				orginialNumber /= base;
			}
		} else {
			convertedNumber += 0;
		}

		// reverses the converted number for the correct result
		result = Support.reverseString(convertedNumber);
		System.out.println("Value: " + result);
		input.close();
	}
}
