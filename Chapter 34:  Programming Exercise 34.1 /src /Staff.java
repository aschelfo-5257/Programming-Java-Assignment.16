import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Staff extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    // TODO Auto-generated method stub

    Scene scene = new Scene(name, 400, 80);
    primaryStage.setTitle("Move Rectangle");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Launch(args);
  }
}
