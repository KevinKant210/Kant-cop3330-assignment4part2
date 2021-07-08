package ucf.assignments;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SaveFile {

     private File file;

     private String fileName;

     private String filePath;

     private ToDoList currList;

     private final String nL = "\n";
     private final String cB = ",";



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

           author.write(currList.getTitle()+nL);

           for(Item item: currList.itemHolder){

               author.write(item.getDescription() + cB + item.getDue().format(format) + cB +  item.getCompletion() + nL);

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

    public void deleteFile(){
        file.delete();
    }






}
