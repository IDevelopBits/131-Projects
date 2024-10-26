package app;

import java.util.Random;

public class DrawingApp {
	// Checks if character is a valid color and otherwise returns false
	private static boolean isValidColor(char color) {
		if (color == 'R' || color == 'G' || color == 'B' || color == 'Y') {
			return true;
		} else if (color == '*' || color == '.') {
			return true;
		} else {
			return false;
		}
	}

	public static String getRectangle(int maxRows, int maxCols, char symbol) {
		String rectangle = "";
		if (maxRows < 0 || maxCols < 0) {
			return null;
		}

		for (int row = 1; row <= maxRows; row++) {
			for (int col = 1; col <= maxCols; col++) {
				rectangle += symbol;
			}
			// Make sure there is no extra new line
			if (row < maxRows) {
				rectangle += '\n';
			}
		}
		return rectangle;

	}

	public static char getRandomColor(Random random) {
		int randomColor = random.nextInt(6);
		if (randomColor == 0) {
			return 'R';
		} else if (randomColor == 1) {
			return 'G';
		} else if (randomColor == 2) {
			return 'B';
		} else if (randomColor == 3) {
			return 'Y';
		} else if (randomColor == 4) {
			return '*';
		} else {
			return '.';
		}
	}

	public static String getHorizontalBars(int maxRows, int maxCols, 
			int bars, char color1, char color2, char color3) {
		int barSize = maxRows / bars;
		String rectangle = "";
		// Checks if all three colors are valid
		boolean validColors = isValidColor(color1) && isValidColor(color2) 
				&& isValidColor(color3);

		if (barSize < 1 && !validColors) {
			return null;
		}

		for (int bar = 1; bar <= bars; bar++) {
			// Changes the color for every new bar
			if (bar % 3 == 1) {
				rectangle += getRectangle(barSize, maxCols, color1);
			} else if (bar % 3 == 2) {
				rectangle += getRectangle(barSize, maxCols, color2);
			} else {
				rectangle += getRectangle(barSize, maxCols, color3);
			}

			if (bar < bars) {
				rectangle += '\n';
			}
		}
		return rectangle;
	}

	public static String getFlag(int size, char color1, char color2, 
			char color3) {
		String flag = "";
		int maxRows = size * 2;
		int maxCols = size * 5;

		if (size < 3) {
			return null;
		}

		// Generates the first half of the flag
		for (int row = 1; row <= maxRows / 2; row++) {
			for (int i = 1; i <= row; i++) {
				flag += color1;
			}

			for (int col = row + 1; col <= maxCols; col++) {
				if (row > 1 && row < maxRows / 2) {
					flag += color3;
				} else {
					flag += color2;
				}
			}
			flag += '\n';
		}

		// Generates the second half of the flag
		for (int row = maxRows / 2; row >= 1; row--) {
			for (int i = 1; i <= row; i++) {
				flag += color1;
			}

			for (int col = row + 1; col <= maxCols; col++) {
				if (row > 1 && row < maxRows / 2) {
					flag += color3;
				} else {
					flag += color2;
				}
			}
			if (row > 1) {
				flag += '\n';
			}
		}
		return flag;
	}

	public static String getVerticalBars(int maxRows, int maxCols, int bars, 
			char color1, char color2, char color3) {
		int barSize = maxCols / bars;
		boolean validColors = isValidColor(color1) && isValidColor(color2) 
				&& isValidColor(color3);

		if (barSize < 1 && !validColors) {
			return null;
		}

		String rectangle = "";
		char currentColor;

		for (int row = 1; row <= maxRows; row++) {
			for (int bar = 1; bar <= bars; bar++) {
				if (bar % 3 == 1) {
					currentColor = color1;
				} else if (bar % 3 == 2) {
					currentColor = color2;
				} else {
					currentColor = color3;
				}

				for (int col = 1; col <= barSize; col++) {
					rectangle += currentColor;
				}
			}
			if (row < maxRows) {
				rectangle += '\n';
			}
		}
		return rectangle;
	}

	public static String drawEight(int size, char color) {
		String eight = "";

		if (size < 5 || size % 2 == 0) {
			return null;
		}

		for (int row = 1; row <= size; row++) {
			// Fills in the first, middle, and bottom row
			if (row == 1 || row == (size / 2) + 1 || row == size) {
				for (int col = 1; col <= size; col++) {
					eight += color;
				}
			} else {
				for (int col = 1; col <= size; col++) {
					// Fills the first and last column with the color given
					if (col == 1 || col == size) {
						eight += color;
					} else {
						eight += ".";
					}
				}
			}
			if (row < size) {
				eight += '\n';
			}
		}
		return eight;
	}
}