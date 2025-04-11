## Refer this first https://www.programiz.com/java-programming/collections

## Collection Classes in Java
   Java provides a comprehensive framework of collection classes as part of the Java Collections Framework (JCF).
   These classes are used to store and manipulate groups of objects and are part of the java.util package.

## The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
   Note : Refer java pptx for clear image of all collections

## Main Collection Interfaces

1. Collection - Root interface for all collections
2. List - Ordered collection (can contain duplicates)
3. Set - Collection with no duplicates
4. Queue - Collection designed for holding elements prior to processing
5. Map - Not technically a Collection, but part of JCF (key-value pairs)

## Common Collection Classes

1. List Implementations

-- ArrayList - Resizable array implementation
   List<String> list = new ArrayList<>();

-- LinkedList - Doubly-linked list implementation
   List<String> linked = new LinkedList<>();

-- Vector - Thread-safe but legacy (use ArrayList instead)
-- Stack - LIFO structure (extends Vector)

2. Set Implementations

-- HashSet - Uses hash table for storage
   Set<String> set = new HashSet<>();

-- LinkedHashSet - Maintains insertion order
-- TreeSet - Sorted set (uses Red-Black tree)

3. Queue Implementations

-- PriorityQueue - Priority-based queue
   Queue<String> queue = new PriorityQueue<>();

-- ArrayDeque - Double-ended queue
   Deque<String> deque = new ArrayDeque<>();

4. Map Implementations

-- HashMap - Hash table implementation
   Map<String, Integer> map = new HashMap<>();

-- LinkedHashMap - Maintains insertion order
-- TreeMap - Sorted map (Red-Black tree)
-- Hashtable - Legacy thread-safe implementation (use ConcurrentHashMap instead)

## Key Features

1. Generics - Type safety at compile time
2. Iterators - Uniform way to traverse collections
3. Algorithms - Common operations like sort, search
4. Performance - Different implementations for different needs

Example Usage

import java.util.*;

public class CollectionExample {
public static void main(String[] args) {
// ArrayList example
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

        // HashSet example
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1); // Duplicate, won't be added
        
        // HashMap example
        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("hello", 1);
        wordCount.put("world", 2);
    }
}

## Java collections are highly optimized and provide a consistent API for working with groups of objects. The choice of 
   which collection to use depends on your specific requirements for ordering, sorting, uniqueness, thread-safety, and 
   performance.