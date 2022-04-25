package advanced.practice5.Task2;

public class Broker {
    Action action = new Action();

    public void findNewActions(){
        action.generateAction();
    }
    public void showActions() {

        if (action.rating > 0) {
            if (action.fastRise){
                action.rating += 2;
            }
            else {
                action.rating -= 4;
            }
            System.out.println("Rating: " + action.rating);
            System.out.println("Fast rising: " + action.fastRise);
            System.out.println("Price of one: " + action.priceOfOne);
            System.out.println("Count: " + action.count);
            System.out.println();
        }
        else {
            System.out.println("Action usually falls");
        }


    }


}
