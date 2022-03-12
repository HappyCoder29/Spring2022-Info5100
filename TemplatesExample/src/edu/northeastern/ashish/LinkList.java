package edu.northeastern.ashish;

public class LinkList<T> {

    public Node<T> head;

    public LinkList(){
    }

    public void printList(){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
