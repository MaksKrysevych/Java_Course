package advanced.practice2;

import advanced.practice2.Task2_1.ListImpl;
import advanced.practice2.Task2_2.QueueImpl;
import advanced.practice2.Task2_3.StackImpl;

public class Demo {
    public static void main(String[] args) {
        ListImpl list = new ListImpl();
        System.out.println("Demonstration list:");
        list.firstMenu();
        list.secondMenu();

        System.out.println();

        QueueImpl queue = new QueueImpl(4);
        System.out.println("Demonstration queue:");
        queue.firstMenu();
        queue.secodMenu();

        System.out.println();


        StackImpl stack = new StackImpl(4);
        System.out.println("Demonstration stack:");
        stack.firstMain();
        stack.secondMenu();
    }
}
