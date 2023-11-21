import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class GameScene extends Scene {
    private Camera camera;

    public GameScene(Camera camera) {
        super(new Group(), 800,600);

        this.camera = this.camera;
        Image mapScreen = new Image("file:C:\\Users\\bayazid\\Downloads\\Ressources audio et image pour le runner-20231121\\img\\desert.png");

        ImageView mapView = new ImageView(mapScreen);
        mapView.setFitWidth(800);
        mapView.setFitHeight(600);

        ((Group) this.getRoot()).getChildren().add(mapView);
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }


}
