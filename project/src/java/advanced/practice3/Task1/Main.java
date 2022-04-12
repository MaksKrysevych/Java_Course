package advanced.practice3.Task1;

public class Main {
    public static void main(String[] args) {
        RangedOpsIntegerSet set = new RangedOpsIntegerSet();
        set.add(1,8);
        set.add(10);

        set.print();

        set.remove(4,6);
        set.remove(10);
        set.print();

        System.out.println("Size: " + set.size());

        set.iterator();
    }
}
