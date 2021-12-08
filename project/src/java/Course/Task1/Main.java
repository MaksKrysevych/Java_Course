package Course.Task1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        MainMenu();
        System.out.println("Input number of action:");
        int action = s.nextInt();
        switch (action){
            case 1:{
                System.out.println("Input positive integer:");
                int n = s.nextInt();
                if (n>0){
                    n = n * n;
                    System.out.println(n);
                }
                else if (n==0){
                    System.out.println(0);
                }
                else if (n<0){
                    n = n * (-1);
                    System.out.println(n);
                }
                break;
            }
            case 2:{
                System.out.println("Input three-digit positive integer:");
                int value = s.nextInt();
                if (value >=100 && value<=999) {
                    int hundreds = value/100;
                    int ten = (value / 10)%10;
                    int one = value %10;
                    int[] arr = new int[]{ hundreds, ten, one};
                    Arrays.sort(arr, 0, 3);
                    int temp;
                    for (int i = 0; i < arr.length/2; i++) {

                        temp = arr[arr.length-i-1];
                        arr[arr.length-i-1] = arr[i];
                        arr[i] = temp;
                    }
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]);
                    }
                }
                break;
            }
            case 3:{
                System.out.println("Input positive integer:");
                int value = s.nextInt();
                int newValue = 0;
                while (value >0){
                    if ((value % 10) % 2 == 0){
                        newValue = newValue + (value%10);
                    }
                }
                System.out.println("The sum of the odd numbers" + newValue);
                break;
            }
            case 4:{
                System.out.println("Input positive integer:");
                int value = s.nextInt();
                String str = "";
                int count = 0;
                while (value > 0){
                    if (value % 2 == 1){
                        count++;
                    }
                    int newValue = value % 2;
                    str = newValue + str;
                    value = value / 2;
                }
                System.out.println("Binary result: " + str);
                System.out.println("The amount of the “1” in the binary representation: " + count);
                break;
            }
        }
    }
    public static void MainMenu(){
        System.out.println("Main menu:");
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
    }
}