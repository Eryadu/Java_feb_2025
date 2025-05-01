package practice.functionalInterfaceLambda.LexicalScoping;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class ScopeTest {
    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();

        // store the output of getLambdaPrinter() to Printer type of lambdaPrinter
        Printer lambdaPrinter = scopeTest.getLambdaPrinter();
        lambdaPrinter.print("Lambda Expression");

        Printer anonymousPrinter = scopeTest.getAnonymousPrinter();
        anonymousPrinter.print("Anonymous Class");
    }

    public Printer getLambdaPrinter(){
        System.out.println("getLambdaPrinter() :" + this.getClass());

        //Uses a lambda expression
        Printer printer = msg -> {
            // Here, this refers to the current object of the ScopeTest class
            System.out.println(msg + " :" + this.getClass());
        };
        return printer;
    }

    public Printer getAnonymousPrinter(){
        System.out.println("getAnonymousPrinter() :" + this.getClass());

        // Uses an anonymous class
        Printer printer = new Printer() {
            @Override
            public void print(String msg) {
                // Here, this refers to the current object of the anonymous class
                System.out.println(msg + ":" + this.getClass());
            }
        };
        return printer;
    }
}
