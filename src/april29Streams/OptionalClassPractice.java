package april29Streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalClassPractice {
    public static void main(String[] args) {

        // of() method of Optional
        Optional<String> str = Optional.of("Hello");
        System.out.println(str);

        // empty() method of Optional
        Optional<String> str1 = Optional.empty();
        System.out.println(str1);

        //with isPresent() method
        String str2 = "";
        Optional<String> str3 = Optional.of(str2);
        System.out.println(str3);

        if(str.isPresent()){
            String value = str.get();
            System.out.println("Optional contains " + value);
        }else {
            System.out.println("Optional is empty");
        }

        // ifPresent() with Lambda --> ifPresent() implement Consumer Interface
        Optional<String> str4 = Optional.of("Hello");

        str4.ifPresent(value -> System.out.println("Optional contains" + value ));

        // orElse()
        String name = str4.orElse("Default");
        System.out.println("orElse : " + name);

        Optional<String> emptyName = Optional.empty();
        System.out.println(emptyName.orElse("Default"));

        // Get the max odd number
        OptionalInt maxOdd = IntStream.of(1,2,3,4,5)
                            .filter(n -> n % 2 == 1)
                            .max();
        if(maxOdd.isPresent()){
            int value = maxOdd.getAsInt();
            System.out.println("Maximum odd Integer is " + value);
        }
        else {
            System.out.println("Stream is empty");
        }

        // Get Longest name

        Optional<String> str5 = Stream.of("Tim", "kim", "Kimle" ,"Chan")
                                 .max(Comparator.comparingInt(String::length));

        if(str5.isPresent()){
            String longestName = str5.get();
            System.out.println("Longest name is :" + longestName);
        }
        else {
            System.out.println("Stream is empty");
        }



    }

}
