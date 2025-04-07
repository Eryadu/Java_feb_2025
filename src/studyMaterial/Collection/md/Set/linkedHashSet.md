## LinkedHashSet in Java
   LinkedHashSet is a specialized implementation of the Set interface that combines the hash table storage of HashSet 
   with a linked list to maintain insertion order. It extends HashSet and implements Set, providing predictable iteration 
   order while retaining HashSet's performance benefits.

## Key Features of LinkedHashSet

✅ Maintains Insertion Order – Elements are retrieved in the order they were added.
✅ No Duplicates – Like all Set implementations, it stores only unique elements.
✅ Permits null – Allows one null element.
✅ Performance – Nearly as fast as HashSet for add, remove, and contains (O(1) average time).
✅ Not Thread-Safe – Requires external synchronization for concurrent access.

## How LinkedHashSet Works Internally

-- Backed by LinkedHashMap (instead of HashMap in HashSet).
-- Uses hashing for storage (like HashSet).
-- Maintains a doubly-linked list to preserve insertion order.

## Constructors in LinkedHashSet

Constructor	                                            Description
LinkedHashSet()	                                        Default initial capacity (16) & load factor (0.75).
LinkedHashSet(int initialCapacity)	                    Custom initial capacity.
LinkedHashSet(int initialCapacity, float loadFactor)	Custom initial capacity & load factor.
LinkedHashSet(Collection<? extends E> c)	            Creates a LinkedHashSet from another collection.

## Common Methods

Method	                        Description	                                                Time Complexity
boolean add(E e)	            Adds an element (ignores duplicates).	                    O(1) avg
boolean remove(Object o)	    Removes an element if present.	                            O(1) avg
boolean contains(Object o)	    Checks if an element exists.	                            O(1) avg
int size()	                    Returns the number of elements.                         	O(1)
boolean isEmpty()	            Checks if the set is empty.	                                O(1)
void clear()	                Removes all elements.	                                    O(n)
Iterator<E> iterator()	        Returns an iterator over elements (in insertion order).	    O(1) per element

## Performance Considerations

-- Slightly slower than HashSet due to maintaining the linked list.
-- Memory overhead due to storing additional linked list pointers.
-- Same load factor (0.75) and resizing behavior as HashSet.
 
## Optimal Initial Capacity

// If expecting ~100 elements:
Set<String> set = new LinkedHashSet<>(100);  // Prevents rehashing

## LinkedHashSet vs. Other Sets

Feature	                LinkedHashSet	                        HashSet	            TreeSet
Order	                Insertion Order	                        Unordered	        Sorted
Performance	            O(1) (slightly slower than HashSet) 	O(1)	            O(log n)
Null Allowed	        ✅ Yes	                                ✅ Yes	            ❌ No
Thread-Safe	            ❌ No	                                ❌ No	            ❌ No

## When to Use LinkedHashSet?

✔ When insertion order must be preserved.
✔ When duplicates must be avoided.
✔ When predictable iteration order is needed.
✔ When null values are allowed.


## Thread-Safe Alternatives
Since LinkedHashSet is not thread-safe, use:

-- Collections.synchronizedSet()
   Set<String> syncSet = Collections.synchronizedSet(new LinkedHashSet<>());
-- ConcurrentHashMap.newKeySet() (Java 8+) (but loses insertion order).

## Conclusion
-- LinkedHashSet = HashSet + Insertion Order.
-- Best choice when you need no duplicates + predictable iteration order.
-- Slightly slower than HashSet but faster than TreeSet.