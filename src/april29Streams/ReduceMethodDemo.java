package april29Streams;

import java.util.stream.Stream;

public class ReduceMethodDemo {
    public static void main(String[] args) {

        Double sum = Stream.generate(() -> (Math.random()*1000))
                            .limit(4)
                            .reduce(1.0, (a,b) -> a/b);
        System.out.println(sum);
    }
}
