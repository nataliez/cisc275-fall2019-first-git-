
public class Jelly extends MoveObject{

	int score = 1;
    int imgHeight = 50;
    int imgWidth = 50;
	
	public Jelly(double yPos, double xPos, Direction currDirection,int velX, int velY) {
		this.velX = velX; this.velY = velY; this.currDirection = currDirection;  this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public Jelly() {
		
	}
}