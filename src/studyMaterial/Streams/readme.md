## Streams are a powerful feature introduced in Java 8 that allow you to process collections of data in a functional 
   and declarative way. 
   ## Steam never ever modify original collections.
   -- Stream is an Interface.
## What is a Stream?
   A Stream is a sequence of elements that supports aggregate operations such as filter, map, reduce, collect, etc. 
   It's not a data structure; instead, it conveys elements from a data source such as a collection, array, or I/O channel.

## Key Features of Java Streams
-- Functional-style operations: You can use lambda expressions to express complex logic more concisely.
-- No storage: A stream doesn't store data; it pulls from a source.
-- Laziness: Intermediate operations are lazy, i.e., computation is only done when a terminal operation is invoked.
-- Parallelism: You can easily process data in parallel using parallelStream().

## Stream Workflow
-- Source: A data source (like a List, Set, or array).
-- Intermediate Operations: Transformations (map, filter, etc.).
-- Terminal Operation: Produces a result (collect, forEach, reduce, etc.).

## Common Stream Operations
import java.util.*;
import java.util.stream.*;

public class StreamExample {
public static void main(String[] args) {
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example: Filter names that start with 'A' and convert to uppercase
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))       // Intermediate
            .map(String::toUpperCase)                   // Intermediate
            .collect(Collectors.toList());              // Terminal

        System.out.println(filteredNames); // Output: [ALICE]
    }
}

## Types of Stream Operations
-- Intermediate (lazy): map, filter, sorted, distinct, limit, peek
-- Terminal (eager): collect, forEach, reduce, count, anyMatch, allMatch, noneMatch

1. Intermediate - Which return streams object i.e. filter().filter()...
   we can extend further because it returned stream objects. filter() return stream which uses in other filter() method.
   we can extend pipeline, or chain of methods
2. Terminator - doesn't return any stream object
   i.e. filter(n -> n % 11 == 0).collect(Collectors.toList();
   it doesn't return any stream object further
   we can't extend pipeline

------------------------------------------------------------------------------------------------------------
## refer to book
## A stream is a sequence of data elements supporting sequential and parallel aggregate operations. Computing the
   sum of all elements in a stream of integers, mapping all names in list to their lengths, etc. are examples of aggregate
   operations on streams.
## So, how do streams differ from collections? Both are abstractions for a collection of data elements. Collections focus
   on storage of data elements for efficient access whereas streams focus on aggregate computations on data elements from
   a data source that is typically, but not necessarily, collections.

-- Streams have no storage.
-- Streams can represent a sequence of infinite elements.
-- The design of streams is based on internal iteration.
-- Streams are designed to be processed in parallel with no additional work from the developers.
-- Streams are designed to support functional programming. 
-- Streams support lazy operations.
-- Streams can be ordered or unordered.
-- Streams cannot be reused.

## Imperative vs. Functional
Collections support imperative programming whereas streams support declarative programming. This is an offshoot
of collections supporting external iteration whereas streams support internal iteration. When you use collections,
you need to know “what” you want and “how” to get it; this is the feature of imperative programming. When you
use streams, you specify only “what” you want in terms of stream operations; the “how” part is taken care by the
Streams API. The Streams API supports the functional programming. Operations on a stream produce a result without
modifying the data source. Like in the functional programming, when you use streams, you specify “what” operations
you want to perform on its elements using the built-in methods provided by the Streams API, typically by passing a
lambda expressions to those methods, customizing the behavior of those operations.

## Stream Operations
A stream supports two types of operations:
1. Intermediate operations
2. Terminal operations
-- Intermediate operations are also known as lazy operations. Terminal operations are also known as eager
   operations. Operations are known as lazy and eager based on the way they pull the data elements from the data
   source. A lazy operation on a stream does not process the elements of the stream until another eager operation is
   called on the stream.
-- Streams connect though a chain of operations forming a stream pipeline. A stream is inherently lazy until you
   call a terminal operation on it.
## Streams Are Not Reusable
 Unlike collections, streams are not reusable. They are one-shot objects. A stream cannot be reused after calling a
 terminal operation on it. If you need to perform a computation on the same elements from the same data source
 again, you must recreate the stream pipeline. A stream implementation may throw an IllegalStateException if it
 detects that the stream is being reused.
 
## If you want to create a stream of primitive values from an array of primitive type, you need to use the 
Arrays.stream() method.  
int[] arr = {1,2,3,4,5,6};
int sum1 = Arrays.stream(arr)
         .filter(n -> n %2 == 1)
         .map(n -> n * n)
         .reduce(0, Integer::sum);

## Flattering Method()
Suppose that you have a stream of three numbers: 1, 2, and 3. You want to produce a stream that contains the numbers 
and the square of the numbers. You want the output stream to contain 1, 1, 2, 4, 3, and 9. The following is the first, 
incorrect attempt to achieve this:
    Stream.of(1, 2, 3)
    .map(n -> Stream.of(n, n * n))
    .forEach(System.out::println);

java.util.stream.ReferencePipeline$Head@372f7a8d
java.util.stream.ReferencePipeline$Head@2f92e0f4
java.util.stream.ReferencePipeline$Head@28a418fc

Are you surprised by the output? You do see numbers in the output. The input stream to the map() method
contains three integers: 1, 2, and 3. The map() method produces one element for each element in the input stream.
In this case, the map() method produces a Stream<Integer> for each integer in the input stream. It produces three
Stream<Integer>s. The first stream contains 1 and 1; the second one contains 2 and 4; the third one contains 3 and 9.
The forEach() method receives the Stream<Integer> object as its argument and prints the string returned from its
toString() method. You can call the forEach() on a stream, so let’s nest its call to print the elements of the stream of
streams, like so:
    Stream.of(1, 2, 3)
    .map(n -> Stream.of(n, n * n))
    .forEach(e -> e.forEach(System.out::println));
1
1
2
4
3
9

You were able to print the numbers and their squares. But you have not achieved the goal of getting those
numbers in a Stream<Integer>. They are still in the Stream<Stream<Integer>>. The solution is to use the flatMap()
method instead of the map() method. The following snippet of code does this:

    Stream.of(1, 2, 3)
    .flatMap(n -> Stream.of(n, n * n))
    .forEach(System.out::println);
1
1
2
4
3
9

## Tip : the container to collect the data using the collect() method need not be a Collection. It can be any mutable
object that can accumulate results, such as a StringBuilder.