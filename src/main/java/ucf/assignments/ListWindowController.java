package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ListWindowController {

    //Backend Vars
    private ArrayList<Item> currList;

    private String newDescription;

    private Date NewDate;

    //FXML Vars
    @FXML
    public Button SaveListButton;
    public TableView ItemsTable;
    public TableColumn DescriptionColumn;
    public TableColumn DueDateColumn;
    public TableColumn CompletionColumn;
    public TextField NewDescriptionTextField;
    public DatePicker NewDatePicker;
    public Button AddItemButton;
    public Button DeleteSelectedItemButton;
    public Text ListTitleText;





    public void DescriptionChanged(TableColumn.CellEditEvent cellEditEvent) {

        //on event check new description to ensure it doesnt break laws
        //if doesnt change description
        //else error window
    }

    public void DueDateChanged(TableColumn.CellEditEvent cellEditEvent) {
        //on event enssure new date does break format
        //if doesnt change due date
        //else error window
    }

    public void IsCompleteChanged(TableColumn.CellEditEvent cellEditEvent) {
        //when they mark complete call the item.markcomplete method for item
    }

    

    public void NewDateEntered(ActionEvent actionEvent) {
        //hold onto new date entered
    }

    public void AddItemButtonClicked(ActionEvent actionEvent) {
        //ensure both date and description fields have inputs
            //if not error window
        //ensure the inputs are both valid inputs
            //if not error window

        //currList.addItem(newDescription,NewDate)

        //add it to the table

    }

    public void DeleteSelectedItemButtonClicked(ActionEvent actionEvent) {
        //delete selected item currList.deleteitem(Item)
        //delete selected row from table
    }

    public void SaveListButtonClicked(ActionEvent actionEvent) {
        //open save window
    }

    public void NewDescriptionTextFieldChanged(ActionEvent actionEvent) {
        //ensure new description is valid else throw error window

        //hold onto newDescription

    }
}
