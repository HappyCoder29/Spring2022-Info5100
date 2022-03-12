package edu.northeastern.ashish;

public class OperationB implements  Runnable{

    @Override
    public void run() {
        synchronized (Main.lockB){
            System.out.println(Thread.currentThread().getName() +  " Got Lock B");

            Main.queueB.add(10);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (Main.lockA){
                Main.queueB.add(79);
            }
        }
        System.out.println("I am after finishing in Operation B");

    }
}
