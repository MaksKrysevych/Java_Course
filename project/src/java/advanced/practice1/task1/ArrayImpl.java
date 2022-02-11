package advanced.practice1.task1;

import java.util.Iterator;

public class ArrayImpl implements Array {

    private class IteratorImpl implements Iterator<Object>{
        private IteratorImpl next;
        private Object data;

        @Override
        public boolean hasNext() {
            if (head != null)
                return true;
            else
            return false;
        }

        @Override
        public Object next() {
            return next;
        }
    }

    private IteratorImpl head;
    private IteratorImpl tail;

    @Override
    public void add(Object element) {
        IteratorImpl iterator = new IteratorImpl();
        iterator.data = element;
        if (iterator.hasNext() != true){
            head = iterator;
            tail = iterator;
        }
        else{
            tail.next = iterator;
            tail = iterator;
        }
    }

    @Override
    public void set(int index, Object element) {
        IteratorImpl iterator = this.head;
        int i = 0;
        while (iterator != null){
            if ((index-1) == i){
                IteratorImpl newIterator = new IteratorImpl();
                newIterator.data = element;
                newIterator.next = iterator.next;
                iterator.next = newIterator;
                iterator = newIterator;
            }
            iterator = iterator.next;
            i++;
        }
    }

    @Override
    public Object get(int index) {
        IteratorImpl iterator = this.head;
        int i = 0;
        Object element = null;
        while (iterator != null) {
            element = null;
            if (index == i) {
                element = iterator.data;
            }
            iterator = iterator.next;
            i++;
        }
        return element;
    }

    @Override
    public int indexOf(Object element) {
        IteratorImpl iterator = this.head;
        int i = 0;
        while (iterator != null) {
            if (element == iterator.data) {
                element = iterator.data;
                break;
            }
            iterator = iterator.next;
            i++;
        }
        return i;
    }

    @Override
    public void remove(int index) {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        IteratorImpl iterator = this.head;
        int i = 0;
        while (iterator != null){
            if ((index-1) == i){
                if (tail == iterator.next) {
                    tail = iterator;
                }
                iterator.next = iterator.next.next;
                return;
            }
            iterator = iterator.next;
            i++;
        }
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        IteratorImpl iterator = this.head;
        int i = 0;
        while (iterator != null){
            iterator = iterator.next;
            i++;
        }
        return i;
    }

    @Override
    public Iterator<Object> iterator() {
        toString();
        clear();
        return null;
    }

    @Override
    public String toString() {
        IteratorImpl iterator = this.head;
        String elements = "";
        if (iterator == null) {
            return "Iterator doesn't have elements!";
        }
        else {
            while (iterator != null) {
                elements += iterator.data + " ";
                iterator = iterator.next;
            }
        }

        return elements;
    }
}
