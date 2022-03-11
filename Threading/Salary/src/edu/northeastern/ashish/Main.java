package edu.northeastern.ashish;

public class Main {

    public static long moneyInMyBank = 1;

    public static Object lockAccount = new Object();
    public static void main(String[] args) {

        Thread microsoft = new Thread(new AddMoneyInMyBank(1));
        microsoft.setName("Microsoft");

        Thread northEastern = new Thread(new AddMoneyInMyBank(1));
        northEastern.setName("North Eastern");

        Thread drillMaps = new Thread(new AddMoneyInMyBank(1));
        drillMaps.setName("Drill Maps");

        Thread stocks = new Thread(new AddMoneyInMyBank(1));
        stocks.setName("Stocks");

        microsoft.start();
        northEastern.start();
        drillMaps.start();
        stocks.start();


    }
}
