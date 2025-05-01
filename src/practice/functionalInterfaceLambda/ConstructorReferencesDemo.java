package practice.functionalInterfaceLambda;

import practice.functionalInterfaceLambda.SuperTypeInstance.Item;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesDemo {
    public static void main(String[] args) {
        Supplier<String> s1 = ()-> new String();
        System.out.println(s1.get());

        Function<String, String> s2 = str-> new String(str);
        System.out.println(s2.apply("hello"));

        // rewrite as
        /*syntax for using a constructor is
        ClassName::new
        ArrayTypeName::new*/
        Supplier<String> s3 = String::new;
        Function<String, String> s4 = String::new;

        Supplier<Item> func1 = ()-> new Item();
        Function<String, Item> func2 = name-> new Item(name);
        BiFunction<String , Double,Item> func3 = (name, price) -> new Item(name, price);

        System.out.println(func1.get());
        System.out.println(func2.apply("Apple"));
        System.out.println(func3.apply("Apple", 0.50));


        // Generic type reference

        Function<String[], List<String>> aslist = Arrays::asList;

        String[] name = {"Jim", "Kim", "Tim"};
        List<String> nameList = aslist.apply(name);
        for(String n : nameList){
            System.out.println(n);
        }
    }
}
