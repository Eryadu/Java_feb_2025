package practice.functionalInterfaceLambda.StaticandDefaultMethod;

public class Test {
    public static void main(String[] args) {
        int a =10;
        int b = 4;
        StaticAndDefaultMethods obj =  x ->  x*x;
        System.out.println("Square is : " + obj.square(10));

        // default methods called by obj of interface
        System.out.println("Addition is  : " + obj.add(a, b));
        System.out.println("Subtraction is  : " + obj.sub(a, b));

        // Static methods called by interface name
        System.out.println("Multiplication is  : " + StaticAndDefaultMethods.multiply(a,b));
        System.out.println("Division is  : " + StaticAndDefaultMethods.divide(a,b));

    }
        }
