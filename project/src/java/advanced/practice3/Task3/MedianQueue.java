package advanced.practice3.Task3;

public class MedianQueue {
    private int[] arr;
    private int size;

    public MedianQueue(int[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public int mediana(){
        if (size%2 != 0){
            return arr[size/2];
        }
        else {
            int min = 0;
            if (arr[size/2-1] > arr[size/2])
                min = arr[size/2];
            else
                min = arr[size/2-1];
            return min;
        }
    }
}
