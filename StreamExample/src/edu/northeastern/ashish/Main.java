package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] strArray =  {"A1234", "b212", "a23", "b5","A24","A345","B234","C34","C324"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArray));

        ArrayList<String> bList = new ArrayList<>();
        for (String str : list) {
            if(str.toUpperCase().startsWith("B")){
                bList.add(str);
            }
        }

        for (String str: bList) {
            System.out.println(str);
        }

        System.out.println("*********");

        list.stream()
                .map( s -> s.toUpperCase())
                .filter( s -> s.startsWith("B"))
                .sorted()
                .forEach( s -> System.out.println(s));

        ArrayList<String> startingWithB =
                (ArrayList<String>) list.stream()
                        .map( s -> s.toUpperCase())
                        .filter( s -> s.startsWith("B"))
                        .sorted()
                                .collect(Collectors.toList());


        System.out.println();


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


        Department hr = new Department("HR");
        Department engineering = new Department("Engineering");

        engineering.employees.add(Ashish);
        engineering.employees.add(Mark);
        engineering.employees.add(Bill);

        hr.employees.add(Peter);
        hr.employees.add(Tom);



        ArrayList<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(engineering);

        departments.stream()
                .flatMap(department -> department.employees.stream())
                .filter(employee -> employee.age >50)
                .forEach( employee -> System.out.println(employee.name + " Age: " + employee.age) );

       ArrayList<Employee> empList = (ArrayList<Employee>) departments.stream()
                .flatMap(department -> department.employees.stream())
                .collect(Collectors.toList());





    }
}
