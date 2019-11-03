public class GameModel {
	int xloc = 0;
	int yloc = 0;
	int xIncr = 8;
	int yIncr = 2;
	final long startNanoTime = System.nanoTime();

	int canvasWidth;
	int canvasHeight;
	int imgWidth;
	int imgHeight;

	Direction direction;

	public GameModel(int width, int height, int imageWidth, int imageHeight) {
		this.canvasWidth = width;
		this.canvasHeight = height;
		this.imgWidth = imageWidth;
		this.imgHeight = imageHeight;
	}

	public int getX() {
		return xloc;
	}

	public int getY() {
		return yloc;
	}

	public Direction getDirection() {
		return direction;
	}

	// increment the x and y coordinates, alter direction if necessary
	public void updateLocationandDirection(Direction direction) {
//		Bass starts from top left corner and heads towards southeast so to change direction multiply by -1
		switch (direction) {
		case NORTH:
			yIncr *= -1;
			break;
		case WEST:
			xIncr *= -1;
			break;

		default:
			break;
		}

//		continues to increment the x and y location
		xloc += xIncr;
		yloc += yIncr;

		this.direction = direction;

	}
}