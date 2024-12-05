package system;

public class TwoDimArrayUtil {
	public static char[][] appendLeftRight(char[][] left, char[][] right) {
		int rows = Math.max(left.length, right.length);

		char[][] result = new char[rows][];

		for (int i = 0; i < rows; i++) {
			/*
			 * Handle when the left or right rows are unequal by adding an empty 
			 * array
			 */
			char[] leftRow;
			if (i < left.length) {
				leftRow = left[i];
			} else {
				leftRow = new char[0];
			}

			char[] rightRow;
			if (i < right.length) {
				rightRow = right[i];
			} else {
				rightRow = new char[0];
			}

			result[i] = new char[leftRow.length + rightRow.length];

			for (int j = 0; j < leftRow.length; j++) {
				result[i][j] = leftRow[j];
			}

			for (int j = 0; j < rightRow.length; j++) {
				result[i][leftRow.length + j] = rightRow[j];
			}
		}

		return result;
	}

	public static char[][] appendTopBottom​(char[][] top, char[][] bottom) {
		int rows = top.length + bottom.length;

		char[][] result = new char[rows][];

		for (int i = 0; i < top.length; i++) {
			// Copy the top row to result
			result[i] = top[i];
		}

		for (int i = 0; i < bottom.length; i++) {
			// Copy the bottom row to result
			result[top.length + i] = bottom[i];
		}

		return result;
	}

	public static boolean isRagged​(char[][] array) {
		if (array == null) {
			throw new IllegalArgumentException("Error: array is null!");
		}

		int previous = array[0].length;
		for (int i = 1; i < array.length; i++) {
			if (array[i].length != previous) {
				return true;
			}
		}
		return false;
	}

	public static void rotateLeftOneColumn​(char[][] array) {
		if (array == null || isRagged​(array)) {
			throw new IllegalArgumentException("Error: null or ragged array!");
		}

		for (int i = 0; i < array.length; i++) {
			char firstChar = array[i][0];

			for (int j = 1; j < array[i].length; j++) {
				array[i][j - 1] = array[i][j];
			}

			array[i][array[i].length - 1] = firstChar;
		}
	}

	public static void rotateTopOneRow​(char[][] array) {
		if (array == null || isRagged​(array)) {
			throw new IllegalArgumentException("Error: null or ragged array!");
		}

		for (int i = 0; i < array[0].length; i++) {
			// Get the first character of the top row
			char firstChar = array[0][i];

			// Shift the rows downward
			for (int j = 1; j < array.length; j++) {
				array[j - 1][i] = array[j][i];
			}

			// Shift the top row to the bottom row
			array[array.length - 1][i] = firstChar;
		}
	}
}
