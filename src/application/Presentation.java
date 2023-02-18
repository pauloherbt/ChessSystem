package application;

import chess.ChessMatch;

public class Presentation {
    public static void main(String[] args) {
        ChessMatch match = new ChessMatch(8,8);
        UserInterface.printBoard(match.getPieces());
    }
}
