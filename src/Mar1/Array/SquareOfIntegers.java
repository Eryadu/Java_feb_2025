package Mar1.Array;

import java.util.Scanner;

public class SquareOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array length : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Elements of Array : ");

        for (int i= 0 ; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for ( int i=0; i< arr.length ; i++)
        {
            System.out.println("Square of Array Element " + arr[i] + " is :"+ arr[i]* arr[i]);
        }
    }
}
