## In Java, a private constructor is used in a Singleton class to ensure that only one instance of the class is 
   created and to prevent external instantiation of the class. The Singleton pattern is a design pattern that restricts 
   the instantiation of a class to a single object, and the private constructor plays a key role in achieving this.

## Singleton Violation Case & Solution
https://javatechonline.com/singleton-design-pattern-in-java-with-all-scenarios/
## Forms of Singleton Class Pattern

There are two forms of singleton design patterns, which are:

1. Early Instantiation: The object creation takes place at the load time.
2. Lazy Instantiation: The object creation is done according to the requirement.

## Why Use a Private Constructor in a Singleton Class?

1. Prevent Instantiation from Outside:By making the constructor private, you prevent other classes from creating instances
   of the Singleton class using the new keyword.
-- This ensures that the only way to access the Singleton instance is through the method provided by the Singleton class itself (e.g., getInstance()).

Example:

public class Singleton {
private static Singleton instance;

    // Private constructor
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
If you try to create an instance of Singleton from another class, it will result in a compilation error:
Singleton obj = new Singleton(); // Error: Constructor is private

2. Control Instance Creation:The Singleton class itself controls when and how the instance is created.
-- The getInstance() method ensures that only one instance of the class is created and reused.

3. Thread Safety:By controlling the instantiation process, you can implement thread-safe mechanisms (e.g., using 
   synchronized or double-checked locking) to ensure that only one instance is created in a multi-threaded environment.

Example (Thread-Safe Singleton):

public class Singleton {
private static volatile Singleton instance;

    // Private constructor
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
4. Global Access Point:The Singleton class provides a global access point to the single instance, typically through a 
   static method like getInstance().
-- This ensures that all parts of the application use the same instance.

5. Lazy Initialization: The Singleton instance can be created only when it is needed (lazy initialization), 
   which improves performance and resource usage.

Example (Lazy Initialization):

public class Singleton {
private static Singleton instance;

    // Private constructor
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

## Key Features of a Singleton Class

-- Private Constructor: Prevents external instantiation.
-- Static Instance: Holds the single instance of the class.
-- Static Method: Provides global access to the instance (e.g., getInstance()).

Example of a Singleton Class

public class Singleton {
// Static variable to hold the single instance
private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Static method to provide global access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage(); // Output: Hello from Singleton!

        // Try to create another instance
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same instance
        System.out.println(obj1 == obj2); // Output: true
    }
}
Output:

Singleton instance created.
Hello from Singleton!
true

## Advantages of Using a Private Constructor in Singleton

-- Single Instance: Ensures that only one instance of the class exists.
-- Controlled Access: Provides a controlled way to access the instance.
-- Resource Efficiency: Saves memory and resources by reusing the same instance.
-- Thread Safety: Can be implemented to handle multi-threaded environments.

## Common Use Cases of Singleton

-- Database Connection Pool: Managing a pool of database connections.
-- Configuration Management: Storing and providing global configuration settings.
-- Logging: Centralized logging service.
-- Caching: Managing a cache for an application.
-- Hardware Access: Controlling access to hardware resources like printers.

## Steps to Access a Singleton Class

1. Call the getInstance() Method:
-- The getInstance() method is a static method that provides access to the single instance of the Singleton class.
-- You call this method using the class name (e.g., Singleton.getInstance()).
2. Use the Returned Instance:
-- The getInstance() method returns the single instance of the Singleton class.
-- You can use this instance to call other methods or access variables of the Singleton class.

Example of Accessing a Singleton Class

Here’s an example of a Singleton class and how to access it:
Singleton Class Definition:

public class Singleton {
// Static variable to hold the single instance
private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Static method to provide global access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
-- Accessing the Singleton Class:

public class Main {
public static void main(String[] args) {
// Access the Singleton instance
Singleton obj1 = Singleton.getInstance();

        // Call a method on the Singleton instance
        obj1.showMessage(); // Output: Hello from Singleton!

        // Try to access the Singleton instance again
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same instance
        System.out.println(obj1 == obj2); // Output: true
    }
}
Output:
Singleton instance created.
Hello from Singleton!
true
Explanation of the Code

## Singleton Class:
-- The Singleton class has a private constructor, so it cannot be instantiated from outside the class.
-- The getInstance() method checks if an instance already exists. If not, it creates one and returns it.
-- Accessing the Singleton:
-- In the Main class, the Singleton.getInstance() method is called to get the Singleton instance.
-- The showMessage() method is called on the Singleton instance.
-- When getInstance() is called again, it returns the same instance, ensuring that only one instance exists.

## Key Points to Remember

-- Single Instance: The getInstance() method ensures that only one instance of the Singleton class is created.
-- Global Access: The Singleton instance can be accessed globally through the getInstance() method.
-- Thread Safety: If your application is multi-threaded, ensure that the Singleton implementation is thread-safe 
   (e.g., using synchronized or double-checked locking).

-- Thread-Safe Singleton Example

If your application requires thread safety, you can modify the Singleton class as follows:

public class Singleton {
private static volatile Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Thread-safe getInstance() method
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

## Purpose of Singleton Class
   The primary purpose of a java Singleton class is to restrict the limit of the number of object creations to only one. 
   This often ensures that there is access control to resources, for example, socket or database connection.
   Memory space wastage does not occur with the use of the singleton class because it restricts instance creation. 
   As the object creation will take place only once instead of creating it each time a new request is made.
   We can use this single object repeatedly as per the requirements. This is the reason why multi-threaded and database
   applications mostly make use of the Singleton pattern in Java for caching, logging, thread pooling, configuration settings,
   and much more.
   For example, there is a license with us, and we have only one database connection or suppose our JDBC driver does not 
   allow us to do multithreading, then the Singleton class comes into the picture and makes sure that at a time, only a single 
   connection or a single thread can access the connection.
   
## Difference between Normal Class and Singleton Class
  We can distinguish a Singleton class from the usual classes with respect to the process of instantiating the object of
  the class. To instantiate a normal class, we use a java constructor. On the other hand, to instantiate a singleton class, 
  we use the getInstance() method. 
  -- The other difference is that a normal class vanishes at the end of the lifecycle of the application while the singleton 
  class does not destroy with the completion of an application

// Java program implementing Singleton class
// with using getInstance() method

// Class 1
// Helper class
class Singleton {
// Static variable reference of single_instance
// of type Singleton
private static Singleton single_instance = null;

	// Declaring a variable of type String
	public String s;

	// Constructor
	// Here we will be creating private constructor
	// restricted to this class itself
	private Singleton()
	{
		s = "Hello I am a string part of Singleton class";
	}

	// Static method
	// Static method to create instance of Singleton class
	public static synchronized Singleton getInstance()
	{
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}

// Class 2
// Main class
class GFG {
// Main driver method
public static void main(String args[])
{
// Instantiating Singleton class with variable x
Singleton x = Singleton.getInstance();

		// Instantiating Singleton class with variable y
		Singleton y = Singleton.getInstance();

		// Instantiating Singleton class with variable z
		Singleton z = Singleton.getInstance();

		// Printing the hash code for above variable as
		// declared
		System.out.println("Hashcode of x is "
						+ x.hashCode());
		System.out.println("Hashcode of y is "
						+ y.hashCode());
		System.out.println("Hashcode of z is "
						+ z.hashCode());

		// Condition check
		if (x == y && y == z) {

			// Print statement
			System.out.println(
				"Three objects point to the same memory location on the heap i.e, to the same object");
		}

		else {
			// Print statement
			System.out.println(
				"Three objects DO NOT point to the same memory location on the heap");
		}
	}
}
Output
Hashcode of x is 558638686
Hashcode of y is 558638686
Hashcode of z is 558638686
Three objects point to the same memory location on the heap i.e, to the same object

## Example 2
// Java program implementing Singleton class
// with method name as that of class

// Class 1
// Helper class
class Singleton {
// Static variable single_instance of type Singleton
private static Singleton single_instance = null;

	// Declaring a variable of type String
	public String s;

	// Constructor of this class
	// Here private constructor is used to
	// restricted to this class itself
	private Singleton()
	{
		s = "Hello I am a string part of Singleton class";
	}

	// Method
	// Static method to create instance of Singleton class
	public static Singleton Singleton()
	{
		// To ensure only one instance is created
		if (single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
}

// Class 2
// Main class
class GFG {
// Main driver method
public static void main(String args[])
{
// Instantiating Singleton class with variable x
Singleton x = Singleton.Singleton();

		// Instantiating Singleton class with variable y
		Singleton y = Singleton.Singleton();

		// instantiating Singleton class with variable z
		Singleton z = Singleton.Singleton();

		// Now changing variable of instance x
		// via toUpperCase() method
		x.s = (x.s).toUpperCase();

		// Print and display commands
		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// Now again changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}
}

OUTPUT: 
String from x is HELLO I AM A STRING PART OF SINGLETON CLASS
String from y is HELLO I AM A STRING PART OF SINGLETON CLASS
String from z is HELLO I AM A STRING PART OF SINGLETON CLASS


String from x is hello i am a string part of singleton class
String from y is hello i am a string part of singleton class
String from z is hello i am a string part of singleton class