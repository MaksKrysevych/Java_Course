package advanced.practice2.Task2_3;

import java.util.Arrays;
import java.util.Iterator;

public class StackImpl implements Stack {

    class IteratorImpl implements Iterator<Object>{
        @Override
        public boolean hasNext() {
            if (stackArray[top+1] != null)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            current++;
            return stackArray[current];
        }

        @Override
        public void remove() {
            while (hasNext()) {
                for (int i = 0; i < top; i++) {
                    stackArray[i] = stackArray[i + 1];
                }
                stackArray[top--] = null;
            }
        }
    }

    public StackImpl(int size) {
        stackArray = new Object[size];
    }

    private Object[] stackArray;
    private int current = -1;
    private int top;

    public void firstMain(){
        push(1);
        push(2);
        push(3);
        System.out.println(toString());


        System.out.println("Size: " + size());
        System.out.println("Element that is deleted: " + pop());

        System.out.println(toString());

        clear();
        System.out.println("Array is clear");
        System.out.println(toString());
    }

    public void secondMenu(){
        push(1);
        push(2);
        push(3);

        iterator();
    }

    @Override
    public void clear() {
        while (top != -1){
            pop();
        }
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public Iterator<Object> iterator() {
        IteratorImpl iterator = new IteratorImpl();
        while (iterator.hasNext()) {
            iterator.next();
        }
        iterator.remove();
        return null;
    }

    @Override
    public void push(Object element) {
        if (!isFull())
            stackArray[++top] = element;
    }

    @Override
    public Object pop() {
        Object value = stackArray[top];
        stackArray[top] = null;
        top--;
        return value;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackArray.length - 1);
    }

    @Override
    public Object top() {
        return stackArray[top];
    }

    @Override
    public String toString() {
        return "stackArray = " + Arrays.toString(stackArray);
    }
}
