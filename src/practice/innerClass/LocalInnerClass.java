package practice.innerClass;
// Local Inner class access method 1

/*public class LocalInnerClass {
    String s = "Hello";
    void display(){
        System.out.println("You are in Local Outer Class" + s);
    }
    void set(){
        String s1 = "Class";
        class InnerClass{ // Scope of inner class only inside the method
                           void get()
                           {
                               System.out.println("Local Inner Class" +  s1);
                           }
                        }
                          InnerClass inn = new InnerClass(); // Inner class object inside method
                          inn.get();

        }

        public static void main (String[] args){
        LocalInnerClass linn = new LocalInnerClass(); // Outer class object
        linn.display();
        linn.set();
        }*/


//}

/* Example
// Java Program to Illustrate Inner class can be
// declared within a method of outer class

// Class 1
// Outer class
class Outer {

    // Method inside outer class
    void outerMethod()
    {

        // Print statement
        System.out.println("inside outerMethod");

        // Class 2
        // Inner class
        // It is local to outerMethod()
        class Inner {

            // Method defined inside inner class
            void innerMethod()
            {

                // Print statement whenever inner class is
                // called
                System.out.println("inside innerMethod");
            }
        }

        // Creating object of inner class
        Inner y = new Inner();

        // Calling over method defined inside it
        y.innerMethod();
    }
}

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of outer class inside main()
        // method
        Outer x = new Outer();

        // Calling over the same method
        // as we did for inner class above
        x.outerMethod();
    }
}*/
public class LocalInnerClass {
    String s = "Hello";

    void set() {
        String s1 = "Inner Class";
        class InnerClass { // Scope of inner class only inside the method
            void get() {
                System.out.println("Local Inner Class" + s1 );
            }
        }
        InnerClass inn = new InnerClass();
        inn.get();

    }

    public static void main(String[] args) {
        LocalInnerClass linn = new LocalInnerClass();
        linn.set();
    }
}