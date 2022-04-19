package advanced.practice4.Task3;

public class Part3 {
    private int counter = 0;
    private int counter2 = 0;

    public void compare() {
        if (counter > counter2)
            System.out.println("Counter > counter2 " + Thread.currentThread().getName());
        if (counter < counter2)
            System.out.println("Counter < counter2 " + Thread.currentThread().getName());
        else
            System.out.println("Counter = counter2 " + Thread.currentThread().getName());
    }

    public synchronized void compareSync() {
        if (counter > counter2)
            System.out.println("Counter > counter2 " + Thread.currentThread().getName());
        if (counter < counter2)
            System.out.println("Counter < counter2 " + Thread.currentThread().getName());
        else
            System.out.println("Counter = counter2 " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MySyncThread syncThread1 = new MySyncThread();
        MySyncThread syncThread2 = new MySyncThread();
        MySyncThread syncThread3 = new MySyncThread();

        syncThread1.start();
        syncThread2.start();
        syncThread3.start();

        try {
            syncThread1.join();
            syncThread2.join();
            syncThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyThread extends Thread {
        Part3 part3 = new Part3();

        @Override
        public void run() {
            part3.compare();
            part3.counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            part3.counter2++;
        }
    }

    static class MySyncThread extends Thread {
        Part3 part3 = new Part3();

        @Override
        public void run() {
            part3.compareSync();
            part3.counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            part3.counter2++;
        }
    }
}