package Constructor;

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
        IVRSystemDemo ivrSystemDemo =  new IVRSystemDemo(choice);



            switch (choice) {
                case 1:
                    ivrSystemDemo.English();
                    break;
                case 2:
                    ivrSystemDemo.French();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
    }
}
