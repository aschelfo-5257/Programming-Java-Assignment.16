import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Staff extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Simple UI: a single label inside a vertical box
        Label label = new Label("Staff");
        VBox root = new VBox(label);

        Scene scene = new Scene(root, 400, 80);
        primaryStage.setTitle("Staff");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);   // NOT “Launch”
    }
}
