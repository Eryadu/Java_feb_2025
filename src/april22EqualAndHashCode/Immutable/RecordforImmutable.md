## Records
In Java, records were introduced in Java 14 (preview) and finalized in Java 16.
They are special classes that are immutable by design — meaning once you create an object, you can't change its values.

Here’s how records help enforce immutability:

-- Final fields:
   When you define a record, all fields are automatically private and final.
   This means:
   They can only be set once (when the object is created).
-- No setter methods are generated.
   No setters:
   Only getters (accessors) are generated. You get methods like fieldName() but no way to update fieldName later.
-- Canonical constructor:
   A constructor is created automatically, setting all the fields, and that's the only place you can assign values.

Example
public record Person(String name, int age) { }

This is equivalent to:

public final class Person {
private final String name;
private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }
}
No setter for name or age.
Once you do new Person("Alice", 30), you can't modify Alice or 30.

## Key Points
-- record classes are implicitly final — you can't subclass them.
-- All fields are final and private — ensuring immutability.
-- Java manages the equals(), hashCode(), and toString() automatically based on the fields.


## Validation in Java Records (while keeping them immutable)
Sometimes, when creating a record, you want to validate the input values (e.g., age must be positive, name must not be empty).
You can't change fields after creation — so validation must happen during construction.

You do this by writing a compact constructor inside the record.

Example with Validation
public record Person(String name, int age) {

    public Person {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
-- public Person {} is called a compact constructor.
Inside it, you can validate the incoming parameters before they get assigned to the fields.
No need to manually assign this.name = name; — Java does that automatically after your validations pass.

How it behaves
Person p = new Person("Alice", 25);  // OK
Person p2 = new Person("", 25);       // Throws IllegalArgumentException: Name cannot be null or blank
Person p3 = new Person("Bob", -5);    // Throws IllegalArgumentException: Age cannot be negative
✅ So you can guard your record against bad data, but still stay immutable.

Bonus: If you need full control (less common)
## You can also write a canonical constructor the old way:

public Person(String name, int age) {
if (name == null || name.isBlank()) {
throw new IllegalArgumentException("Name cannot be null or blank");
}
if (age < 0) {
throw new IllegalArgumentException("Age cannot be negative");
}
this.name = name;
this.age = age;
}

## Default values in Java Records
-- Normally, records require all fields to be provided when creating an object.
-- There’s no optional constructor built-in — but you can simulate default values by overloading constructors.

✅ Basically:
You add an extra constructor that sets default values if certain inputs are missing.

Example: Default age = 0 if not provided
public record Person(String name, int age) {

    // Compact constructor for validation
    public Person {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Extra constructor: only name, defaults age to 0
    public Person(String name) {
        this(name, 0);  // calls the main constructor
    }
}
## How you use it
Person p1 = new Person("Alice", 25);   // Normal usage
Person p2 = new Person("Bob");         // Age defaults to 0
p2.age() will return 0 because we passed only the name!

## Important:
-- The main constructor (the one auto-generated based on all fields) is always required.
-- Your extra constructors must call this(...) — you can't directly assign to fields in the extra constructors.

## build a real-world mini-example — a clean, powerful, and production-ready style record! 🚀

Imagine we're creating a User record:

Full Example: User.java
public record User(String username, String email, int age) {

    // Compact constructor: validation logic
    public User {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Extra constructor: username + email only, default age = 18
    public User(String username, String email) {
        this(username, email, 18);
    }

    // Custom toString() (optional but nice)
    @Override
    public String toString() {
        return String.format("User(username='%s', email='%s', age=%d)", username, email, age);
    }
}


## Why Use static in a Java Record?
-- When you add static things inside a record (like static methods or static fields), it gives you extra power without 
   breaking immutability or the simple nature of records.

Here’s why you would use static in a record:

1. Static Factory Methods

Instead of calling new RecordName(...), you can create a static method like create(), of(), or from() that:

Makes the code more readable
Allows custom logic inside
Can return different instances if needed (e.g., caching, default values)
👉 Example:

public record User(String username, int age) {
public static User createAdultUser(String username) {
return new User(username, 18); // Default age for adult
}
}
Usage:
User user = User.createAdultUser("john_doe");
✅ Looks clean
✅ Hides complex logic
✅ No need to expose new everywhere


## Static Method
-- Updated User Record with Static Factory Method
public record User(String username, String email, int age) {

    // Compact constructor for validation
    public User {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Static factory method with default age
    public static User create(String username, String email) {
        return new User(username, email, 18); // Default age set to 18
    }

    // Custom toString() for better readability
    @Override
    public String toString() {
        return String.format("User(username='%s', email='%s', age=%d)", username, email, age);
    }
}

## Benefits of Using Static Factory Methods
-- Descriptive Naming: Unlike constructors, static factory methods can have meaningful names, enhancing code readability.
   For instance, User.create(...) clearly indicates the creation of a User object.
-- Default Values: They allow setting default values (e.g., default age) without overloading constructors.
-- Encapsulation of Logic: Complex creation logic can be encapsulated within the factory method, keeping constructors clean.
-- Flexibility in Object Creation: They can return instances based on specific conditions or even return cached instances, 
   promoting efficient resource usage.