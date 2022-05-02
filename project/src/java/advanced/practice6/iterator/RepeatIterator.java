package advanced.practice6.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RepeatIterator implements Iterator {
    int index;
    int repeats;
    int currentRepeat;
    int[] arr;

    public RepeatIterator(int repeats, int[] arr) {
        this.repeats = repeats;
        this.arr = arr;
        this.currentRepeat = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length && currentRepeat<repeats;
    }

    @Override
    public Object next() {
        if(arr.length==0 || index == arr.length) throw new NoSuchElementException("Array is empty");
        int value = 0;
        if (currentRepeat < repeats) {
            currentRepeat++;
            value = arr[index];
        }
        if (currentRepeat >= repeats) {
            currentRepeat=0;
            index++;
        }
        return value;
    }
}
