package edu.northeastern.ashish;

public interface iSMS {
    void sendSMS(int toNumber, String message);
    void receiveSMS(int fromNumber, String message);

}
