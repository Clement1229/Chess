package chess;

public class King extends Chess {

	public King(String color, int x, int y) {
		super(color, x, y);
		// TODO Auto-generated constructor stub
		init = "K";
	}

    public Boolean isLegalMove(int x1, int y1){
		if(x1-x >= 2 || y1-y >= 2){
			return false;
		}
		
		return true;
	}
}
