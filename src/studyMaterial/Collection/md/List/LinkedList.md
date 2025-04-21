
## LinkedList is a fundamental Java collection /or data Structure that implements both the List and Deque interfaces, providing a 
   doubly-linked list data structure. Unlike ArrayList, LinkedList excels at frequent insertions/deletions but has slower
   random access.
## The underlying data structure is Double Linked List
-- Insertion order is preserved.
-- Duplicates are allowed.
-- Heterogeneous Objects are allowed.
-- Null insertion is possible
-- Linked list implements Serializable abd Clonable interfaces but not RandomAccess interface
-- Linked list is the best choice if our frequent operation is insertion or deletion in the middle.
-- LinkedList is the worst choice if our frequent operation is retrieval operation
-- Usually we can use LinkedList to implement stacks and Queues to provide support for this requirement linked list 
   class define following specific methods:  void addFirst();
                                             void addLast();
                                             Object getFirst();
                                             Object getLast();
                                             Object removeFirst();
                                             void removeLast();


## Difference ArrayList and Linked List
            ArrayList                                          LinkedList
-- It is the best choice if our frequent operation    It is the best choice if our frequent op is insertion and Deletion.
   is retrieval
-- ArrayList is worst case for frequent op are        LinkedList  is the worst choice if our frequent operation is retrival
   insertion and Deletion.
-- Underlying DS is resizable or growable Array       DS is double linked list
-- Implement Random Access interface                  Doesn't support RandomAccess interface.

1. Key Features

✔ Doubly-linked nodes (each element points to next + previous)
✔ Efficient insertions/deletions (O(1) at head/tail)
✔ Implements both List and Deque (can function as stack/queue)
✔ No random access (sequential traversal required)
✔ No capacity restrictions (grows dynamically)

2. Internal Structure

class Node<E> {
E item;
Node<E> next;
Node<E> prev;
// Constructor...
}
First and last pointers maintain list ends
Each node stores:
Data (item)
Reference to next node (next)
Reference to previous node (prev)

3. Constructors

LinkedList<String> list1 = new LinkedList<>(); // Empty list
LinkedList<String> list2 = new LinkedList<>(existingCollection); // From another collection

4. Common Operations

a. Adding Elements

list.add("A"); // Append to end (O(1))
list.addFirst("B"); // Insert at head (O(1))
list.addLast("C"); // Same as add() (O(1))
list.add(1, "D"); // Insert at index (O(n))
list.addAll(otherList); // Add collection (O(n))

b. Removing Elements

list.remove(); // Remove head (O(1))
list.remove("A"); // By object (O(n))
list.remove(2); // By index (O(n))
list.removeFirst(); // O(1)
list.removeLast(); // O(1)
list.clear(); // Remove all

c. Accessing Elements

String first = list.getFirst(); // O(1)
String last = list.getLast(); // O(1)
String item = list.get(2); // By index (O(n))

d. Searching

int index = list.indexOf("A"); // O(n)
boolean exists = list.contains("B"); // O(n)

e. Queue Operations (Deque Interface)

list.offer("X"); // Add to end (O(1))
list.poll(); // Remove head (O(1))
list.peek(); // View head (O(1))

5. Performance Comparison

Operation	        LinkedList	      ArrayList
get(index)	            O(n)	       O(1)
add(element)	        O(1)	       O(1) amortized
add(index, element)	    O(n)	       O(n)
remove(index)	        O(n)	       O(n)
remove(element)	        O(n)	       O(n)
insert at head	        O(1)	       O(n)

6. When to Use LinkedList?

✔ Frequent insertions/deletions at beginning/middle
✔ Implementing stacks/queues/deques
✔ No need for random access by index
✔ Memory efficiency for large, changing collections

7. Memory Overhead

Each element requires 3 references (item, next, prev)
~3x more memory per element than ArrayList
No unused allocated space (unlike ArrayList's capacity)

8. Iteration Methods

// Standard for-loop (slow - O(n²))
for (int i = 0; i < list.size(); i++) {
System.out.println(list.get(i));
}

// Enhanced for-loop (fast - O(n))
for (String item : list) {
System.out.println(item);
}

// Iterator (fast - O(n))
Iterator<String> it = list.iterator();
while (it.hasNext()) {
System.out.println(it.next());
}

// forEach (Java 8+)
list.forEach(System.out::println);

9. Java 8+ Features

// Remove conditionally
list.removeIf(s -> s.length() > 5);

// Stream operations
List<String> filtered = list.stream()
.filter(s -> s.startsWith("A"))
.collect(Collectors.toList());

10. Real-World Use Cases

a. Browser History

LinkedList<String> history = new LinkedList<>();

// Navigation
history.add("google.com");
history.add("stackoverflow.com");
history.addLast("github.com");

// Back button functionality
String previous = history.removeLast();

b. Music Playlist

LinkedList<Song> playlist = new LinkedList<>();

// Add songs
playlist.add(new Song("Bohemian Rhapsody"));
playlist.addFirst(new Song("Sweet Child O'Mine"));

// Skip to next
Song current = playlist.removeFirst();

c. Undo/Redo Functionality

LinkedList<Action> undoStack = new LinkedList<>();
LinkedList<Action> redoStack = new LinkedList<>();

// User performs action
undoStack.push(new Action("Typed 'Hello'"));

// Undo
Action undone = undoStack.pop();
redoStack.push(undone);

11. Thread Safety
Like ArrayList, LinkedList is not thread-safe. For concurrent access:

// Synchronized wrapper
List<String> syncList = Collections.synchronizedList(new LinkedList<>());

// ConcurrentLinkedDeque (alternative)
Deque<String> safeDeque = new ConcurrentLinkedDeque<>();

12. Best Practices

Prefer iterators over index-based access
Use Deque methods (addFirst(), removeLast()) for stack/queue behavior
Avoid get(index) in loops (causes O(n²) performance)
Consider memory overhead (3x per element vs ArrayList)

13. Comparison with ArrayList

Criteria	        LinkedList	                         ArrayList
Access by index	    Slow (O(n))	                         Fast (O(1))
Insert at end	    Fast (O(1))	                         Fast (O(1) amortized)
Insert at start	    Fast (O(1))	                         Slow (O(n))
Memory usage	    Higher (3 references per element)	 Lower (contiguous array)
Use cases	        Frequent modifications	             Random access

14. Advanced Usage

a. Custom LinkedList Implementation

class Node<E> {
E data;
Node<E> next;
Node<E> prev;
// Constructor...
}

class MyLinkedList<E> {
private Node<E> head;
private Node<E> tail;
private int size;

    public void addFirst(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = head;
        size++;
    }
    // Other methods...
}

b. Combining with Collections

// Convert to synchronized list
List<String> syncList = Collections.synchronizedList(new LinkedList<>());

// Create immutable copy
List<String> immutable = List.copyOf(linkedList);

## LinkedList remains the optimal choice when you need frequent modifications at both ends of the collection or when 
   implementing queue/stack functionality. For most random-access scenarios, ArrayList is preferable.