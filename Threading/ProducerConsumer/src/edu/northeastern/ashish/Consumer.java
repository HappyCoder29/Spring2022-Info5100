package edu.northeastern.ashish;

import java.util.Random;

public class Consumer implements  Runnable{
    @Override
    public void run() {
        Random rand = new Random();
        while(true){
            synchronized (Main.lockMarket){
                if(Main.fishMarket.size() > 0){
                    String fish = Main.fishMarket.remove(0);
                    System.out.println(Thread.currentThread().getName() + " Consumed " + fish);
                }

            }

            try {
                Thread.sleep(rand.nextInt(20));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
