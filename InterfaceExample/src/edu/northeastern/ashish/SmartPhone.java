package edu.northeastern.ashish;

public class SmartPhone extends Phone implements  iSMS, iConnectedDevice{

    public SmartPhone(int myPhoneNumber) {
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

    @Override
    public void connectToInternet() {
        System.out.println("Connected to Internet");
    }
}
