package april29Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReducePractice {
    public static void main(String[] args) {
        /*1. T reduce(T identity, BinaryOperator<T> accumulator)
        Identity: The initial value.
                Accumulator: A function that combines two values.*/

        int sum = Stream.of(1,2,3,4,5,6)
                .filter( n -> n % 2 ==1)
                .map(n -> n*n).reduce(0, (a,b)-> a+b);
        System.out.println("Sum :" + sum);


       /* 2. Optional<T> reduce(BinaryOperator<T> accumulator)
        No identity value, so result is wrapped in an Optional to handle the empty stream case.*/

        List<Integer> numbers = Arrays.asList(1,2,3,4 );
        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);
        max.ifPresent(System.out::println);
    }
}
