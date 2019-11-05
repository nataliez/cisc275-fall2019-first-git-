/**
 * A non-physical object that keeps track of the pieces of debris left in the cave pathway.
 * @author CISC275 Team 6
 *
 */
public class ControlObject extends MoveObject {
	
	Direction currDir;

	public Direction getCurrDir() {
		return currDir;
	}

	public void setCurrDir(Direction currDir) {
		this.currDir = currDir;
	}
	
	void move() {}
	
	
}
