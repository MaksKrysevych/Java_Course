package Course.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainMenu();
        System.out.println("Input number of action:");
        int action = sc.nextInt();
        switch (action){
            case 1:
            {
                System.out.println("Input sides of rectangle:");
                System.out.println("Side a: ");
                double a = sc.nextDouble();
                System.out.println("Side b: ");
                double b = sc.nextDouble();
                Rectangle rectangle = new Rectangle(a,b);
                System.out.println("Area: " + rectangle.area());
                System.out.println("Perimeter: " + rectangle.perimeter());
                System.out.println("is square: " + rectangle.isSquare());
                break;
            }
            case 2:
            {
                System.out.println("Input sides of rectangle:");
                System.out.println("Side a: ");
                double a = sc.nextDouble();
                Rectangle rectangle = new Rectangle(a);
                System.out.println("Side b =" + rectangle.getSideB());
                System.out.println("Area: " + rectangle.area());
                System.out.println("Perimeter: " + rectangle.perimeter());
                System.out.println("is square: " + rectangle.isSquare());
                break;
            }
            case 3:
            {
                Rectangle rectangle = new Rectangle();
                System.out.println("Side a =" + rectangle.getSideA());
                System.out.println("Side b =" + rectangle.getSideB());
                System.out.println("Area: " + rectangle.area());
                System.out.println("Perimeter: " + rectangle.perimeter());
                System.out.println("is square: " + rectangle.isSquare());
                break;
            }
            case 4:
            {
                Rectangle rectangle = new Rectangle();
                System.out.println("Side b =" + rectangle.getSideB());
                System.out.println("Side a =" + rectangle.getSideA());
                rectangle.replaceSides();
                System.out.println("Swap");
                System.out.println("Side b =" + rectangle.getSideB());
                System.out.println("Side a =" + rectangle.getSideA());
                break;
            }
            case 5:
            {
                Rectangle[] arrOfRectangle = new Rectangle[] {new Rectangle(), new Rectangle(7), new Rectangle(10, 23)};
                ArrayRectangles arrayRectangles = new ArrayRectangles(arrOfRectangle);
                double maxArea = arrayRectangles.numberMaxArea();
                System.out.println("Max index of area: " + maxArea);
                double minPerimeter = arrayRectangles.numberMinPerimeter();
                System.out.println("Min index of perimeter: " + minPerimeter);
                break;
            }
            default:
                break;
        }

    }
    public static void MainMenu(){

    }
}
