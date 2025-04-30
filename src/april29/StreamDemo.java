package april29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,12,13,14,15,17,22,33,44,19,23,432,45));

        Stream<Integer> numberStream = numbers.stream();
        //Predicate<Integer> predicate = n-> n%2==0;

        // First way
       numberStream.filter(n -> n % 2 == 0).filter(n -> n % 11 == 0).forEach(n -> System.out.println(n));

       // Second way
       numbers.stream().filter(n -> n % 2 == 0).filter(n -> n % 11 == 0).forEach(n -> System.out.println(n));

      // collect method to print list, set, array
        // it doesn't return any stream method
       List<Integer> processedNumbers =numbers.stream().filter(n -> n % 2 == 0).filter(n -> n % 11 == 0).collect(Collectors.toList());



    }
}
