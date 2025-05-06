## how reduce() work in java 8?
  In Java 8, the reduce() method is a terminal operation in the Stream API that combines elements of a stream into a
  single result. It's part of the java.util.stream.Stream interface and is often used for aggregation (e.g., summing 
  numbers, concatenating strings).

## There are three main variants of reduce():

1. T reduce(T identity, BinaryOperator<T> accumulator)
   Identity: The initial value.
   Accumulator: A function that combines two values.
   ✅ Example: Sum of integers

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b); // identity = 0
    System.out.println(sum); // Output: 15

2. Optional<T> reduce(BinaryOperator<T> accumulator)
   No identity value, so result is wrapped in an Optional to handle the empty stream case.
   ✅ Example: Maximum value

   List<Integer> numbers = Arrays.asList(3, 5, 2, 8);
   Optional<Integer> max = numbers.stream()
   .reduce((a, b) -> a > b ? a : b);
   max.ifPresent(System.out::println); // Output: 8

3. <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
    Used with parallel streams to ensure correct combining of intermediate results.
    Useful for mutable reductions (like collecting into a list or map).
    ✅ Example: Sum lengths of strings

    List<String> words = Arrays.asList("apple", "banana", "cherry");
    int totalLength = words.parallelStream()
    .reduce(0,
     (sum, word) -> sum + word.length(), // accumulator
    Integer::sum);                      // combiner
    System.out.println(totalLength); // Output: 18

## Summary
-- reduce() helps reduce a stream to a single value.
-- Use it when you want to combine stream elements in a custom way.
-- For most common aggregations, consider Collectors (like Collectors.joining() or Collectors.summingInt()), which are
   often more readable.