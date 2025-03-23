package practice;
import java.util.Scanner;
/*
Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers,  and , as parameters and finds . If either  or  is negative,
then the method must throw an exception which says "". Also, if both  and  are zero,
then the method must throw an exception which says ""
*/


    class MyCalculator {
        public static long power  (int n, int p)throws Exception
        { int c =1;
            if(n==0 && p == 0)
        {
            throw new Exception("n or p should not be negative.");
        }
        if(n<0 || p<0)
        {
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        }
        if (p>=0) {
            for(int i =0; i<p; i++){
                c= c*n;
            }

        }
            return c;
        }

    }

    public class ExceptionHandling  {
        public static final MyCalculator my_calculator = new MyCalculator();
        public static final Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            while (in .hasNextInt()) {
                int n = in .nextInt();
                int p = in .nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

