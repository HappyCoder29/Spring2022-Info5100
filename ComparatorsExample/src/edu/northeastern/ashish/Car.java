package edu.northeastern.ashish;

public class Car {
    private String make;
    private String model;
    private int year;
    private int price;
    private int color;
    private int milesDriven;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public Car(String make, String model, int year, int price, int milesDriven, int color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.milesDriven = milesDriven;
    }




}
