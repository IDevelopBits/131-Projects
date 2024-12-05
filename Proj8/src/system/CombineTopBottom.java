package system;

public class CombineTopBottom implements Diagram {
	private char[][] board;
	private int animationType;

	public CombineTopBottom(Diagram top, Diagram bottom, int animationType) {
		char[][] topBoard = top.getBoard();
		char[][] bottomBoard = bottom.getBoard();
		
		board = TwoDimArrayUtil.appendTopBottom​(topBoard, bottomBoard);
		
		if (TwoDimArrayUtil.isRagged​(board)) {
			throw new IllegalArgumentException("Top and bottom have a" 
					+ "different amount of columns!");
		}
		
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
