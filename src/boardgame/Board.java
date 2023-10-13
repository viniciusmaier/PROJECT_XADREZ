package src.boardgame;

public class Board {
    private int row;
    private int column;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        this.row = rows;
        this.column = columns;
        pieces = new Piece[rows][columns];

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
