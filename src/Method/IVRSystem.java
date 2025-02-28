package Method;

import java.util.Scanner;

public class IVRSystem {
    public static void main(String[] args) {

        IVRSystemDemo ivrSystemDemo =  new IVRSystemDemo();
        ivrSystemDemo.Welcome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

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
