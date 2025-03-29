package feb18Loops;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {


       /* While
        DO-While
        For*/

        /*
        1. Print number from 1-n- take user input
        2. print sum of first n numbers
        3. sum of first n , even or odd numbers
         */

        Scanner num = new Scanner(System.in);
         System.out.println("Enter the number to print");
          int x = num.nextInt(); // take user input
          int y = 1; // declare variable to check condition
          while(y<=x) {
            System.out.println(y);
            y++;
        }

    }
}
