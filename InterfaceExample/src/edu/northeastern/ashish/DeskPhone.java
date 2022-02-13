package edu.northeastern.ashish;

public class DeskPhone extends Phone{

    public DeskPhone(int myPhoneNumber) {
        super(myPhoneNumber);
    }

    public void connectToWire(){
        System.out.println(" I am a desk phone and I am connected to a wire");
    }
}
