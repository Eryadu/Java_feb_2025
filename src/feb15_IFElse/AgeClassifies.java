package feb15_IFElse;

import java.util.Scanner;

public class AgeClassifies {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the age : ");
    int age = scanner.nextInt();

    if(age<13){
        System.out.println("Child");
    }
    else if (age>= 13 && age<=19) {
        System.out.println("Teenager");
    }
    else if (age>=20 && age <=59) {
        System.out.println("Adult");
    }
    else if (age>=60) {
        System.out.println("Senior");
    }

    }
}
