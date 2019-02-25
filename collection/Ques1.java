package Mycollectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ques1 {
    //Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
    public static void main(String[] args) {
        List<Float> mylist=new ArrayList<>();
        System.out.println("Enter your elements:");
        Scanner s=new Scanner(System.in);
        for (int j=0;j<5;j++) {
            float f = s.nextFloat();
            mylist.add(f);
        }
        float sum=0;


        Iterator<Float> iterator=mylist.iterator();
        while (iterator.hasNext()){
            float u=iterator.next();
            if (!iterator.hasNext()){
                System.out.println(u);
            }else {
                System.out.println(u+",");
            }

            sum+=u;
        }
        System.out.println("\n Sum of elements are:"+sum);
    }
}
