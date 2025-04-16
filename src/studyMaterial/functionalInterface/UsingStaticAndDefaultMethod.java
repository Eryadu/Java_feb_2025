package studyMaterial.functionalInterface;


import java.util.Scanner;

// interface implementation Static and Default methods
@FunctionalInterface
interface StaticandDefaultMethods{
    // abstract method
    int square(int x);
    // default methods
    default int add(int a, int b){
        return a+b;
    }
    default int sub(int a, int b){
        return a-b;
    }
    // static methods
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
}
public class UsingStaticAndDefaultMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b =  sc.nextInt();

        /* Implementation Approach
        -- Lambda can only implement the abstract method (square in this case)
        -- Default and static methods come with the interface and don't need implementation
        -- We'll create an instance using lambda for the abstract method while keeping the default and static methods
        */

        // First way to implement static and default method in Functional Interface
        StaticandDefaultMethods addMethod = new StaticandDefaultMethods() {
            @Override
            public int square(int x) {
                return x*x;
            }

            @Override
            public int add(int a, int b) {
                return a+b+1;
            }

            @Override
            public int sub(int a, int b) {
                return a-b+1;
            }
        };

        System.out.println("Add is : " + addMethod.add(a, b));
        System.out.println("Sub is : " + addMethod.sub(a, b));

        // calling Static methods
        System.out.println("Divide is : " + StaticandDefaultMethods.divide(a,b));
        System.out.println("Multiply is : " + StaticandDefaultMethods.multiply(a,b));



        // Second way

        StaticandDefaultMethods method = (int x) -> x*x;
        System.out.println("Square using lambda is : " +method.square(a));

        System.out.println("Add using Lambda object is : " + method.add(a, b));
        System.out.println("Sub using Lambda object is : " + method.sub(a, b));
        System.out.println("Divide using Lambda object is : " + StaticandDefaultMethods.divide(a, b));
        System.out.println("Multiply using Lambda object is : " + StaticandDefaultMethods.multiply(a, b));

    }
}
