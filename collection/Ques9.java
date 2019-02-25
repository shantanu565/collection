package Mycollectionpack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ques9 {
    //Write a program to display times in different country format.
    public static void main(String[] args) {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        System.out.println(dateFormat.format(new Date())+":"+dateFormat.getTimeZone().getDisplayName());

        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
        System.out.println(dateFormat.format(new Date())+":"+dateFormat.getTimeZone().getDisplayName());

        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Mumbai"));
        System.out.println(dateFormat.format(new Date())+":"+dateFormat.getTimeZone().getDisplayName());
    }
}
