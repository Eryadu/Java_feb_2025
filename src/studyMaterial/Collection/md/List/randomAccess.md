## RandomAccess is a marker interface in Java, defined in the java.util package. It is used to indicate that a List 
   implementation supports fast (generally constant time) random access to elements using the get(int index) method.

🔹 Key Points

Feature	                Description
Package	                java.util
Type	                Marker Interface (no methods)
Implemented By	        ArrayList, Vector, CopyOnWriteArrayList
Not Implemented By	    LinkedList
Purpose	                Optimization hint for algorithms
Introduced in	        Java 1.4

🔹 Why It Matters
Algorithms (like binary search) or frameworks can check whether a list implements RandomAccess to choose the most 
efficient algorithm. For example:

if (list instanceof RandomAccess) {
// use index-based iteration
} else {
// use iterator-based loop
}
🔹 Example
import java.util.*;

public class RandomAccessCheck {
public static void main(String[] args) {
List<String> arrayList = new ArrayList<>();
List<String> linkedList = new LinkedList<>();

        System.out.println("ArrayList is RandomAccess: " + (arrayList instanceof RandomAccess));
        System.out.println("LinkedList is RandomAccess: " + (linkedList instanceof RandomAccess));
    }
}
Output:

ArrayList is RandomAccess: true
LinkedList is RandomAccess: false

🧠 Rule of Thumb

List Type	                            Use When...
RandomAccess (e.g., ArrayList)	        You need fast element access via index
Not RandomAccess (e.g., LinkedList)	    You frequently insert/delete elements in the middle
