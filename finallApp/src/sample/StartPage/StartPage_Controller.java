package sample.StartPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import sample.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class StartPage_Controller {

    @FXML
    private TextField username_textfield;

    @FXML
    private PasswordField password_textfield;

    @FXML
    private Button sign_in_button;

    @FXML
    private Button sign_up_button;

    @FXML
    private Button exit_button;


    private void check(TextField username_textfield, PasswordField password_textfield) {

    }


    public void initialize() {

        sign_in_button.setOnAction(event -> {
            String username, password;
            username=username_textfield.getText().trim();
            password=password_textfield.getText().trim();

            if (username.equals("admin")  && password.equals("admin") ) {
                    try {
                        Parent root1 = FXMLLoader.load(getClass().getResource("/sample/admin/adminPage.fxml"));
                        Main.setscene(root1);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

            }

            if (username.equals("1")  && password.equals("1") ) {
                try {
                    Parent root1 = FXMLLoader.load(getClass().getResource("/sample/HomePage/homepage.fxml"));
                    Main.setscene(root1);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!username.equals("")  && !password.equals("") ) {
                loginUser(username,password);
            }
            else{
                System.out.println("ERROR!!! User not found");
            }

        });

    }

    private void loginUser(String username, String password) {

    }

    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource() == exit_button) {
            Main.window.close();
        }
        if (actionEvent.getSource() == sign_up_button ) {
            try {
                Parent root2 = FXMLLoader.load(getClass().getResource("/sample/SignUpPage/SignUpPage.fxml"));
                Main.setscene(root2);
                Main.window.centerOnScreen();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }








}

