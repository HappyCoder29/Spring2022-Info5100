package edu.northeastern.ashish;

import java.util.Random;

public class FisherMan implements Runnable{
    @Override
    public void run() {
        Random rand = new Random();
        int counter = 1;
        while(true){
            synchronized (Main.lockMarket){
                Main.fishMarket.add(Thread.currentThread().getName() + " " + counter + " fish");
            }

            counter ++;

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
