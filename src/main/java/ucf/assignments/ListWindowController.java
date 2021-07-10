package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class ListWindowController {

    //Backend Vars
    private ToDoList currList = new ToDoList("Title");

    private String newDescription;

    private Date NewDate;

    //FXML Vars
    @FXML
    private Button SaveListButton;
    @FXML
    private TableView<Item> ItemsTable;
    @FXML
    private TableColumn<Item, String> DescriptionColumn;
    @FXML
    private TableColumn<Item, LocalDate> DueDateColumn;
    @FXML
    private TableColumn<Item, Boolean> CompletionColumn;
    @FXML
    private TextField NewDescriptionTextField;
    @FXML
    private DatePicker NewDatePicker;
    @FXML
    private Button AddItemButton;
    @FXML
    private Button DeleteSelectedItemButton;
    @FXML
    private  Text ListTitleText;
    @FXML
    private Button ChangeTitleButton;


    public void initialize(){
        System.out.println("initial");


        DescriptionColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        DueDateColumn.setCellValueFactory(new PropertyValueFactory<Item, LocalDate>("date"));
        CompletionColumn.setCellValueFactory(new PropertyValueFactory<Item, Boolean>("iscomplete"));
    }





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
        System.out.println(NewDescriptionTextField.getText() + NewDatePicker.getValue());

        Item tempItem = new Item(new LocalDateStringConverter().fromString("01/02/2021"),"description");


        ItemsTable.getItems().add(tempItem);
        System.out.println(tempItem.getDate().toString() + tempItem.getDescription());
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
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("SaveList.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Single Save");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void NewDescriptionTextFieldChanged(ActionEvent actionEvent) {
        //ensure new description is valid else throw error window

        //hold onto newDescription

    }

    public void ChangeTitleButtonClicked(ActionEvent actionEvent) {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("EditTitle.fxml"));
            root = loader.load();
            EditTitleController controller = loader.getController();

            controller.setCurrList(currList);
            controller.setHolderText(ListTitleText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Change Title");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();


    }




}
