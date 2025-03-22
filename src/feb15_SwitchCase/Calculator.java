package feb15_SwitchCase;

public class Calculator {
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

        int input = 5;
        float x= 10f ,y= 20f;
        int a =5 , b =3;
        switch (input) {
            case 1:
                float sum = x + y;
                System.out.println("Sum is : " + sum);
                break;
            case 2:
                float sub = x - y;
                System.out.println("Subtraction is : " + sub);
                break;
            case 3:
                float mul = x * y;
                System.out.println("Multiplication is : " + mul);
                break;
            case 4:
                float div = x / y;
                System.out.println("Division is : " + div);
                break;
            case 5:
                int mod = a % b;
                System.out.println("Modulus is : " + mod);
                break;
            case 6:
                System.out.println("Exit");
            default:
                System.out.println("Wrong Input.");

        }
    }
}
