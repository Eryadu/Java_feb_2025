package Feb18;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to sum.");
        int num = sc.nextInt();
        int n = 0;
        int sum =0;
        int sum1 =0;

        do {
            if (n % 2 == 0){

                sum = sum + n;
                n++;
            }
                sum1 =sum1+n;
                n++;


        }while (n < num) ;
        System.out.println("Sum of even numbers : " + sum);
        System.out.println("Sum of odd numbers : " + sum1);

    }
}
