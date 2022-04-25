package advanced.practice5.Task2;

import java.util.concurrent.locks.ReentrantLock;

public class Program {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Broker broker = new Broker();

        Thread th1 = new Thread(() -> {
            lock.lock();
                broker.showActions();
                broker.findNewActions();
            lock.unlock();
        });
        Thread th2 = new Thread(() -> {
            lock.lock();
                broker.showActions();
                broker.findNewActions();
            lock.unlock();
        });
        Thread th3 = new Thread(() -> {
            lock.lock();
                broker.showActions();
                broker.findNewActions();
            lock.unlock();
        });

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
