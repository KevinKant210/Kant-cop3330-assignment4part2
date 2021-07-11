/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class ErrorScreenController {

    //FXML CONTENT
        //Text
    //ErrorInfoText

    @FXML
    Text ErrorInfoText;
    @FXML
    Button OkButton;


    public void setErrorDescription(String ErrorDescription){
        //changes text error description to the error description provided on constructor creation
        ErrorInfoText.setText(ErrorDescription);
    }

    public static void generateError(String ErrorDescription){

        //summon error screen with a description
        Parent root = null;
        try {
            FXMLLoader loader = new  FXMLLoader (ErrorScreenController.class.getResource("ErrorScreen.fxml"));
            root = loader.load();

           ErrorScreenController controller =  loader.getController();
           controller.setErrorDescription(ErrorDescription);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("ERROR");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void OkButtonClicked(ActionEvent actionEvent) {
        //close the screen
        Stage stage = (Stage) OkButton.getScene().getWindow();
        stage.close();
    }
}
