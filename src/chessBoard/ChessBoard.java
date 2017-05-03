package chessBoard;

import chess.*;

public class ChessBoard {
	int x;
	int y;
	Chess[] [] board = new Chess[x][y];
	
	/*    8  X  8
	 *   rook  knight bishop king   queen bishop knight rook
	 *   pawn  pawn    pawn  pawn  pawn   pawn    pawn   pawn
	 * 
	 * 
	 * 
	 * 
	 *   pawn  pawn    pawn  pawn  pawn   pawn    pawn  pawn
	 *   rook  knight bishop king  queen  bishop knight rook
	 */
	
	
	public ChessBoard(){
		initialize();
	}
	
	public void initialize(){
		x = 7;
		y = 7;
		board[0][0] = new Rook("black");
		board[1][0] = new Knight("black");
		board[2][0] = new Bishop("black");
		board[3][0] = new King("black");
		board[4][0] = new Queen("black");
		board[5][0] = new Bishop("black");
		board[6][0] = new Knight("black");
		board[7][0] = new Rook("black");
		board[0][2] = new Pawn("black");
		board[1][2] = new Pawn("black");
		board[2][2] = new Pawn("black");
		board[3][2] = new Pawn("black");
		board[4][2] = new Pawn("black");
		board[5][2] = new Pawn("black");
		board[6][2] = new Pawn("black");
		board[7][2] = new Pawn("black");
		
		
		board[0][7] = new Rook("red");
		board[1][7] = new Knight("red");
		board[2][7] = new Bishop("red");
		board[3][7] = new King("red");
		board[4][7] = new Queen("red");
		board[5][7] = new Bishop("red");
		board[6][7] = new Knight("red");
		board[7][7] = new Rook("red");
		board[0][6] = new Pawn("red");
		board[1][6] = new Pawn("red");
		board[2][6] = new Pawn("red");
		board[3][6] = new Pawn("red");
		board[4][6] = new Pawn("red");
		board[5][6] = new Pawn("red");
		board[6][6] = new Pawn("red");
		board[7][6] = new Pawn("red");
	
	}
}
