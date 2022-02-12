package edu.northeastern.ashish;

import java.util.Date;

public class Animal {
    private String name;
    private Date birthDate;

    public Animal(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void sleep(){
        System.out.println(this.getClass() + " : " + this.getName() + " is sleeping");
    }

    public void speak(){
        System.out.println(this.getClass() + " : " + this.getName() + " is Speaking");
    }

}
