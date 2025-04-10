## refer this link https://www.programiz.com/java-programming/set

## ArrayList is one of Java's most commonly used collection classes, or it is a data Structure, providing a resizable  
   array implementation of the List interface.
##  ArrayList is the most widely used implementation of the List interface. Some of the salient features of an ArrayList are:
   1. Elements are stored in the order of insertion.
   2. It allows the storage of duplicate elements.
   3.  ArrayList also supports null elements.

1. Key Features

✔ Dynamic resizing   - Grows automatically when full
✔ Fast random access - O(1) time for get(index) and set(index)
✔ Ordered collection - Maintains insertion order
✔ Permits duplicates and nulls
✔ Not thread-safe (Use Collections.synchronizedList() for thread safety)

2. Internal Implementation

## An ArrayList stores data in a resizable array. Before Java 8, when an ArrayList was created, an array of default size
   10 was created internally. Now, when an ArrayList is created, an array of size zero is created. Only when the first 
   element is inserted does the array size change to ten. This is called lazy initialization, and it saves a lot of memory.
   Before adding an element in ArrayList, its capacity is checked. If the internal array is full, then a new array of size
   (n + n/2 +1)  is created (e.g., if the capacity is ten, then a new array of size 16 will be created). The elements from
   the old array will be copied to the new array. This increases the capacity of an ArrayList, which is a time-consuming process.

Backed by an Object[] array
Default initial capacity: 10
Grows by 50% when full (newCapacity = oldCapacity + (oldCapacity >> 1)) using formula n+n/2+1
// Simplified internal array structure
transient Object[] elementData; // Where elements are stored
private int size; // Current number of elements

3. Constructors

ArrayList<String> list1 = new ArrayList<>(); // Capacity=10
ArrayList<String> list2 = new ArrayList<>(50); // Custom capacity
ArrayList<String> list3 = new ArrayList<>(existingCollection); // From another collection

4. Common Operations

a. Adding Elements

list.add("Apple"); // Append to end
list.add(0, "Banana"); // Insert at index
list.addAll(otherList); // Add all from another collection

b. Accessing Elements

String fruit = list.get(0); // Get by index
list.set(1, "Orange"); // Replace at index

c. Removing Elements

list.remove(0); // By index
list.remove("Apple"); // By object
list.removeIf(fruit -> fruit.startsWith("A")); // Conditionally
list.clear(); // Remove all

d. Searching

int index = list.indexOf("Apple"); // First occurrence
boolean exists = list.contains("Mango"); // Check existence

e. Iteration

// For loop
for (int i = 0; i < list.size(); i++) {
System.out.println(list.get(i));
}

// Enhanced for loop
for (String fruit : list) {
System.out.println(fruit);
}

// Iterator
Iterator<String> it = list.iterator();
while (it.hasNext()) {
System.out.println(it.next());
}

// forEach (Java 8+)
list.forEach(System.out::println);

5. Important Methods
Method	            Description	                Time Complexity
add(E e)	        Appends element	            Amortized O(1) // E is generic type i.e. Integer, String
add(index, E e)	    Inserts at index	            O(n)
get(index)	        Returns element	                O(1)
set(index, E e) 	Replaces element	            O(1)
remove(index)	    Removes by index	            O(n)
remove(Object)	    Removes by object	            O(n)
contains(Object)	Checks existence	            O(n)
size()	            Returns count	                O(1)

6. Performance Considerations

Best for frequent access by index (get(), set())
Worst for frequent insertions/removals at beginning/middle
Alternatives:
LinkedList for frequent insertions/deletions
CopyOnWriteArrayList for thread safety

7. Conversion Methods

// ArrayList to Array
String[] array = list.toArray(new String[0]);

// Array to ArrayList
## Note : As Array is not a collection so, to convert Array to Arraylist, first convert Array to List (Collections), then 
   pass that List to anywhere for conversion. Ex. Between Collections
List<String> list = Arrays.asList(array); // Fixed-size
List<String> realList = new ArrayList<>(Arrays.asList(array)); // Mutable

// Between Collections
Set<String> set = new HashSet<>(list); // Remove duplicates
List<String> newList = new ArrayList<>(set); // Back to list

8. Java 8+ Features

// Remove conditionally
list.removeIf(s -> s.length() > 5);

// Replace all elements
list.replaceAll(String::toUpperCase);

// Stream operations
List<String> filtered = list.stream()
.filter(s -> s.startsWith("A"))
.collect(Collectors.toList());

9. Thread Safety

ArrayList is not thread-safe. For concurrent access:
// Synchronized wrapper
List<String> syncList = Collections.synchronizedList(new ArrayList<>());

// CopyOnWriteArrayList (better for read-heavy cases)
List<String> safeList = new CopyOnWriteArrayList<>();

10. Best Practices

Specify initial capacity if size is known

new ArrayList<>(expectedSize);
Use isEmpty() instead of size() == 0
Prefer forEach over traditional loops (Java 8+)
Avoid frequent mid-list modifications (use LinkedList instead)

11. Common Pitfalls

❌ Concurrent modification during iteration (throws ConcurrentModificationException)
❌ Assuming thread safety (requires explicit synchronization)
❌ Using raw types (always use generics)

12. Real-World Example

// Shopping cart using ArrayList
List<Product> cart = new ArrayList<>();

// Add products
cart.add(new Product("iPhone", 999.99));
cart.add(new Product("Case", 19.99));

// Calculate total
double total = cart.stream()
.mapToDouble(Product::getPrice)
.sum();

// Remove expensive items
cart.removeIf(p -> p.getPrice() > 500);

// Checkout
if (!cart.isEmpty()) {
checkout(cart);
}

13. When to Use ArrayList?

✔ Need fast random access
✔ Mostly add/remove at end
✔ Working with known or small datasets
✔ Don't need thread safety

For large datasets with frequent modifications, consider:
-- LinkedList for frequent insertions/deletions
-- Vector for thread safety (but slower)
-- CopyOnWriteArrayList for concurrent read-heavy cases

## ArrayList remains the default choice for most Java developers when a resizable array is needed.

-- How the ArrayList works
   The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.
   If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

-- How the LinkedList works
   The LinkedList stores its items in "containers." The list has a link to the first container and each container has a
   link to the next container in the list. To add an element to the list, the element is placed into a new container and 
   that container is linked to one of the other containers in the list.

## Java Sort a List
   ArrayList and LinkedList, which are found in the java.util package. Another useful class in the java.util package is 
   the Collections class, which include the sort() method for sorting lists alphabetically or numerically.
   i.e. Collections.sort(ArrayList/LinkedList)