## Vector is one of the legacy classes in Java, part of the java.util package. It implements the List interface and 
   is synchronized, meaning it is thread-safe.

🔹 Basic Features

Property	            Description
Package	                java.util
Implements	            List, RandomAccess, Cloneable, Serializable
Synchronization	        Yes (thread-safe)
Duplicates	            Allowed
Null elements	        Allowed
Order	                Maintains insertion order
Resizable?	            Yes
Underlying DStructure	Dynamic array

🔹 Constructors
Vector()                  // Default capacity is 10
Vector(int initialCapacity)
Vector(int initialCapacity, int capacityIncrement)
Vector(Collection<? extends E> c)

🔹 Common Methods
add(E e)                  // Adds element
add(int index, E element)
remove(Object o)
remove(int index)
get(int index)
set(int index, E element)
size()
capacity()               // Only available in Vector
contains(Object o)
clear()
elements()               // Returns Enumeration
removeElement (Object o) 
RemoveElementAt (int index) // from vector
clear()// from collections
removeAllElements () // from vector

// Vector has lengthy method name as compare to collections



🔹 Example
import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
Vector<String> vector = new Vector<>();
vector.add("Apple");
vector.add("Banana");
vector.add("Cherry");

        System.out.println("Vector: " + vector);
        System.out.println("Element at index 1: " + vector.get(1));
    }
}

🔹 Vector vs ArrayList

Feature	               Vector                	ArrayList
Thread-safe	           ✅ Yes (synchronized)	❌ No (not synchronized)
Performance	           Slower	                Faster
Introduced in	       Java 1.0	                Java 1.2
Growth Rate	           Doubles capacity	        50% increase

✅ When to Use Vector?
When you need thread safety and are not using external synchronization tools.
However, in modern Java, ArrayList + external sync (or Collections.synchronizedList) or CopyOnWriteArrayList is usually preferred.
