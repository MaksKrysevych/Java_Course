package advanced.practice6.iterator;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Iterators {
    public static Iterator intArrayTwoTimesIterator(int[] array) {
        return new RepeatIterator(2, array);
    }

    public static Iterator intArrayThreeTimesIterator(int[] array) {
        return new RepeatIterator(3,array);
    }

    public static Iterator intArrayFiveTimesIterator(int[] array) {
        return new RepeatIterator(5,array);
    }
    public static Iterable table(String[] columns, int[] rows) {
        return new TableIterator(columns, rows);
    }
}
