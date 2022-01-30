package edu.northeastern.ashish;

public class Employee {
    private String name;
    private int employeeID;
    private String SSN;
    private int level;

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee(String name, int employeeID, String SSN, int level){
        this.name = name;
        this.employeeID = employeeID;
        this.SSN = SSN;
        this.level = level;
    }
    public Employee(){
        this.name = "Default Name";
        this.employeeID = -1;
        this.SSN = "ABCD";
        this.level = 67;
    }
}
