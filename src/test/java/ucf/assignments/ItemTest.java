package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void ensure_item_can_change_description(){
        //GUI calls the set method for description encapsulated by the item obj

        //create Test Item with (TestDate,InitiailTestDescription)

        Item testItem = new Item("02/21/2019","testDescription");

        //User Item Set method to change description to FinalTestDescription

        testItem.setDescription("final Description");
        //ensure it worked
        //assertEquals(Item.getDescription, FinalTestDescription)

        assertEquals(testItem.getDescription(),"final Description");

    }

    @Test
    public void ensure_item_can_change_dueDate() {
        //GUI calls the set method for dueDate encapsulated by the item obj

        //create Test Item with (InitiailTestDate,TestDescription)
        Item testItem = new Item("02/21/2019","testDescription");
        //User Item Set method to change description to FinalDate
        testItem.setDue("12/12/1999");

        LocalDate testDate = new LocalDateStringConverter().fromString("12/12/1999");

        //ensure it worked
        //assertEquals(Item.getDate, FinalTestDate)



        assertEquals(testItem.getDue().toString(),testDate.toString());


    }

    @Test
    public void ensure_Item_can_change_complete(){
        //gui calls markComplete method in Item

        //createTestItem Object (TestDate,TestDescription)
        //isComplete is initialized to false
        Item testItem = new Item("02/21/2019","testDescription");
        //call testItem is compelte method to change it to true
        testItem.setComplete(true);
        //assertTrue (testItem.getIsComplete)

        assertTrue(testItem.getCompletion());
    }


}
