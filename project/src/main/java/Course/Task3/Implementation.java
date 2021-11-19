package Course.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Implementation {
    public static SortOrder IsSorted(SortOrder sortOrder, int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr, 0, newArr.length);
        if (Arrays.equals(arr, newArr)){
            sortOrder = SortOrder.ASC;
        }
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
        if (Arrays.equals(arr, newArr)){
            sortOrder = SortOrder.DESC;
        }
        if (sortOrder!= SortOrder.DESC && sortOrder!= SortOrder.ASC) {
            sortOrder = null;
        }
        return sortOrder;
    }

    public static int[] Transform(SortOrder sortOrder, int[] arr) {
        sortOrder = IsSorted(sortOrder, arr);
        if (sortOrder == SortOrder.DESC) {
            int temp;
            for (int i = 0; i < arr.length/2; i++) {
                temp = arr[arr.length-i-1];
                arr[arr.length-i-1] = arr[i];
                arr[i] = temp;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] += i;
            }
        }
        return arr;
    }

    public static int MultArithmeticElements(int a1, int t, int n) {
        int res = a1;
        System.out.printf("a1 = %d, t = %d, n = %d\n", a1, t, n);
        System.out.printf("%d * ", a1);

        for (int i = 1; i < n; i++) {
            a1 += t;
            res *= a1;

            if(i != n - 1){
                System.out.printf("%d * ", a1);
            }
            else{
                System.out.printf("%d", a1);
            }
        }
        System.out.printf(" = %d\n\n",res);
        return res;
    }

    public static int SumGeometricElements(int a1, double t, int alim) {
        int res = a1;

        while (a1 * t >= alim) {
            System.out.printf("%d + ", a1);
            a1 *= t;
            res += a1;
        }

        System.out.printf("%d", a1);
        System.out.printf(" = %d\n\n", res);
        return res;
    }

    public static void ShowArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void FillArray(Scanner sc, int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.println("Number" + (i + 1));
            arr[i] = sc.nextInt();
        }
    }
}