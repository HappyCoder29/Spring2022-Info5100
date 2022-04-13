package edu.northeastern.ashish;

import java.util.*;

public class SingleLinkList<T>  implements List, Queue {

    Node<T> head;
    Node<T> tail;
    int size ;

    public SingleLinkList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if(head == null){
            return true;
        }
        Node<T> temp = head;
        while(temp != null){
            if(temp.equals(o)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> temp = head;
        int counter = 0;
        while(temp != null){
            array[counter] = temp.data;
            counter++;
        }
        return array;
    }

    @Override
    public boolean add(Object o) {
        Node<T> node = new Node<>((T) o);
        if(head == null){
            head = node;
            tail = node;
            return true;
        }

        tail.next = node;
        return true;
    }

    @Override
    public boolean offer(Object o) {
        Node<T> node = new Node<>((T) o);
        if(head == null){
            head = node;
            tail = node;
            return true;
        }

        tail.next = node;
        return true;
    }

    @Override
    public Object remove()  {
        if(head == null){
            try {
                throw new Exception("Empty List");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    @Override
    public Object poll() {
        if(head == null){
            return null;
        }
        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return head;
    }

    @Override
    public boolean remove(Object o) {
        if(head == null){
            return false;
        }
        T data = (T) o;

        if(head.data.equals(data)){
            head = head.next;
            return true;
        }
        Node<T> prev = head;
        Node<T> temp = head.next;
        while(temp != null){
            if(temp.equals(data)){
                prev.next = temp.next;
                temp.next = null;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }


    }

    @Override
    public boolean addAll(Collection c) {
        if(c.size() == 0 ){
            return false;
        }

        if(head == null){
            Iterator iterator = c.iterator();
            head = new Node<>((T)iterator.next());
            Node<T> temp = head;
            while(iterator.hasNext()){
                temp.next = new Node<>((T) iterator.next());
                temp = temp.next;
            }
            tail = temp;
            return true;
        }
        Iterator iterator = c.iterator();
        Node<T> temp = tail;
        while(iterator.hasNext()){
            while(iterator.hasNext()){
                temp.next = new Node<>((T) iterator.next());
                temp = temp.next;
            }
            tail = temp;
        }

        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
