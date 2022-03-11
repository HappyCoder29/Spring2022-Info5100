package edu.northeastern.ashish;

public class SimpleThreadClass implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 20; i ++){
            System.out.println("Inside Run Function Thread = " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
