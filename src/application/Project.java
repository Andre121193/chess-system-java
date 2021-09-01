package application;

import chess.chessMatch;

public class Project {

	public static void main(String[] args) {
	
	chessMatch chessMatch = new chessMatch();
	UI.printBoard(chessMatch.getPieces());

	}

}
