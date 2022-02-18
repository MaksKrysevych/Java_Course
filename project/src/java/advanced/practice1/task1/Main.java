package advanced.practice1.task1;

public class Main {
    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("All elements: " + array.toString());
        System.out.println("Size: " + array.size());
        System.out.println("Index of 4 element: " + array.indexOf(4));
        System.out.println("Get element with index 4: " + array.get(4));
        System.out.println("Delete element with index 1:");
        array.remove(1);
        System.out.println(array.toString());
        System.out.println("Add new element 7 for 3 position");
        array.set(2, 4);
        System.out.println(array.toString());
        System.out.println("Delete all elements:");
        array.clear();
        System.out.println(array.toString());

    }
}
