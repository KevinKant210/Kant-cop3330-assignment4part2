package ucf.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToDoList {
   // private String Title;

  //  private ArrayList<Item> ItemHolder = new ArrayList<>();


    private int numItems = 0;

    public ToDoList(String UserTitle){
        //set Title to user title
    }

    public void addItem(String ItemDescription, String ItemDueDate){
        //construct item object with itemDescription and ItemDueDate Param
            //Item newitem = new Item(ItemDescription,ItemdueDate)

        //Add the newly constructed Item to itemholder arraylist
            //itemholder.add(newitem)
    }

    public boolean deleteItem(Item CurrItem){
        //search for reference to CurrItem in ItemHolder ArrayList
        //if found delete it and return true
        //else return false
        return false;
    }



    public ArrayList<Item> displayAllItems(){
        //returns the ItemHolder Array list
        return new ArrayList<>();
    }



    public ArrayList<Item> displayCompeleteItems(){
        //generate new arraylist since I cant return a literal here i will return an empty arraylist
        ArrayList<Item> completeItemHolder = new ArrayList<>();
        //for item in itemholder
            //if item.getComplete returns false add it to new arraylist

        return new ArrayList<>();
    }

    public ArrayList<Item> displayIncompelteItems(){
        //generate temp arraylist
       // ArrayList<Item> incompleteItemHolder = new ArrayList<>();
        //for (item in itemholder)
            //if item.getcomplete is true
                //add it to new arraylists

        return new ArrayList<>();
    }

    public String getTitle(){
        //fetch title of the ToDoList

        return "title";
    }

    public Item getItem(Item requestedItem){
        //for items in item
        //if(item == requestedItem) return item
        return new Item("date","description");
    }

    public void setTitle(String NewTitle){
        //this.title = newtitle;

    }

    public int getNumItems() {
        //this was auto genned :)
        return numItems;
    }

    public void setNumItems(int numItems) {
        //also auto genned
       // this.numItems = numItems;
    }




}
