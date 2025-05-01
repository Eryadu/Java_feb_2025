package practice.functionalInterfaceLambda;

import java.util.Locale;
import java.util.function.IntFunction;

public class RecursiveLambdaExpression {
    public static void main(String[] args) {

        // Implement by using lambda expression
        IntFunction<Long> factorialCal = RecursiveLambdaExpression::factorial;
        System.out.println("Factorial : " + factorialCal.apply(5));


    }

    public static long factorial(int n){
        if(n < 0){
            String msg = "Number must not be negative";
            throw new IllegalArgumentException(msg);
        }
        if(n == 0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }



        /*// Implement by anonymous inner class (by overriding method signature)
        IntFunction<Long> factorialCal = new IntFunction<Long>() {
            @Override
            public Long apply(int n) {
                if (n < 0) {
                    String msg = "Number must not be negative";
                    throw new IllegalArgumentException(msg);
                }
                if (n == 0) {
                    return 1L;
                } else {
                    return n * this.apply(n - 1);
                }
            }
        };
        int n = 5;
        long fact = factorialCal.apply(n);
        System.out.println("Factorial : " + fact);*/
    }

}