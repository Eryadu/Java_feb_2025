package practice.functionalInterfaceLambda;

import java.util.function.Consumer;

public class JumpAndExits {
    public static void main(String[] args) {
        Consumer<int[]> printer = ids ->
        {
            int printCount =0;
            for(int id : ids){
                if(id % 2 !=0){
                    continue;
                }
                System.out.println(id);
                printCount++;

                //Break out of the loop after printing 3 ids

                if(printCount==3){
                    break;
                }
            }
        };

        // Print an array of 8 integers
        printer.accept(new int[]{1,2,3,4,5,6,7,8});
    }
}
