package Mycollectionpack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {
    //Write a method that takes a string and returns the number of unique characters in the string.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your string:");
        String s1=s.nextLine();

        Set<Character>myset=new HashSet<>();
        for (Character i:s1.toCharArray()){
            myset.add(i);
        }
        System.out.println("Unique chracter in string are"+myset);
    }
}
