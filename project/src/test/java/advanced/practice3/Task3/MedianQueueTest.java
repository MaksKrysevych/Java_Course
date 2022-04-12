package advanced.practice3.Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianQueueTest {

    @Test
    public void mediana() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        MedianQueue medianQueue = new MedianQueue(arr);
        System.out.println(medianQueue.mediana());
        assertEquals(5, medianQueue.mediana());
    }

    @Test
    public void mediana2() {
        int[] arr = {1,2,3,4,6,5,7,8,9,10};
        MedianQueue medianQueue = new MedianQueue(arr);
        System.out.println(medianQueue.mediana());
        assertEquals(5, medianQueue.mediana());
    }
}