import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage mainStg) {
        GameScene gaME = new GameScene(new Camera(800,600));
        mainStg.setTitle("Game Bayazid");
        mainStg.setScene(gaME);
        mainStg.show();
    }
}
