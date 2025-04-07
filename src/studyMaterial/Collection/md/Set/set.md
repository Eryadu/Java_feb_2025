## Set Interface in Java
   The Set interface in Java is part of the Java Collections Framework (JCF) and represents a collection that does not 
   allow duplicate elements. It models the mathematical set abstraction and extends the Collection interface.

## The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements 
   are prohibited.

## Key Features of Set

✅ No Duplicate Elements – Ensures uniqueness (only one null element allowed in most implementations).
✅ No Index-Based Access – Unlike List, elements cannot be accessed via indices.
✅ Unordered (Except LinkedHashSet & TreeSet) – Does not guarantee insertion order (unless using LinkedHashSet or TreeSet).
✅ Supports Basic Collection Operations – add(), remove(), contains(), size(), etc.

## Common Implementations of Set

Implementation	         Ordering              Null Allowed	             Thread-Safe	Performance
HashSet	                 Unordered	           ✅ Yes	                  ❌ No	        O(1) avg-time for add, remove, contains
LinkedHashSet	         Insertion Order	   ✅ Yes	                  ❌ No	        O(1) (slightly slower than HashSet due to linked list)
TreeSet	                 Sorted (Natural       ❌ No (throws              ❌ No	        O(log n) for operations
                        or Custom Order)       NullPointerException)	                (uses Red-Black Tree)
CopyOnWriteArraySet	     Insertion Order	   ✅ Yes	                  ✅ Yes (Thread-safe)	Slower due to copy-on-write
ConcurrentSkipListSet	 Sorted	               ❌ No	                  ✅ Yes (Thread-safe)	O(log n)


## When to Use Which Set?

Use Case	                                    Recommended Set
General-purpose,fastest access	                 HashSet
Maintain insertion order	                     LinkedHashSet
Sorted elements (natural/comparator order)	     TreeSet
Thread-safe requirement	                         ConcurrentSkipListSet or CopyOnWriteArraySet

## Example: Different Set Implementations

1. HashSet (Unordered, Fastest)

Set<String> hashSet = new HashSet<>();
hashSet.add("Zebra");
hashSet.add("Apple");
hashSet.add("Banana");
System.out.println(hashSet);  // Output order unpredictable (e.g., [Banana, Apple, Zebra])

2. LinkedHashSet (Maintains Insertion Order)

Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Zebra");
linkedHashSet.add("Apple");
linkedHashSet.add("Banana");
System.out.println(linkedHashSet);  // Output: [Zebra, Apple, Banana] (insertion order)

3. TreeSet (Sorted Order)

Set<String> treeSet = new TreeSet<>();
treeSet.add("Zebra");
treeSet.add("Apple");
treeSet.add("Banana");
System.out.println(treeSet);  // Output: [Apple, Banana, Zebra] (sorted)
