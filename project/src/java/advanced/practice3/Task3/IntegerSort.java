package advanced.practice3.Task3;

import java.util.Arrays;

public class IntegerSort {
    private int[] arr;
    private int size;

    public IntegerSort(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void addElement(int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = element;
                break;
            }
        }
    }
    public void removeElement(int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                arr[i] = 0;
                break;
            }
        }
    }
    public int searchElement(int element){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                index = arr[i];
                break;
            }
        }
        return index;
    }
    public void addCollection(int[] collection){
        int[] newArr = new int[arr.length + collection.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(collection, 0, newArr, arr.length, collection.length);
        arr = newArr;
    }
    public void addCollectionByIndex(int[] collection, int index){
        int[] newArr = new int[arr.length + collection.length];
        System.arraycopy(arr, 0, newArr, 0, index-1);
        System.arraycopy(collection, 0, newArr, index, collection.length);
        System.arraycopy(arr, index, newArr, index+collection.length, arr.length-index);

        arr = newArr;
    }
}
