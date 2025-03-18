## Abstraction is a fundamental concept in object-oriented programming (OOP) that focuses on hiding the internal 
   implementation details of an object and exposing only the essential features or functionalities to the outside world. 
   It allows you to work with high-level concepts without worrying about the underlying complexity.

-- Key Points about Abstraction:

-- Focus on What, Not How:
   Abstraction lets you focus on what an object does rather than how it does it.
   Example: When you drive a car, you don’t need to know how the engine works; you only need to know how to use the 
   steering wheel, pedals, and gears.
-- Simplifies Complexity:
   Abstraction reduces complexity by breaking down systems into smaller, manageable parts.
-- Achieved Through Abstract Classes and Interfaces:
   In programming, abstraction is implemented using abstract classes and interfaces.
-- Supports Modularity:
   Abstraction promotes modularity by separating the interface (what is exposed) from the implementation (how it works).

## Why Use Abstraction?

-- Reduces Complexity:
   Hides unnecessary details, making the system easier to understand and use.
-- Improves Maintainability:
   Changes to the internal implementation do not affect the external interface.
-- Enhances Reusability:
   Abstracted components can be reused in different parts of the program.
-- Promotes Security:
   Prevents external code from directly accessing or modifying internal data.

## Abstraction in Java:
In Java, abstraction is achieved using:
1. Abstract Classes: 
-- A class declared with the abstract keyword.
-- It can have both abstract methods (without a body) and concrete methods (with a body).
-- Cannot be instantiated directly. (Cannot create Object of abstract class)
-- if any class inherits from abstract class it must implement all abstract methods.
   any non-abstract class inherit from abstract class , must implement all abstract method
2. Interfaces:
-- A blueprint of a class that contains only abstract methods (before Java 8).
-- From Java 8 onwards, interfaces can also have default and static methods.

-- Example of Abstraction Using Abstract Class:

// Abstract class
abstract class Animal {
// Abstract method (no implementation)
abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Concrete subclass
class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Bark");
}
}

public class Main {
public static void main(String[] args) {
Animal myDog = new Dog(); // Upcasting
myDog.makeSound(); // Output: Bark
myDog.sleep(); // Output: Animal is sleeping
}
}

-- Example of Abstraction Using Interface:

java
Copy
// Interface
interface Vehicle {
void start(); // Abstract method
void stop();  // Abstract method
}

// Concrete class implementing the interface
class Car implements Vehicle {
@Override
public void start() {
System.out.println("Car started");
}

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Main {
public static void main(String[] args) {
Vehicle myCar = new Car();
myCar.start(); // Output: Car started
myCar.stop();  // Output: Car stopped
}
}

## Abstraction vs. Encapsulation:

-- Abstraction:
   Focuses on hiding the internal details and showing only the essential features.
   Example: Using an abstract class or interface to define a high-level structure.
-- Encapsulation:
   Focuses on bundling data (attributes) and methods (behaviors) into a single unit (class) and restricting access to the internal state.
   Example: Using private fields and public getter/setter methods.

## Benefits of Abstraction:

-- Simplifies Design:
   Breaks down complex systems into manageable components.
-- Improves Code Readability:
   Exposes only what is necessary, making the code easier to understand.
-- Enhances Flexibility:
   Allows you to change the internal implementation without affecting the external interface.
-- Promotes Reusability:
   Abstracted components can be reused across different parts of the program.

-- When to Use Abstraction:

- Use abstraction when you want to:
- Hide unnecessary details from the user.
- Define a common interface for multiple implementations.
- Simplify complex systems by breaking them into smaller parts.

In summary, abstraction is a powerful OOP concept that helps you manage complexity by focusing on the essential features 
of an object while hiding the implementation details. It is achieved through abstract classes and interfaces, making your 
code more modular, reusable, and maintainable.