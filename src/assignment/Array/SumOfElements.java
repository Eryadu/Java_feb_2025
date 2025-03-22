package assignment.Array;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of Array : ");
        for (int i = 0 ; i <5 ; i++)
        {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements are : " + sum);
    }
}
