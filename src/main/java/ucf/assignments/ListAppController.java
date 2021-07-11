/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ListAppController {

    //FXML content -- all private all @FXML
    /*
            Buttons
        LoadAllListsButton
        NewListButton
        SaveAllButton
        LoadSingleListButton
     */

    public void CreateList(ActionEvent actionEvent) {
        //create a new ToDoList Obj

        //launch ListWindow

        //Pass it the new ToDoList Obj


        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("ListWindow.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("List Window");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();


    }

    public void LoadListButtonClicked(ActionEvent actionEvent) {
        //Launch Load File Window


        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("LoadSingleList.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Load List");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }









}
