package mar25InnerClass;
// Inner class to test the main method inside Inner class.
public class OuterClassTest {
    void outerMethod() {
        System.out.println("Outer Method");
    }

    static class InnerClass {
        public static void main(String[] args) {
            System.out.println("Inner CLass");


            OuterClassTest test = new OuterClassTest();
            test.outerMethod();
        }
    }
}