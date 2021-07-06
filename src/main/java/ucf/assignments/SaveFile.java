package ucf.assignments;

import java.io.File;
import java.util.ArrayList;

public class SaveFile {
   // private File FilePath;
    //private String FileName;


    public SaveFile(String FilePath){
        //try to convert the FilePath into a String
    }

   public boolean SaveList(ToDoList currList, String FileName) {

       // if FileName is null we are writing to a already created file
        //else try to create a file of filepath+filename

       // write currList into the file

       return true;
       //catch exceptions() return false;




    }

    private boolean writeList(File FileLocation,ToDoList List){
        //try writing list to file
        // return true once list is fully written
        return true;
        //catch exceptions() return false
    }

    public boolean SaveAllLists(ArrayList<ToDoList> ListHolder,String FileName){
        //if FileName is null then file is already created
            //else try to create new file of FilePath + FileName
       //for element in listholder
        //write to file
        //catch exception () return false;
        return true;
    }

    public boolean createFile(){
        //try to create file with file filename
            //set the filepath to that path
        //catch(exception) return false error with filename

        return true;

    }






}
