## List Interface in Java
  The List interface is one of the fundamental parts of Java's Collections Framework, representing an ordered collection 
  (also called a sequence). 

## List interface extends Collection interface method as well it has its own method

## Key Characteristics

1. Ordered Collection: Maintains insertion order
2. Index-based Access: Elements can be accessed by their integer index (position)
3. Allows Duplicates: Can contain duplicate elements
4. Allows Null Elements: Can contain null elements (implementation dependent)

## Note : Several of the list methods will throw an UnsupportedOperationException if the collection cannot be modified,
   and a ClassCastException is generated when one object is incompatible with another. 
   -- UnsupportedOperationException: this one is raised when we try to modify the unmodifiable list create with 
      collections.unmodifiable() method


## Core Methods
The List interface extends Collection and adds several important methods:

1. ArrayList:
-- Resizable-array implementation
-- Fast random access
-- Slower insertions/removals in middle

   List<String> arrayList = new ArrayList<>();

2. LinkedList:
-- Doubly-linked list implementation
-- Faster insertions/deletions
-- Slower random access

   List<String> linkedList = new LinkedList<>();

3. Vector:
-- Legacy synchronized implementation
-- Generally replaced by ArrayList

4. Stack:
-- LIFO (Last-In-First-Out) structure
-- Extends Vector