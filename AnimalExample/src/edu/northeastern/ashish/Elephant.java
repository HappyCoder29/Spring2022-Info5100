package edu.northeastern.ashish;

import java.util.Date;

public class Elephant extends Mammal{

    private boolean isFemale;

    public Elephant(String name, Date birthDate, boolean isFemale){
        super(name, birthDate);
        System.out.println(" I am inside Elephant Constructor");

        this.isFemale = true;
    }

    @Override
    public void eat(){
        System.out.println("I am eating grass, vegetables, fruits");
    }



}
