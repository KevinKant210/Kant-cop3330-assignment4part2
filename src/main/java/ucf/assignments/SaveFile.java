/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package ucf.assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class SaveFile {

     private File file;

     private final String fileName;

     private final String filePath;

     private final ToDoList currList;


    public SaveFile(String filePath,String fileName,ToDoList currList){
        //try to convert the FilePath into a String

        this.filePath = filePath;

        this.fileName = fileName;

        this.currList = currList;

    }

   public boolean SaveList() {

       // if FileName is null we are writing to a already created file
        //else try to create a file of filepath+filename
        if(!createFile()){
            return false;
        }


       // write currList into the file

       return writeList();
       //catch exceptions() return false;
   }

    private boolean writeList(){

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        FileWriter author;

        try {
           author = new FileWriter(file);

            String nL = "\n";
            author.write(currList.getTitle()+ nL);

           for(Item item: currList.itemHolder){

               String cB = ",";
               author.write(item.getDescription() + cB + item.getDate().format(format) + cB +  item.getComplete() + nL);

           }

           author.close();

        } catch (IOException e) {
            return false;
        }
        //try writing list to file


        // return true once list is fully written
        return true;
        //catch exceptions() return false
    }



    private boolean createFile(){
        //try to create file with file filename
            //set the filepath to that path
        //catch(exception) return false error with filename

        file = new File(filePath+"\\"+fileName+".txt");

        try {
            return file.createNewFile();
        } catch (IOException e) {
            return false;
        }



    }

    //used to make testing automated
    public void deleteFile(){
        file.delete();
    }






}
