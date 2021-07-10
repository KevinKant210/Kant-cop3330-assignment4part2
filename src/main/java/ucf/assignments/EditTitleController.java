package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class EditTitleController {



    ToDoList currList;

    @FXML
    private TextField NewTitleTextField;
    @FXML
    private Button SetTitleButton;



    @FXML
    private Text holderText;


    private String newTitle;

    public void SetTitleButtonClicked(ActionEvent actionEvent) {
        setNewTitle(NewTitleTextField.getText());

        if(newTitle.isEmpty()){
            ErrorScreenController.generateError("Please Fill The Title");
            return;
        }

        currList.setTitle(newTitle);
        holderText.setText(newTitle);
        Stage stage = (Stage) SetTitleButton.getScene().getWindow();
        stage.close();



    }


    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    public ToDoList getCurrList() {
        return currList;
    }

    public void setCurrList(ToDoList currList) {
        this.currList = currList;
    }

    public void setHolderText(Text holderText) {
        this.holderText = holderText;
    }
}
