package advanced.practice4.Task1;

public class Part1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        while (true) {
            if (thread.isAlive() == false) {
                Thread runnable = new Thread(new MyRunnable());
                runnable.start();
                break;
            }
        }

    }

}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " MyThread");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " MyRunnable");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
