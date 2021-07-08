package ucf.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaveFileTest {


    public static String folderPath = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment4part2\\src\\test\\resources\\FileIOTestFolder";

    @Test
    public void ensure_save_list_saves_list(){
        //gui will call saveList method and pass in the toDoList

        //generate test ToDoList
        //generate SavelIst testObj
        ToDoList testList = new ToDoList("List Name");

        for(int i = 0 ; i < 5 ; i ++){
            testList.addItem("Test Description","01/02/2003");
        }

        SaveFile fileSaver = new SaveFile(folderPath,"testdoc",testList);
        //asserttrue(saveList(Testlist)
        assertTrue(fileSaver.SaveList());
        //ensure a file was created with the proper file name and data was written in properly (no missing items or data)

        //for automated testing you may wish to use the deletefile function so overlapping file error does not occur
        //fileSaver.deleteFile();
    }



}
