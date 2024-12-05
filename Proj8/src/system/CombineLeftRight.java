package system;

public class CombineLeftRight implements Diagram {
	private char[][] board;
	private int animationType;

	public CombineLeftRight(Diagram left, Diagram right, int animationType) {
		char[][] leftBoard = left.getBoard();
		char[][] rightBoard = right.getBoard();

		if (leftBoard.length != rightBoard.length) {
			throw new IllegalArgumentException("Left and right rows are not equal!");
		}

		board = TwoDimArrayUtil.appendLeftRight(leftBoard, rightBoard);
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
