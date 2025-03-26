package mar25InnerClass.Annonymous;

public class GreetingMain {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() { // this is annonymous (Without name) class. Check by curly bracket
            @Override
            public void greet() {
                System.out.println("Greeting of the Day.");
            }

            @Override
            public void display() {
                System.out.println("You are implimenting Annonymous class.");
            }
        }; // by defining annonymous class put semicolon of Greeting interface object.

        greeting.greet(); // calling method
        greeting.display(); // calling method


        AbstractClass ab = new AbstractClass() { // By using Annonymuos class we can also impliment Abstract Class.
            @Override
            void show() {
                super.show();
                System.out.println("Show method");
            }
        };
        ab.show(); // calling abstract class method
    }
}
