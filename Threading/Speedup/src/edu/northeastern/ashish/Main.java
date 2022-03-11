package edu.northeastern.ashish;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

    public static int[] values = new int[500000000];

    public static long[] portionSum = new long[5];

    public static int portionSize = values.length/5;// Dividing vales in 5 parts each with 100 million values

    public static void main(String[] args) {
        generateValues();


        // Calculating sum in main Thread
        Instant start = Instant.now();
        long sum = getSum();
        Instant end = Instant.now();

        System.out.println("Sum = " + sum);
        System.out.println("Time taken to get sum = " + Duration.between(start, end).toMillis());

        // Calculate Sum in multiple threads

        start = Instant.now();
        Thread[] threads = new Thread[5];
        for(int i = 0 ; i < threads.length; i ++){
            threads[i] = new Thread(new CalculateSum(i));
            threads[i].setName("Thread " + i);
            threads[i].start();
        }

        // Wait for threads to execute
        for(int i = 0 ; i < threads.length; i ++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        sum = 0 ;
        for(int i = 0 ; i < 5; i ++){
            sum += portionSum[i];
        }

        end = Instant.now();
        System.out.println("Sum = " + sum);
        System.out.println("Time taken to get sum by 5 threads= " + Duration.between(start, end).toMillis());

    }

    private static void generateValues(){
        Random rand = new Random();
        for(int i = 0 ; i < values.length; i ++) {
            values[i] = rand.nextInt(10);
        }
    }

    private static long getSum(){
        long sum = 0;
        for(int i = 0 ; i < values.length; i ++){
            sum += values[i];
        }
        return sum;
    }
}
