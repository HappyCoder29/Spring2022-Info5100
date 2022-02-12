package edu.northeastern.ashish;

import java.util.Date;

public class Penguin extends Bird implements  iSwim {
    public Penguin(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void swim() {
        System.out.println("I am a penguin and I can swim");
    }
}
