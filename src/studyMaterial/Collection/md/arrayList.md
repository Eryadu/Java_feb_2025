
## ArrayList is one of Java's most commonly used collection classes, providing a resizable array implementation of the 
   List interface.

1. Key Features

✔ Dynamic resizing - Grows automatically when full
✔ Fast random access - O(1) time for get(index) and set(index)
✔ Ordered collection - Maintains insertion order
✔ Permits duplicates and nulls
✔ Not thread-safe (Use Collections.synchronizedList() for thread safety)

2. Internal Implementation

Backed by an Object[] array
Default initial capacity: 10
Grows by 50% when full (newCapacity = oldCapacity + (oldCapacity >> 1))
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
add(E e)	        Appends element	            Amortized O(1)
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
