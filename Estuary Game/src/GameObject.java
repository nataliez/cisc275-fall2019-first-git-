
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
	
	
	
}
