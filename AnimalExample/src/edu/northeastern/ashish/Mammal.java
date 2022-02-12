package edu.northeastern.ashish;

import java.util.Date;

public class Mammal extends Animal{
    public Mammal(String name, Date birthDate) {
        super(name, birthDate);
        System.out.println(" I am inside Mammal Constructor");
    }
    public void giveBirth(){
        System.out.println("We are Mammals and we don't lay eggs");
    }
}
