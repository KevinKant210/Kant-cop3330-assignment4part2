package ucf.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void ensure_item_can_change_description(){
        //GUI calls the set method for description encapsulated by the item obj

        //create Test Item with (TestDate,InitiailTestDescription)

        //User Item Set method to change description to FinalTestDescription

        //ensure it worked
        //assertEquals(Item.getDescription, FinalTestDescription)



    }

    @Test
    public void ensure_item_can_change_dueDate(){
        //GUI calls the set method for dueDate encapsulated by the item obj

        //create Test Item with (InitiailTestDate,TestDescription)

        //User Item Set method to change description to FinalDate

        //ensure it worked
        //assertEquals(Item.getDate, FinalTestDate)



    }

    @Test
    public void ensure_Item_can_mark_complete(){
        //gui calls markComplete method in Item

        //createTestItem Object (TestDate,TestDescription)
        //isComplete is initialized to false

        //call testItem is compelte method to change it to true

        //assertTrue (testItem.getIsComplete)
    }


}
