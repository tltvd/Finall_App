package sample.SignUpPage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import sample.Main;
import sample.dataBase.DatabaseHandler;

public class SignUp_Controller {
    @FXML
    private PasswordField password_textfield;
    @FXML
    private Button register_button;
    @FXML
    private Button cancel_button;
    @FXML
    private TextField username_textfield;
    @FXML
    private PasswordField passwordConfirm_textfield;
    @FXML
    private TextField email_textfield;
    @FXML
    private TextField number_textfield;
    @FXML
    private RadioButton male_rad_button;
    @FXML
    private ToggleGroup Gender;
    @FXML
    private RadioButton female_rad_button;
    @FXML
    private TextField firstname_textfield;
    @FXML
    private TextField lastname_textfield;
    @FXML
    private TextField city_textfield;
    @FXML
    void initialize() {

        DatabaseHandler dbHandler=new DatabaseHandler();

        register_button.setOnAction(event -> {
            dbHandler.signUpUser(firstname_textfield.getText(),lastname_textfield.getText(),
                    number_textfield.getText(),city_textfield.getText(),
                    "male",username_textfield.getText(),email_textfield.getText(),password_textfield.getText());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Registration completed!");
            alert.showAndWait();
            try {
                Parent root1 = FXMLLoader.load(getClass().getResource("/sample/StartPage/StartPage.fxml"));
                Main.setscene(root1);
                Main.window.centerOnScreen();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource()==cancel_button) {
            try {
                Parent root1 = FXMLLoader.load(getClass().getResource("/sample/StartPage/StartPage.fxml"));
                Main.setscene(root1);
                Main.window.centerOnScreen();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}