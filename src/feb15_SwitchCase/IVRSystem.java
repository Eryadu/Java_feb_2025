package feb15_SwitchCase;

import java.util.Scanner;

public class IVRSystem {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("Welcome to Roger Customer Service");
        System.out.println("*********************************");
        System.out.println("Choose the language : ");
        System.out.println("1. English");
        System.out.println("2. French");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter your choice to proceed in English Language");
                System.out.println("Press 1 for Billing ");
                System.out.println("Press 2 for Technical support");
                System.out.println("Press 3 for Sales");
                System.out.println("Press 4 to Speak with an Agent");
                System.out.println("Press 5 to back to main menu");

                System.out.println("Enter your choice");
                int choice1 =scanner.nextInt();
                switch (choice1){
                    case 1:
                        System.out.println("Welcome to Billing Section");
                        break;
                    case 2:
                        System.out.println("Welcome to Technical support");
                        break;
                    case 3:
                        System.out.println("Welcome to Sales");
                        break;
                    case 4:
                        System.out.println("Hold to talk with Agent");
                        break;
                    case 5:
                        System.out.println("Go back to main menu");
                        break;
                    default:
                        System.out.println("Wrong Input");
                }
                break;
            case 2:
                System.out.println("Enter your choice to proceed in French Language");
                System.out.println("Press 1 for Billing ");
                System.out.println("Press 2 for Technical support");
                System.out.println("Press 3 for Sales");
                System.out.println("Press 4 to Speak with an Agent");
                System.out.println("Press 5 to back to main menu");

                System.out.println("Enter your choice");
                int choice2 =scanner.nextInt();
                switch (choice2){
                    case 1:
                        System.out.println("Welcome to Billing Section");
                        break;
                    case 2:
                        System.out.println("Welcome to Technical support");
                        break;
                    case 3:
                        System.out.println("Welcome to Sales");
                        break;
                    case 4:
                        System.out.println("Hold to talk with Agent");
                        break;
                    case 5:
                        System.out.println("Go back to main menu");
                        break;
                    default:
                        System.out.println("Wrong Input");
                }
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
