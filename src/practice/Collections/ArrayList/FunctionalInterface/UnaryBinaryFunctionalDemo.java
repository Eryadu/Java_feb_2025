package practice.Collections.ArrayList.FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryFunctionalDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> notUni = a ->a^1;
        System.out.println("Unary Operator(XOR) is : " + notUni.apply(0));

        BinaryOperator<Integer> binaryOperator = (a,b) -> a&b;
        System.out.println("Binary Operator(ADD) is : " + binaryOperator.apply(1,0));
    }
}
