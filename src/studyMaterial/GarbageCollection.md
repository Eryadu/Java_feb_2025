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




