package advanced.practice3.Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairStringListTest {

    @Test
    public void addValue() {
        PairStringList list = new PairStringList(4);
        list.addValue("3456");

        assertEquals("3456",list.gettingByIndex(1));
    }

    @Test
    public void addByIndex() {
        PairStringList list = new PairStringList(4);
        list.addByIndex(2,"3456");

        assertEquals("3456",list.gettingByIndex(2));
    }

    @Test
    public void removeOfObject() {
        PairStringList list = new PairStringList(4);
        list.addByIndex(2,"3456");
        list.removeOfObject("3456");

        assertEquals(null, list.gettingByIndex(2));
    }

    @Test
    public void removingByIndex() {
        PairStringList list = new PairStringList(4);
        list.addByIndex(2,"3456");
        list.removingByIndex(2);

        assertEquals(null, list.gettingByIndex(2));
    }

    @Test
    public void gettingByIndex() {
        PairStringList list = new PairStringList(4);
        list.addByIndex(2,"3456");

        assertEquals("3456", list.gettingByIndex(2));
    }

    @Test
    public void settingByIndex() {
        PairStringList list = new PairStringList(4);
        list.settingByIndex(2, "3456");

        assertEquals("3456", list.gettingByIndex(2));
    }

    @Test
    public void addingOfCollection() {
        PairStringList list = new PairStringList(4);
        list.settingByIndex(2, "3456");

        String[] arr = {"2", "6"};

        list.addingOfCollection(arr);
        System.out.println(list.gettingByIndex(5));

        assertEquals("6", list.gettingByIndex(5));
    }

    @Test
    public void addingOfCollectionByIndex() {
        PairStringList list = new PairStringList(7);
        list.settingByIndex(2, "3456");

        String[] arr = {"2", "6"};

        list.addingOfCollectionByIndex(arr, 5);
        assertEquals("2", list.gettingByIndex(5));
    }
}