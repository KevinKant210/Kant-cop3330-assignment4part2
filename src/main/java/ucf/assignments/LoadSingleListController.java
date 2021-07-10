package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class LoadSingleListController {



    File userFile;
        //FXML CONTTENT
        /*
            TEXT FIELDS
                ListNameInputTextField
                ListLocationInputTextField
            Buttons
                BrowseButton
                LoadListButton

         */

    //String userPath;
    @FXML
    public Button BrowseButton;
    @FXML
    public Button LoadListButton;

    public void BrowseLoadSingleList(ActionEvent actionEvent) {
        //will open native machine file explorere and allow user to select a file
        //will save this path in userpath var
        FileChooser getFile = new FileChooser();
        getFile.setTitle("File Loader");

        userFile = getFile.showOpenDialog(BrowseButton.getScene().getWindow());

        System.out.println(userFile);

    }

    public void ListNameInputted(ActionEvent actionEvent) {

    }

    public void LoadSingleListButtonClicked(ActionEvent actionEvent) {
        //grab list name from ListName Text Field
        //generate LoadFile Object from Data

        LoadFile fileLoader = new LoadFile(userFile.getAbsolutePath());


        Parent root = null;
        ListWindowController controller;

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ListWindow.fxml"));

            root = loader.load();

            controller = loader.getController();

            controller.setCurrList(fileLoader.LoadList());



        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("List Manager");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        controller.DisplayAllButton.fire();
    }
}
