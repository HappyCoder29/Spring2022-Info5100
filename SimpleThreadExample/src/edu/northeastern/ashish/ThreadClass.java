package edu.northeastern.ashish;

public class ThreadClass implements  Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 100; i ++){
            System.out.println("Printing in " + Thread.currentThread().getName() +  " " + i );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
