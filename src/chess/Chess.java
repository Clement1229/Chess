package chess;

public class Chess {
	int x; 
	int y; // current position
	String color;
	
	public Chess(String color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
//		setPosition();
	}
	
	public String getPosition(){
		return x + ", " + y;
	}
	
	public void move(int x1, int y1){
		if(isLegalMove(x1, y1) == true){
			
		}
		
		
	}
	
	public Boolean hasEnemy(){
		return true;
	}
	
	public Boolean isLegalMove(int x1, int y1){
		
		
		return true;
	}

}
