package practice.functionalInterfaceLambda.FunctionInterface;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FunctionMethods {
    public static void main(String[] args) {

        // FunctionInterface Specializations
        Function<Integer, Integer> square1 = x-> x*x;
        IntFunction<Integer> square2 = x -> x*x;
        ToIntFunction<Integer> square3 = x -> x*x;
        UnaryOperator<Integer> square4 = x-> x*x;

        System.out.println(square1.apply(5));
        System.out.println(square2.apply(5));
        System.out.println(square3.applyAsInt(5));
        System.out.println(square4.apply(5));

        Function<Long, Long> square = x -> x*x;
        Function<Long, Long> addOne = x -> x+1;

        // Compose functions from the two functions
        Function<Long, Long> squareAddOne = square.andThen(addOne);
        Function<Long, Long> addOneSquare = square.compose(addOne);

        Function<Long, Long> identity = Function.<Long>identity();

        // Test the functions
        long num = 5L;
        System.out.println("Number : " + num);
        System.out.println("Square and then add one: " + squareAddOne.apply(num));
        System.out.println("Add one and then square: " + addOneSquare.apply(num));
        System.out.println("Identity: " + identity.apply(num));



        // Chained Function
        Function<Long, Long> chainFunction = ((Function<Long, Long>)  x->x*x).andThen(x->x+x).andThen(x->x+1);
        System.out.println("Chained Function : " + chainFunction.apply(10L));
    }
}
