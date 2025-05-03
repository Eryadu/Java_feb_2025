package april29Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello");

        Stream<String > stream1 = Stream.of("Ken","Sha", "Kim", "Tim");

        int sum = Stream.of(1,2,3,4,5,6)
                .filter(n -> n %2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum is : " + sum);

        // Example of how to use primitive data tye with Streams
        int[] arr = {1,2,3,4,5,6};
        int sum1 = Arrays.stream(arr)
                .filter(n -> n %2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum is : " + sum1);

        // Example of using IntStream.range()--> Exclude End Range, IntStream.rangeClosed() --> Include End Range
        int sum2 = IntStream.range(1,6)
                .filter(n -> n %2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum is : " + sum2);

        // How to Iterate over infinite series by using methods like limit(), skip()
        Stream.iterate(1, n -> n+2)
                .limit(10).skip(5) // it will skip first five elements
                .forEach(System.out::println);


        // Example to using generate() method , internally support Supplier<> Interface
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out :: println);


        // Using peek() method for debugging, internally support Consumer<> Interface
        int sum4 = Stream.of(1,2,3,4,5,6)
                .peek(e -> System.out.println( "Taking Integer :" + e))
                .filter(n -> n % 2 == 1)
                .peek(e -> System.out.println( "Filtered Integer :" + e))
                .map(n -> n * n)
                .peek(e -> System.out.println( "Mapped Integer :" + e))
                .reduce(0, Integer :: sum);
        System.out.println("Sum is : " + sum4);

        // Flattering method
        // Without FlatMap()
        Stream.of(1,2,3)
                .map(n -> Stream.of(n, n*n))
                .forEach(System.out :: println);    // java.util.stream.ReferencePipeline$Head@34c45dca
                                                    //java.util.stream.ReferencePipeline$Head@52cc8049
                                                    // java.util.stream.ReferencePipeline$Head@5b6f7412

        // Changes in foreach to accept two inputs
        Stream.of(1,2,3)
                .map(n -> Stream.of(n, n*n))
                .forEach(e -> e.forEach(System.out :: println)); // 1,1,2,4,3,9

        // With FlatMap , it flattered the output
        Stream.of(1,2,3)
                .flatMap((n -> Stream.of(n, n*n)))
                .forEach(System.out :: println);
    }
}
