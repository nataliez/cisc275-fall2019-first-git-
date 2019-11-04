/**
 * A non-physical object that keeps track of the pieces of debris left in the cave pathway.
 * @author CISC275 Team 6
 *
 */
public class Cave {
	/**
	 * The "level" of trash present in the Cave environment, out of 10.
	 */
	int trashLevel;
	
	/**
	 * Empty constructor, sets trashLevel to 10.
	 */
	public Cave(){
		trashLevel = 10;
	}
	
	/**
	 * Returns the current trashLevel
	 */
	public int getTrashLevel() {
		return trashLevel;
	}
	
	/**
	 * Reduces trashLevel by one upon the successful collision of corresponding garbage draggable object and collection object. (i.e. trash and 
	 * trash bag.)
	 */
	public void reduceTrashLevel() {
		trashLevel --;
	} //TODO call this method upon "corresponding collisions" in the trash minigame.
	
	/**
	 * Boolean that tests if the cave has been cleared out.
	 * @return true if the trashLevel is 0
	 * @return false if the trashLevel is anything but 0
	 */
	public boolean caveClear() {
		if(this.trashLevel == 0) {
			return true;
		}
		return false;
	}
	
	
}
