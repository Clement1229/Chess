package chessBoard;

import chess.*;

public class ChessBoard {
	int x;
	int y;
	Chess[] [] board = new Chess[x][y];
	
	/*    8  X  8
	 *   rook  knight bishop king   queen bishop knight rook
	 *   pawn  pawn    pawn  pawn  pawn   pawn    pawn   pawn   white
	 * 
	 * 
	 * 
	 * 
	 *   pawn  pawn    pawn  pawn  pawn   pawn    pawn  pawn     black
	 *   rook  knight bishop king  queen  bishop knight rook
	 */
	
	
	public ChessBoard(){
		initialize();
	}
	
	public void initialize(){
		x = 7;
		y = 7;
		Chess bRook1 = new Rook("black");
		Chess bKnight1 = new Knight("black");
		Chess bBishop1 = new Bishop("black");
		Chess bKing1 = new King("black");
		Chess bQueen1 = new Queen("black");
		Chess bBishop2 = new Bishop("black");
		Chess bKnight2 = new Knight("black");
		Chess bRook2 = new Rook("black");
		Chess bPawn1 = new Pawn("black");
		Chess bPawn2 = new Pawn("black");
		Chess bPawn3= new Pawn("black");
		Chess bPawn4= new Pawn("black");
		Chess bPawn5= new Pawn("black");
		Chess bPawn6= new Pawn("black");
		Chess bPawn7= new Pawn("black");
		Chess bPawn8= new Pawn("black");
		board[0][0] = bRook1;
		board[1][0] = bKnight1;
		board[2][0] = bBishop1;
		board[3][0] = bKing1;
		board[4][0] = bQueen1;
		board[5][0] = bBishop2;
		board[6][0] = bKnight2;
		board[7][0] = bRook2;
		board[0][2] = bPawn1;
		board[1][2] = bPawn2;
		board[2][2] = bPawn3;
		board[3][2] = bPawn4;
		board[4][2] = bPawn5;
		board[5][2] = bPawn6;
		board[6][2] = bPawn7;
		board[7][2] = bPawn8;
	//----------------------------------------	
		Chess wRook1 = new Rook("white");
		Chess wKnight1 = new Knight("white");
		Chess wBishop1 = new Bishop("white");
		Chess wKing1 = new King("white");
		Chess wQueen1 = new Queen("white");
		Chess wBishop2 = new Bishop("white");
		Chess wKnight2 = new Knight("white");
		Chess wRook2 = new Rook("white");
		Chess wPawn1 = new Pawn("white");
		Chess wPawn2 = new Pawn("white");
		Chess wPawn3= new Pawn("white");
		Chess wPawn4= new Pawn("white");
		Chess wPawn5= new Pawn("white");
		Chess wPawn6= new Pawn("white");
		Chess wPawn7= new Pawn("white");
		Chess wPawn8= new Pawn("white");
		
		board[0][7] = wRook1;
		board[1][7] = wKnight1;
		board[2][7] = wBishop1;
		board[3][7] = wKing1;
		board[4][7] = wQueen1;
		board[5][7] = wBishop2;
		board[6][7] = wKnight2;
		board[7][7] = wRook2;
		board[0][6] = wPawn1;
		board[1][6] = wPawn2;
		board[2][6] = wPawn3;
		board[3][6] = wPawn4;
		board[4][6] = wPawn5;
		board[5][6] = wPawn6;
		board[6][6] = wPawn7;
		board[7][6] = wPawn8;
	}
}
