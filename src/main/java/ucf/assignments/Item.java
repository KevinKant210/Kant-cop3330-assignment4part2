package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LocalDateTimeStringConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Date;
import java.time.*;
import java.util.Formatter;

public class Item {

     private String Description;

    // private Date dueDate;

     private LocalDate dueDate;


     private boolean isComplete;

    {
        isComplete = false;
    }


    public Item(String UserdueDate, String UserDescription){
        // Change UserDueDate from string to a Date object
        //set class Variable dueDate to user param
        //set Description to user description
        Description = UserDescription;

        dueDate = changeStringToDate(UserdueDate);





    }


    void setDescription(String newDescription){
        //set description to new description

        Description = newDescription;

    }

    void setDue(String newDueDate){
        //set dueDate to new DueDate


        dueDate = changeStringToDate(newDueDate);
    }

    void setComplete(boolean newCompleteVal){
        //set isCompelte to new complete val

        isComplete = newCompleteVal;

    }

    LocalDate getDue(){
       //could not return a literal for a return type of date sorry

        return dueDate;
    }

    String getDescription(){
        //return descrption lo'
        return Description;
    }

    Boolean getCompletion(){
        return isComplete;
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


    private LocalDate changeStringToDate(String dateString){




        LocalDateStringConverter date = new LocalDateStringConverter();


        return date.fromString(dateString);
    }




}
