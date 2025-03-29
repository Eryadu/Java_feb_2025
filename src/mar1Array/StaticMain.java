package mar1Array;

public class StaticMain {
    public static void main(String[] args) {
        StaticDemo.emp1(); //Don't need to create object to call static method

        StaticDemo staticDemo = new StaticDemo();
        staticDemo.emp2(); // for void method we need to create object.


    }
}
