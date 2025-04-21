## The Stack class is a legacy collection that represents a Last-In-First-Out (LIFO) data structure. It extends Vector,
   which means it inherits synchronization and dynamic resizing.

## It is a child class of vector
-- specially designed class for Last in First out order(LIFO)
-- Stack s= new Stack();

🔹 Key Characteristics

Feature	        Description
Package	        java.util
Extends	        Vector
Type	        Generic class: Stack<E>
Thread-safe 	✅ Yes (inherited from Vector)
Ordering	    LIFO (Last In, First Out)
Duplicates	    ✅ Allowed
Nulls	        ✅ Allowed
Introduced	    Java 1.0
Use now?	    ❌ Not recommended (use Deque instead)

🔹 Stack Methods

Method	            Description
push(E item)	    Adds an item to the top of the stack
pop()	            Removes and returns top item
peek()	            Returns top item without removing
empty()	            Returns true if the stack is empty
search(Object o)	Returns 1-based position or -1 // if the object is available it returns its offset from top of stack
                                                    // if no object then returns -1.


Example: 
Stack S = new Stack();
s.push("A");
s.push("B");
s.push("C");
System.out.println(s); //[A,B,C]
System.out.println(s.search ("A")); // [3] cause it search from top
System.out.println(s.search ("Z")); // -1

🔹 Example
import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Top: " + stack.peek()); // C++
        System.out.println("Popped: " + stack.pop()); // C++
        System.out.println("Is empty? " + stack.empty()); // false
    }
}

🆚 Stack vs Deque

Feature	            Stack	                    Deque (via ArrayDeque)
Thread-safe     	✅ Yes (inherited)	        ❌ No (unless externally synced)
Performance	        ❌ Slower (synchronized)	✅ Faster (not synchronized)
Preferred?	        ❌ Deprecated-style	        ✅ Modern replacement

Use Deque if you're not dealing with concurrency and want better performance:

Deque<String> stack = new ArrayDeque<>();
stack.push("item");
stack.pop();
