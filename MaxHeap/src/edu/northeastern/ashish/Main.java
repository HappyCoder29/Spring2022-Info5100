package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        MaxPriorityQueue maxHeap = new MaxPriorityQueue();

        maxHeap.offer(-5);
        maxHeap.offer(3);
        maxHeap.offer(20);
        maxHeap.offer(-40);
        maxHeap.offer(60);

        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());




    }
}
