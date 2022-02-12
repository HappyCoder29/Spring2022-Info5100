package edu.northeastern.ashish;

import java.util.Date;

public class Bird extends Animal implements iFly{
    public Bird(String name, Date birthDate) {
        super(name, birthDate);
    }


    public void giveBirth(){
        System.out.println("We are Birds and we lay eggs");
    }
    @Override
    public void fly(){
        System.out.println("I am a bird I can fly");
    }
}
