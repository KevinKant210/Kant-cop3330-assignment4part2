package ucf.assignments;

import javafx.event.ActionEvent;

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



    //curr list will be passed to the constructor on creation



    //private ToDoList currList;

   // private String FileName;

    //private String UserPath;

    public void FileLocationEntered(ActionEvent actionEvent) {
        //grab the file location from the text field and set it to the userpath string
    }

    public void FileNameEntered(ActionEvent actionEvent) {
        //get filename from the text field and set it to filename variable
    }

    public void BrowseForFile(ActionEvent actionEvent) {
        //open up the native file explorer and once done browsing set the text field to that value
    }

    public void SubmitDataSaveButton(ActionEvent actionEvent) {
        //submit value of both text fields to their respective values
            //filename text to string filename
            //userpathtext to string userpath
        //if(user did not enter data) create error screen and get mad at them then return;

        //create SaveFileObj with fileName and UserPath data
        //call SaveFile.CreateFIle to create an empty file
            //if error generate error window and return;

        //call SaveFile.SaveList(with currList)
        //if true return
        //else bring up error window

    }

    public void setCurrList(ToDoList list){
        //currList = list;

    }

}
