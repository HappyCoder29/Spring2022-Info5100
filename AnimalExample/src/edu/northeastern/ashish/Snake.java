package edu.northeastern.ashish;

import java.util.Date;

public  class Snake extends Reptile implements iSwim{
    public Snake(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void swim() {
        System.out.println(" I am Snake and I can swim");
    }
}
