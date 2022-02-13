package edu.northeastern.ashish;

public abstract class Phone extends  ElectronicDevice{

    private int myPhoneNumber;

    public Phone(int myPhoneNumber){
        this.myPhoneNumber = myPhoneNumber;
    }


    public void makeCall(int toPhoneNumber){
        System.out.println("Making call from " + myPhoneNumber + " to " + toPhoneNumber);
    }
    public void receiveCall(int fromPhoneNumber){
        System.out.println("Received a call from " + fromPhoneNumber + " to " + myPhoneNumber);
    }
}
