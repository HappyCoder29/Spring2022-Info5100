package edu.northeastern.ashish;

import java.util.Date;

public  class Crocs extends Reptile implements iSwim{
    public Crocs(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void swim() {
        System.out.println(" I am a Corc I can swim");
    }
}
