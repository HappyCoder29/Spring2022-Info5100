package edu.northeastern.ashish;

import java.util.Date;

public class Elephant extends Animal {
    public String breed;


    public String getBreed() {
        return breed;
    }

    public Elephant(String name, Date birthDate, String breed){
        super(name, birthDate);
        this.breed = breed;
    }

    public void eat(){
        System.out.println(this.getClass() + " : " + this.getName() + " is eating vegetarian food");
    }

    public void run(){
        System.out.println(this.getClass() + " : " + this.getName() +  " is running");
    }

    public void breathe(){
        System.out.println(this.getClass() + " : " + this.getName() +  " is breathing through lungs");
    }


}
