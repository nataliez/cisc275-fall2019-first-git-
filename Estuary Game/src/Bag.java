
public class Bag extends MoveObject{

	/**
	 * The score of the Bag object which is used to calculate the turtle character's overall score. Always -1.
	 */
	int score = -1;
	/**
	 * The height of the jellyfish image in pixels. (Placeholder of 50 for now)
	 */
    int imgHeight = 50;
	/**
	 * The width of the jellyfish image in pixels. (Placeholder of 50 for now)
	 */
    int imgWidth = 50;
	
	public Bag(double yPos, double xPos, Direction currDirection,int velX, int velY) {
		this.velX = velX; this.velY = velY; this.currDirection = currDirection;  this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public Bag() {
		
	}
}
