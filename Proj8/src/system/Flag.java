package system;

import app.DrawingApp;
import gui.BoardCell;

public class Flag implements Diagram {
	private char[][] board;
	private int animationType;

	public Flag(int size, char color1, char color2, char color3, 
			int animationType) {
		String flag = DrawingApp.getFlag(size, color1, color2, color3);
		board = BoardCell.getCharArray(flag);

		this.animationType = animationType;
	}

	public char[][] getBoard() {
		return board;
	}

	public char[][] nextAnimationStep() {
		if (animationType == 1) {
			TwoDimArrayUtil.rotateLeftOneColumn​(board);
		} else if (animationType == 2) {
			TwoDimArrayUtil.rotateTopOneRow​(board);
		}

		return board;
	}

	public int getNumberRows() {
		return board.length;
	}

	public int getNumberCols() {
		return board[0].length;
	}
}
