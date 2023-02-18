package board;

public class Board {
    private int rows;
    private int columns;
    private Piece pieces[][];

    public Board(int rows, int columns) {
        this.rows=rows;
        this.columns=columns;
        this.pieces= new Piece[rows][columns];
    }
    public Piece piece(int rows,int columns){
        return pieces[rows][columns];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
