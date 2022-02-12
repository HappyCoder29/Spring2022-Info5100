package edu.northeastern.ashish;

import java.util.Date;

public  class WaterAnimals extends Animal implements iSwim {
    public WaterAnimals(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void swim() {
        System.out.println(" I can swim");
    }

}
