package edu.northeastern.ashish;

import java.util.Date;

public class Rhino extends  Mammal{
    public Rhino(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public void eat(){
        System.out.println("I am eating grass, vegetables, fruits");
    }

}
