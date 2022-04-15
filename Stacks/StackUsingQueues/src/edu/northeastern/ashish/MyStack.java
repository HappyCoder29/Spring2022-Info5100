package edu.northeastern.ashish;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {
    Queue<T> queue;
    int size = 0;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(T x) {
        if(empty()){
            queue.add(x);
            size++;
            return;
        }
        queue.add(x);
        for(int i = 0 ; i < size; i ++){
            queue.add(queue.remove());
        }
        size ++;

    }

    public T pop() {
        if(empty()== true){
            return  null;
        }
        return queue.remove();
    }

    public T top() {
        if(empty()== true){
            return  null;
        }
        return queue.peek();
    }

    public boolean empty() {
        return size == 0;
    }
}
