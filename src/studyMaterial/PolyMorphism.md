
## Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different classes 
   to be treated as objects of a common superclass. It enables a single interface or method to operate on different types 
   of data or objects, providing flexibility and extensibility in code.

 The word "polymorphism" comes from Greek, meaning "many forms." In programming, it refers to the ability of a function, 
 method, or object to behave differently based on the context in which it is used.

## Types of Polymorphism:

1. Compile-Time Polymorphism (Static Polymorphism):
   Achieved through method overloading or operator overloading.
   The method to be executed is determined at compile time based on the number or types of arguments.
   Example: method overloading in Java or C++.

class MathOperations {
int add(int a, int b) {
return a + b;
}

    double add(double a, double b) {
        return a + b;
    }
}
2. Runtime Polymorphism (Dynamic Polymorphism):
   Achieved through method overriding and inheritance.
   The method to be executed is determined at runtime based on the actual object type.
   Example: method overriding in Java or C++.

class Animal {
void makeSound() {
System.out.println("Animal sound");
}
}

class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Bark");
}
}

public class Main {
public static void main(String[] args) {
Animal myAnimal = new Dog(); // Upcasting
myAnimal.makeSound(); // Output: Bark (Runtime polymorphism)
}
}

## Key Concepts of Polymorphism:

1. method Overriding:
   A subclass provides a specific implementation of a method that is already defined in its superclass.
   The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
2. Upcasting:
   Treating a subclass object as an instance of its superclass.
   Enables polymorphism by allowing a superclass reference to point to a subclass object.
3. Dynamic method Dispatch:
   The process by which the correct overridden method is called at runtime based on the actual object type, not the reference type.

## Why Use Polymorphism?

1. Code Reusability:
   Write generic code that works with the base class, and it will automatically work with all derived classes.
2. Flexibility and Extensibility:
   Easily add new subclasses without modifying existing code.
3. Simplified Code Maintenance:
   Changes in the superclass automatically propagate to all subclasses, reducing redundancy.
4. Supports Abstraction:
   Allows you to focus on what an object does rather than how it does it.

Example of Polymorphism in Action:

class Shape {
void draw() {
System.out.println("Drawing a shape");
}
}

class Circle extends Shape {
@Override
void draw() {
System.out.println("Drawing a circle");
}
}

class Square extends Shape {
@Override
void draw() {
System.out.println("Drawing a square");
}
}

public class Main {
public static void main(String[] args) {
Shape myShape1 = new Circle(); // Upcasting
Shape myShape2 = new Square(); // Upcasting

        myShape1.draw(); // Output: Drawing a circle
        myShape2.draw(); // Output: Drawing a square
    }
}
## Real-World Analogy:

Think of a remote control (base class) that can operate different devices like a TV, fan, or AC (subclasses). Each device
responds differently to the "power" button, but the remote control doesn't need to know the details of how each device works. 
This is polymorphism in action!
In summary, polymorphism allows you to write flexible, reusable, and maintainable code by enabling objects to take on 
multiple forms and behave differently based on their actual type.
