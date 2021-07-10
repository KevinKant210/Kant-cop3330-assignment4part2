package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {

    @Test
    public void ensure_ToDoList_Editable(){
        //gui will call the ToDoList setMethod and give it a parameter we must ensure the object changes properly



        //create ToDoListObject
        //set the title to a testTitle using ToDoObject.setTitle method
        ToDoList newList = new ToDoList("Title");

        newList.setTitle("newTitle");
        //AssertEquals(ToDoList Title, TestTitle)

        assertEquals(newList.getTitle(),"newTitle");
    }

    @Test
    public void ensure_ToDoList_generates_Lists(){
        //in gui a new Item Object is Constructed and then added to a ToDoList Object



        //generate a todoList Object
            //use addItemMethod(TestItem)
        ToDoList testList = new ToDoList("List Title");

        testList.addItem("newDescription",Item.changeStringToDate("02/22/2019"));
        //assertEquals("TestDescription", ToDoList.get(testItem).getDescription)

        assertEquals(testList.itemHolder.get(0).getDescription(), "newDescription");

    }

    @Test
    public void ensure_item_removed_from_list(){
        //gui will simply call deleteitem method from ToDoList

        //Generation of item object with params (testdate,TestDescription)

        //generate a todoList Object
        //use addItemMethod(TestItem)
        ToDoList testList = new ToDoList("List");

        testList.addItem("testDescription",Item.changeStringToDate("02/22/2019"));
        //we then test the delete method with ToDoList.deleteItem(TestItem)
        testList.deleteItem(testList.itemHolder.get(0));
        //assertrue(ToDoList.Itemholder.isEmpty())
        assertTrue(testList.itemHolder.isEmpty());
    }

    @Test
    public void ensure_all_Items_displayed(){
        //gui will call and create a window for each item in ItemHolder array in ToDoList Obj

        //create ToDoList TestObj
        //fill it 100 with dummy items
        //call Testobj.displayAllItems method

        ToDoList testList = new ToDoList("title");

        for(int i = 0 ; i < 100; i++){
            testList.addItem("testitem",Item.changeStringToDate("02/22/2019"));
        }

        //AssertEquals(Testobj.displayAllItem.size , 100)
        assertEquals(100,testList.displayAllItems().size());

    }

    @Test
    public void ensure_all_incomplete_items_displayed(){
        //gui will call and create a window for each item returned from ToDoList.displayIncomplete method

        //create ToDoList testObj
        ToDoList testList = new ToDoList("title");
        //fill with 20 complete item objects
        for(int i = 0 ; i < 20; i++){
            testList.addItem("testItem",Item.changeStringToDate("02/22/2019"));
            testList.itemHolder.get(i).setComplete(true);
        }
        //fill with 30 incomplete item objects
        for(int i = 20 ; i < 50; i++){
            testList.addItem("testItem",Item.changeStringToDate("02/22/2019"));
            testList.itemHolder.get(i).setComplete(false);
        }
        //Assertequals(testObj.displayIncomplete.size, 30)

        assertEquals(30,testList.displayIncompleteItems().size());

    }

    @Test
    public void ensure_all_complete_items_displayed(){
        //gui will call and create a window for each item returned from todolist.displaycomplete method

        //create ToDoList testObj
        ToDoList testList = new ToDoList("title");
        //fill with 50 complete item objects
        for(int i = 0 ; i < 50; i++){
            testList.addItem("item",Item.changeStringToDate("02/22/2019"));
            testList.itemHolder.get(i).setComplete(true);
        }
        //fill with 20 incomplete item objects
        for(int i = 50 ; i < 70; i++){
            testList.addItem("item",Item.changeStringToDate("02/22/2019"));
            testList.itemHolder.get(i).setComplete(false);
        }
        //AssertEquals(testObj.displayComplete.size, 50)

        assertEquals(50,testList.displayCompeleteItems().size());
    }

    @Test
    public void ensure_date_sort_sorts_item_holder()  {
        //gui will call the sort method in ToDoList

        //create test ToDoList testObj
        ToDoList testList = new ToDoList("title");
        //fill it with random Items\
        Random rand = new Random();
        testList.addItem("description",Item.changeStringToDate("12/25/1999"));

        testList.addItem("description",Item.changeStringToDate("12/20/1999"));

        //ensure that items get inserted out of date order
        testList.addItem("description",Item.changeStringToDate("12/01/1999"));
        //call the sort


        //assertEquals(firstItem.date, expectedDate)
        LocalDate expectedDate = new LocalDateStringConverter().fromString("12/01/1999");

        testList.sortDate();
        assertEquals(expectedDate,testList.itemHolder.get(0).getDate());
    }










}
