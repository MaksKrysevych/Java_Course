package advanced.practice5.Task1;

public class Auction {
    private String item;
    private int startPrice;

    public Auction(String item, int startPrice) {
        this.item = item;
        this.startPrice = startPrice;
    }

    public void announcement(){
        System.out.println("The auction is started");
        System.out.println("Item: " + item);
        System.out.println("Start price: " + startPrice);

    }

}
