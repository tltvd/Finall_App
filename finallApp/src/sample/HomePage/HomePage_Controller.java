package sample.HomePage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import sample.Main;

public class HomePage_Controller {

    @FXML
    private Button home_button;

    @FXML
    private Button Account_button;

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
    private Button LogOut_button;

    @FXML
    private Button exit_button;

    @FXML
    private TextField Search_textfield;

    @FXML
    private Pane pnlhome;

    @FXML
    private VBox pnItems;

    @FXML
    private Pane pnlMyGarage;

    @FXML
    private Pane pnlBuy;

    @FXML
    private Pane pnlMedia;

    @FXML
    private Pane pnlTuning;

    @FXML
    private Pane pnlInfo;

    @FXML
    private Pane pnlMyAccount;



    public void logout(){
        LogOut_button.setOnAction(event -> {
            try {
                Parent root1 = FXMLLoader.load(getClass().getResource("/sample/StartPage/StartPage.fxml"));
                Main.setscene(root1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    public void colorChange(Button button){

        button.setOnMouseEntered(event -> {
            button.setStyle("-fx-background-color : rgba(0,0,0,0.6)");

        });
        button.setOnMouseExited(event -> {
            button.setStyle("-fx-background-color :  #181818");
        });
    }
    public void panechanger(Button button){
        button.setOnAction(event -> {
            if (button==My_Garage_button) {
                pnlhome.setVisible(false);
                pnlBuy.setVisible(false);
                pnlInfo.setVisible(false);
                pnlMedia.setVisible(false);
                pnlTuning.setVisible(false);
                pnlMyGarage.setVisible(true);
                pnlMyAccount.setVisible(false);
            }
            if (button==Information_button) {
                pnlhome.setVisible(false);
                pnlBuy.setVisible(false);
                pnlInfo.setVisible(true);
                pnlMedia.setVisible(false);
                pnlTuning.setVisible(false);
                pnlMyGarage.setVisible(false);
                pnlMyAccount.setVisible(false);
            }
            if (button==home_button) {
                pnlhome.setVisible(true);
                pnlBuy.setVisible(false);
                pnlInfo.setVisible(false);
                pnlMedia.setVisible(false);
                pnlTuning.setVisible(false);
                pnlMyGarage.setVisible(false);
                pnlMyAccount.setVisible(false);
            }
            if (button==NewCar_button) {
                pnlhome.setVisible(false);
                pnlBuy.setVisible(true);
                pnlInfo.setVisible(false);
                pnlMedia.setVisible(false);
                pnlTuning.setVisible(false);
                pnlMyGarage.setVisible(false);
                pnlMyAccount.setVisible(false);
            }
            if (button==Tuning_button) {
                pnlhome.setVisible(false);
                pnlBuy.setVisible(false);
                pnlInfo.setVisible(false);
                pnlMedia.setVisible(false);
                pnlTuning.setVisible(true);
                pnlMyGarage.setVisible(false);
                pnlMyAccount.setVisible(false);
            }
            if (button==Media_button) {
                pnlhome.setVisible(false);
                pnlBuy.setVisible(false);
                pnlInfo.setVisible(false);
                pnlMedia.setVisible(true);
                pnlTuning.setVisible(false);
                pnlMyGarage.setVisible(false);
                pnlMyAccount.setVisible(false);
            }
            if (button==Account_button) {
                pnlhome.setVisible(false);
                pnlBuy.setVisible(false);
                pnlInfo.setVisible(false);
                pnlMedia.setVisible(false);
                pnlTuning.setVisible(false);
                pnlMyGarage.setVisible(false);
                pnlMyAccount.setVisible(true);
            }
        });


    }


    @FXML
    void initialize() {


        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("/sample/HomePage/Item.fxml"));

                //give the items some effect

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : rgba(0,0,0,0.6)");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        colorChange(home_button);
        colorChange(LogOut_button);
        colorChange(Information_button);
        colorChange(Media_button);
        colorChange(Tuning_button);
        colorChange(My_Garage_button);
        colorChange(NewCar_button);
        colorChange(exit_button);
        colorChange(Account_button);

    }

    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource()==My_Garage_button) {
            panechanger(My_Garage_button);
        }
        if (actionEvent.getSource()==Information_button) {
            panechanger(Information_button);
        }
        if (actionEvent.getSource()==home_button) {
            panechanger(home_button);
        }
        if (actionEvent.getSource()==NewCar_button) {
            panechanger(NewCar_button);
        }
        if (actionEvent.getSource()==Tuning_button) {
            panechanger(Tuning_button);
        }
        if (actionEvent.getSource()==Media_button) {
            panechanger(Media_button);
        }
        if (actionEvent.getSource()==Account_button) {
            panechanger(Account_button);
        }


        if (actionEvent.getSource() == exit_button) {
            Main.window.close();
        }



    }
}



