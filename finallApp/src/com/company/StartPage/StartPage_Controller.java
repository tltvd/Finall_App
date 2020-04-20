package com.company.StartPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import com.company.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class StartPage_Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField username_textfield;

    @FXML
    private PasswordField password_textfield;

    @FXML
    private Button sign_in_button;

    @FXML
    private Button sign_up_button;


    public void openHomePage(){
        sign_in_button.setOnAction(event -> {
            try {
                Parent root1 = FXMLLoader.load(getClass().getResource("/com/company/HomePage/HomePage.fxml"));
                Main.setscene(root1);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }


    public void openSignUpPage(){
        sign_up_button.setOnAction(event -> {
            try {
                Parent root1 = FXMLLoader.load(getClass().getResource("/com/company/SignUpPage/SignUpPage.fxml"));
                Main.setscene(root1);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }







    public void initialize() {


    }



}



/*

        @FXML
        void initialize () {


            sign_in_button.setOnAction(event -> {


                sign_in_button.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/HomePage/homepage1.fxml"));

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




            sign_up_button.setOnAction(event -> {
                sign_up_button.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/SignUpPage/SignUpPage.fxml"));

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


}
 */