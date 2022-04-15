package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        /*
        * ["", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
        * */
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());


    }
}
