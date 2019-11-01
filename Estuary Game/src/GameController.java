import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;

public class GameController extends Application {
	//data fields hold Model and View
	private GameModel model;
	private GameView view;
	
	
	
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
	public void start(Stage theStage) {
 	
    	view = new GameView(theStage);
		model = new GameModel(view.getWidth(), view.getHeight(), 
                view.getImageWidth(), view.getImageHeight());
		
		
		
        new AnimationTimer() {
            public void handle(long currentNanoTime)
            {
                //increment the x and y coordinates, alter direction if necessary
                model.updateLocationandDirection(view.getDirection(), view.getBassMode()); //get rid of BassMode
                //input the x coordinates, y coordinates, and direction picture
                view.update(model.getX(), model.getY(), model.getDirection());
                
                System.out.println(view.getDirection() +" "+ view.getBassMode()); //get rid of BassMode
                System.out.println(model.getX() + " " + model.getY() + " "+ model.getDirection());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        theStage.show();
    }
}
