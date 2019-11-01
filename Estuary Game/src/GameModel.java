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
	BassMode bassMode;

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
	public void updateLocationandDirection(Direction direction, BassMode bassMode) {
		// The Bass's speed based off of BassMode
		if (bassMode == BassMode.CONFUSE) {
			xIncr = 4;
			yIncr = 1;
		} else if (bassMode == BassMode.ATTAC) {
			xIncr = 16;
			yIncr = 4;
		} else if (bassMode == BassMode.DEFAULT){
			xIncr = 8;
			yIncr = 2;
		}
		else if (bassMode == BassMode.STOP) {
			xIncr = 0;
			yIncr = 0;
		}


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
		this.bassMode = bassMode;

	}
}