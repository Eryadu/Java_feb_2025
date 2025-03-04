package Mar1.Array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

      //  int[] arr = {10,20,30,40}; // first method to declare array

        int[] arr = new int[5]; // second method to declare array
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the elements of Array . . .");
        for (int i = 0 ; i < arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Elements of Array are : ");
        for (int i =0; i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
