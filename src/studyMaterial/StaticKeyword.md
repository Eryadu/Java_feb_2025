## In Java, the static keyword is used to define members (variables, methods, blocks, and nested classes) that belong 
   to the class itself rather than to any specific instance of the class. This means that static members are shared 
   across all instances of the class and can be accessed without creating an object of the class.

## Key Concepts of static in Java

1. Static Variables (Class Variables):
-- A static variable is shared by all instances of the class.
-- It is initialized only once, at the start of the program execution.
-- It can be accessed using the class name (without creating an object).

Example:
public class Counter {
static int count = 0; // Static variable

    Counter() {
        count++; // Increment count each time an object is created
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Total objects created: " + Counter.count); // Output: 2
    }
}

2. Static Methods:
-- A static method belongs to the class rather than any specific instance.
-- It can be called using the class name (without creating an object).
-- Static methods can only access static variables and other static methods directly.

Example:
public class MathUtils {
static int add(int a, int b) { // Static method
return a + b;
}

    public static void main(String[] args) {
        int result = MathUtils.add(5, 10); // Call static method
        System.out.println("Result: " + result); // Output: 15
    }
}

3. Static Block:
-- A static block is used to initialize static variables or perform one-time setup tasks.
-- It is executed when the class is loaded into memory.

Example:

public class StaticBlockExample {
static int num;

    static {
        num = 10; // Initialize static variable
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
        System.out.println("Value of num: " + num); // Output: 10
    }
}

4. Static Nested Classes:
-- A static nested class is a nested class that is declared as static.
-- It can be accessed without creating an instance of the outer class.
-- It cannot access non-static members of the outer class directly.

Example:

public class OuterClass {
static class NestedClass { // Static nested class
void display() {
System.out.println("Inside static nested class.");
}
}

    public static void main(String[] args) {
        OuterClass.NestedClass obj = new OuterClass.NestedClass(); // Create object
        obj.display(); // Output: Inside static nested class.
    }
}

## Key Points About static

1. Shared Across Instances: Static members are shared by all instances of the class.
2. Class-Level Access: Static members can be accessed using the class name (e.g., ClassName.staticMember).
3. No this Reference: Static methods and blocks cannot use the this keyword (since they belong to the class, not an instance).
4.Memory Efficiency: Static variables are stored in a single memory location, making them memory-efficient.

## Limitations:
1. Static methods cannot access non-static members (variables or methods) directly.
2. Static methods cannot be overridden (but can be hidden in subclasses).

## When to Use static

1. Constants: Use static for constants (e.g., static final int MAX_VALUE = 100;).
2. Utility Methods: Use static for utility methods that do not depend on instance variables (e.g., Math.sqrt()).
3. Counters or Shared Data: Use static for variables that need to be shared across all instances (e.g., counters).
4. One-Time Initialization: Use static blocks for one-time initialization tasks.

Example: Static vs Non-Static Members

public class Example {
int instanceVar = 5; // Non-static variable
static int staticVar = 10; // Static variable

    void instanceMethod() { // Non-static method
        System.out.println("Instance method: " + instanceVar);
    }

    static void staticMethod() { // Static method
        System.out.println("Static method: " + staticVar);
    }

    public static void main(String[] args) {
        // Access static members
        System.out.println("Static variable: " + Example.staticVar); // Output: 10
        Example.staticMethod(); // Output: Static method: 10

        // Access non-static members
        Example obj = new Example();
        System.out.println("Instance variable: " + obj.instanceVar); // Output: 5
        obj.instanceMethod(); // Output: Instance method: 5
    }
}

## Common Use Cases of static

1. Main Method: The main method is always static because it is called by the JVM without creating an object.

public static void main(String[] args) {
// Main method
}
2. Math Utilities: The Math class in Java uses static methods for mathematical operations.
double result = Math.sqrt(25); // Static method call
3. Singleton Design Pattern: Static variables are used to implement the Singleton pattern.

public class Singleton {
private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
