## Internal Working of Set in Java
   Sets in Java are collections that store unique elements. The most common implementations are HashSet, LinkedHashSet, 
   and TreeSet, each with different internal mechanisms.

## HashSet Implementation (Most Common)

## Core Structure:
1. Backed by a HashMap: Uses a HashMap internally where elements are stored as keys
2. Dummy values: All map entries share the same dummy value (PRESENT object)

private transient HashMap<E,Object> map;
private static final Object PRESENT = new Object();

## Key Operations:

1. Add Operation:

public boolean add(E e) {
return map.put(e, PRESENT) == null; // Returns true if new element
}

2. Contains Operation:

public boolean contains(Object o) {
return map.containsKey(o);
}
3. Remove Operation:

public boolean remove(Object o) {
return map.remove(o) == PRESENT;
}

## Storage Mechanism

Java 8+ Hybrid Storage:
-- Uses array + linked list/red-black tree (same as HashMap)
-- Default initial capacity: 16
-- Load factor: 0.75 (when 75% full, capacity doubles)
-- Buckets convert to trees when containing 8+ elements

## Hashing Process:
-- Computes hashCode() of element
-- Applies additional hashing to prevent clustering:

// HashMap's hash() method
static final int hash(Object key) {
int h;
return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
-- Determines bucket index: (capacity - 1) & hash

## TreeSet Implementation

Core Structure:
-- Backed by a TreeMap: Uses Red-Black tree structure
-- Maintains elements in sorted order (natural ordering or via Comparator)

-- Key Characteristics:
Guaranteed O(log n) time for basic operations
Elements must be Comparable or use Comparator
Uses compareTo() instead of equals() for uniqueness

## LinkedHashSet Implementation

Core Structure:
-- Extends HashSet but maintains insertion-order
-- Uses doubly-linked list running through all entries

// Internal structure
HashSet.Node {
E key;
Node next;
Node before, after; // Maintains insertion order
}

Performance:
-- Slightly slower than HashSet due to linked list maintenance
-- Iteration faster than HashSet (follows linked list order)

## Uniqueness Enforcement

All Set implementations enforce uniqueness using:
HashSet/LinkedHashSet:
First checks hashCode()
Then checks equals() if hash collision occurs

## TreeSet:
Uses compareTo() (returns 0 for duplicates)
Must be consistent with equals()
Example: Adding Elements to HashSet
Set<String> names = new HashSet<>();
names.add("Alice");  // hash=12345 → bucket 5
names.add("Bob");    // hash=23456 → bucket 6
names.add("Alice");  // Same hash → bucket 5 → equals() check → rejected

## Performance Characteristics

Operation	       HashSet	    LinkedHashSet	TreeSet
add()	           O(1) avg	    O(1) avg	    O(log n)
contains()	       O(1) avg	    O(1) avg	    O(log n)
next()	           O(h/n)	    O(1)	        O(log n)
Order	           None	        Insertion	    Sorted

## Key Takeaways
-- HashSet is fastest for most operations but unordered
-- LinkedHashSet maintains insertion order with minimal overhead
-- TreeSet provides sorting but with logarithmic time costs
-- All implementations rely on proper hashCode() and equals() methods
-- Java 8+ optimizations prevent performance degradation from hash collisions

## Understanding these internal workings helps in choosing the right Set implementation for specific use cases and 
   performance requirements.