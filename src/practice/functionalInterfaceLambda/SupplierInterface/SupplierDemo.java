package practice.functionalInterfaceLambda.SupplierInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> greet = ()-> "Hello World !";
        System.out.println("Greeting : " + greet.get());
    }
}
