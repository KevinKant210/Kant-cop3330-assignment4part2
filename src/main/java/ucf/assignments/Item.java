package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;

import java.time.*;

public class Item {

     private String description;

    // private Date dueDate;

     private LocalDate date;


     private boolean iscomplete;

    {
        iscomplete = false;
    }


    public Item(LocalDate UserdueDate, String UserDescription){
        // Change UserDueDate from string to a Date object
        //set class Variable dueDate to user param
        //set Description to user description
        description = UserDescription;

        date = UserdueDate;





    }


    void setDescription(String newDescription){
        //set description to new description

        description = newDescription;

    }

    void setDue(String newDueDate){
        //set dueDate to new DueDate


        date = changeStringToDate(newDueDate);
    }

    void setIscomplete(boolean newCompleteVal){
        //set isCompelte to new complete val

        iscomplete = newCompleteVal;

    }

    public LocalDate getDate(){
       //could not return a literal for a return type of date sorry

        return date;
    }

    public String getDescription(){
        //return descrption lo'
        return description;
    }

    public Boolean getCompletion(){
        return iscomplete;
    }


        /*
    private Date hangeStringToDate(String dateString){
        //take string and put it in date format
        Date tempDate = null;
        try {
            tempDate = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);

            return tempDate;
        } catch (ParseException e) {

            e.printStackTrace();
            return null;
        }


    }
    */


    public static LocalDate changeStringToDate(String dateString){




        LocalDateStringConverter date = new LocalDateStringConverter();


        return date.fromString(dateString);
    }




}
