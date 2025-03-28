package practice.innerClass;
// local inner class, creating class inside method.

public class LocalInnerClass {
    void set(){
        String s1 = "Class";
        abstract class InnerClass{ // Scope of inner class only inside the method
                         void get(){
                               System.out.println("Local Inner Class" +  s1); // access the local variable of method
                           }
                           abstract void show();
                        }
                          /*InnerClass inn = new InnerClass(); // Inner class object inside method
                          inn.get();*/
                          class InnerClass2 extends InnerClass{
                              void get1(){
                                  System.out.println("Inheritence");
                              }

                              @Override
                              void show() {
                                  System.out.println("Abstract Method");
                              }
                          }
                     InnerClass2 inn2 = new InnerClass2();
                          inn2.get1();
                          inn2.get();
                          inn2.show();

        }

        public static void main (String[] args){
        LocalInnerClass obj = new LocalInnerClass(); // Outer class object
        obj.set();
        }
}

/* Example

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
