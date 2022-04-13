package edu.northeastern.ashish;

import java.util.*;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) {
        //priorityQueueExample();
        //int[] arr = {1,1,2,2,2,3};
//        hashSetExample();
//
//        int val = MathLib.add(1,2);
        linkList();
    }

    private static void linkList(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println();

    }

    private static void priorityQueueExample(){

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(-5);
        queue.add(10);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.add(6);



        System.out.println(queue.offer(7));
        System.out.println(queue.poll());
    }



    private static void sortArrayBasedOnFrequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        queue.addAll(map.entrySet());

        int currentIndex = 0;
        while(!queue.isEmpty()){
            Map.Entry<Integer, Integer> entry = queue.poll();
            for(int i = 0; i < entry.getValue(); i ++){
                arr[currentIndex++] = entry.getKey();
            }
        }

        System.out.println(Arrays.toString(arr));
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

    private static void hashSetExample(){
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(15);
        set.add(7);
        set.add(3);
        set.add(24);

        Integer[] arr = Arrays.asList(set.toArray()).toArray(new Integer[0]);

        System.out.println(set.toString());

       // System.out.println(arr);


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(24);

        System.out.println(treeSet.toString());

    }
}
