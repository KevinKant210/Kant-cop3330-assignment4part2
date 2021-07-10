package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class SaveListController {




    //FXML CONTENT

    /*
        Buttons
            SaveButton
            BrowseButton

         Text-Fields
            FileLocationTextField
            FileNameTextField

     */
    private File userDir;

    @FXML
    public TextField FileLocationTextField;
    @FXML
    public Button BrowseButton;
    @FXML
    public Button SaveButton;

    //curr list will be passed to the constructor on creation



    private ToDoList currList;

   // private String FileName;

    //private String UserPath;

    // dont need
    public void FileLocationEntered(ActionEvent actionEvent) {
        //grab the file location from the text field and set it to the userpath string
    }

    //dontneed
    public void FileNameEntered(ActionEvent actionEvent) {
        //get filename from the text field and set it to filename variable

    }

    public void BrowseForFile(ActionEvent actionEvent) {
        //open up the native file explorer and once done browsing set the text field to that value
        DirectoryChooser chooser = new DirectoryChooser();

        chooser.setTitle("Choose Directory");


        userDir = chooser.showDialog(BrowseButton.getScene().getWindow());



    }

    public void SubmitDataSaveButton(ActionEvent actionEvent) {
        //submit value of both text fields to their respective values
            //filename text to string filename
            //userpathtext to string userpath
        //if(user did not enter data) create error screen and get mad at them then return;

        if(FileLocationTextField.getText().isEmpty()){
            ErrorScreenController.generateError("Please Choose A File Name");
            return;

        }


        //create SaveFileObj with fileName and UserPath data
        //call SaveFile.CreateFIle to create an empty file
            //if error generate error window and return;
        SaveFile fileSaver = new SaveFile(userDir.getAbsolutePath(), FileLocationTextField.getText(), currList);

        if(!fileSaver.SaveList()){
            ErrorScreenController.generateError("Error Saving File");
            return;
        }

        Stage stage = (Stage) BrowseButton.getScene().getWindow();
        stage.close();


        //call SaveFile.SaveList(with currList)
        //if true return
        //else bring up error window

    }

    public void setCurrList(ToDoList list){
        currList = list;

    }

}
