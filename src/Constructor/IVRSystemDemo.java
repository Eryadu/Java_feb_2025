package Constructor;

import java.util.Scanner;

public class IVRSystemDemo {
    int choice;

    public IVRSystemDemo(int choice) {
        this.choice = choice;
    }

    Scanner scanner = new Scanner(System.in);
    public void English(){
        System.out.println("Enter your choice to proceed in English Language");
        System.out.println("Press 1 for Billing ");
        System.out.println("Press 2 for Technical support");
        System.out.println("Press 3 for Sales");
        System.out.println("Press 4 to Speak with an Agent");
        System.out.println("Press 5 to back to main menu");
        System.out.println("Enter your choice");
        int choice1 =scanner.nextInt();
        SubEnglish(choice1);
    }
    public void SubEnglish(int i) {
        switch (i) {
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
                English();
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
        public void French()
        {
            System.out.println("Enter your choice to proceed in French Language");
            System.out.println("Press 1 for Billing ");
            System.out.println("Press 2 for Technical support");
            System.out.println("Press 3 for Sales");
            System.out.println("Press 4 to Speak with an Agent");
            System.out.println("Press 5 to back to main menu");

            System.out.println("Enter your choice");
            int choice2 =scanner.nextInt();
            SubFrench(choice2);
        }
        public void SubFrench(int y){
            switch (y){
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
                    French();
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

