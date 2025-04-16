## Hash Collisions in Java
   A hash collision occurs when two different objects produce the same hash code. In Java's hash-based collections like
   HashMap and HashSet, collisions are expected and handled through specific mechanisms.

## How Collisions Occur
1. Same hash code: Two distinct objects return the same hashCode() value
String s1 = "Aa";  // hash code: 2112
String s2 = "BB";  // hash code: 2112

2. Same bucket index: Different hash codes may map to the same bucket due to modulo operation

// With table size 16:
hash1 = 17 → 17 % 16 = 1
hash2 = 33 → 33 % 16 = 1

## How Java Handles Collisions

1. In HashMap/HashSet (Java 7 and earlier)
-- Separate chaining: Uses linked lists in each bucket
-- When collision occurs, new entry is added to the linked list

2. In HashMap/HashSet (Java 8+)
-- Hybrid approach: Uses linked lists until threshold, then converts to trees
-- Linked lists for buckets with ≤ 8 entries
-- Red-black trees for buckets with > 8 entries
-- Improves worst-case performance from O(n) to O(log n)

## Impact of Collisions

1. Performance degradation:
   More collisions → longer linked lists → slower lookups
   Worst case: All keys collide → O(n) performance (Java 7) or O(log n) (Java 8+)
2. Memory overhead:
   Additional nodes for linked lists/trees
   Tree nodes require more memory than simple linked list nodes

## Minimizing Collisions

1. Good hashCode() implementation:
-- Should produce diverse values for different objects
-- Should be consistent with equals()
-- Should use all significant fields
Example:
@Override
public int hashCode() {
return Objects.hash(field1, field2, field3);
}

2. Proper HashMap capacity:
-- Set initial capacity based on expected size
-- Use appropriate load factor (default 0.75 works for most cases)

3. Immutable keys:
   Changing a key's hash-relevant fields after insertion breaks the map

## Testing for Collisions

You can detect collisions by:
Map<Integer, List<String>> hashGroups = new HashMap<>();
List<String> strings = Arrays.asList("Aa", "BB", "C#", "DB", "EF");

for (String s : strings) {
int hash = s.hashCode();
hashGroups.computeIfAbsent(hash, k -> new ArrayList<>()).add(s);
}

hashGroups.values().stream()
.filter(list -> list.size() > 1)
.forEach(System.out::println);

## Interesting Facts

1. Java String hash collision:
   Many 2-letter strings produce collisions (like "Aa" and "BB")
   This is intentional for performance reasons
2. Security implications:
   Poor hash functions can lead to denial-of-service attacks
   Java 8+ includes security improvements to mitigate this
3. Perfect hashing:
   Possible when all keys are known in advance
   Java doesn't use this approach due to dynamic nature of collections