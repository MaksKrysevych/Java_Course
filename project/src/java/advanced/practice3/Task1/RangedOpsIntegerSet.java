package advanced.practice3.Task1;

import advanced.practice2.Task2_1.ListImpl;

import java.util.Iterator;

public class RangedOpsIntegerSet {
    private class Node {
        int data;
        Node next;
        public Node() {}
    }
    class IteratorImpl implements Iterator<Object>{
        @Override
        public boolean hasNext() {
            if(head.next != null)
                return true;
            else {
                return false;
            }
        }
        @Override

        public Object next() {
            head = head.next;
            return head;
        }
    }
    Node head;
    Node tail;

    boolean add(int fromInclusive, int toExclusive){
        if (head == null){
            Node node = new Node();
            node.data = fromInclusive;
            head = node;
            tail = node;
            while (true) {
                for (int i = fromInclusive+1; i < toExclusive; i++) {
                    Node newNode = new Node();
                    newNode.data = i;
                    tail.next = newNode;
                    tail = newNode;
                }
                break;
            }
        }
        else {
            while (true) {
                for (int i = fromInclusive; i < toExclusive; i++) {
                    Node newNode = new Node();
                    newNode.data = i;
                    tail.next = newNode;
                    tail = newNode;
                }
                break;
            }
        }
        return true;
    }
    boolean add(int value){
        Node node = new Node();
        node.data = value;
        if (tail == null)
        {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        return true;
    }

    boolean remove(int fromInclusive, int toExclusive){
        Node node = this.head;
        while (node != null){
            if (node.data == fromInclusive){
                for (int i = 0; i < toExclusive-fromInclusive-1; i++) {
                    node.next = node.next.next;
                }
            }
            node = node.next;
        }

        return true;
    }
    boolean remove(int value){
        if(head == null)
            return true;

        if (head == tail) {
            head = null;
            tail = null;
            return true;
        }

        Node node = this.head;
        while (node != null){
            if (node.next.data == value){
                node.next = node.next.next;
            }
            node = node.next;
        }
        return true;
    }

    public int size() {
        Node node = this.head;
        int i = 0;
        while (node != null){
            node = node.next;
            i++;
        }
        return i;
    }

    public Iterator<Object> iterator() {
        IteratorImpl iterator = new IteratorImpl();
        while (iterator.hasNext()){
            iterator.next();
        }
        return null;
    }

    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println();
    }

}
