## A Singleton class is a design pattern in object-oriented programming that ensures a class has only one 
   instance and provides a global point of access to that instance. This is useful when exactly one object is needed 
   to coordinate actions across a system, such as managing a connection pool, configuration settings, or a logging service.

## Key Characteristics of a Singleton Class

-- Single Instance: Only one instance of the class is created.
-- Global Access: The instance is accessible globally through a static method.
-- Private Constructor: The constructor is private to prevent external instantiation.
-- Static Instance: A static variable holds the single instance of the class.

## Implementation of a Singleton Class in Java

1. Eager Initialization
   The instance is created at the time of class loading.

public class Singleton {
// Private static instance of the class
private static final Singleton instance = new Singleton();

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        return instance;
    }
}

-- Pros:
   Simple and thread-safe.
-- Cons:
   Instance is created even if it’s not used, which may waste resources.

2. Lazy Initialization
   The instance is created only when it is needed.

public class Singleton {
// Private static instance of the class
private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
-- Pros:
   Instance is created only when required.
-- Cons:
   Not thread-safe (may create multiple instances in a multi-threaded environment).

3. Thread-Safe Lazy Initialization
   To make the lazy initialization approach thread-safe, use synchronization.

   public class Singleton {
   // Private static instance of the class
   private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Synchronized method to provide access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
-- Pros:
   Thread-safe.
-- Cons:
   Synchronization can cause performance overhead.

4. Double-Checked Locking
   A more efficient thread-safe approach that minimizes synchronization overhead.

   public class Singleton {
   // Private static instance of the class
   private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the instance
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
-- Pros:
   Thread-safe and efficient.
-- Cons:
   Slightly more complex implementation.

5. Bill Pugh Singleton (Static Inner Class)
   A thread-safe and efficient approach using a static inner class.

  public class Singleton {
  // Private constructor to prevent instantiation
  private Singleton() {}

    // Static inner class to hold the instance
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
-- Pros:
   Thread-safe and lazy initialization.
   No synchronization overhead.

## Use Cases for Singleton

-- Database Connection Pool: Managing a pool of database connections.
-- Configuration Management: Storing and providing global configuration settings.
-- Logging: Centralized logging service.
-- Caching: Managing a cache for an application.
-- Hardware Access: Controlling access to hardware resources like printers.

## Advantages of Singleton

- Ensures a single instance of the class.
- Provides a global point of access.
- Reduces memory usage by reusing the same instance.

## Disadvantages of Singleton

- Can introduce global state, making the code harder to test.
- May lead to tight coupling in the application.
- Can cause issues in multi-threaded environments if not implemented correctly.

## Best Practices

- Use Singleton only when absolutely necessary.
- Prefer dependency injection over Singleton for better testability and flexibility.
- Ensure thread safety in multi-threaded environments.