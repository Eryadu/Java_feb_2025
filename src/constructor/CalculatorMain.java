package constructor;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        System.out.println("***********************");
        System.out.println(" Welcome to Calculator.");
        System.out.println("***********************");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int input = scanner.nextInt();
        System.out.println("Enter the value of x : ");
        float x = scanner.nextFloat();
        System.out.println("Enter the value of y : ");
        float y =scanner.nextFloat();

        CalculatorConst calculatorMethod = new CalculatorConst(x,y);

        switch (input) {
            case 1:
                float add = calculatorMethod.sum();
                System.out.println("Sum is : " + add);
                break;
            case 2:
                float sub = calculatorMethod.sub();;
                System.out.println("Subtraction is : " + sub);
                break;
           case 3:
               float mul = calculatorMethod.sub();;
               System.out.println("Multiplication is : " + mul);
               break;
            case 4:
                float div = calculatorMethod.div();;
                System.out.println("Division is : " + div);
                break;
            case 5:
                float mod = calculatorMethod.mod();;
                System.out.println("Modulus is : " + mod);
                break;
            case 6:
               System.exit(0);
            default:
                System.out.println("Wrong Input.");

        }
    }
}
