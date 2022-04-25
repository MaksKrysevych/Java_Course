package advanced.practice5.Task3;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new Airport()).start();
            Thread.sleep(1000);
        }
    }
}
