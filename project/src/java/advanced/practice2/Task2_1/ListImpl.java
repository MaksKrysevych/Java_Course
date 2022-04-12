package advanced.practice2.Task2_1;

import java.util.Iterator;

public class ListImpl implements List {

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

        @Override
        public void remove() {
            while (hasNext()){
                head = null;
                head = (Node) next();
            }
        }
    }

    static class Node{
        Object data;
        Node next;
        public Node() {}
    }

    Node head;
    Node tail;

    public void firstMenu(){
        addLast(2);
        addLast(3);
        addLast(4);
        addFirst(1);
        print();
        System.out.println("Size: " + size());
        System.out.println("First element: " + getFirst());
        System.out.println("Last element: " + getLast());
        System.out.println("Find element 2:" + search(2));
        removeFirst();
        removeLast();
        System.out.println("Was deleted first and last element");
        print();
        remove(2);
        System.out.println("2 was deleted");
        print();
        clear();
        System.out.println("List is clear");
        print();

    }
    public void secondMenu(){
        addLast(2);
        addLast(3);
        addLast(4);
        addFirst(1);
        iterator();
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        Node node = this.head;
        int i = 0;
        while (node != null){
            node = node.next;
            i++;
        }
        return i;
    }

    @Override
    public Iterator<Object> iterator() {
        IteratorImpl iterator = new IteratorImpl();
        while (iterator.hasNext()){
            iterator.next();
        }
        iterator.remove();
        return null;
    }

    @Override
    public void addFirst(Object element) {
        Node node = new Node();
        node.data = element;

        if(head == null)
        {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    @Override
    public void addLast(Object element) {
        Node node = new Node();
        node.data = element;
        if (tail == null)
        {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    @Override
    public void removeFirst() {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        else {
            Node temp = head.next;
            head = null;
            head = temp;
        }
    }

    @Override
    public void removeLast() {
        Node t = head;
        while (t.next != null) {
            if (t.next.next == tail) {
                tail = null;
                tail = t.next;
                return;
            }
            t = t.next;
        }
    }

    @Override
    public Object getFirst() {
        return head.data;
    }

    @Override
    public Object getLast() {
        return tail.data;
    }

    @Override
    public Object search(Object element) {
        Node node = this.head;
        Object obj = null;
        while (node != null) {
            if (element.equals(node.data)) {
                obj = node.data;
                break;
            }
            node = node.next;
        }
        return obj;
    }

    @Override
    public boolean remove(Object element) {
        if(head == null)
            return true;

        if (head == tail) {
            head = null;
            tail = null;
            return true;
        }

        Node node = this.head;
        boolean removing = false;
        while (node != null){
            if (node.data == element){
                node.next = node.next.next;
                removing = true;
            }
            node = node.next;
        }
        return removing;
    }

    public void print(){
        Node node = this.head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
