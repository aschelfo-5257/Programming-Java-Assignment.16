import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Staff extends Application {
    private Label lbStatus = new Label("");

    /**
     * You would follow the label and textfield:
     * private Label ldlName = new Label("Name");
     * private TextField txtName = new TextField();
     */
    private Label lblID = new Label("ID");
    private TextField txtID = new TextField();
    private Label lblLastName = new Label("Last Name");
    private TextField txtLastName = new TextField();
    private Label lblFirstName = new Label("First Name");
    private TextField txtFirstName = new TextField();
    private Label lblMiddleName = new Label("MI");
    private TextField txtMiddleName = new TextField();
    private Label lblAddress = new Label("Address");
    private TextField txtAddress = new TextField();
    private Label lblCity = new Label("City");
    private TextField txtCity = new TextField();
    private Label lblState = new Label("State");
    private TextField txtState = new TextField();
    private Label lblPhone = new Label("Telephone");
    private TextField txtPhone = new TextField();
    private Label lblEmail = new Label("Email");
    private TextField txtEmail = new TextField();

    private Button btnView = new Button("View");
    private Button btnInsert = new Button("Insert");
    private Button btnUpdate = new Button("Update");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Staff");

        HBox hbox1 = new HBox(5, lblID, txtID);
        HBox hbox2 = new HBox(5, lblLastName, txtLastName, lblFirstName, txtFirstName, lblMiddleName, txtMiddleName);
        HBox hbox3 = new HBox(5, lblAddress, txtAddress);
        HBox hbox4 = new HBox(5, lblCity, txtCity, lblState, txtState);
        HBox hbox5 = new HBox(5, lblPhone, txtPhone, lblEmail, txtEmail);

        VBox vbox = new VBox(5, label, hbox1, hbox2, hbox3, hbox4, hbox5);

        HBox btnBox = new HBox(5, btnView, btnInsert, btnUpdate, btnClear);

        BorderPane pane = new BorderPane();
        pane.setTop(vbox);
        pane.setBottom(btnBox);

        Scene scene = new Scene(pane, 600, 300);
        primaryStage.setTitle("Staff");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
