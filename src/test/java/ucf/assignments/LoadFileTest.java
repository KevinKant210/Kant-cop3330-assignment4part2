package ucf.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoadFileTest {

    //create a test file with ListObjs ( preferrable with saveFile)

    @Test
    public void ensure_single_list_loaded(){
        //gui will call load list method in LoadFile Obj

        //create LoadFile obj and feed it testFile with testList

        //call LoadList method and test to see that it generated a list object properly

        //AssertEquals(LoadFile.LoadList(TestFile,TestListTitle.Title, TestTitle)

    }

    @Test
    public void ensure_single_list_loaded_from_many(){
        //gui will call load list method in LoadFile Obj

        //create LoadFile obj and feed it testFile with testList
            //this time ensure there are multiple lists in the test file IE ensure the method chooses the proper list out of many

        //call LoadList method and test to see that it generated a list object properly

        //AssertEquals(LoadFile.LoadList(TestFile,TestListTitle.Title, TestTitle)

    }

    @Test
    public void ensure_load_all_generates_all_lists(){
        //gui will call loadall methold in loadfile obj

        //create a test file with ListObjs ( preferrable with saveFile)

        //create test LoadFile obj TestObj

        //feed it the file

        //method will return a arrayList of ListObjs

        //assertEquals(testObj.LoadAll(TestFile)).size, numListsInFile)
    }

    @Test
    public void ensure_load_all_generates_all_lists_titles(){
        //gui will call loadall methold in loadfile obj

        //create a test file with ListObjs ( preferrable with saveFile)

        //create test LoadFile obj TestObj

        //feed it the file

        //method will return a arrayList of ListObjs
        // store it in testList
        //correct = true
        //for items in testList

            //if title != Testtitle
            //correct = false

        //we check to ensure all the titles were maintained
        //asserttrue(correct)

    }

}
