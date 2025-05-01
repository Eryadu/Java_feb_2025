package practice.functionalInterfaceLambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class InstanceMethodDemo {
    public static void main(String[] args) {
        String name = "Hello";

        // Instance reference --> Bound receiver syntax objRef.instanceMethod

        Supplier<Integer> supplier = () -> "Hello".length();
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = "Hello"::length;
        System.out.println(supplier1.get());

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello");

        Consumer<String> consumer1 = System.out::println;
        consumer.accept("Hello");

    // Instance reference --> Unbound receiver syntax class.instanceMethod

        Function<String, Integer> function = String::length;
        function.apply(name);

        BiFunction<String , String,String > function1 = (s1, s2 )-> s1.concat(s2);
        System.out.println(function1.apply("Hello" ,"World"));

        BiFunction<String , String,String > function2 = String::concat;
        System.out.println(function2.apply("Hello" ,"World"));
    }

}
