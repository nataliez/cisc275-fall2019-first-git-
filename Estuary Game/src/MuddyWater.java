/**
 * A non-physical object that keeps track of how dark the muddy water is for the oyster minigame.
 * @author CISC275 Team 6
 *
 */
public class MuddyWater {
	/**
	 * The "level" of mud present in the water, out of 10. Initially set to 10.
	 */
	int darkness;
	
	
	/**
	 * Empty constructor, sets darkness to 10.
	 */
	public MuddyWater(){
		darkness = 10;
	}
	
	/**
	 * Returns the current darkness
	 */
	public int getDarkness() {
		return darkness;
	}
	
	/**
	 * Reduces darkness by one upon the successful placement of oyster
	 */
	public void reduceDarkness() {
		darkness--;
	} //TODO call this method upon "corresponding collisions" in the oyster minigame.
	
	/**
	 * Boolean that tests if the water is clean.
	 * @return true if the darkness is 0
	 * @return false if the darkness is anything but 0
	 */
	public boolean waterClean() {
		if(this.darkness == 0) {
			return true;
		}
		return false;
	}
	
	
}
