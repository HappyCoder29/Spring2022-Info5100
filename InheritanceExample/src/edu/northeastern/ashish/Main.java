package edu.northeastern.ashish;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Dog happy = new Dog("Happy", new Date(), "Dalmation");
        Cat cat = new Cat("Micky", new Date(), "Saimese");
        Elephant elephant = new Elephant("Ruby", new Date(), "Indian Elephant");
        Fish fish = new Fish( "Salmon");
        Rhino rhino = new Rhino("Ruby", new Date(), "Indian Elephant");
        happy.speak();
        rhino.speak();

    }
}
