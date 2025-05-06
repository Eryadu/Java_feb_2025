package april29Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamMethod {
    public static void main(String[] args) {
        // Creating Stream from values

        // Creating Stream from one element
        Stream<String> stream = Stream.of("Hello");
        stream.forEach(System.out::println);

        // Creating Stream from multiple element
        Stream<String> stream1 = Stream.of("Kim", "Tim","Cam");
        stream1.forEach(System.out::println);

        //Compute the sum of the squares of all odd integers in the list
        int sum  = Stream.of(1,2,3,4,5,6,7,8)
                .filter(n -> n % 2 ==1)
                .map(n -> n*n)
                .map(n -> n+n)
                .reduce(0, (a,b) -> a+b);

        System.out.println("Sum :" + sum);

        // Creating Stream of array

        String[] name = {"Kim", "Tim","Cam"};
        Stream<String > c = Stream.of(name);

        String str = "Kim,Tim,Cam";
        Stream<String> c1 = Stream.of(str.split(","));

        Stream<String> stream2 = Stream.<String>builder() // builder method return Builder Object so we need to convert
                                                        // to string  by putting <String>
                .add("Ken")
                .add("Tim")
                .add("Chen")
                .build();
        stream2.forEach(System.out::println);

        //Stream.Builder<String> builder = Stream.builder();

        // Create a IntStream with range method that exclude end range
        IntStream oneToFive = IntStream.range(1,6);
        oneToFive.forEach(System.out::println);

        // Create a IntStream with rangeClosed method that include end range
        IntStream oneToSix = IntStream.rangeClosed(1,6);
        oneToSix.forEach(System.out::println);



    }

}
