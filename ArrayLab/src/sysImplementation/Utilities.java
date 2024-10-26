package sysImplementation;

import java.util.Arrays;

public class Utilities {

	/**
	 * Returns the number of values in the range defined by lower (inclusive) and
	 * upper (inclusive)
	 * 
	 * @param array integer array
	 * @param lower lower limit
	 * @param upper upper limit
	 * @return Number of values found
	 * @throws IllegalArgumentException if array is null or lower is greater than
	 *                                  upper Any error message is fine (e.g.,
	 *                                  "Invalid parameters(s)")
	 */
	public static int getCountInRange(int[] array, int lower, int upper) {
		if (array == null || lower > upper) {
			throw new IllegalArgumentException();
		}
		
		int count = 0;
		for (int num : array) {
			if (num >= lower && num <= upper) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Initializes the out parameter result with even values found in array
	 * 
	 * @param array  integer array
	 * @param result integer array
	 * @return Number of even values found
	 * @throws IllegalArgumentException if array or result (or both) are null, or if
	 *                                  result's length is less than array's length.
	 *                                  Any error message is fine (e.g., "Invalid
	 *                                  parameters(s)")
	 */
	public static int getEvens(int[] array, int[] result) {
		if (array == null || result == null || result.length < array.length) {
			throw new IllegalArgumentException();
		}
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				result[count] = array[i];
				count++;
			}
		}
		
		return count;
	}

	/**
	 * Returns an array with values in the range defined by lower (inclusive) and
	 * upper (inclusive). Feel free to use the getCountInRange method during the
	 * implementation of this method.
	 * 
	 * @param array integer array
	 * @param lower lower limit
	 * @param upper upper limit
	 * @return array with even values or empty array
	 * @throws IllegalArgumentException if array is null or lower is greater than
	 *                                  upper. Any error message is fine (e.g.,
	 *                                  "Invalid parameters(s)")
	 */
	public static int[] getArrayElemsInRange(int[] array, int lower, int upper) {
		int length = getCountInRange(array, lower, upper);
		int[] result = new int[length];
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= lower && array[i] <= upper) {
				result[c] = array[i];
				c++;
			}
		}
		return result;
	}
}
