## HashSet in Java
   HashSet is one of the most commonly used implementations of the Set interface in Java. It stores elements using a 
   hash table (backed by a HashMap), providing constant-time performance (O(1)) for basic operations like add, remove,
   and contains.

## Key Features of HashSet

✅ No Duplicates – Only unique elements are stored.
✅ Unordered Collection – Does not maintain insertion order.
✅ Permits null – Allows one null value.
✅ Not Thread-Safe – Requires external synchronization for concurrent access.
✅ Backed by HashMap – Internally uses a HashMap for storage.

## How HashSet Works Internally

-- Uses hashing to store elements.
-- Each element is stored as a key in a HashMap (with a dummy PRESENT object as the value).
-- Hash collisions are handled using linked lists (or balanced trees in Java 8+ for large buckets).

## Constructors in HashSet

Constructor	                                        Description
HashSet()	                                        Default initial capacity (16) & load factor (0.75).
HashSet(int initialCapacity)	                    Custom initial capacity.
HashSet(int initialCapacity, float loadFactor)	    Custom initial capacity & load factor.
HashSet(Collection<? extends E> c)	                Creates a HashSet from another collection.

## Methods inherited
This class inherits methods from the following classes −

-- java.util.AbstractSet
-- java.util.AbstractCollection
-- java.util.Object
-- java.util.Set

## Common Methods

Method	                    Description	                            Time Complexity
boolean add(E e)	        Adds an element (ignores duplicates).	O(1) avg
boolean remove(Object o)	Removes an element if present.	        O(1) avg
boolean contains(Object o)	Checks if an element exists.	        O(1) avg
int size()	                Returns the number of elements.	        O(1)
boolean isEmpty()	        Checks if the set is empty.	            O(1)
void clear()	            Removes all elements.	                O(n)
Iterator<E> iterator()	    Returns an iterator over elements.	    O(1) per element
        
## Performance Considerations

-- Initial Capacity (Default: 16) – If too small, frequent rehashing occurs.
-- Load Factor (Default: 0.75) – When the set is 75% full, it resizes (doubles capacity).

## Optimal Initial Capacity

// If expecting ~100 elements, prevent rehashing:
Set<String> set = new HashSet<>(100);  // Initial capacity = 100

## HashSet vs. Other Sets

Feature	        HashSet	        LinkedHashSet	            TreeSet
Order	        Unordered	    Insertion Order	            Sorted
Performance	      O(1)	        O(1) (slightly slower)  	O(log n)
Null Allowed	 ✅ Yes	        ✅ Yes	                    ❌ No
Thread-Safe	     ❌ No	        ❌ No	                    ❌ No

## When to Use HashSet?

✔ When duplicates must be avoided.
✔ When order doesn’t matter.
✔ When fast insertion, deletion, and lookup are needed.
✔ When null values are allowed.