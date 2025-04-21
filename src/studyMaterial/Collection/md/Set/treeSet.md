## TreeSet in Java
   TreeSet is a sorted implementation of the Set interface in Java that stores elements in a Red-Black Tree
   (a self-balancing binary search tree). It maintains elements in sorted order, either:
-- Natural ordering (using Comparable), or
-- Custom ordering (using a Comparator).

## In order to create a tree set, we must import the java.util.TreeSet package first.

## Key Features of TreeSet

✅ Elements are Sorted – Always maintains ascending order (or custom order).
✅ No Duplicates – Only unique elements allowed.
✅ No null Allowed – Throws NullPointerException if null is inserted.
✅ Slower than HashSet – Operations take O(log n) time due to tree structure.
✅ Not Thread-Safe – Requires external synchronization for concurrent access.

## How TreeSet Works Internally

-- Uses a Red-Black Tree (a type of balanced BST) for storage.
-- Automatically sorts elements upon insertion.
-- Guarantees O(log n) time for add, remove, and contains.
-- Internal Structure
   [D]
  /    \
 [B]   [F]
/  \   /  \
[A] [C][E] [G]
(Elements are stored in a sorted hierarchical structure.)

## Constructors in TreeSet

Constructor	                                Description
TreeSet()	                                Sorts elements in natural order (using Comparable).
TreeSet(Comparator<? super E> comparator)	Sorts elements using a custom comparator.
TreeSet(Collection<? extends E> c)	        Creates a TreeSet from another collection (natural order).
TreeSet(SortedSet<E> s)	                    Creates a TreeSet from a sorted set (preserves order).

## Common Methods

Method	                            Description	                                                    Time Complexity
boolean add(E e)	                Adds an element (ignores duplicates).	                        O(log n)
boolean remove(Object o)	        Removes an element if present.	                                O(log n)
boolean contains(Object o)	        Checks if an element exists.	                                O(log n)
E first()	                        Returns the first (lowest) element.                 	        O(1)
E last()	                        Returns the last (highest) element.	                            O(1)
SortedSet<E> headSet(E toElement)	Returns elements less than toElement.	                        O(1) (view)
SortedSet<E> tailSet(E fromElement)	Returns elements greater than or equal to fromElement.	        O(1) (view)
SortedSet<E> subSet(E from, E to)	Returns elements between from (inclusive) and to (exclusive).	O(1) (view)
int size()	                        Returns the number of elements.	                                O(1)
void clear()	                    Removes all elements.	                                        O(n)

## Example: Basic TreeSet Operations

1. Natural Ordering (Using Comparable)

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
public static void main(String[] args) {
Set<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("John");  // Duplicate → ignored

        System.out.println(names);  // [Alice, Bob, John] (sorted)

        // Get first and last elements
        String first = ((TreeSet<String>) names).first();  // "Alice"
        String last = ((TreeSet<String>) names).last();    // "John"

        // Subset example
        Set<String> subSet = ((TreeSet<String>) names).subSet("A", "C");
        System.out.println(subSet);  // [Alice, Bob] (A ≤ elements < C)
    }
}

2. Custom Ordering (Using Comparator)

// Sort in descending order
Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
numbers.add(5);
numbers.add(2);
numbers.add(8);
System.out.println(numbers);  // [8, 5, 2] (descending)

## Performance Considerations

-- Slower than HashSet (O(log n) vs O(1)) due to tree balancing.
-- No null allowed (unlike HashSet and LinkedHashSet).
-- Memory overhead due to tree node structures.

## When to Use TreeSet?

✔ When elements must be sorted.
✔ When range queries (headSet, tailSet, subSet) are needed.
✔ When first/last element access is required.
✔ When duplicates must be avoided.

## Thread-Safe Alternatives
Since TreeSet is not thread-safe, use:

-- Collections.synchronizedSortedSet()
   SortedSet<String> syncSet = Collections.synchronizedSortedSet(new TreeSet<>());
-- ConcurrentSkipListSet (Thread-safe alternative with O(log n) performance).
   SortedSet<String> concurrentSet = new ConcurrentSkipListSet<>();

## Conclusion

-- TreeSet = Sorted Set with O(log n) operations.
-- Best choice when sorted order is required.
-- No null allowed (unlike HashSet/LinkedHashSet).
-- Slower than HashSet but provides range operations.