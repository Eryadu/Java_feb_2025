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

Implementation	         Ordering              Null Allowed	           Thread-Safe	         Performance
HashSet	                 Unordered	           ✅ Yes	               ❌ No	             O(1) avg-time for add, remove, contains
LinkedHashSet	         Insertion Order	   ✅ Yes	               ❌ No	             O(1) (slightly slower than HashSet due to linked list)
TreeSet	                 Sorted (Natural       ❌ No (throws           ❌ No	             O(log n) for operations
                         or Custom Order)      NullPointerException)	                     (uses Red-Black Tree)
CopyOnWriteArraySet	     Insertion Order	   ✅ Yes	               ✅ Yes (Thread-safe)	 Slower due to copy-on-write
ConcurrentSkipListSet	 Sorted	               ❌ No	               ✅ Yes (Thread-safe)	 O(log n)


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


## Methods for Navigation
Since the TreeSet class implements NavigableSet, it provides various methods to navigate over the elements of the tree set.

1. first() and last() Methods

first() - returns the first element of the set
last() - returns the last element of the set

2. ceiling(), floor(), higher() and lower() Methods

-- higher(element) - Returns the lowest element among those elements that are greater than the specified element.
-- lower(element) - Returns the greatest element among those elements that are less than the specified element.
-- ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. 
   If the element passed exists in a tree set, it returns the element passed as an argument.
-- floor(element) - Returns the greatest element among those elements that are less than the specified element. 
   If the element passed exists in a tree set, it returns the element passed as an argument.

3. pollfirst() and pollLast() Methods

-- pollFirst() - returns and removes the first element from the set
-- pollLast() - returns and removes the last element from the set

4. headSet(), tailSet() and subSet() Methods

## headSet(element, booleanValue)
-- The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).
-- The booleanValue parameter is optional. Its default value is false.
-- If true is passed as a booleanValue, the method returns all the elements before the specified element including the
   specified element.

## tailSet(element, booleanValue)
-- The tailSet() method returns all the elements of a tree set after the specified element (which is passed as a parameter) 
   including the specified element.
-- The booleanValue parameter is optional. Its default value is true.
-- If false is passed as a booleanValue, the method returns all the elements after the specified element without including 
   the specified element.

## subSet(e1, bv1, e2, bv2)
-- The subSet() method returns all the elements between e1 and e2 including e1.
-- The bv1 and bv2 are optional parameters. The default value of bv1 is true, and the default value of bv2 is false.
-- If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.
-- If true is passed as bv2, the method returns all the elements between e1 and e2, including e1.

https://www.programiz.com/java-programming/treeset // TreeSet methods