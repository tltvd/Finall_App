package com.company.HomePage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HomePage_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button My_Garage_button;

    @FXML
    private Button NewCar_button;

    @FXML
    private Button Tuning_button;

    @FXML
    private Button Media_button;

    @FXML
    private Button Information_button;

    @FXML
    private Button Settings_button;

    @FXML
    private Button exit_button;

    @FXML
    private Label homePage_username;

    @FXML
    private ImageView avatar;

    @FXML
    private TextField Search_textfield;

    @FXML
    void handleClicks(ActionEvent event) {

    }

    @FXML
    void initialize() {

        exit_button.setOnAction(actionEvent -> {
            exit_button.getScene().getWindow().hide();
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
            stage.showAndWait();
        });





    }
}
