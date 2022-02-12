package edu.northeastern.ashish;

import java.util.Date;

public class Fish extends Animal{
    public String breed;
    public String getBreed() {
        return breed;
    }

    public Fish( String breed){
        super("Fish", new Date());
        this.breed = breed;
    }

    public void eat(){
        System.out.println(this.getClass() + " : " + this.getName() + " is eating sea food");
    }

    public void swim(){
        System.out.println(this.getClass() + " : " + this.getName() +  " is swimming");
    }

    public void breathe(){
        System.out.println(this.getClass() + " : " + this.getName() +  " is breathing through gills");
    }

}
