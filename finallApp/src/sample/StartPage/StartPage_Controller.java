package sample.StartPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import sample.Main;
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
                Parent root1 = FXMLLoader.load(getClass().getResource("/sample/HomePage/homepage.fxml"));
                Main.setscene(root1);

            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }

    private void check(){
        //if(username_textfield ==)
    }

    public void openSignUpPage(){
        sign_up_button.setOnAction(event -> {
            try {
                Parent root2 = FXMLLoader.load(getClass().getResource("/sample/SignUpPage/SignUpPage.fxml"));
                Main.setscene(root2);
                Main.window.setWidth(800);
                Main.window.setHeight(600);
                Main.window.centerOnScreen();


            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }

    public void initialize() { }

}
