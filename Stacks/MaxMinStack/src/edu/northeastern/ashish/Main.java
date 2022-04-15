package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        //["", "", "", "", "", "", "", "", "pop", "top"
        MaxMinStack maxMinStack = new MaxMinStack();
        maxMinStack.push(5);
        maxMinStack.push(1);
        maxMinStack.push(5);
        System.out.println(maxMinStack.top());
        System.out.println(maxMinStack.popMax());
        System.out.println(maxMinStack.top());
        System.out.println(maxMinStack.peekMax());
        System.out.println(maxMinStack.pop());
        System.out.println(maxMinStack.top());


    }
}
