package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;

public class ItemWindowController {

    //grab all interactables and put them into the FXML annotations  -- All Private All @FXML
        /*
            Text
        User Description Text
        UserDueDateText
        UserIsCompletedText

            DatePickers
        DatePicker

            Buttons
        EditDescriptionButton
        MarkCompleteButton
        DeletTaskButton
        EditDueDateButton
         */


    //Variables that reference backend
        //private Item CurrItem;
        //private ToDoList ParentList;





    @FXML
    public void EditDescriptionClicked(ActionEvent actionEvent) {

        //currItem.setDescription
        //change UserDescriptionText to currItem.getDescription

    }

    public void EditDueDateClicked(ActionEvent actionEvent) {
        //on event grab date from date picker
    }

    public void MarkItemCompleteClicked(ActionEvent actionEvent) {
        //currItem.markComplete

    }

    public void DeleteCurrItemClicked(ActionEvent actionEvent) {
        //find call deleteItem function in parent list
        //pass curritem as the parameter
    }

    public void setCurrItem(Item newItem){
        //item setter to set the curr item of the controller
    }

    public void setParentList(ToDoList parentList) {

        //this.parentList = parentList;
    }


}
