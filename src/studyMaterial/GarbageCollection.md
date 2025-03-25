The lifecycle of a Java object is managed by the JVM. Once an object is created by the programmer,
we need not worry about the rest of its lifecycle. The JVM will automatically find those objects that are not 
in use anymore and reclaim their memory from the heap.

## Garbage Collection?

Garbage collection is a major operation that JVM does and tuning it for our needs can give massive performance 
boosts to our application. There are a variety of garbage collection algorithms that are provided by modern JVMs. 
We need to be aware of our application's needs to decide on which algorithm to use.

You cannot deallocate an object programmatically in Java as you can do in non-GC languages like C and C++. 
Therefore, you cannot have dangling references in Java. 
However, you may have null references (references that refer to an area of memory where the JVM won't ever store o
bjects). Whenever a null reference is used, the JVM throws a NullPointerException.

Note that while it is rare to find memory leaks in Java programs thanks to the GC, they do happen. 
We will create a memory leak at the end of this chapter.

## Types of Garbage Collectors

The following GCs are used in modern JVMs

Serial collector
Throughput collector
CMS collector
G1 collector

Each of the above algorithms does the same task - finding objects that are no longer in use and reclaiming the 
memory that they occupy in the heap. One of the naïve approaches to this would be to count the number of references 
that each object has and free it up as soon as the number of references turn 0 (this is also known as reference 
counting). Why is this naïve? Consider a circular linked list. Each of its nodes will have a reference to it, 
but the entire object is not being referenced from anywhere, and should be freed, ideally.

## Memory Coalescing

The JVM not only frees the memory, but also coalesces small memory chucks into bigger ones it. 
This is done to prevent memory fragmentation.

On a simple note, a typical GC algorithm does the following activities −

Finding unused objects
Freeing the memory that they occupy in the heap
Coalescing the fragments

## String Intern
   When you create a new string literal from the String class, the JVM will first check if the string already exists 
   in the string pool. If it does, the JVM will return a reference to the existing string object, rather than creating 
   a new object. This is known as string interning. 

## String.intern() Method
   String literals are automatically interned, which means that they are stored in the string pool. However, you can also 
   intern strings manually using the intern() method of the String class. This is useful if you want to ensure that a 
   particular string is stored in the string pool and can be shared by multiple variables or objects.
   
   i.e. String s6 = new String("The Lord of the Rings").intern();
   
## Benefits of the String Pool
1. Improved performance: Because the JVM can return a reference to an existing string object rather than creating a 
   new one, string operations are faster when using the string pool.
2. Memory conservation: The string pool helps to conserve memory by avoiding the creation of unnecessary string objects.
3. Shared strings: The string pool allows you to share strings between different variables and objects, which can be 
   useful for reducing the memory footprint of your program.
   
## Downside of String Pool
   It can lead to decreased performance. Retrieving a string from the pool requires a search through all of the strings
   in the pool, which can be slower than simply creating a new string object. This is especially true if the program 
   creates and discards a large number of strings, as the string pool will need to be searched each time a string is used.
   
## Some Notes to Remember
-- String pool is an example of the Flyweight Design Pattern.
-- All literal strings and string-valued constant expressions are interned.
   
## In-term of garbage collector Enhancement in java 8 or java 11?
-- Before Java 7, the JVM placed the Java String Pool in the PermGen space, which has a fixed size — it can’t be expanded 
   at runtime and is not eligible for garbage collection.
-- The risk of interning Strings in the PermGen (instead of the Heap) is that we can get an OutOfMemory error from the JVM 
   if we intern too many Strings.
-- From Java 7 onwards, the Java String Pool is stored in the Heap space, which is garbage collected by the JVM. 
   The advantage of this approach is the reduced risk of OutOfMemory error because unreferenced Strings will be removed 
   from the pool, thereby releasing memory.
