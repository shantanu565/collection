package Mycollectionpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ques4 {
    //Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(21,30000,"Raghav"));
        employeeList.add(new Employee(26,20000,"kritika"));
        employeeList.add(new Employee(28,50000,"polo"));

        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.Salary-o1.Salary);
            }
        });

        Iterator<Employee> iterator=employeeList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getData());
        }
    }

}

class Employee{
    double Age; double Salary;
    String Name;

    Employee(double age,double salary,String name){
        this.Age=age;
        this.Salary=salary;
        this.Name=name;
    }
    public String getData(){
        String info=Name+"-"+Age+"-"+Salary;
        return info;
    }


}

