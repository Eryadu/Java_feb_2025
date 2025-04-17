package practice.Collections.ArrayList.FunctionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface Sample{
    int calculate (int val); // abstract method
}

@FunctionalInterface
interface PersonalGreet{
    String greeting(String name);
}


// A Functional Interface Can Have Methods of Object Class
@FunctionalInterface
interface AbstractClass{
    // abstract method
    int abstractMethod(int val);
// methods of the object class
    int hashCode();
    String toString();
    boolean equals(Object obj);
}


//  using functional interface, implement without using implements keyword and an override the method
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
     Sample sample = (int val) -> val+12; // lambda implementation
     System.out.println(sample.calculate(12));

        Scanner sc = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name  = sc.nextLine();
        PersonalGreet greet = (String temp) -> "Hello! " +temp;
        System.out.println(greet.greeting(name));

        Main main = new Main(); // create object of class to call method
        System.out.println("Value is : " + main.calculate(12));
    }
}

// without using functional interface, implement using implements keyword and an override the method
class Main implements Sample{
    @Override
    public int calculate(int val) {
        return val;
    }
}