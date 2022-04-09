package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        priorityQueueExample();
    }

    private static void priorityQueueExample(){

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(-5);
        queue.add(10);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.add(6);
        q

        System.out.println(queue.offer(7));
        System.out.println(queue.poll());


    }


    private static void arrayListExample(){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(-3);
        list.add(7);
        list.add(2,-5);

        ArrayList<Integer> list2  = new ArrayList<>();
        list2.add(100);
        list2.add(101);
        list2.add(102);


        Iterator<Integer> iterator =  list.iterator();
        System.out.println( iterator.next());


//        int shouldThrowException = list.get(100);
//        System.out.println(shouldThrowException);

        System.out.println();

    }
}
