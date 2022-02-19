package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

       Thread[] arr = new Thread[5];

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = new Thread(new ThreadClass());
            arr[i].setName("Thread" + i);
            arr[i].start();
        }

        for(int i = 0 ; i < 100; i ++){
            System.out.println("Printing  in the " + Thread.currentThread().getName() + " " + i );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
