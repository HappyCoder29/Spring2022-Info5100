package edu.northeastern.ashish;

import java.util.Date;

public abstract class Animal {

    public String name;
    public Date birthDate;
    public Animal(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
        System.out.println(" I am inside Animal Constructor");

    }


    public void eat(){
        System.out.println(" I am eating");
    }
    public void move(){
        System.out.println("I am moving");
    }
    public void breathe(){
        System.out.println("I am breathing");
    }

}
