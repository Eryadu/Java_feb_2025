## Upcasting is a concept in object-oriented programming (OOP) where a subclass object is treated as an instance of 
   its superclass. It involves casting a derived class object to its base class type. This is a safe and implicit operation
   because the derived class inherits all the properties and behaviors of the base class.

-- Key Points about Upcasting:

-- Implicit Conversion: Upcasting is usually done implicitly by the compiler. You don't need to explicitly cast the object.
-- Safe Operation: Since the derived class is a specialized version of the base class, upcasting is always safe.
-- Access to Base Class Members: After upcasting, you can only access the members (methods and properties) of the base class,
   not the additional members of the derived class.
-- Polymorphism: Upcasting is often used in conjunction with polymorphism, where a base class reference can point to a 
   derived class object, enabling dynamic method dispatch.

Example in Java:

class Animal {
void makeSound() {
System.out.println("Animal sound");
}
}

class Dog extends Animal {
void makeSound() {
System.out.println("Bark");
}

    void fetch() {
        System.out.println("Fetching the ball");
    }
}

public class Main {
public static void main(String[] args) {
Dog myDog = new Dog(); // Creating a Dog object
Animal myAnimal = myDog; // Upcasting: Dog is treated as an Animal

        myAnimal.makeSound(); // Calls the overridden method in Dog: "Bark"
        // myAnimal.fetch(); // This would cause a compile-time error because fetch() is not in Animal
    }
}

-- Explanation:

-- Dog is a subclass of Animal.
-- When myDog (a Dog object) is assigned to myAnimal (an Animal reference), upcasting occurs.
-- Through myAnimal, you can only access methods defined in the Animal class, even though the actual object is a Dog.
-- The overridden makeSound() method in Dog is called because of polymorphism.

## Why Use Upcasting?

-- Code Reusability: Allows you to write generic code that works with the base class, making it reusable for all derived classes.
-- Polymorphism: Enables runtime method binding, where the correct method (from the derived class) is called based on the 
   actual object type.
-- Flexibility: You can store objects of different derived classes in a collection of the base class type.

## Downcasting:

  The opposite of upcasting is downcasting, where a base class reference is cast to a derived class type. This is not 
  implicit and requires an explicit cast. It can be risky because the object might not actually be an instance of the derived 
  class, leading to a ClassCastException if done incorrectly.