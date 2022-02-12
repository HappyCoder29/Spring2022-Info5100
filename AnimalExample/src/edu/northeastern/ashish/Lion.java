package edu.northeastern.ashish;

import java.util.Date;

public class Lion  extends Mammal{
    public Lion(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public void eat(){
        System.out.println("I am eating yummy mammals");
    }

}
