package practice.functionalInterfaceLambda;

import java.util.Scanner;

public class MyClassLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String str = sc.next();
        PersonalGreet greet = name -> "Hello" + name;
        System.out.println("Greeting : " +greet.greeting(str));
    }
}
