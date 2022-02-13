package edu.northeastern.ashish;

public class Tablet extends  ElectronicDevice implements iConnectedDevice{
    @Override
    public void connectToInternet() {
        System.out.println("Connect Tablet to WiFi");
    }
}
