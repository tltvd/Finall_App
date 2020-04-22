package sample.HomePage.overview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class item_controller {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private HBox item_pnl;

    @FXML
    private Label brand;

    @FXML
    private Label model;

    @FXML
    private Label year;

    @FXML
    private Label condition;

    @FXML
    private Label money;

    @FXML
    private Button buy_button;


    @FXML
    void initialize() {
    }
    public void handleClicks(){}
}