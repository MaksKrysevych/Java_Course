package advanced.practice4.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spam {
    private String[] messages ;
    private int[] times;

    private Thread[] threads;
    public Spam(String[] messages, int[] times) {
        threads = new Thread[messages.length];
        for (int i =0;i<messages.length;i++)
            threads[i] = new Worker(messages[i],times[i]);
    }
    public void start() {
        for (var thread : threads) {
            thread.start();
        }
    }
    public void stop() {
        for (var thread : threads) {
            thread.interrupt();
        }
    }
    private static class Worker extends Thread {
        String message;
        int time;

        public Worker(String message, int delay) {
            this.message = message;
            this.time = delay;
        }

        @Override
        public void run() {
            while(!Thread.interrupted()){
                System.out.println(message);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    public static void main(String[] args) {
        Spam spam = new Spam(new String[]{"@@@","bbbbbb"}, new int[]{333,222});
        spam.start();

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            boolean isFinish = true;
            String str;
            while (isFinish) {
                str = bf.readLine();
                if (str.isEmpty()) {
                    spam.stop();
                    isFinish = false;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
