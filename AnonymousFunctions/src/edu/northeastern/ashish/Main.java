package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        Thread th = new Thread(new SimpleThread());
//        th.start();
     //   new Thread(new SimpleThread()).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(" I am inside a simple thread in the main class ");
//            }
//        }).start();

        // Lambda function
        new Thread(() -> System.out.println(" I am inside a simple thread in the " +
                "main class with Lambda function ") )
                .start();

        // If we have to execute multiple lines
        new Thread( () -> {
            System.out.println("First Line");
            System.out.println("Second Line");
            System.out.println("Third Line");
        } ).start();


        Employee Ashish = new Employee("Ashish", 22);
        Employee Mark = new Employee("Mark", 72);
        Employee Bill = new Employee("Bill", 53);
        Employee Peter = new Employee("Peter", 65);
        Employee Tom  = new Employee("Tom", 43);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(Ashish);
        employees.add(Mark);
        employees.add(Bill);
        employees.add(Peter);
        employees.add(Tom);


//
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.age.compareTo(emp2.age);
//            }
//        });
//        printEmployeeList(employees);
//
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.name.compareTo(emp2.name);
//            }
//        });

        //System.out.println("AFTER*******");

      //  printEmployeeList(employees);

        employees.sort((emp1, emp2) -> emp1.age.compareTo(emp2.age) );
        printEmployeeList(employees);

        employees.sort(( emp1, emp2)-> emp1.name.compareTo(emp2.name) );
        printEmployeeList(employees);

        SimpleStringClass strClass = new SimpleStringClass();
        System.out.println( strClass.upperCaseAndConcat("abc","def") );

        System.out.println(  new SimpleStringClass().upperCaseAndConcat("abc", "def")    );

        System.out.println( upperCaseAndConcat("abc", "def") );

        IStringFunctions iSf = (str1, str2) -> str1.toUpperCase() + str2.toUpperCase();

        System.out.println(iSf.upperCaseAndConcat("ghi", "jkl") );


    }


    private static String upperCaseAndConcat(String str1, String str2){
        return str1.toUpperCase() + str2.toUpperCase();
    }

    private static void printEmployeeList(ArrayList<Employee> employees){
        System.out.println("******");
        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee Age: " + emp.age);
        }
        System.out.println("******");
    }
}
