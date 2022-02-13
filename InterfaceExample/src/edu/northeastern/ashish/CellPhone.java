package edu.northeastern.ashish;

public class CellPhone extends Phone implements iSMS {


    public CellPhone(int myPhoneNumber) {
        super(myPhoneNumber);
    }

    @Override
    public void sendSMS(int toNumber, String message) {
        System.out.println("I am sending SMS to " + toNumber + ": " + message);
    }

    @Override
    public void receiveSMS(int fromNumber, String message) {
        System.out.println("I received SMS from " + fromNumber + ": " + message);
    }
}
