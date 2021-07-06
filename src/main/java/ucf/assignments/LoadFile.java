package ucf.assignments;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadFile {

   // private File FilePath;
   // private Scanner reader;

   public LoadFile(String UserFile){
        // try{
       //      creating new file with UserFile String
       //       set FilePath to the newly created file;

            //generate a new reader to read the file
       // }

       //catch exception
        //return false
    }

    public ArrayList<ToDoList> LoadAllLists(){
       //reader will read the file
        //for Lists in file
        //private method generatetodoList
                //will line by line generate a list object full of item objects
                //will add each list to arraylist of lists
        //once end of file has occured will return arraylist

        return new ArrayList<>();
    }


   public  ToDoList LoadList(){
        //try {
       //       grab the file at FilePath location
       //       generate a TodoList Object from file
       //       return todolist
       // }catch exception(){
       //   return null for error catching
       // }

       return new ToDoList("Title");
   }

   private ToDoList GenerateToDoList(File parseFile){
       //will generate a TodoList object from a file and return it

       return new ToDoList("title");
   }




}
