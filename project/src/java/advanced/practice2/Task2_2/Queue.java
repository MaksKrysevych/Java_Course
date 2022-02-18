package advanced.practice2.Task2_2;

import advanced.practice1.task1.task2.Container;

public interface Queue extends Container {
    // Appends the specified element to the end.
    void enqueue(Object element);

    // Removes the head.
    Object dequeue();

    // Returns the head.
    Object top();
}
