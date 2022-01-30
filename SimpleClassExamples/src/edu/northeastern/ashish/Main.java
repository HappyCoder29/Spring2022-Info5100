package edu.northeastern.ashish;

public class Main {

    public static int temp = 40;
    public static void main(String[] args) {
        saySomething();

        Employee ashish = new Employee("Ashish",007, "111222333", 77);
        printEmployeeInfo(ashish);
        ashish.setLevel(78);
        printEmployeeInfo(ashish);
        Employee sample = new Employee();


    }

    private static void printEmployeeInfo(Employee employee){
        System.out.println("*********");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Employee Level: " + employee.getLevel());
        System.out.println("*********");

    }

    public static void saySomething(){
        System.out.println("Something");
    }
}
