package edu.northeastern.ashish;

import java.util.Stack;

class MaxMinStack {

    private Stack<Integer> stackMain;
    private Stack<Integer> stackMax;
    private Stack<Integer> stackMin;

    public MaxMinStack() {
        stackMain = new Stack<>();
        stackMax = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int x) {
        if(stackMain.isEmpty()){
            stackMain.push(x);
            stackMax.push(x);
            stackMin.push(x);
            return;
        }
        stackMain.push(x);
        if(stackMax.peek() < x){
            stackMax.push(x);
        }else{
            stackMax.push(stackMax.peek());
        }

        if(stackMin.peek() > x){
            stackMin.push(x);
        }else{
            stackMin.push(stackMin.peek());
        }

    }

    public int pop() {
        if(stackMain.isEmpty()){
            return Integer.MIN_VALUE;
        }

        int val = stackMain.pop();
        stackMin.pop();
        stackMax.pop();

        return val;

    }

    public int top() {
        if(stackMain.isEmpty()){
            return Integer.MIN_VALUE;
        }

        return stackMain.peek();

    }

    public int peekMax() {
        if(stackMain.isEmpty()){
            return Integer.MIN_VALUE;
        }

        return stackMax.peek();

    }

    public int peekMin(){
        if(stackMain.isEmpty()){
            return Integer.MIN_VALUE;
        }

        return stackMin.peek();
    }

    public int popMax() {
        if(stackMain.isEmpty()){
            return Integer.MIN_VALUE;
        }
        Stack<Integer> tempStack = new Stack<>();
        int max = -1;
        while(!stackMain.isEmpty()){
            int main = stackMain.pop();
            max = stackMax.pop();
            if(main == max){
                break;
            }
            tempStack.push(main);
        }
        if(tempStack.isEmpty()){
            return max;
        }

        while(!tempStack.isEmpty()){
            stackMain.push(tempStack.pop());
            stackMax.push(stackMax.peek());
        }
        return stackMax.peek();
    }


    public int popMin() {
        // if there is nothing in stack
        if(stackMain.isEmpty()){
            return Integer.MIN_VALUE;
        }


        Stack<Integer> tempStack = new Stack<>();
        int min = -1;
        while(!stackMain.isEmpty()){
            int main = stackMain.pop();
            min = stackMin.pop();
            if(main == min){
                break;
            }
            tempStack.push(main);
        }
        // If there was just one value in stack or the top most element
        // was the min element
        if(tempStack.isEmpty()){
            return min;
        }

        while(!tempStack.isEmpty()){
            stackMain.push(tempStack.pop());
            stackMin.push(stackMin.peek());
        }
        return stackMin.peek();
    }
}
