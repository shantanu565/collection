package Mycollectionpack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques3 {
    //Write a method that takes a string and print the number of occurrence of each character characters in the string.

    static void charCount(String in) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = in.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }}

        public static void main (String[]args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your string:");

            String g = s.nextLine();
            charCount(g);

        }
    }
