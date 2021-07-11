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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;


public class ListWindowController {





    //Backend Vars
    private ToDoList currList;





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
    @FXML
    public Button MarkCompleteButton;
    @FXML
    public Button EditItemButton;
    @FXML
    public Button DisplayAllButton;
    @FXML
    public Button DisplayCompleteButton;
    @FXML
    public Button DisplayIncomplete;
    @FXML
    public Button ClearListButton;


    public void initialize(){



        DescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        DueDateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        CompletionColumn.setCellValueFactory(new PropertyValueFactory<>("complete"));

        currList = new ToDoList("New List");

        ListTitleText.setText(currList.getTitle());


    }






    public void AddItemButtonClicked(ActionEvent actionEvent) {

        //ensure both date and description fields have inputs
        if(NewDatePicker.getValue() == null){
            ErrorScreenController.generateError("Please Fill In Date");
            return;
        }
            //if not error window
        //ensure the inputs are both valid inputs
        if(NewDescriptionTextField.getText().isEmpty()){
            ErrorScreenController.generateError("Please Fill In Description");
            return;
        }

        if(NewDescriptionTextField.getText().length() > 256){
            ErrorScreenController.generateError("Please Keep Descriptions less then 256 characters");
            return;
        }
            //if not error window

        //currList.addItem(newDescription,NewDate)
        Item tempItem = new Item(NewDatePicker.getValue(),NewDescriptionTextField.getText());

        currList.itemHolder.add(tempItem);
        //add it to the table
        ItemsTable.getItems().add(tempItem);

        NewDatePicker.getEditor().clear();
        NewDescriptionTextField.clear();
        NewDatePicker.setValue(null);
    }

    public void DeleteSelectedItemButtonClicked(ActionEvent actionEvent) {
        //delete selected item currList.deleteitem(Item)
        //delete selected row from table

        currList.deleteItem(ItemsTable.getSelectionModel().getSelectedItem());
        ItemsTable.getItems().removeAll(ItemsTable.getSelectionModel().getSelectedItem());
    }

    public void SaveListButtonClicked(ActionEvent actionEvent) {
        //open save window
        Parent root = null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("SaveList.fxml"));

            root = loader.load();

            SaveListController controller = loader.getController();

            controller.setCurrList(currList);

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



    public void ChangeTitleButtonClicked(ActionEvent actionEvent) {

        //open change title window
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


    public void MarkCompleteButtonClicked(ActionEvent actionEvent) {
        //grab item from table
        Item temp = ItemsTable.getSelectionModel().getSelectedItem();
        //change Complete value
        temp.setComplete(true);


        ItemsTable.refresh();
    }

    public void EditItemButtonClicked(ActionEvent actionEvent) {

        //grab item from table
        Item temp = ItemsTable.getSelectionModel().getSelectedItem();

        //validate input change
        if(NewDatePicker.getValue() != null){
            temp.setDue(NewDatePicker.getValue());
            NewDatePicker.getEditor().clear();
            NewDatePicker.setValue(null);
        }

        if(NewDescriptionTextField.getText().length() > 256){
            ErrorScreenController.generateError("Please Keep Descriptions less then 256 characters");
            return;
        }

        if(!NewDescriptionTextField.getText().isEmpty()){
            temp.setDescription(NewDescriptionTextField.getText());
            NewDescriptionTextField.clear();
        }


        //change item values to new values

        ItemsTable.refresh();
    }

    public void DIsplayAllButtonClicked(ActionEvent actionEvent) {

        //empty the table

        ItemsTable.getItems().clear();

        //add ALL items in currlist
        for(Item item: currList.itemHolder){
            ItemsTable.getItems().add(item);
        }


    }

    public void DisplayCompleteButtonClicked(ActionEvent actionEvent) {
        //empty current table
        ItemsTable.getItems().clear();

        //add all items with Complete = true
        for(Item item: currList.itemHolder){
            if(item.getComplete()){
                ItemsTable.getItems().add(item);
            }
        }

    }

    public void DsiplayIncompleteClicked(ActionEvent actionEvent) {

        //empty table
        ItemsTable.getItems().clear();

        //add all items where Completed = false
        for(Item item: currList.itemHolder){
            if(!item.getComplete()){
                ItemsTable.getItems().add(item);
            }
        }


    }

    public void ClearListButtonClicked(ActionEvent actionEvent) {

        //clear table
        ItemsTable.getItems().clear();

        //clear currlist
        for(Item item: currList.itemHolder){
            currList.deleteItem(item);
        }


    }

    public void setCurrList(ToDoList loadList){
        currList = loadList;
    }

}
