package practice.functionalInterfaceLambda.StaticandDefaultMethod;
@FunctionalInterface
public interface StaticAndDefaultMethods {

    // abstract method
    int square(int x);
    // default methods
    default int add(int a, int b){
        return a+b;
    }
    default int sub(int a, int b){
        return a-b;
    }
    // static methods
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
}
