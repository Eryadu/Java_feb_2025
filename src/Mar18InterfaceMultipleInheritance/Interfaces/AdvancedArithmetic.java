package Mar18InterfaceMultipleInheritance.Interfaces;

/*public class AdvancedArithmetic {*/
    import java.util.*;
    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }

//Write your code here
/*
    divisorSum function just takes an integer as input and return the sum of all its divisors.
    For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
*/
 class MyCalculator implements AdvancedArithmetic {
    @Override

    public int divisor_sum(int n) {
        int sum = 0;
        boolean T = true;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                sum += i;
            }
            else  {
                T=false;
            }
        }
        return sum;
    }
}


    class Solution{
        public static void main(String []args){
            MyCalculator my_calculator = new MyCalculator();
            System.out.print("I implemented: ");
            ImplementedInterfaceNames(my_calculator);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(my_calculator.divisor_sum(n) + "\n");
            sc.close();
        }
        /*
         *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
         */
        static void ImplementedInterfaceNames(Object o){
            Class[] theInterfaces = o.getClass().getInterfaces();
            for (int i = 0; i < theInterfaces.length; i++){
                String interfaceName = theInterfaces[i].getName();
                System.out.println(interfaceName);
            }
        }
    }


