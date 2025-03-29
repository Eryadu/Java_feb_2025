package feb18Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number to sum.");
        int x = num.nextInt();
        int y = 0;
        int sum = 0;
        while(y<x){
            sum = sum + y;
            y++;
        }System.out.println("Sum is : " + sum);
    }
}
