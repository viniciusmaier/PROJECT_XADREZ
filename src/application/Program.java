package src.application;

import src.boardgame.Board;
        import src.boardgame.Position;
        import src.chess.ChessMatch;
        import src.chess.ChessPiece;

public class Program {
    public static void main(String[]args){
        ChessMatch chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPieces());
    }
}
