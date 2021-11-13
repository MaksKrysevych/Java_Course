package Course.Task3;

import java.util.Scanner;

enum SortOrder{ASC,DESC}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of action:");
        int action = sc.nextInt();

        switch (action) {
            case 1:{
                SortOrder sortOrder = null;
                System.out.println("Input size of array: ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                Implementation.FillArray(sc, size, arr);
                sortOrder =  Implementation.IsSorted(sortOrder, arr);
                if (sortOrder == SortOrder.ASC || sortOrder == SortOrder.DESC){
                    System.out.println("Array is " + sortOrder);
                }
                else {
                    System.out.println("Array isn't sorted");
                }

                break;
            }
            case 2:{
                SortOrder sortOrder = null;
                System.out.println("Input size of array: ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                
                Implementation.FillArray(sc, size, arr);
                Implementation.Transform(sortOrder, arr);
                Implementation.ShowArray(arr);
                break;
            }
            case 3:{
                System.out.println("Input a1: ");
                int a1 = sc.nextInt();
                System.out.println("t");
                int t = sc.nextInt();
                System.out.println("n");
                int n = sc.nextInt();
                Implementation.MultArithmeticElements(a1, t, n);
            }
            case 4:
            {
                System.out.println("Input a1: ");
                int a1 = sc.nextInt();
                System.out.println("t");
                double t = sc.nextDouble(); // with ,
                System.out.println("n");
                int alim = sc.nextInt();

                System.out.printf("a1 = %d, t = %f, alim = %d\n", a1, t, alim);
                Implementation.SumGeometricElements(a1, t, alim);
                break;
            }

            default: {
                break;
            }
        }

    }




}

