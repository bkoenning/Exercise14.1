/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise14.pkg1;

/**
 *
 * @author Brandon Koenning
 */

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.Scene;

public class Flags extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        String[] flagStrings = {"uk.gif", "china.gif", "ca.gif", "us.gif"};
        ImageView[] flagViews = new ImageView[flagStrings.length];
        
        for (int i = 0; i < flagViews.length; i++)
            flagViews[i] = new ImageView(new Image("/image/" + flagStrings[i]));
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 30));
        
        for (int i = 0, a = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++, a++)
                pane.add(flagViews[a], i, j);
        
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
