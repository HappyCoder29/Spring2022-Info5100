package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee Ashish = new Employee("Ashish Singh", 22);
        Employee Peter =new Employee("Peter Hambling", 56);
        Employee Mark = new Employee("Mark Bruce", 64);
        Employee Tom = new Employee("Tom Searcy", 46);
        Employee Bill = new Employee("Bill Gates", 67);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(Ashish);
        employees.add(Peter);
        employees.add(Mark);
        employees.add(Tom);
        employees.add(Bill);

        Function<Employee, String> getLastName  = (Employee employee) -> {
            return  employee.name.substring(employee.name.indexOf(" ") + 1);
        };

        System.out.println(getLastName.apply(Peter));

        Function<Employee, String> getFirstName  = (Employee employee) -> {
            return  employee.name.substring(0, employee.name.indexOf(" ") + 1);
        };
        System.out.println(getFirstName.apply(Ashish));

        // Predicate
        IntPredicate greaterThan10 = i -> i > 10;
        IntPredicate lessThan50 = i -> i < 50;

        int val = 25;
        if( greaterThan10.test(val)){
            System.out.println("Value is greater than 10");
         }

        if( lessThan50.test(val)){
            System.out.println("Value is less than 50");
        }

        if( greaterThan10.and(lessThan50).test(val) ){
            System.out.println("Value is less than 50 and greater than 10");
        }

        BiPredicate<String, Employee> biPredicate = (str, emp) -> {
            return  str.equals(emp.name.substring(0, emp.name.indexOf(" ")));
        };

        System.out.println(biPredicate.test("Ashish", Ashish));

        Predicate<Employee> youngerThan60 = employee -> employee.age < 60;
        Predicate<Employee> olderThan20 = employee -> employee.age > 20;

        ArrayList<Predicate<Employee>> listPredicate = new ArrayList<>();
        listPredicate.add(youngerThan60);
        listPredicate.add(olderThan20);
        printEmployeesWithConditions(employees, listPredicate);


        BiFunction<Employee, String, Boolean> biFunction = (employee, str) ->{
           if(employee.name.equalsIgnoreCase(str)){
               return true;
           }
           return false;
        };

        System.out.println(biFunction.apply(Ashish, "Ashish Singh"));




    }

    private static String getLastName(Employee employee){
        return employee.name.substring(employee.name.indexOf(" ") + 1);
    }

    private static void  printEmployeesWithConditions(ArrayList<Employee> employees,
                                                      ArrayList<Predicate<Employee>> predicates){

        for(int i = 1; i < predicates.size(); i ++){
            predicates.get(i-1).and(predicates.get(i));
        }
        for (Employee emp : employees) {

            if(predicates.get(0).test(emp)){
                printEmployee(emp);
            }
        }

    }

    private static void printEmployee(Employee employee){
        System.out.println("******");
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee age: " + employee.age);
        System.out.println("******");

    }
}
