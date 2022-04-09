package edu.northeastern.ashish;

import java.util.ArrayList;

public class MaxPriorityQueue {
    ArrayList<Integer> arr = null;
    int currentIndex = -1;
    public MaxPriorityQueue(){
        arr = new ArrayList<>();
        currentIndex = -1;
    }

    private int parent(int n){
        return (n-1)/2;
    }

    private int leftChild(int n){
        return 2*n + 1;
    }

    private int rightChild(int n){
        return 2*n + 2;
    }

    public boolean offer(int value){

        currentIndex ++;
        arr.add(value);
        siftUp(currentIndex);
        return true;
    }

    public Integer peek(){
        if(currentIndex < 0){
            return null;
        }
        return arr.get(0);
    }

    private void siftUp(int index){
        if(index == 0){
            return;
        }
        int parent = parent(index);
        if( arr.get(parent) >= arr.get(index) ){
            return;
        }
        // Swap parent and self and call sift up again
        int temp = arr.get(parent);
        arr.set(parent, arr.get(index));
        arr.set(index,temp);
        siftUp(parent);
    }

    public Integer poll(){
        if(currentIndex < 0 ){
            return null;
        }
        int maxValue = arr.get(0);
        arr.set(0, arr.get(currentIndex));
        currentIndex --;

        siftDown(0);


        return maxValue;

    }

    private void siftDown(int index){
        if(index == currentIndex){
            return;
        }
        int leftChildIndex = leftChild(index);
        int rightChildIndex = rightChild(index);

        if(leftChildIndex > currentIndex && rightChildIndex > currentIndex){
            return;
        }
        int maxChildIndex = -1;
        // I have to find the child with largest value
        if(rightChildIndex > currentIndex){// No right child
            maxChildIndex = leftChildIndex;
        }else{
            // both child exist
//            if(arr[leftChildIndex] > arr[rightChildIndex]){
//                maxIndex = leftChildIndex;
//            }else{
//                maxIndex = rightChildIndex;
//            }
           maxChildIndex = arr.get(leftChildIndex) > arr.get(rightChildIndex) ?
                   leftChildIndex : rightChildIndex;
        }

        // At this point I have max Index
        if( arr.get(index) > arr.get(maxChildIndex) ){
            return;
        }
        // swap values and call sift down
        int temp = arr.get(index);
        arr.set(index,  arr.get(maxChildIndex));
        arr.set(maxChildIndex, temp);
        siftDown(maxChildIndex);
    }
}
