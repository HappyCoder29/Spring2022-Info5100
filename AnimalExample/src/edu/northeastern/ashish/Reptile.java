package edu.northeastern.ashish;

import java.util.Date;

public class Reptile extends  Animal{
    public Reptile(String name, Date birthDate) {
        super(name, birthDate);
    }

    public void coldBlodded(){
        System.out.println("We are cold blodded");
    }
}
