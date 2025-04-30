package practice.functionalInterfaceLambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        ToIntFunction<String> lengthFunction = str -> str.length();
        String name = "Pragra";
        int len  = lengthFunction.applyAsInt(name);
        System.out.println("Name = " + name + " , Length = " + len);

        // Method reference
        ToIntFunction<String> lengthFunction1 = String ::length;
        String name1 = "Pragra";
        int len1  = lengthFunction.applyAsInt(name1);
        System.out.println("Name = " + name1 + " , Length = " + len1);

        // Static function (toBinaryString) of Integer class
        Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
        System.out.println(func1.apply(17));

        // using static method reference
        Function<Integer, String> func2 = Integer ::toBinaryString;
        System.out.println(func2.apply(17));

        // Static function (sum) of Integer class
        BiFunction<Integer, Integer, Integer> func3 = (x , y) -> Integer.sum(x,y);
        System.out.println(func3.apply(10, 12));

        // using static method reference
        BiFunction<Integer, Integer, Integer> func4 =  Integer:: sum;
        System.out.println(func3.apply(10, 12));

        // Uses Integer.valueOf(int)
        Function<Integer, Integer> func5 = Integer::valueOf;

        // Uses Integer.valueOf(String)
        Function<String, Integer> func6 = Integer::valueOf;

        // Uses Integer.valueOf(String, int)
        BiFunction<String, Integer, Integer> func7 = Integer::valueOf;
        System.out.println(func5.apply(17));
        System.out.println(func6.apply("17"));
        System.out.println(func7.apply("10001", 2));
    }
}
