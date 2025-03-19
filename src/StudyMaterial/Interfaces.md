## An interface is a reference type that defines a contract or a set of abstract methods (methods without a body)
   that a class must implement. Interfaces are used to achieve abstraction and multiple inheritance in Java, 
   as a class can implement multiple interfaces but can only extend one class.

## Key Features of Interfaces in Java:

1. Abstract Methods:
   Interfaces can declare methods without providing an implementation.
   All methods in an interface are implicitly public and abstract.
2. Default Methods (Java 8+):
   Interfaces can have default methods with an implementation.
   Default methods allow adding new functionality to interfaces without breaking existing implementations.
3. Static Methods (Java 8+):
   Interfaces can have static methods with an implementation.
   These methods are called using the interface name.
4. Constant Variables:
   Interfaces can have variables, but they are implicitly public, static, and final (constants).
5. Functional Interfaces (Java 8+):
   An interface with exactly one abstract method is called a functional interface.
   Functional interfaces can be implemented using lambda expressions.

-- Multiple Inheritance:
   A class can implement multiple interfaces, enabling multiple inheritance of behavior.
-- Implementing an Interface:
   A class uses the implements keyword to implement an interface and must provide implementations for all abstract methods
   in the interface.

Example:

// Define an interface
interface Animal {
void makeSound(); // Abstract method

    default void sleep() { // Default method
        System.out.println("Sleeping...");
    }

    static void info() { // Static method
        System.out.println("This is an Animal interface.");
    }
}

// Implement the interface
class Dog implements Animal {
@Override
public void makeSound() {
System.out.println("Woof!");
}
}

public class Main {
public static void main(String[] args) {
Dog dog = new Dog();
dog.makeSound(); // Output: Woof!
dog.sleep();    // Output: Sleeping...
Animal.info();  // Output: This is an Animal interface.
}
}

Functional Interface Example:
A functional interface can be implemented using a lambda expression.

@FunctionalInterface
interface Greeting {
void greet(String name);
}

public class Main {
public static void main(String[] args) {
// Lambda expression to implement the interface
Greeting greeting = (name) -> System.out.println("Hello, " + name);
greeting.greet("Alice"); // Output: Hello, Alice
}
}

## Key Points:

1. Interfaces cannot be instantiated directly.
2. A class can implement multiple interfaces.
3. Interfaces are used to achieve loose coupling and abstraction.
4. Java 8 introduced default and static methods, making interfaces more flexible.
5. all the variables are by default public, static, and final 
6. implement multiple inheritance
7. implement 100% abstraction
8. all the methode are public and abstract // Java 7 and below
9. you can't create object of interfaces

Final method cannot be overridden
If class is final, it cannot be inherited.

## Final - keyword
1. variable - this become constant
2. methode - can't override
3. class - can't inherit