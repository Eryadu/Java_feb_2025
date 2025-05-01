package practice.functionalInterfaceLambda;

import practice.functionalInterfaceLambda.LexicalScoping.Printer;

public class VariableCapture {
    private int counter = 0;

    public static void main(String[] args) {
        VariableCapture v1 = new VariableCapture();
        VariableCapture v2 = new VariableCapture();

        // Create Lambdas

        Printer p1 = v1.createLambda(1);
        Printer p2 = v2.createLambda(100);

        // Execute lambda bodies

        p1.print("Lambda #1");
        p2.print("Lambda #2");
        p1.print("Lambda #1");
        p2.print("Lambda #2");
        p1.print("Lambda #1");
        p2.print("Lambda #2");

    }

    public Printer createLambda(int incrementBy){
        Printer printer = msg ->{
            // Access instance and local variable
            counter += incrementBy;
            System.out.println(msg + ":counter = " + counter);
        };
        return printer;
    }
}
