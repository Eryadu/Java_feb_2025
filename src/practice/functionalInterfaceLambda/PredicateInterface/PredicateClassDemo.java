package practice.functionalInterfaceLambda.PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClassDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() == 8;
        List<String> list = Arrays.asList("Predicate" , "Functional" , "Supplier", "Consumer") ;
        list.forEach(x -> {
            if(checkLength.test(x)){
                System.out.println(x);
            }
        }
        );
    }
}
