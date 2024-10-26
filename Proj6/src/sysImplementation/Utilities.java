package sysImplementation;

public class Utilities {
	public static int[] filter​(int[] array, int lowerLimit, int upperLimit) {
		if (lowerLimit > upperLimit || array == null) {
			throw new IllegalArgumentException();
		}
		
		// Use this to figure out the length of an array to make;
		int count = 0;
		for (int num : array) {
		// Increase count based on the numbers between lower and upper limits
		if (num >= lowerLimit && num <= upperLimit) {
				count++;
			}
		}
		
		int[] filteredArr = new int[count];
			
		// c is the index for the filtered array
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= lowerLimit && array[i] <= upperLimit) {
				filteredArr[c] = array[i];
				c++;
			}
		}
		
		return filteredArr;
	}
	
	public static String getArrayString​(int[] array, char separator) {
		if (array == null) {
			throw new IllegalArgumentException();
		}
		
		// Make an empty String to be added on to
		String arrString = "";
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				// Empty String is included so the numbers are added as Strings
				arrString += "" + array[i] + separator;
			} else {
				// Makes sure the String doesn't end with a separator
				arrString += array[i];
			}
		}
		return arrString;
	}
	
	public static StringBuffer[] getArrayStringsLongerThan​(StringBuffer[] array, 
			int length) {
		if (array == null) {
			throw new IllegalArgumentException();
		}
		
		
		// Use this to figure out the length of an array to make;
		int count = 0;
		for (StringBuffer sb : array) {
			// Increase count based on the number of StringBuffers > length
			if (sb.length() > length) {
				count++;
			}
		}
		
		StringBuffer[] arrStrings = new StringBuffer[count];
		
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			StringBuffer sb = array[i];
			if (sb.length() > length) {
				// Using new to make sure it is a copy not a reference
				arrStrings[c] = new StringBuffer(sb);
				c++;
			}
		}

		
		return arrStrings;
	}
	
	public static int getInstances​(int[] array, int lowerLimit, int upperLimit) {
		// Throw an exception if array is null
		if (array == null) {
			throw new IllegalArgumentException();
		}
		
		int amount = 0;
		for (int num : array) {
			// Check if the number is between the lower and upper limits
			if (num >= lowerLimit && num <= upperLimit) {
				// Add to amount if it is
				amount++;
			}
		}
		return amount;
	}
	
	public static void rotate​(int[] array, boolean leftRotation, int positions) {
		// Throw an exception if array is null
		if (array == null) {
			throw new IllegalArgumentException();
		}
		
		// If leftRotation is true, rotate the array left else right
		if (leftRotation) {
			// Use a for loop to rotate the array (position) times
			for (int i = 1; i <= positions; i++) {
				rotateLeft(array);
			}
		} else {
			for (int i = 1; i <= positions; i++) {
				rotateRight(array);
			}
		}
	}
	
	private static void rotateLeft(int[] array) {
		int[] origArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			origArray[i] = array[i];
		}
		
		for (int i = 0; i < array.length-1; i++) {
			if (i == 0) {
				array[array.length-1] = origArray[0];
			}
			array[i] = origArray[i + 1];
		}
	}
	
	private static void rotateRight(int[] array) {
		int[] origArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			origArray[i] = array[i];
		}
		
		for (int i = 1; i < array.length; i++) {
			array[i] = origArray[i - 1];
			if (i == array.length - 1) {
				array[0] = origArray[array.length-1];
			}
		}
	}
}