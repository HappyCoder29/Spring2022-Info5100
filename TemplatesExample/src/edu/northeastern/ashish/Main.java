package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        list.head = initializeList();
        list.printList();

        LinkList<String> stringList = new LinkList<>();
        stringList.head = initializeStringList();
        stringList.printList();

    }

    private static Node<Integer> initializeList(){
        Node<Integer> head = new Node(-1);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(23);
        return head;

    }

    private static Node<String> initializeStringList(){
        Node<String> head = new Node("Ashish");
        head.next = new Node("Mark");
        head.next.next = new Node("Peter");
        head.next.next.next = new Node("Bill");
        head.next.next.next.next = new Node("Tom");
        return head;

    }
}
