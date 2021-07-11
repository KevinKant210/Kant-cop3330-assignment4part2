/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadFile {

    private final File file;



    private Scanner reader;

   public LoadFile(String userFile){
       //initialize var

        file = new File(userFile);

    }




   public  ToDoList LoadList(){
        //try {
       //       grab the file at FilePath location

       try {
           reader = new Scanner(file);

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       //       generate a TodoList Object from file
        ToDoList tempList = generateToDoList(reader.nextLine());

       //populate with items
       while(reader.hasNextLine()){

           String allInfo = reader.nextLine();

            tempList.addItem(generateItem(allInfo));
       }

       reader.close();

        //return populated ToDoList
       return tempList;
   }

   private ToDoList generateToDoList(String title){
       //will generate a TodoList object from a file and return it


       return new ToDoList(title);
   }

   private Item generateItem(String info){
       //generate an item with given description and date


       String[] itemInfo = info.split(",");



       Item tempItem = new Item(new LocalDateStringConverter().fromString(itemInfo[1]),itemInfo[0]);
       //set the isComplete boolean properly
       tempItem.setComplete(Boolean.getBoolean(itemInfo[2]));
       //return the item
       return tempItem;
   }







}
