## Calculating hashCode() in Java
   The hashCode() method is crucial for objects used in hash-based collections like HashMap and HashSet. Here's how to 
   properly implement it:

## Basic Principles

1. Consistency: Must return same value for same object (unless modified)
2. Equality contract: If a.equals(b) is true, then a.hashCode() == b.hashCode()
3. Distribution: Should distribute values uniformly to minimize collisions

## Common Implementation Approaches

1. Using Objects.hash() (Java 7+)
@Override
public int hashCode() {
return Objects.hash(field1, field2, field3); // Takes any number of arguments
}

2. Manual Implementation (Traditional Approach)

@Override
public int hashCode() {
int result = 17;  // Arbitrary prime number
result = 31 * result + field1.hashCode();
result = 31 * result + (field2 == null ? 0 : field2.hashCode());
result = 31 * result + field3;
return result;
}
3. For Arrays

@Override
public int hashCode() {
return Objects.hash(arrayField1, arrayField2) + Arrays.hashCode(primitiveArray);
}

## Why 31?

1. Prime number: Reduces collisions
2. Odd number: Maintains information (even numbers lose bits on overflow)
3. Optimization: 31 * i can be optimized to (i << 5) - i by JVM

## Rules for Effective hashCode()

-- Include all significant fields used in equals()
-- Exclude derived fields that can be computed from other fields
-- Handle nulls safely (return 0 or other constant)
-- Use primitive wrapper hashCode() for primitive fields
-- Consider immutable fields for better cacheability

Example Implementations

## For a Simple Class

public class Person {
private String name;
private int age;
private LocalDate birthDate;

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthDate);
    }
}

## For a Class with Collections

public class Order {
private long orderId;
private List<Item> items;

    @Override
    public int hashCode() {
        int result = Long.hashCode(orderId);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }
}

## Common Pitfalls to Avoid

-- Inconsistent with equals(): Fields used in equals() must be used in hashCode()
-- Ignoring nulls: Not properly handling null fields
-- Mutable hash keys: Changing fields after object is used in HashSet/HashMap
-- Poor distribution: Using only part of the object's state

## Performance Considerations

Cache hashCode for immutable objects:
private int hash; // Default 0

@Override
public int hashCode() {
if (hash == 0) {
hash = Objects.hash(field1, field2);
}
return hash;
}
-- Keep it fast: hashCode() is called frequently in hash collections
-- Balance distribution vs. computation: More fields → better distribution but slower computation

## Remember that a good hashCode() implementation is essential for efficient performance when using hash-based 
   collections in Java.