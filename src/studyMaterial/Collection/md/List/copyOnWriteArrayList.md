## What is CopyOnWriteArrayList?
-- It's a thread-safe version of ArrayList.
-- Part of the java.util.concurrent package.
-- Works well in multi-threaded environments where:
-- Reads happen frequently ✅
-- Writes happen occasionally 🔁

🔁 How it Works (Internally)?
-- Whenever you modify the list (like add(), remove()):
-- It creates a brand new copy of the entire array.
-- So the original array stays unchanged for readers.

📌 That’s why:
-- Reads are super fast ✅
-- Writes are expensive ❌ (new copy every time)

📦 Basic Features

Property	                    Value
Thread-safe	                    ✅ Yes
Fail-safe Iterator	            ✅ Yes (no ConcurrentModificationException)
Reads	                        Fast
Writes	                        Slower (creates new copy)
Nulls allowed?              	✅ Yes
Order	                        Maintains insertion order
Implements	                    List, RandomAccess, etc.
Introduced in	                Java 5 (java.util.concurrent)

🛠️ Constructor Examples
-- CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
-- CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>(existingList);

✅ Example Code
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
public static void main(String[] args) {
CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
list.add("Java");
list.add("Python");
list.add("C++");

        // Thread-safe iteration
        for (String item : list) {
            System.out.println(item);
            list.add("New"); // No error! Copy is made internally
        }

        System.out.println("Final List: " + list);
    }
}
🛑 With a normal ArrayList, this would throw ConcurrentModificationException.

⚔️ ArrayList vs CopyOnWriteArrayList


Feature                 	ArrayList	    CopyOnWriteArrayList
Thread-safe	                ❌ No	        ✅ Yes
Fail-fast	                ✅ Yes	        ❌ No (fail-safe)
Read performance	        🚀 Fast	        🚀 Very fast
Write performance       	⚡ Fast	        🐢 Slower (copies array)
Use when...	Few threads or write-heavy	Many threads and read-heavy

✅ Best Use Case:
When your app reads data often, but rarely updates it — like caches, config data, or live dashboards.


-------------------------------------------------------------------------------------------------------------
-- "Copy on write" means that whenever a write operation like adding or removing an element, instead of directly modifying 
   the existing list, a new copy of the list is created, and the modification is applied to that copy.
-- This ensures that other threads reading the list while it's being modifying are unaffected
-- Read operation : Fast and direct, since they happen on a stable list without interference from modification.
-- Write operation : A new copy of the list is created for every modification, the reference to the list is then updated
   so that subsequent reads use this new list. For every Update operation at certain point both will Synchronized automatically
   which is take care by JVM
-- While one thread iterating COWAL, the other threads are allowed to modify and we won't get concurrentModificationException
   this is fail-safe iterator.
-- Iterator of ArrayList can perform remove operation but iterator of COWAL can't perform remove operation. Other-wise we will 
   get RuntimeException saying UnsupportedOperationException


## Methods :
-- booleanaddIfAbsentList() -- Element will be added if and only if List doesn't contain the elements.
-- intaddAllAbsent(Collection c)-- the element of collections will be added to the list if elements are absent and returns Number
  of elements added

## Internal working :
-- CopyOnWriteArrayList uses a Reentrant lock.
-- when adding an element:
-- Acquire the lock to ensure exclusive access.
-- Create a new Array, one element larger than the original.
-- Copy elements from the original array to the new array.
-- Add the new element to the end of the new array.
-- update the reference to the new array and release the lock.
## refer pictures for more detail 

## What is ReentrantLock?
   ReentrantLock is a class in the java.util.concurrent.locks package that provides explicit locking for threads,
   just like synchronized blocks — but with more control.

🧠 Simple Meaning:
   "Reentrant" means a thread can acquire the same lock multiple times without getting stuck (i.e., without deadlocking itself).

🛠️ Where is it used?
   It’s used when you need:
-- Manual control over locking & unlocking
-- More flexible locking than synchronized
-- Try-locking with timeouts
-- Fairness policy (first-come-first-serve)


## Scenario:
-- let say we have created a COWAL that has five elements
-- So the size of the back-array is five. There is thread, thread1, that wants to iterate our list. this thread will create
   an iterator.
-- The returned iterator provides a snapshot of the state of the list when the iterator was constructed. the thread1 is iterating 
   the array, and in the meantime, another thread, thread2 comes to add an element to the list. If this thread adds in the
   back-array, then concurrentModificationException will be thrown.
-- To avoid this, thread2 will create a copy of the back-array, and then it will add the new element to this copied array.
   the thread1 will complete its iteration, but it will not be able to see the newly added element.
-- Now, if a new thread, thread3, wants to iterate the list, then it will again create the iterator. And this time, it
   will get the snapshot of the back-array, which has six elements