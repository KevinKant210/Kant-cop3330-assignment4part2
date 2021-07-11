/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package ucf.assignments;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ListApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //oon start generate a single empty list
            //create new ToDOList Object and add it to ListHandler via ListHandler Methods
        // generate default values for the ToDoList Object

        try {
            Parent root = FXMLLoader.load(getClass().getResource("ListApp.fxml"));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("ListApp");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
