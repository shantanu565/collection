package Mycollectionpack;

import java.util.*;

public class Ques6 {
    //Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of ekement of array:");
        int n = s.nextInt();
        int arr[] =new int[n];

        Set<Integer> myset=new LinkedHashSet<>();
        System.out.println("Enter your element:-");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
            myset.add(arr[i]);
        }
        List<ArrayList<Integer>> freq=new ArrayList<>();
        for (int i:myset){
            int count=0;
            for (int j=0;j<n;j++){
                if (i==arr[j]){
                    ++count;
                }
            }
            freq.add(new ArrayList<>(Arrays.asList(i,count))) ;}
        freq.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.get(1)-o1.get(1);
            }
        });
        System.out.println("Element in decreasing frequency:");
        for (ArrayList<Integer> mylist:freq){
            System.out.println(mylist.get(0)+":"+mylist.get(1));
        }
    }



}
