package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static ArrayList<String> fishMarket = new ArrayList<>();
    public static Object lockMarket = new Object();
    public static void main(String[] args) {

        Thread[] fisherMens = new Thread[5];
        Thread[] consumers = new Thread[3];

        for(int i = 0 ; i < fisherMens.length; i ++){
            fisherMens[i] = new Thread(new FisherMan());
            fisherMens[i].setName("Fisher " + i);
            fisherMens[i].start();
        }

        for(int i = 0 ; i < consumers.length; i ++){
            consumers[i] = new Thread(new Consumer());
            consumers[i].setName("Consumer " + i);
            consumers[i].start();
        }
        Queue<String> queue = new LinkedList<>();
    }
}
