package Course.Task5;

import java.util.Arrays;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b){
        sideA = a;
        sideB = b;
    }
    public Rectangle(double a){
        sideA = a;
        sideB = 5;
    }
    public Rectangle(){
        sideA = 4;
        sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double area(){
        return sideA*sideB;
    }
    public double perimeter(){
        return 2*(sideA+sideB);
    }
    public boolean isSquare(){
        if (sideA == sideB)
        return true;
        else return false;
    }
    public void replaceSides(){
        double temp;
        temp = sideA;
        sideA = sideB;
        sideB = temp;
    }
}
