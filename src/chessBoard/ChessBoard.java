package chessBoard;

import chess.*;

public class ChessBoard {
	int x;
	int y;
	Chess[] [] board = new Chess[x][y];
	
	/*    8  X  8
	 *   (0,0) (0,1)
	 *   rook  knight bishop king   queen bishop knight rook
	 *   pawn  pawn    pawn  pawn  pawn   pawn    pawn   pawn   white
	 * 
	 * 
	 * 
	 *   (6,0) (6,1)
	 *   pawn  pawn    pawn  pawn  pawn   pawn    pawn  pawn     black
	 *   rook  knight bishop king  queen  bishop knight rook
	 *   (7,0)  (7,1)
	 */
	
	public ChessBoard(){
		initialize();
	}
	
	public void initialize(){
		x = 7;
		y = 7;
		Chess bRook1 = new Rook("black", 7, 0);
		Chess bKnight1 = new Knight("black", 7, 1);
		Chess bBishop1 = new Bishop("black", 7, 2);
		Chess bKing1 = new King("black", 7, 3);
		Chess bQueen1 = new Queen("black", 7, 4);
		Chess bBishop2 = new Bishop("black", 7, 5);
		Chess bKnight2 = new Knight("black", 7, 6);
		Chess bRook2 = new Rook("black", 7, 7);
		Chess bPawn1 = new Pawn("black", 6, 0);
		Chess bPawn2 = new Pawn("black", 6, 1);
		Chess bPawn3= new Pawn("black", 6, 2);
		Chess bPawn4= new Pawn("black", 6, 3);
		Chess bPawn5= new Pawn("black", 6, 4);
		Chess bPawn6= new Pawn("black", 6, 5);
		Chess bPawn7= new Pawn("black", 6, 6);
		Chess bPawn8= new Pawn("black", 6, 7);
		board[7][0] = bRook1;
		board[7][1] = bKnight1;
		board[7][2] = bBishop1;
		board[7][3] = bKing1;
		board[7][4] = bQueen1;
		board[7][5] = bBishop2;
		board[7][6] = bKnight2;
		board[7][7] = bRook2;
		board[6][0] = bPawn1;
		board[6][1] = bPawn2;
		board[6][2] = bPawn3;
		board[6][3] = bPawn4;
		board[6][4] = bPawn5;
		board[6][5] = bPawn6;
		board[6][6] = bPawn7;
		board[6][7] = bPawn8;
	//----------------------------------------	
		Chess wRook1 = new Rook("white",0,0);
		Chess wKnight1 = new Knight("white",0,1);
		Chess wBishop1 = new Bishop("white",0,2);
		Chess wKing1 = new King("white",0,3);
		Chess wQueen1 = new Queen("white",0,4);
		Chess wBishop2 = new Bishop("white",0,5);
		Chess wKnight2 = new Knight("white",0,6);
		Chess wRook2 = new Rook("white",0,7);
		Chess wPawn1 = new Pawn("white",1,0);
		Chess wPawn2 = new Pawn("white",1,1);
		Chess wPawn3= new Pawn("white",1,2);
		Chess wPawn4= new Pawn("white",1,3);
		Chess wPawn5= new Pawn("white",1,4);
		Chess wPawn6= new Pawn("white",1,5);
		Chess wPawn7= new Pawn("white",1,6);
		Chess wPawn8= new Pawn("white",1,7);
		
		board[0][0] = wRook1;
		board[0][1] = wKnight1;
		board[0][2] = wBishop1;
		board[0][3] = wKing1;
		board[0][4] = wQueen1;
		board[0][5] = wBishop2;
		board[0][6] = wKnight2;
		board[0][7] = wRook2;
		board[1][0] = wPawn1;
		board[1][1] = wPawn2;
		board[1][2] = wPawn3;
		board[1][3] = wPawn4;
		board[1][4] = wPawn5;
		board[1][5] = wPawn6;
		board[1][6] = wPawn7;
		board[1][7] = wPawn8;
	}
}
