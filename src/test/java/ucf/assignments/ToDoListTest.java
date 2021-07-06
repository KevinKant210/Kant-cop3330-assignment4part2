package ucf.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {

    @Test
    public void ensure_ToDoList_Editable(){
        //gui will call the ToDoList setMethod and give it a parameter we must ensure the object changes properly



        //create ToDoListObject
        //set the title to a testTitle using ToDoObject.setTitle method

        //AssertEquals(ToDoList Title, TestTitle)

    }

    @Test
    public void ensure_ToDoList_generates_Lists(){
        //in gui a new Item Object is Constructed and then added to a ToDoList Object

        //Generation of item object with params (testdate,TestDescription)

        //generate a todoList Object
            //use addItemMethod(TestItem)

        //assertEquals("TestDescription", ToDoList.get(testItem).getDescription)



    }

    @Test
    public void ensure_item_removed_from_list(){
        //gui will simply call deleteitem method from ToDoList

        //Generation of item object with params (testdate,TestDescription)

        //generate a todoList Object
        //use addItemMethod(TestItem)

        //we then test the delete method with ToDoList.deleteItem(TestItem)

        //assertrue(ToDoList.Itemholder.isEmpty())

    }

    @Test
    public void ensure_all_Items_displayed(){
        //gui will call and create a window for each item in ItemHolder array in ToDoList Obj

        //create ToDoList TestObj
        //fill it 100 with dummy items
        //call Testobj.displayAllItems method

        //AssertEquals(Testobj.displayAllItem.size , 100)


    }

    @Test
    public void ensure_all_incomplete_items_displayed(){
        //gui will call and create a window for each item returned from ToDoList.displayIncomplete method

        //create ToDoList testObj

        //fill with 20 complete item objects

        //fill with 30 incomplete item objects

        //Assertequals(testObj.displayIncomplete.size, 30)


    }

    @Test
    public void ensure_all_complete_items_displayed(){
        //gui will call and create a window for each item returned from todolist.displaycomplete method

        //create ToDoList testObj

        //fill with 50 complete item objects

        //fill with 20 incomplete item objects

        //AssertEquals(testObj.displayComplete.size, 50)
    }

    @Test
    public void ensure_date_sort_sorts_item_holder(){
        //gui will call the sort method in ToDoList

        //create test ToDoList testObj

        //fill it with random Items

        //ensure that items get inserted out of date order

        //call the sort

        //assertEquals(firstItem.date, expectedDate)

    }










}
