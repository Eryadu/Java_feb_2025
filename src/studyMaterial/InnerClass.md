## An inner class in Java is a class that is defined inside another class. Inner classes are used to logically group 
   classes and interfaces in a single place, making the code more readable and maintainable. They can access all the
   members (fields and methods) of the outer class, including private members.

-- Types of Inner Classes:
   Java supports four types of inner classes:
1. Non-static (Regular) Inner Class:Defined inside another class without the static keyword.
   It has access to all members of the outer class.
2. Static Nested Class:Defined inside another class with the static keyword.
   It does not have access to non-static members of the outer class.
3. Local Inner Class:Defined inside a block of code (e.g., inside a method).
   It can only access final or effectively final local variables of the enclosing block.
4. Anonymous Inner Class:A class without a name, defined and instantiated at the same time.
   Often used for implementing interfaces or extending classes on the fly.

1. Non-static (Regular) Inner Class:
-- It has access to all members of the outer class, including private members.
-- An instance of the inner class cannot exist without an instance of the outer class
Example:

class Outer {
private int outerField = 10;

    class Inner {
        void display() {
            System.out.println("Outer field: " + outerField); // Accessing outer class field
        }
    }
}

public class Main {
public static void main(String[] args) {
Outer outer = new Outer(); // Create an instance of the outer class
Outer.Inner inner = outer.new Inner(); // Create an instance of the inner class
inner.display(); // Output: Outer field: 10
}
}
2. Static Nested Class:
-- It is a static member of the outer class.
-- It does not have access to non-static members of the outer class.
-- It can be instantiated without an instance of the outer class.
Example:

class Outer {
private static int outerStaticField = 20;

    static class StaticNested {
        void display() {
            System.out.println("Outer static field: " + outerStaticField); // Accessing outer static field
        }
    }
}

public class Main {
public static void main(String[] args) {
Outer.StaticNested nested = new Outer.StaticNested(); // Create an instance of the static nested class
nested.display(); // Output: Outer static field: 20
}
}

3. Local Inner Class:
-- Defined inside a block of code, such as a method.
-- Method Local inner classes can’t use a local variable of the outer method until that local variable is not declared
   as final. 
Note : Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, it is possible to access 
       the non-final local variable in method local inner class.
-- Method local inner class can’t be marked as private, protected, static, and transient but can be marked as abstract 
   and final, but not both at the same time.
   
## Example:

class Outer {
void outerMethod() {
final int localVar = 30; // Local variable (must be final or effectively final)

        class LocalInner {
            void display() {
                System.out.println("Local variable: " + localVar); // Accessing local variable
            }
        }

        LocalInner inner = new LocalInner(); // Create an instance of the local inner class
        inner.display(); // Output: Local variable: 30
    }
}

public class Main {
public static void main(String[] args) {
Outer outer = new Outer();
outer.outerMethod();
}
}

4. Anonymous Inner Class:
-- A class without a name, defined and instantiated at the same time.
-- Often used for implementing interfaces or extending classes on the fly.
Example:

interface Greeting {
void greet();
}

public class Main {
public static void main(String[] args) {
// Anonymous inner class implementing the Greeting interface
Greeting greeting = new Greeting() {
@Override
public void greet() {
System.out.println("Hello from anonymous inner class!");
}
};

        greeting.greet(); // Output: Hello from anonymous inner class!
    }
}

## Key Points about Inner Classes:

-- Access to Outer Class Members:
   Non-static inner classes can access all members of the outer class, including private members.
   Static nested classes can only access static members of the outer class.
-- Instance Dependency:
   Non-static inner classes require an instance of the outer class to be instantiated.
   Static nested classes do not require an instance of the outer class.
-- Use Cases:
   Inner classes are useful for logically grouping classes that are only used in one place.
   They are often used in event handling (e.g., in GUI programming) or to implement helper classes.
-- Memory Overhead:
   Inner classes can increase memory usage because they maintain a reference to the outer class instance.

## When to Use Inner Classes:

-- You need to logically group classes that are tightly coupled.
-- You want to encapsulate a class within another class.
-- You need to access private members of the outer class.

-- Example of Inner Class in Real-World Use:

class ShoppingCart {
private String cartName;

    ShoppingCart(String cartName) {
        this.cartName = cartName;
    }

    class Item {
        private String itemName;
        private double price;

        Item(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        void display() {
            System.out.println("Cart: " + cartName); // Accessing outer class field
            System.out.println("Item: " + itemName + ", Price: " + price);
        }
    }
}

public class Main {
public static void main(String[] args) {
ShoppingCart cart = new ShoppingCart("My Cart");
ShoppingCart.Item item = cart.new Item("Laptop", 999.99);
item.display();
}
}

## In summary, inner classes are a powerful feature in Java that allow you to logically group classes, encapsulate 
functionality, and access private members of the outer class. They come in four types: non-static inner classes, static 
nested classes, local inner classes, and anonymous inner classes. Each type has its own use cases and benefits.

