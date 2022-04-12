package advanced.practice2.Task2_2;


import java.util.Arrays;
import java.util.Iterator;

public class QueueImpl implements Queue{
    class IteratorImpl implements Iterator<Object>{
        @Override
        public boolean hasNext() {
            if (arr[last+1] != null)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            current++;
            return arr[current];
        }

        @Override
        public void remove() {
            while (hasNext()) {
                for (int i = 0; i < last; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[last--] = null;
            }
        }
    }

    private Object []arr;
    private int current = -1;
    private int last = -1;

    public QueueImpl(int size) {
        arr = new Object[size];
    }

    public void firstMenu(){

        enqueue(1);
        enqueue(2);
        enqueue(3);
        System.out.println(toString());


        System.out.println("Size of queue: " + size());
        System.out.println("Element that was deleted: " + dequeue());
        System.out.println("Head element: " + top());
        System.out.println("Queue is clear");
        clear();
        System.out.println(toString());

    }
    public void secodMenu(){
        IteratorImpl iterator = new IteratorImpl();

        enqueue(1);
        enqueue(2);
        enqueue(3);

        iterator();
    }

    @Override
    public void clear() {
        for (int i = 0; i <= arr.length; i++) {
            dequeue();
        }
    }

    @Override
    public int size() {
        return last;
    }

    @Override
    public Iterator<Object> iterator() {
        IteratorImpl iterator = new IteratorImpl();
        if (iterator.hasNext()){
            iterator.next();
        }
        iterator.remove();
        return null;
    }

    @Override
    public void enqueue(Object element) {
        arr[last+1] = element;
        last++;
    }

    @Override
    public Object dequeue() {
        if (arr[0] == null){
            return null;
        }
        else {
            Object temp = arr[0];
            for (int i = 0; i < last; i++) {
                arr[i] = arr[i + 1];
            }
            arr[last--] = null;
            return temp;
        }
    }

    @Override
    public Object top() {
        return arr[0];
    }

    @Override
    public String toString() {
        return "arr = " + Arrays.toString(arr);
    }
}
