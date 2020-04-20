package com.company.SignUpPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

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
    void initialize() {

        cancel_button.setOnAction(
                actionEvent -> {
            cancel_button.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();


            loader.setLocation(getClass().getResource("/com/company/StartPage/StartPage.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

    }
}