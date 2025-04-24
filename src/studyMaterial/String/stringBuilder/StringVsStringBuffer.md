Key Differences:

Feature	           String	                 StringBuffer	                              StringBuilder
Mutability	      Immutable	                    Mutable	                                    Mutable
Performance	     Slow for modifications	    Faster than String(Synchronized)	        Fastest (not synchronized)
Thread Safety	     N/A	                 Thread-safe (synchronized)	                 Not thread-safe
Use Case	     Fixed strings	      Frequent modifications + thread safety	  Frequent modifications (no thread safety)


## Why equals() Can't Be Overridden in StringBuffer but Can Be in String
  Key Difference in Behavior
## String Class:
-- Overrides equals() to perform value comparison
   "hello".equals("hello") → true (compares contents)

## StringBuffer Class:
-- Does not override equals(), so it uses Object's default implementation
   new StringBuffer("hello").equals(new StringBuffer("hello")) → false (compares references)

## Why This Design Choice?

  For String (Overrides equals())
-- Strings are immutable, so value-based comparison is safe and logical
-- Fundamental for use in collections (HashSet, HashMap) where equality matters
-- Matches developer expectations (we usually want to compare string contents)

  For StringBuffer (Does NOT Override equals())
-- Mutability Problem:
   StringBuffer is mutable - its content can change
   If equals() were value-based, two equal StringBuffers could become unequal later
   This would violate the equals() contract (consistency requirement)

   StringBuffer sb1 = new StringBuffer("hello");
   StringBuffer sb2 = new StringBuffer("hello");

   if (sb1.equals(sb2)) {  // Would be true if value-based
   sb1.append(" world");
    // Now sb1 no longer equals sb2 - contract violated!
   }

## Thread Safety Considerations:
-- StringBuffer is thread-safe (synchronized)
   Value-based comparison would require synchronization, hurting performance
-- Design Purpose:
   StringBuffer is primarily a mutable string builder, not a value object
   Reference equality is more appropriate for mutable objects

Workaround for Comparing StringBuffer Contents
If you need to compare contents:

StringBuffer sb1 = new StringBuffer("hello");
StringBuffer sb2 = new StringBuffer("hello");

boolean equalContent = sb1.toString().equals(sb2.toString()); // override toString() method which will compare String 
                        // contents rather than reference

## Contrast with StringBuilder
-- StringBuilder (unsynchronized version) also does not override equals()
-- Same reasoning applies - mutability makes value comparison problematic

## Key Takeaway

The inability to override equals() in StringBuffer is a deliberate design choice to:
-- Maintain consistency with mutable objects
-- Preserve the equals() contract
-- Avoid subtle bugs that could arise from comparing mutable objects by value
-- This contrasts with String where immutability allows and benefits from value-based comparison.

-----------------------------------------------------------------------------------------------------------------------
## StringBuffer vs StringBuilder in Java (with Synchronization Examples)
Both StringBuffer and StringBuilder are used for mutable string operations, but they differ in thread safety.

1. StringBuffer (Thread-Safe)

-- Synchronized: All methods are synchronized (thread-safe).
-- Slower due to synchronization overhead.
-- Best for multi-threaded environments.
Example: StringBuffer (Thread-Safe)

public class StringBufferExample {
public static void main(String[] args) {
StringBuffer buffer = new StringBuffer("Hello");

        // Thread 1
        Runnable task1 = () -> {
            buffer.append(" World");
            System.out.println("Thread 1: " + buffer);
        };
        
        // Thread 2
        Runnable task2 = () -> {
            buffer.append("!");
            System.out.println("Thread 2: " + buffer);
        };
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final Result: " + buffer);
    }
}
Possible Output (Consistent due to synchronization):

Thread 1: Hello World
Thread 2: Hello World!
Final Result: Hello World!
(or)

Thread 2: Hello!
Thread 1: Hello! World
Final Result: Hello! World
Key Point:
Even if multiple threads modify StringBuffer, synchronization ensures no corruption.

2. StringBuilder (Not Thread-Safe)

-- Not synchronized: Faster but unsafe in multi-threading.
-- Best for single-threaded environments.

Example: StringBuilder (Non-Thread-Safe)

public class StringBuilderExample {
public static void main(String[] args) {
StringBuilder builder = new StringBuilder("Hello");

        // Thread 1
        Runnable task1 = () -> {
            builder.append(" World");
            System.out.println("Thread 1: " + builder);
        };
        
        // Thread 2
        Runnable task2 = () -> {
            builder.append("!");
            System.out.println("Thread 2: " + builder);
        };
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final Result: " + builder);
    }
}
Possible Output (May be inconsistent due to race conditions):

Thread 1: Hello World
Thread 2: Hello World!
Final Result: Hello World!
(or) Corrupted Output (Due to Lack of Synchronization)

Thread 2: Hello!
Thread 1: Hello! World
Final Result: Hello! World
(or even worse) Data Corruption (Rare but possible)

Thread 1: Hello W!orld
Thread 2: Hello W!orld
Final Result: Hello W!orld
Key Point:
Without synchronization, StringBuilder can produce unpredictable results in multi-threaded environments.

## When to Use Which?

Criteria	            StringBuffer                                            	StringBuilder
Thread Safety	        ✅ Yes (synchronized)	                                    ❌ No
Performance	            Slower (due to synchronization)	                            Faster
Use Case	            Multi-threaded environments	                                Single-threaded environments
Example Usage	        Web applications (multiple requests modifying same buffer)	Local method string manipulations

Best Practice:

-- Use StringBuilder if working in a single-threaded environment (better performance).
-- Use StringBuffer only when multiple threads modify the same buffer.

## Alternative (Java 8+)

If working in a thread-confined environment (like within a method), always prefer StringBuilder:

public String buildMessage() {
StringBuilder sb = new StringBuilder(); // Local variable → thread-safe
sb.append("Hello");
sb.append(" World");
return sb.toString();
}
(Since StringBuilder is confined to a single thread, synchronization is unnecessary.)

## Summary
-- StringBuffer → Thread-safe, slower (due to synchronized).
-- StringBuilder → Not thread-safe, faster (preferred in single-threaded cases).
-- Race conditions can corrupt StringBuilder in multi-threading.
-- Best practice: Use StringBuilder unless thread safety is required.





