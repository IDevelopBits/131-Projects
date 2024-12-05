package system;

import java.util.Arrays;

public class DriverExample {

	public static void main(String[] args) {
		char[][] array1 = { { 'A', 'B' }, { 'C', 'D' }, { 'E', 'F' } };

		String answer = "Original:\n";
		answer += getTwoDimArrayString(array1);

		answer += "\nAfter one top rotation:\n";
		TwoDimArrayUtil.rotateTopOneRow​(array1);
		answer += getTwoDimArrayString(array1);

		answer += "\nAfter two top rotations:\n";
		TwoDimArrayUtil.rotateTopOneRow​(array1);
		answer += getTwoDimArrayString(array1);

		answer += "\nAfter left rotation:\n";
		TwoDimArrayUtil.rotateLeftOneColumn​(array1);
		answer += getTwoDimArrayString(array1);

		char[][] array2 = { { 'G', 'H' }, { 'I', 'J' }, { 'K', 'L' } };

		char[][] array3 = { { 'M', 'N' }, { 'O', 'P' }, { 'Q', 'R' } };

		answer += "\nAfter left right append:\n";
		answer += getTwoDimArrayString(TwoDimArrayUtil.appendLeftRight(array2, array3));

		answer += "\nAfter top bottom append:\n";
		answer += getTwoDimArrayString(TwoDimArrayUtil.appendTopBottom​(array2, array3));

		answer += "\nAnimation of horizontal bars:";
		int maxRows = 6, maxCols = 6, bars = 3, animationType = 1;
		char color1 = 'R', color2 = 'G', color3 = 'B';
		HorizontalBars horizontalBars = new HorizontalBars(maxRows, maxCols, bars, color1, color2, color3,
				animationType);
		answer += "\nOriginal:\n";
		answer += getTwoDimArrayString(horizontalBars.getBoard());
		for (int i = 1; i <= 3; i++) {
			answer += "\n\nAnimation Step: " + i + "\n";
			char[][] nextAnimationStep = horizontalBars.nextAnimationStep();
			answer += getTwoDimArrayString(nextAnimationStep);
		}

		System.out.println(answer);
	}

	private static String getTwoDimArrayString(char[][] array) {
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameter getTwoDimArrayString()");
		}

		String answer = "";
		for (int row = 0; row < array.length - 1; row++) {
			answer += Arrays.toString(array[row]) + "\n";
		}
		answer += Arrays.toString(array[array.length - 1]);

		return answer;
	}
}
