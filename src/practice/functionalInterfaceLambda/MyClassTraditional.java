package practice.functionalInterfaceLambda;

import java.util.Scanner;

public class MyClassTraditional implements PersonalGreet{
    @Override
    public String greeting(String name) {
        return "Hello" + name;
    }

    public static void main(String[] args) {
        MyClassTraditional obj = new MyClassTraditional();
        Scanner sc = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name = sc.next();
        System.out.println("Greeting :  " + obj.greeting(name));
    }


}
