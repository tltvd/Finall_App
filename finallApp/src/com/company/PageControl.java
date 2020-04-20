package com.company;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class PageControl extends Main {
    public static void setscene(Parent root){
        window.setScene(new Scene(root, WIDTH, HEIGHT));
    }

}
