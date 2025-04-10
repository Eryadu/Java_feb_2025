## refer this https://www.programiz.com/java-programming/iterator

## Java Iterator
    The Iterator in Java is an interface that provides a way to traverse through a collection of objects, such as lists
    or sets, one element at a time. It is part of the Java Collections Framework and is found in the java.util package. 
    The Iterator interface is used to access elements of a collection sequentially without exposing the underlying 
    structure of the collection.

## An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an 
   "iterator" because "iterating" is the technical term for looping.
   -- To use an Iterator, you must import it from the java.util package.

## Key Features of Iterator

✅ Universal Traversal – Works with all Java collections (List, Set, Map via keySet(), etc.).
✅ Fail-Fast Behavior – Throws ConcurrentModificationException if the collection is modified while iterating 
   (except via Iterator.remove()).
✅ Forward-Only Access – Can only move forward (next()), not backward.
✅ Safe Element Removal – Only way to safely remove elements during iteration.

## Key Methods
The Iterator interface provides three primary methods:

1. hasNext(): Returns true if the iteration has more elements. It allows checking if there are more elements to iterate over.
   boolean hasNext();

2. next(): Returns the next element in the iteration. It should be called after hasNext() to ensure that there is a next element.
   E next();

3. remove(): Removes the last element returned by the next() method from the underlying collection. This method is 
   optional and may throw UnsupportedOperationException if the collection does not support removal.
   void remove();

Example 1: Basic Usage with List

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

Example 2: Removing Elements


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveExample {
public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if ("Banana".equals(fruit)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}

## Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is 
   changing size at the same time that the code is trying to loop.

## Best Practices

-- Use Iterator.remove() instead of Collection.remove() during iteration.
-- Avoid modifying collections while iterating (except via Iterator.remove()).
-- Prefer for-each for simple traversals (unless removal is needed).

## How Iterator Works Internally

-- Internally, collections maintain a modification counter (modCount).
-- If the collection is modified (e.g., add, remove) while iterating (except via Iterator.remove()), it throws ConcurrentModificationException.

## Fail-Fast Example
   List<String> list = new ArrayList<>(List.of("A", "B", "C"));
   Iterator<String> it = list.iterator();
   while (it.hasNext()) {
   String item = it.next();
    if (item.equals("B")) {
    list.remove("B");  // ❌ Throws ConcurrentModificationException
    }
   }


## Types of Iterators in Java

1. Iterator – Basic forward-only traversal.
2. ListIterator – Bidirectional traversal (hasPrevious(), previous()), supports add(), set().
3. Spliterator (Java 8) – Supports parallel iteration (used in streams).

## ListIterator Example
 
List<String> list = new ArrayList<>(List.of("A", "B", "C"));
ListIterator<String> listIterator = list.listIterator();

while (listIterator.hasNext()) {
System.out.println(listIterator.next());  // A → B → C
}

while (listIterator.hasPrevious()) {
System.out.println(listIterator.previous());  // C → B → A
}