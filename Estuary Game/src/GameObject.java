
public class GameObject {
	double yPos;
	double xPos;
	Direction currDirection;
	int imgHeight;
	int imgWidth;
	
	public double getyPos() {
		return yPos;
	}
	
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	
	public double getxPos() {
		return xPos;
	}
	
	public void setxPos(double xPos) {
		this.xPos = xPos;
	}
	
	public Direction getCurrDirection() {
		return currDirection;
	}
	
	public void setCurrDirection(Direction currDirection) {
		this.currDirection = currDirection;
	}
	
	public int getImgHeight() {
		return imgHeight;
	}
	
	public void setImgHeight(int imgHeight) {
		this.imgHeight = imgHeight;
	}
	
	public int getImgWidth() {
		return imgWidth;
	}
	
	public void setImgWidth(int imgWidth) {
		this.imgWidth = imgWidth;
	}
	
	/**
	 * Use the x- and y- coordinates of this and antoher GameObject to determine if they are currently colliding with one another.
	 * @param go2, the second game object
	 * @return boolean whether this GameObject has collided with another
	 */
	public boolean collision(GameObject go2) {
		return true;
	} //TODO determine what the FUCK a collision even is in game logic
	
	
	
}
