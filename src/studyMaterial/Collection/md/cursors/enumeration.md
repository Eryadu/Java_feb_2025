## Three type of cursors in java 
1. Enumeration ( Java 1.0)
2. Iterator (Java 1.2)
3. ListIterator 

## Enumeration is a legacy interface in Java used to iterate over collections, mainly legacy classes like Vector and 
   Hashtable. It was introduced in Java 1.0, before the Iterator interface came in Java 1.2.

## limitations of Enumeration :
-- Enumeration concept is applicable only for legacy classes and hence it is not a universal cursor.
-- By using enumeration we can get only read access, and we can't perform remove operation. That's why we prefer Iterator

📌 Key Characteristics of Enumeration

Feature	            Description
Package	            java.util
Type	            Interface (legacy)
Introduced	        Java 1.0
Fail-Fast?	        ❌ No
Supports Remove?	❌ No
Thread-safe?	    ✅ Only with legacy synchronized collections like Vector

🔹 Methods of Enumeration
boolean hasMoreElements()
E nextElement()
hasMoreElements() → checks if more elements exist.
nextElement() → retrieves the next element.

-- We can create Enumeration objects by using elements() method of vector class.
i.e. Public Enumeration element();
     Enumeration e = v. elements();

🔹 Example
import java.util.*;

public class EnumerationExample {
public static void main(String[] args) {
Vector<String> vector = new Vector<>();
vector.add("Java");
vector.add("Python");
vector.add("C++");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

🧠 Enumeration vs Iterator

Feature	            Enumeration	     Iterator
Introduced in	    Java 1.0	     Java 1.2
Remove support	    ❌ No	         ✅ Yes (remove())
Fail-fast	        ❌ No	         ✅ Yes (usually)
Modern usage	    ❌ Legacy only	 ✅ Recommended
Use with	Vector, Hashtable	All collections

✅ When to Use?
Use only when working with legacy code or legacy classes like Vector, Stack, or Hashtable.
For modern Java code, always prefer Iterator, or even ListIterator if bidirectional traversal is needed.
