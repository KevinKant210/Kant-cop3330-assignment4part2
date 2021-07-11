/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

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

    public void addItem(String itemDescription, LocalDate itemDueDate){

        //construct item object with itemDescription and ItemDueDate Param
            //Item newitem = new Item(ItemDescription,ItemdueDate)
        Item newItem = new Item(itemDueDate,itemDescription);
        //Add the newly constructed Item to itemholder arraylist
            //itemholder.add(newitem)
        itemHolder.add(newItem);
    }

    //overloading addItem to make loading files easier
    public void addItem(Item item){

        itemHolder.add(item);

    }


    public void deleteItem(Item currItem){

        //delete given item

            itemHolder.remove(currItem);




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
            if(item.getComplete()){
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
            if(!item.getComplete()){
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


    //deprecated cause table view does this for us but no reason taking out
    public void sortDate(){

       Comparator<Item> dateCompare = (o1, o2) -> o1.getDate().compareTo(o2.getDate());

       itemHolder.sort(dateCompare);



    }










}
