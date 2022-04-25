package advanced.practice5.Task1;

import java.sql.Time;
import java.util.Random;

public class Trade {
    private static Object sync = new Object();

    public void start(){
        Thread th1 = new Thread(() -> {synchronized (sync) {
            Thread.currentThread().setName("Person1");
            Person person = new Person();

            for (int i = 0; i < 3; i++) {
                try {
                    sync.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (person.getMoney() == 0){
                    System.out.println("Person doesn't have money");
                    sync.notify();
                    break;
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " " + person.riseBid());
                }
                sync.notify();
            }
        }
        });
        Thread th2 = new Thread(() -> {synchronized (sync) {
            Thread.currentThread().setName("Person2");
            Person person = new Person();
            for (int i = 0; i < 3; i++) {
                sync.notify();
                try {
                    sync.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (person.getMoney() == 0){
                    System.out.println("Person doesn't have money");
                    sync.notify();
                    break;
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " " + person.riseBid());
                }
            }
        }
        });

        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
