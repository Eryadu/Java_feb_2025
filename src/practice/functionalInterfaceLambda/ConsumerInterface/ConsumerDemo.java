package practice.functionalInterfaceLambda.ConsumerInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> eligibility = (Integer age , Integer percentage) -> {
            if(age>18 && percentage >75)
                System.out.println("You are eligible to participate");
            else
                System.out.println("The eligibility criteria is not fulfilled");
        };
        eligibility.accept(19, 76);
    }
}
