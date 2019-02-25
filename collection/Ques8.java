package Mycollectionpack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8 {
    //Write a program to format date as example "21-March-2016"
    public static void main(String[] args) {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(dateFormat.format(new Date()));

    }
}
