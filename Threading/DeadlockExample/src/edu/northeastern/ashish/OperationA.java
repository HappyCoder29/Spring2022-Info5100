package edu.northeastern.ashish;

public class OperationA implements  Runnable {
    @Override
    public void run() {
        System.out.println();
        synchronized (Main.lockA){
            System.out.println(Thread.currentThread().getName() +  " Got Lock A");

            Main.queueA.add(5);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (Main.lockB){
                Main.queueB.add(76);
            }
        }

        System.out.println("I am after finishing in Operation A");
    }
}
