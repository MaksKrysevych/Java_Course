package Course.Task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Implementation.Menu();
        System.out.println("Input number of action:");
        int action = sc.nextInt();
        switch (action) {
            case 1:{
                System.out.println("Input size of array: ");
                int size = sc.nextInt();
                int[] arr = new int[size];

                Implementation.FillArray(sc, size, arr);

                System.out.println("Your array:");
                Implementation.ShowArray(arr);
                System.out.println();

                Implementation.Task1(arr);

                System.out.println("New array:");
                Implementation.ShowArray(arr);

                break;
            }
            case 2:{
                System.out.println("Input size of array: ");
                int size = sc.nextInt();
                int[] arr = new int[size];

                Implementation.FillArray(sc, size, arr);

                System.out.println("Your array:");
                Implementation.ShowArray(arr);
                System.out.println();

                Implementation.Task2(arr);
                break;
            }
            case 3:{
                System.out.println("Input col of array: ");
                int row = sc.nextInt();

                System.out.println("Input row of array: ");
                int col = sc.nextInt();

                int[][] arr = new int[col][row];

                Implementation.FillMatrix(row, col, arr);
                Implementation.Task3(row, arr);
                Implementation.ShowMatrix(arr);
                break;
            }
            default:
                System.out.println("Not exist");
                break;
        }
    }
}