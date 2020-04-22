package sample.admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import sample.Main;

public class adminPage_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button orders_button;

    @FXML
    private Button cars_button;

    @FXML
    private Button users_button;

    @FXML
    private Button exit_button;

    @FXML
    private Button logout_button;


    @FXML
    void initialize() {
    }

    public void handleClicks(ActionEvent actionEvent){
        if (actionEvent.getSource()==exit_button) {
            Main.window.close();
        }
        if (actionEvent.getSource()==logout_button) {
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

