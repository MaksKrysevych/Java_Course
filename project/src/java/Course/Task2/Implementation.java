package Course.Task2;

import java.util.Scanner;

public class Implementation {
    public static void Menu(){
        System.out.println("Main menu:");
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
    }

    public static void Task1(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] % 2 == 0 && arr[(arr.length - i - 1)] % 2 == 0) {
                temp = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void Task2(int[] arr) {
        int max;
        max = arr[0];
        int index = 0;
        int anotherIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
            if (arr[i]==max){
                anotherIndex = i;
            }
        }
        System.out.println("Max is: " + max + "\t" + "the distance is " + (anotherIndex - index));
    }

    public static void Task3(int row, int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i==j){
                    continue;
                }
                else if(i<j){
                    arr[i][j] = 1;
                }
                else if (i>j){
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void FillArray(Scanner sc, int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.println("Number" + (i + 1));
            arr[i] = sc.nextInt();
        }
    }

    public static void FillMatrix(int row, int col, int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = i*j+1;
            }
        }
    }

    public static void ShowMatrix(int[][] arr) {
        for(var row : arr){
            for(var cell : row){
                System.out.print(cell+"\t");
            }
            System.out.println();
        }
    }

    public static void ShowArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}