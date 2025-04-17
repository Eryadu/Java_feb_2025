package practice.Collections.ArrayList.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

// One way to declare Interface
/*@FunctionalInterface
interface Supplier<String>{
    String get();
}*/

public class SupplierConsumerPredicateDemo {
    public static void main(String[] args) {
        // Supplier interface
        Supplier<String> message = () -> "Hello Yad !";
        System.out.println(message.get());


        // Bi Consume Interface
        BiConsumer<Integer, Integer> biConsumer = (Integer age, Integer percentage) -> {
            if ((age > 18) && percentage > 75) {
                System.out.println("You're eligible to participate in school elections");
            } else {
                System.out.println("The eligibility criteria is Age > 14 and Percentage > 75");
            }
        };
        biConsumer.accept(19, 76);


        // Predicate Functional Interface
        Predicate<String> checkList = (String s) -> s.length()==8;
        List<String> list = Arrays.asList("Predicate", "Function", "Consumer", "Supplier");
        list.forEach(x ->
        {
            if(checkList.test(x)){
            System.out.println(x);
        }
        }
        );

    }
}
