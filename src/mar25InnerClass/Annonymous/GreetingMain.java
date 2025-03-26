package mar25InnerClass.Annonymous;

public class GreetingMain {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() { // this is anonymous (Without name) class. Created by new keyword following Interface/class name.
            @Override
            public void greet() {
                System.out.println("Greeting of the Day.");
            }

            @Override
            public void display() {
                System.out.println("You are implementing Anonymous class.");
                class Testing{
                    void test(){
                        System.out.println("testing");
                    }
                }
                Testing te = new Testing();
                te.test(); // testing of inner class inside anonymous class
            }



        }; // by defining anonymous class put semicolon of Greeting interface object.

        greeting.greet(); // calling method
        greeting.display(); // calling method


        AbstractClass ab = new AbstractClass() { // By using Anonymous class we can also implement Abstract Class.
            @Override
            void show() {
                super.show();
                System.out.println("Show method");
            }
        };
        ab.show(); // calling abstract class method

        Test test = new Test() { // try to implement normal class with help of anonymous class
           @Override
            void hello() {
                super.hello();
                System.out.println("Hello2");
            }
        };
        test.hello();

    }
}
