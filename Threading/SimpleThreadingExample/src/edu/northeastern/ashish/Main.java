package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        // Finding number of cores in my computer
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores = " + cores);

       // simpleFunction(); // This function runs in main thread and is a blocking call

//        Thread th = new Thread(new SimpleThreadClass());
//        th.setName("Ashish's Thread");
//        th.start();// This thread will run in separate thread and is non blocking


        // I want to pass values to the Thread

        Employee emp1 = new Employee("Ashish", 21);

        Thread th1 = new Thread(new PassingValueInThreadClass(emp1));
        th1.setName("Employee Thread");
        th1.start();




        for(int i = 0 ; i < 20; i ++){

            System.out.println("Inside main Function Thread = " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    private static void simpleFunction(){

        for(int i = 0 ; i < 20; i ++){

            System.out.println("Inside Simple Function Thread = " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
