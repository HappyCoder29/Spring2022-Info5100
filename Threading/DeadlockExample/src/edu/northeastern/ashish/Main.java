package edu.northeastern.ashish;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static Queue<Integer> queueA;
    public static Queue<Integer> queueB;

    public static Object lockA = new Object();
    public static Object lockB = new Object();



    public static void main(String[] args) {

        System.out.println(hasUniqueChars(null));

        queueA = new LinkedList<>();
        queueB = new LinkedList<>();

        Thread th1 = new Thread(new OperationA());
        th1.setName("Thread 1");
        th1.start();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread th2 = new Thread(new OperationB());
        th2.setName("Thread 2");

        th2.start();

    }

    private static boolean hasUniqueChars(String str){
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
