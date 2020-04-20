package com.company;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

import java.io.InputStream;


public class Main extends Application {



    public static final int WIDTH=1280;
    public static final int HEIGHT=720;
    public static Stage window;
    AnchorPane pane;




    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/com.company/StartPage/StartPage.fxml"));

        //Parent root = FXMLLoader.load(getClass().getResource("HomePage/HomePage.fxml"));
        window.setTitle("Germany Motors");

        InputStream iconStream = getClass().getResourceAsStream("/com.company/content/DE-Germany-Flag-icon.png");
        Image image = new Image(iconStream);
        window.getIcons().add(image);

        window.setScene(new Scene(root, WIDTH, HEIGHT));
        //window.initStyle(StageStyle.UTILITY);
        window.centerOnScreen();
        window.show();



    }

    public static void setscene(Parent root){
        window.setScene(new Scene(root, WIDTH, HEIGHT));
    }



    public static void main(String[] args) {
        launch(args);
    }
}
