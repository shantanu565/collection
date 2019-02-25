package Mycollectionpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ques5 {
    //Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age
    public static void main(String[] args) {
        List<Student> slist=new ArrayList<>();
        slist.add(new Student(15,90,"Raghav"));
        slist.add(new Student(18,50,"kritika"));
        slist.add(new Student(16,70,"polo"));

        slist.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return (int) (o2.Score-o1.Score)==0?o1.Name.compareTo(o2.Name):(int)(o2.Score-o1.Score);
            }
        });

        Iterator<Student> iterator=slist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getData());
        }
    }

}

class Student{
    double Age; double Score;
    String Name;

    Student(double age,double score,String name){
        this.Age=age;
        this.Score=score;
        this.Name=name;
    }
    public String getData(){
        String info=Name+"-"+Age+"-"+Score;
        return info;
    }



}
