package chess;

import board.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch(int rows,int columns) {
        this.board = new Board(rows,columns);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] aux= new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < aux.length ; i++) {
            for (int j = 0; j < aux.length; j++) {
                aux[i][j]= (ChessPiece) board.piece(i,j);
            }
        }
        return aux;
    }
}
