package ucf.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import java.time.*;

public class ToDoList {
    private String title;

    public ArrayList<Item> itemHolder;

    {
        itemHolder = new ArrayList<>();
    }




    public ToDoList(String userTitle){
        //set Title to user title
        title = userTitle;
    }

    public void addItem(String itemDescription, String itemDueDate){

        //construct item object with itemDescription and ItemDueDate Param
            //Item newitem = new Item(ItemDescription,ItemdueDate)
        Item newItem = new Item(itemDueDate,itemDescription);
        //Add the newly constructed Item to itemholder arraylist
            //itemholder.add(newitem)
        itemHolder.add(newItem);
    }

    public boolean deleteItem(Item currItem){
        //search for reference to CurrItem in ItemHolder ArrayList
        //if found delete it and return true
        if(itemHolder.contains(currItem)){
            itemHolder.remove(currItem);
            return true;
        }
        //else return false
        return false;
    }



    public ArrayList<Item> displayAllItems(){
        //returns the ItemHolder Array list
        return itemHolder;
    }



    public ArrayList<Item> displayCompeleteItems(){
        //generate new arraylist since I cant return a literal here i will return an empty arraylist

        ArrayList<Item> completeItemHolder = new ArrayList<>();

        //for item in itemholder
            //if item.getComplete returns false add it to new arraylist\

        for(Item item: itemHolder){
            if(item.getCompletion()){
                completeItemHolder.add(item);
            }
        }

        return completeItemHolder;
    }

    public ArrayList<Item> displayIncompleteItems(){
        //generate temp arraylist
        ArrayList<Item> incompleteItemHolder = new ArrayList<>();
        //for (item in itemholder)
            //if item.getcomplete is true
                //add it to new arraylists

        for(Item item: itemHolder){
            if(!item.getCompletion()){
                incompleteItemHolder.add(item);
            }
        }

        return incompleteItemHolder;
    }

    public String getTitle(){
        //fetch title of the ToDoList

        return title;
    }



    public void setTitle(String newTitle){
        //this.title = newtitle;

        title = newTitle;
    }

    public void sortDate(){

       Comparator dateCompare = (Comparator<Item>) (o1, o2) -> o1.getDue().compareTo(o2.getDue());

       itemHolder.sort(dateCompare);



    }










}
