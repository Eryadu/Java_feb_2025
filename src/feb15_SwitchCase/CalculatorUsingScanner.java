package feb15_SwitchCase;

import java.util.Scanner;

public class CalculatorUsingScanner {
    public static void main(String[] args) {
        char output;
        do {
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


        switch (input) {

            case 1:
                do {
                    System.out.println("Enter the value of x :");
                    float x = scanner.nextFloat();
                    System.out.println("Enter the value of y : ");
                    float y = scanner.nextFloat();
                    float sum = x + y;
                    System.out.println("Sum is : " + sum);
                    System.out.println("DO you want to exit or continue ?");
                    System.out.println("For continue Press Y");
                    System.out.println("For exit Press N");
                    output = scanner.next().charAt(0);
                    if(Character.isDigit(output)){
                        System.out.println("Wrong input.");
                    }
                } while (output == 'y' || output == 'Y');
                break;
            case 2:
                do {
                    System.out.println("Enter the value of x :");
                    float x = scanner.nextFloat();
                    System.out.println("Enter the value of y : ");
                    float y = scanner.nextFloat();
                    float sub = x - y;
                    System.out.println("Subtraction is : " + sub);
                    System.out.println("DO you want to exit or continue ?");
                    System.out.println("For continue Press Y");
                    System.out.println("For exit Press N");
                    output = scanner.next().charAt(0);
                    if(Character.isDigit(output)){
                        System.out.println("Wrong input.");
                    }
                } while (output == 'y' || output == 'Y');
                break;
            case 3:
                do {
                    System.out.println("Enter the value of x :");
                    float x = scanner.nextFloat();
                    System.out.println("Enter the value of y : ");
                    float y = scanner.nextFloat();
                    float mul = x * y;
                    System.out.println("Multiplication is : " + mul);
                    System.out.println("DO you want to exit or continue ?");
                    System.out.println("For continue Press Y");
                    System.out.println("For exit Press N");
                    output = scanner.next().charAt(0);
                    if(Character.isDigit(output)){
                        System.out.println("Wrong input.");
                    }
                } while (output == 'y' || output == 'Y');
                break;
            case 4:
                do {
                    System.out.println("Enter the value of x :");
                    float x = scanner.nextFloat();
                    System.out.println("Enter the value of y : ");
                    float y = scanner.nextFloat();
                    float div = x / y;
                    System.out.println("Division is : " + div);
                    System.out.println("DO you want to exit or continue ?");
                    System.out.println("For continue Press Y");
                    System.out.println("For exit Press N");
                    output = scanner.next().charAt(0);
                    if(Character.isDigit(output)){
                        System.out.println("Wrong input.");
                    }
                } while (output == 'y' || output == 'Y');
                break;
            case 5:
                do {
                    System.out.println("Enter the value of x :");
                    float x = scanner.nextFloat();
                    System.out.println("Enter the value of y : ");
                    float y = scanner.nextFloat();
                    float mod = x % y;
                    System.out.println("Modulus is : " + mod);
                    System.out.println("DO you want to exit or continue ?");
                    System.out.println("For continue Press Y");
                    System.out.println("For exit Press N");
                    output = scanner.next().charAt(0);
                    if(Character.isDigit(output)){
                        System.out.println("Wrong input.");
                    }
                } while (output == 'y' || output == 'Y');
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong Input. Please enter again : ");
                break;
            }
            System.out.println("Welcome to Main Menu . . .");
            System.out.println("Press Y for continue.");
            System.out.println("Press N for exit.");
            output = scanner.next().charAt(0);
            if(Character.isDigit(output)){
                System.out.println("Wrong input");
            }
         }  while ( output == 'y' || output == 'Y');
            System.out.println("Thank you. Try again.");
            System.exit(0);
    }
}
