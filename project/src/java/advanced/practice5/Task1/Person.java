package advanced.practice5.Task1;

import java.util.Random;

class Person {
    private int money =  new Random().nextInt(5000);

    public int getMoney() {
        return money;
    }

    public int riseBid(){
        int bid = new Random().nextInt(money);
        money-= bid;
        return bid;
    }
}
