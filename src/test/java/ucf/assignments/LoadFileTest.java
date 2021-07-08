package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LoadFileTest {

    //create a test file with ListObjs ( preferrable with saveFile)

    String filePath = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment4part2\\src\\test\\resources\\FileIOTestFolder\\testloaderdoc.txt";

    @Test
    public void ensure_single_list_loaded_all_items(){
        //gui will call load list method in LoadFile Obj

        //create LoadFile obj and feed it testFile with testList
        LoadFile loader = new LoadFile(filePath);

        //call LoadList method and test to see that it generated a list object properly
        ToDoList newList = loader.LoadList();
        //AssertEquals(LoadFile.LoadList(TestFile,TestListTitle.Title, TestTitle)

        assertEquals(5,newList.itemHolder.size());
    }

    @Test
    public void ensure_single_list_loaded_all_items_with_proper_names(){

        //generate load file obj with file path

        LoadFile loader = new LoadFile(filePath);

        //generate temp to do list to hold result
        ToDoList newList = loader.LoadList();

        //loop through to check valid item conditions

        String testDescription = "Test Description";

        boolean isRight = true;
        for(Item item : newList.itemHolder){
            if (item.getDescription().compareTo(testDescription) != 0) {
                isRight = false;
                break;
            }
        }

        //assertrue(conditionsmet)

        assertTrue(isRight);
    }

    @Test
    public void ensure_single_list_loaded_all_items_with_proper_dates(){
        //generate load file obj with file path

        LoadFile loader = new LoadFile(filePath);

        //generate temp to do list to hold result
        ToDoList newList = loader.LoadList();

        //loop through to check valid item conditions

        LocalDate testDate = new LocalDateStringConverter().fromString("01/02/2003");

        boolean isRight = true;


        for(Item item : newList.itemHolder){
            if (item.getDue().compareTo(testDate) != 0) {
                isRight = false;
                break;
            }
        }

        //assertrue(conditionsmet)

        assertTrue(isRight);
    }

    @Test
    public void ensure_single_list_loaded_all_items_with_proper_completion(){
        //generate load file obj with file path

        LoadFile loader = new LoadFile(filePath);

        //generate temp to do list to hold result
        ToDoList newList = loader.LoadList();

        //loop through to check valid item conditions

        boolean isRight = true;
        for(Item item : newList.itemHolder){
            if(item.getCompletion()){
                isRight = false;
            }
        }

        //assertrue(conditionsmet)

        assertTrue(isRight);
    }









}
