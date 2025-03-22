## The IS-A relationship is a fundamental concept in object-oriented programming (OOP) that describes inheritance 
   between classes. It signifies that one class is a type of another class. This relationship is implemented using 
   inheritance, where a subclass (child class) inherits properties and behaviors from a superclass (parent class).

-- Key Points about IS-A Relationship:

-- Inheritance:
   The IS-A relationship is established through inheritance, where a subclass extends a superclass.The subclass inherits 
   all the fields and methods of the superclass (unless they are private).
-- Generalization and Specialization:
   The superclass represents a more generalized entity, while the subclass represents a more specialized entity.
   Example: A Dog is a Animal.
-- Code Reusability:
   The IS-A relationship promotes code reuse by allowing subclasses to inherit and extend the functionality of superclasses.
-- Polymorphism:
   The IS-A relationship enables polymorphism, where a subclass object can be treated as an instance of its superclass.

-- Syntax (Example in Java):

class Animal { // Superclass (Parent)
void eat() {
System.out.println("Animal is eating");
}
}

class Dog extends Animal { // Subclass (Child) - Dog IS-A Animal
void bark() {
System.out.println("Dog is barking");
}
}

public class Main {
public static void main(String[] args) {
Dog myDog = new Dog();
myDog.eat(); // Inherited from Animal
myDog.bark(); // Specific to Dog
}
}

## Real-World Examples of IS-A Relationship:

Vehicle Hierarchy:
A Car is a Vehicle.
A Bike is a Vehicle.
Shape Hierarchy:
A Circle is a Shape.
A Square is a Shape.
Employee Hierarchy:
A Manager is an Employee.
A Developer is an Employee.
IS-A Relationship vs. HAS-A Relationship:

## IS-A Relationship:
   Represents inheritance.
   Example: A Dog is a Animal.
   Implemented using extends in Java.
## HAS-A Relationship:
   Represents composition or aggregation.
   Example: A Car has a Engine.
   Implemented by creating an instance of one class inside another class.

-- Example of IS-A and HAS-A Relationships:

// IS-A Relationship
class Animal {
void eat() {
System.out.println("Animal is eating");
}
}

class Dog extends Animal { // Dog IS-A Animal
void bark() {
System.out.println("Dog is barking");
}
}

// HAS-A Relationship
class Engine {
void start() {
System.out.println("Engine started");
}
}

class Car {
private Engine engine; // Car HAS-A Engine

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class Main {
public static void main(String[] args) {
// IS-A Relationship
Dog myDog = new Dog();
myDog.eat(); // Inherited from Animal
myDog.bark(); // Specific to Dog

        // HAS-A Relationship
        Car myCar = new Car();
        myCar.drive(); // Uses Engine
    }
}

## Benefits of IS-A Relationship:

1. Code Reusability:
   Subclasses can reuse code from the superclass, reducing redundancy.
2. Polymorphism:
   Enables objects of subclasses to be treated as objects of the superclass.
3. Logical Hierarchy:
   Represents real-world relationships in a clear and logical manner.
4. Extensibility:
   New subclasses can be added without modifying existing code.

-- When to Use IS-A Relationship:
   Use the IS-A relationship when there is a clear hierarchical relationship between classes.
   Example: If you can say "X is a Y" and it makes logical sense, then use inheritance.
   In summary, the IS-A relationship is a cornerstone of inheritance in OOP, allowing you to create specialized classes 
   (subclasses) from generalized classes (superclasses) and build logical, reusable, and extensible code.

