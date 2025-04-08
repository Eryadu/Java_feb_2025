## Marker Interface in Java
   A marker interface is a special type of interface in Java that contains no methods or fields but is used to mark a 
   class for special behavior at runtime. It acts as a flag or tag for the Java compiler and JVM. 
## Marker interface provide metadata about object or class, it provides information to JVM or compiler at run time, that
   this object or class is implementing marker interface or classifying them

## Key Characteristics

✅ Empty Interface – No methods or constants.
✅ Runtime Behavior – Used by JVM to provide special functionality.
✅ Type Checking – Helps in categorizing classes.

## Common Built-in Marker Interfaces

Interface	            Purpose
Serializable	        Indicates that an object can be serialized.
Cloneable	            Allows an object to be cloned using clone().
Remote (RMI)	        Marks an interface as a remote object in RMI.

## Example: Serializable Marker Interface

import java.io.Serializable;

// Implementing Serializable (a marker interface)
public class Employee implements Serializable {
private String name;
private int id;

    // Constructor, getters, setters...
}

Here, Serializable tells the JVM that Employee objects can be converted into a byte stream.

## How Marker Interfaces Work?

-- Compile-Time: No impact (since they have no methods).
-- Run-Time: The JVM checks for marker interfaces and applies special behavior.

Example with Cloneable

class Student implements Cloneable {
String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Works only if Cloneable is implemented
    }
}

public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
Student s1 = new Student();
s1.name = "Alice";

        Student s2 = (Student) s1.clone();  // Allowed because of Cloneable
        System.out.println(s2.name);  // Alice
    }
}
If Cloneable is not implemented, clone() throws CloneNotSupportedException.

## Why Use Marker Interfaces?

✔ Runtime Type Identification – Helps JVM identify special classes (e.g., serializable objects).
✔ Better than Annotations in Early Java – Before Java 5, marker interfaces were the only way to add metadata.
✔ Backward Compatibility – Still used in core Java (Serializable, Cloneable).

## Marker Interface vs. Annotations

Feature	                    Marker Interface	            Annotations (@Override)
Introduced in	            Java 1.0	                    Java 5
Usage	                    implements Serializable	        @Override, @Deprecated
Flexibility	                Limited (only interfaces)	    More powerful (can have parameters)
Compile-Time vs Runtime	    Mostly runtime	                at compile-time & runtime

## Modern Preference: Annotations

Since Java 5, annotations (e.g., @Serializable) are preferred over marker interfaces because:
-- They can carry additional metadata.
-- They are more flexible (can be applied to methods, fields, etc.).
-- They support compile-time processing.

## Custom Marker Interface Example
Note : Marker interface always checked with "instanceof" keyword.
You can create your own marker interface:

// Custom marker interface
interface Loggable {
// No methods
}

// Class implementing the marker
class User implements Loggable {
String name;
}

// Check at runtime
public class Main {
public static void main(String[] args) {
User user = new User();

        if (user instanceof Loggable) {
            System.out.println("This object supports logging.");
        }
    }
}

## When to Use Marker Interfaces?

✔ When working with legacy code (e.g., Serializable).
✔ When runtime type checking is needed.
✔ When you want to enforce a contract (e.g., "must be cloneable").

## When to Avoid?

❌ If you need additional metadata (use annotations instead).
❌ If the behavior can be better represented by methods.