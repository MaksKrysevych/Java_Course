package advanced.practice5.Task3;

import java.util.concurrent.Semaphore;

public class Airport implements Runnable{
    static final Semaphore SEMAPHORE = new Semaphore(5, true);
    private Plane[] planes = new Plane[]{new Plane(50), new Plane(100), new Plane(30)};

    @Override
    public void run() {
        try {
            System.out.println("Registration");
            Thread.sleep(500);
            System.out.println("Registration is finished");

            SEMAPHORE.acquire();
            int planeNumber = 0;

            synchronized (planes){
                for (int i = 0; i < 5; i++) {
                    if (!planes[i].isFlying){
                        planes[i].isFlying = true;
                        planeNumber = i;
                        break;
                    }
                }
            }

            planes[planeNumber].takeOff();

            Thread.sleep(100);

            planes[planeNumber].land();

            synchronized (planes){
                planes[planeNumber].isFlying = false;
            }

            SEMAPHORE.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
