package advanced.practice5.Task3;

public class Plane {
    int seats;
    boolean isFlying = false;

    public Plane(int seats) {
        this.seats = seats;
    }
    public void takeOff(){
        System.out.println("Plane is flying");
    }

    public void land(){
        System.out.println("Plane is landed");
    }
}
