package feb18;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n = num.nextInt();
        int sum =0;
        int sum1 =0;
        for ( int i=0; i<n; i=i+1)
        {
            if(i%2 == 0)
                //continue;
            sum = sum +i;
            else
                sum1= sum1+i;

        } System.out.println("Sum of Odd numbers : " + sum1);
        System.out.println("Sum of Even numbers : " + sum);

    }
}
