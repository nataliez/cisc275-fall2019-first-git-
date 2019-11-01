import java.util.concurrent.TimeUnit;

public class GameTimer {
	// I used this website as a starting point:
	// https://www.techiedelight.com/measure-elapsed-time-execution-time-java/
	
	// There may be a better method on that site than the one I suggested here 

	void StartTimer() throws InterruptedException {

		long startTime = System.nanoTime();
		TimeUnit.SECONDS.sleep(5);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
	}

}
