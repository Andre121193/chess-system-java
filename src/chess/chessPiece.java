package chess;

import boardgame.Board;
import boardgame.Piece;

public class chessPiece extends Piece {
	
	private Color color;

	public chessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
