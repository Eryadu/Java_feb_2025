## The HAS-A relationship is a fundamental concept in object-oriented programming (OOP) that describes composition or 
   aggregation between classes. It signifies that one class has a reference to another class as a member. This 
   relationship is used to model objects that are composed of other objects or have a dependency on other objects.

-- Key Points about HAS-A Relationship:

-- Composition:
   The HAS-A relationship is typically implemented by creating an instance of one class inside another class.
   The contained object (member) is part of the containing object and cannot exist independently.
-- Aggregation:
   A weaker form of the HAS-A relationship where the contained object can exist independently of the containing object.
-- Code Reusability:
   The HAS-A relationship promotes code reuse by allowing you to use existing classes as components of new classes.
-- Flexibility:
   Unlike inheritance (IS-A relationship), the HAS-A relationship does not create a tight coupling between classes, 
   making the design more flexible.

-- Syntax (Example in Java):

class Engine { // Part class
void start() {
System.out.println("Engine started");
}
}

class Car { // Whole class - Car HAS-A Engine
private Engine engine; // HAS-A relationship

    Car() {
        engine = new Engine(); // Composition
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class Main {
public static void main(String[] args) {
Car myCar = new Car();
myCar.drive(); // Uses Engine
}
}

-- Real-World Examples of HAS-A Relationship:

- Car and Engine:
  A Car has an Engine.
- Library and Books:
  A Library has Books.
- Person and Address:
  A Person has an Address.
- Computer and CPU:
  A Computer has a CPU.


1. Composition:
   A strong relationship where the contained object cannot exist independently of the containing object.
   Example: A Car has an Engine. If the car is destroyed, the engine is also destroyed.

class Engine {
void start() {
System.out.println("Engine started");
}
}

class Car {
private Engine engine; // Composition

    Car() {
        engine = new Engine(); // Engine is created with the Car
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
2. Aggregation:
   A weaker relationship where the contained object can exist independently of the containing object.
   Example: A Library has Books. If the library is destroyed, the books can still exist.

class Book {
String title;

    Book(String title) {
        this.title = title;
    }

    void read() {
        System.out.println("Reading " + title);
    }
}

class Library {
private List<Book> books; // Aggregation

    Library(List<Book> books) {
        this.books = books; // Books exist independently of the Library
    }

    void listBooks() {
        for (Book book : books) {
            System.out.println(book.title);
        }
    }
}

## Benefits of HAS-A Relationship:

1. Code Reusability:Allows you to reuse existing classes as components of new classes.
2. Flexibility:Changes in one class do not necessarily affect the other class.
3. Better Design:Promotes a modular and maintainable design by breaking down complex objects into smaller, reusable components.
4. Avoids Tight Coupling:Unlike inheritance, the HAS-A relationship does not create a tight coupling between classes.

-- When to Use HAS-A Relationship:
   Use the HAS-A relationship when one object is composed of or uses another object.
   Example of HAS-A Relationship in Action:

class Address {
String city;
String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void display() {
        System.out.println("City: " + city + ", State: " + state);
    }
}

class Person {
String name;
Address address; // Person HAS-A Address

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        address.display();
    }
}

public class Main {
public static void main(String[] args) {
Address myAddress = new Address("New York", "NY");
Person myPerson = new Person("John Doe", myAddress);
myPerson.display();
}
}
In summary, the HAS-A relationship is used to model composition or aggregation between classes, allowing you to build 
complex objects by combining simpler ones. It promotes code reuse, flexibility, and better design in object-oriented 
programming.