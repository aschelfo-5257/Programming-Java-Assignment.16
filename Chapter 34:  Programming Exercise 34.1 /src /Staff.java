import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Staff extends Application {
    private Label lbStatus = new Label("");

    /**
     * Use of the following:
     * private Label lblName = new Label("Name")
     * private TextField txtName = new TextField();
     *
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
        // Simple UI: a single label inside a vertical box
        Label label = new Label("Staff");
        VBox root = new VBox(label);

        Hbox hbox1 = new HBox(5);
        hbox1.getChildren().addAll(lblID, txtID);
        
        Hbox hbox2 = new HBox(5);
        hbox2.getChildren().addAll(lblLastName, txtLastName, lblFirstName, txtFirstName, lblMiddleName, txtMiddleName);

        Hbox hbox3 = new HBox(5);
        hbox3.getChildren().addAll(lblAddress, txtAddress);

        Hbox hbox4 = new HBox(5);
        hbox4.getChildren().addAll(lblCity, txtCity, lblState, txtState);

        Hbox hbox5 = new HBox(5);
        hbox5.getChildren().addAll(lblPhone, txtPhone, lblEmail, txtEmail);

        VBox vbox = new VBox(5);
        Vbox.getChildren().addAll(hbox1, hbox2, hbox3, hbox4, hbox5);

        HBox btnBox = new HBox(5);
        btnBox.getChildren().addAll(btnView, btnInsert, btnUpdate, btnClear);

        BorderPane pane = new BorderPane();
        pane.setTop(value);
        pane.setCenter(value);
        pane.setBottom(btnBox);

        Scene scene = new Scene(root, 400, 80);
        primaryStage.setTitle("Staff");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);   // NOT “Launch”
    }
}
