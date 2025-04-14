## IdentityHashMap in Java
   IdentityHashMap is a specialized Map implementation in Java that uses reference equality (==) instead of object 
   equality (equals()) when comparing keys.

## Key Characteristics

1. Reference-based comparison:
   Uses == instead of equals() for key comparison
   Two keys are considered equal only if they are the exact same object reference
2. Hash calculation:
   Uses System.identityHashCode() instead of the object's hashCode()
   Matches the default implementation of Object.hashCode()
3. Performance:
   Generally faster than HashMap for operations
   Not thread-safe (like most Java collections)


## Use IdentityHashMap when you need:
-- To distinguish between different objects that may be "equal" according to their equals() method
-- Object identity semantics rather than value semantics
-- To maintain mappings for objects that change their equality behavior


1. Maintaining proxy objects
2. Object graph traversals where identity matters
3. Framework implementations that need to track objects by identity
4. Cases where mutable objects are used as keys

## Constructors

1. Default constructor:
   IdentityHashMap<K, V> map = new IdentityHashMap<>();
   Creates an empty map with default expected maximum size (21)

2. Constructor with initial capacity:
   IdentityHashMap<K, V> map = new IdentityHashMap<>(int expectedMaxSize);
   Creates an empty map with the specified expected maximum size

## Important Methods

All standard Map methods are available
Special behavior for containsKey(), get(), put(), etc. that use == comparison
Example

IdentityHashMap<String, Integer> map = new IdentityHashMap<>();

String key1 = new String("key");
String key2 = new String("key"); // Same content, different object

map.put(key1, 1);
map.put(key2, 2); // Both entries will be stored

System.out.println(map.size()); // Output: 2
System.out.println(map.get(key1)); // Output: 1
System.out.println(map.get(key2)); // Output: 2

## Performance Notes

-- More memory-efficient than HashMap for small maps
-- Not suitable for most general-purpose use cases
-- Particularly useful in serialization and object graph processing

## Differences from HashMap

Feature	                IdentityHashMap             	HashMap
Key comparison	        == (reference)	                equals() (value)
Hash calculation	    System.identityHashCode()	    hashCode()
Use case	            When identity matters	        General purpose
Null keys	            Allowed	                        Allowed
