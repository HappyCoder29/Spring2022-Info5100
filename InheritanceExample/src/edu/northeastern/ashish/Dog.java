package edu.northeastern.ashish;

import java.util.Date;

public class Dog extends Animal{
    private String breed;
    public String getBreed() {
        return breed;
    }

    public Dog(String name, Date birthDate, String breed){
        super(name, birthDate);
        this.breed = breed;
    }

    public void eat(){
        System.out.println(this.getClass() + " : " + this.getName() + " is eating Kibbles");
    }

    public void breathe(){
        System.out.println(this.getName() + " is breathing through lungs");
    }

    public void run(){
        System.out.println(this.getName() + " is running");
    }

    @Override
    public void speak(){
        System.out.println(this.getClass() + " : " + this.getName() + " is barking");
    }


}
