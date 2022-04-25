package advanced.practice5.Task1;

public class Program {
    public static void main(String[] args) {
        Auction auction = new Auction("Picture", 10000);
        auction.announcement();
        Trade trade = new Trade();
        trade.start();
    }
}
