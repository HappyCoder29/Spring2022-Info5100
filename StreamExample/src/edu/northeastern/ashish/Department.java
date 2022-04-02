package edu.northeastern.ashish;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Department {

    public String name;
    public ArrayList<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }
}
