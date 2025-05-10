In Java 8, the **sorted()** method in the Stream API is used to sort the elements of a stream. It returns a new stream 
with the elements sorted in natural order or based on a custom comparator.

🧱 Syntax:
1. Natural Order (elements must implement Comparable):
stream.sorted()
2. Custom Comparator:
stream.sorted(Comparator)

🔁 Important Notes:
sorted() is intermediate, so the stream remains lazy until a terminal operation (like collect() or forEach()).
Sorting is stable (maintains relative order of equal elements).

⚠️ 2. Handling Null Values

Sorting streams with null values can throw a NullPointerException unless handled explicitly.

✅ Example: Null-safe Sorting (nulls first)
List<String> names = Arrays.asList("Charlie", null, "Alice", "Bob");

List<String> sortedWithNulls = names.stream()
.sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
.collect(Collectors.toList()); // Output: [null, Alice, Bob, Charlie]

✅ Nulls Last Example:
List<String> sortedNullsLast = names.stream()
.sorted(Comparator.nullsLast(Comparator.naturalOrder()))
.collect(Collectors.toList());
// Output: [Alice, Bob, Charlie, null]

🔧 Internals of Stream.sorted()
When you call stream.sorted():

-- Stream stays lazy — no sorting happens yet.
-- When a terminal operation (like collect() or forEach()) is triggered:
-- Java collects all elements into a buffered array (since sorting requires full knowledge of all elements).
-- Java uses Arrays.sort() under the hood — which:
   Uses Dual-Pivot Quicksort for primitives
   Uses TimSort for objects (like Strings or custom types)

⚠️ Performance Consideration
Because it buffers all elements:

sorted() is not suitable for infinite streams
Can consume a lot of memory for very large streams
• Internally, the stream collects all elements, sorts them (using an algorithm like TimSort, similar to Arrays.sort()), 
  and then processes the sorted stream.
•	Because sorting requires all elements, sorted() is a stateful operation and not suitable for infinite streams.

