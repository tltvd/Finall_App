package sample.SignUpPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import sample.Main;

public class SignUp_Controller {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
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
    private RadioButton male_rad_button;
    @FXML
    private ToggleGroup Gender;
    @FXML
    private RadioButton female_rad_button;
    @FXML
    private DatePicker dateOfbirth;
    @FXML
    private TextField firstname_textfield;
    @FXML
    private TextField lastname_textfield;
    @FXML
    private ComboBox<?> city_choose;

    @FXML
    void initialize() { }

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