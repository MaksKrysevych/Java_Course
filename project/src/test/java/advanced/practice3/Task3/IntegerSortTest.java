package advanced.practice3.Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSortTest {

    @Test
    public void addElement() {
        IntegerSort intsort = new IntegerSort(6);
        intsort.addElement(5);

        assertEquals(5, intsort.searchElement(5));
    }

    @Test
    public void removeElement() {
        IntegerSort intsort = new IntegerSort(6);
        intsort.addElement(5);
        intsort.removeElement(5);

        assertEquals(0, intsort.searchElement(5));
    }

    @Test
    public void searchElement() {
        IntegerSort intsort = new IntegerSort(6);
        intsort.addElement(5);

        assertEquals(5, intsort.searchElement(5));
    }

    @Test
    public void addCollection() {
        IntegerSort intsort = new IntegerSort(6);
        intsort.addElement(5);

        int[] arr = {2,3,4};

        intsort.addCollection(arr);

        assertEquals(3, intsort.searchElement(3));
    }

    @Test
    public void addCollectionByIndex() {
        IntegerSort intsort = new IntegerSort(6);
        intsort.addElement(5);

        int[] arr = {2,3,4};
        intsort.addCollectionByIndex(arr, 1);

        assertEquals(3, intsort.searchElement(3));
    }
}