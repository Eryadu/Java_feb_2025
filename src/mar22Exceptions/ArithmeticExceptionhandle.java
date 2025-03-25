package mar22Exceptions;

import java.util.Scanner;

public class ArithmeticExceptionhandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int x = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int y = sc.nextInt();
        int result=0;
        try {
            result = x/y;
        }
        catch (ArithmeticException e)
        {
            //e.printStackTrace();
            //System.out.println(e);
            System.out.println(result);

        }
        /*finally {
            System.out.println("Result is :" +  result); // without catch block it print only declared variable
        }*/

    }
}
