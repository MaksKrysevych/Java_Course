package advanced.practice5.Task2;

import java.util.Random;

public class Action {
    public int rating = 10;
    public int count;
    public int  priceOfOne;
    public boolean fastRise;

    public Action() {
        generateAction();
    }

    public void generateAction(){
        count = new Random().nextInt(100);
        priceOfOne = new Random().nextInt(100);
        if (new Random().nextInt(2) == 1) {
            fastRise = true;
        }
        else {
            fastRise = false;
        }
    }
}
