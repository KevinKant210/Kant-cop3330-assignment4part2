package ucf.assignments;

import java.util.Date;

public class Item {

     //private String Description;
     private Date dueDate;
    // private boolean isComplete = false;



    public Item(String UserdueDate, String UserDescription){
        // Change UserDueDate from string to a Date object
        //set class Variable dueDate to user param
        //set Description to user description


    }


    void setDescription(String newDescription){
        //set description to new description

    }

    void setDue(Date newDueDate){
        //set dueDate to new DueDate

    }

    void setComplete(boolean newCompleteVal){
        //set isCompelte to new complete val

    }

    Date getDue(){
       //could not return a literal for a return type of date sorry

        return dueDate;
    }

    String getDescription(){
        //return descrption lo'
        return "Holder";
    }

    Boolean getCompletion(){
        return false;
    }

    private Date StringToDate(String Date){
        //change a string into the date format using date class

        //holder for what would be a returned date type
        return dueDate;
    }

    private Date changeStringToDate(String dateString){
        //take string and put it in date format

        return new Date();
    }




}
