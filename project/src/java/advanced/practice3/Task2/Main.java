package advanced.practice3.Task2;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        IntStringCappedMap map = new IntStringCappedMap(25);
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(12, "Twelve");
        map.put(9, "Nine");
        map.put(1, "One");
        System.out.println("Size" + map.size());
        map.print();
        map.remove(8);
        map.print();

    }
}
