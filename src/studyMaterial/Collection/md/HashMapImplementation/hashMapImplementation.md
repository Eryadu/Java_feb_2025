## https://www.youtube.com/watch?v=-oafFAPgLao

-- We can't use primitive data type for key, because we have to calculate the hashCode by using hashCode(), which 
   is the method of Object class, so we only use Objects
1. Divide the memory in heap into 16 (by default size ) buckets, called array of bucket, which implement linked-list inside array 
2. Step is calculate hashCode of "key" by using HashCode(). map.put ("FB" (key) , "A" (value)) -->String object -->hashcode is 3321
3. Step is calculate bucket index by using hash function, which use formula hashCode + (length -1) and modulo function; 
   3321 + (16-1) --> (using Modulo function ) 221%16 -->index = 13 , length is the capacity of hashmap
Example map.put("FB" , "A") --> HashCode= 3321, index = 12
        map.put("DF" , "B") --> HashCode= 3123, index = 8
        map.put("ER" , "C") --> HashCode= 3321, index = 12 // hashcode is same , so now hash Collision will occur 

JVM check "ER".equals("FB") ?
## HashCollision? when hashcode are same, jvm try to put the node in bucket and bucket is not empty, there is already one or 
   more nodes exist, then hash collision occurred if Key match with existing key. If same key exist then JVM replaced the old 
   key with new one. If hashcode match only, but key don't match then JVM transverse through the list and add the node at the end 

4. Speciality of hashmap is that, hashmap get methode [map.get("FB")] return the value very fast, time complexity is O(1)
5. to search element a. first calculate hashcode b. calculate bucket index c. use equal() method to match the key, 
  JVM first goes to first node, if don't match then goes to next and so on until it's not matched
6. Hash collision is rare, because it de-grade the performance if JVM is to transverse through the list
7. In Java 8, if bucket is full or reaches to certain treeify threshold, then it convert it to red-black tree(binary search tree)
   binary search tree is self-balancing tree, benefit of tree over linked list is, it divided the search in half everytime
   it improve the performance and complexity is O(log n). O(log n) is occurred when at every step search divided in half
-- if any element from upper node of tree will be deleted then all the other nodes on that branch will be re-inserted

## Hash Bucket 
## Hash Buckets in Java Collections
   A hash bucket is a fundamental concept in Java's hash-based collections like HashMap, HashSet, and Hashtable. 
   It's the storage location where entries with the same hash code (or more precisely, the same bucket index) are stored.

## How Hash Buckets Work

1. Basic Structure:
-- The backing storage is an array (called "table" in HashMap implementation)
-- Each array element represents a bucket
-- Default initial capacity is 16 buckets (in HashMap)

2. Bucket Index Calculation:
// Simplified version of how HashMap calculates bucket index
int hash = key.hashCode();
int index = (table.length - 1) & hash;  // Equivalent to hash % table.length

3. Bucket Organization Over Java Versions

## Java 7 and Earlier
-- Linked List buckets: Each bucket was a simple linked list of entries
-- Collision handling: New entries added to end of list
-- Performance: O(n) worst case when many collisions occur

## Java 8 and Later
-- Hybrid buckets:
   Start as linked lists
-- Convert to balanced trees (red-black trees) when bucket size exceeds threshold (8 entries)
-- Revert to linked lists if bucket size decreases below threshold (6 entries)
-- Performance improvement: O(log n) worst case for lookups

## Internal Bucket Structure (Java 8+)

1. Linked List Node Structure
static class Node<K,V> implements Map.Entry<K,V> {
final int hash;
final K key;
V value;
Node<K,V> next;  // Reference to next node in bucket
}

2. Tree Node Structure
static final class TreeNode<K,V> extends LinkedHashMap.Entry<K,V> {
TreeNode<K,V> parent;  // Red-black tree links
TreeNode<K,V> left;
TreeNode<K,V> right;
TreeNode<K,V> prev;    // Needed to unlink next upon deletion
boolean red;
}

3. Bucket Operations

a. Insertion:
-- Calculate bucket index
   If bucket empty → create new node
   If bucket not empty → traverse list/tree to check for existing key
   Add new entry or update existing one
b. Lookup:
   Calculate bucket index
   Traverse list/tree to find matching key
c. Deletion:
   Find entry in bucket
   Remove from list/tree
   Adjust bucket structure if needed
d. Bucket Resizing
   When the number of entries exceeds threshold (capacity × load factor):
   Create new bucket array (typically double the size)
   Rehash all entries to new buckets
e. In Java 8+, maintain order within buckets during transfer

## Key Characteristics

1. Bucket count:
-- Always a power of two (16, 32, 64, etc.)
-- Enables fast index calculation using bitwise AND
2. Load factor:
-- Default 0.75 (when 75% full, resize occurs)
-- Higher values → more collisions but less memory
-- Lower values → fewer collisions but more memory
3. Null handling:
-- Null key always goes to bucket 0

Example Visualization

For a HashMap with capacity 8:

Buckets: [0] -> [Entry1] -> [Entry2]  (hash % 8 = 0)
[1] -> null
[2] -> [Entry3]              (hash % 8 = 2)
[3] -> [TreeNode1] -> [TreeNode2] -> [TreeNode3] (treeified bucket)
...
[7] -> [Entry4] -> [Entry5]  (hash % 8 = 7)

## Performance Considerations

-- Good hash distribution minimizes collisions
-- Proper initial capacity reduces resizing operations
-- Immutable keys prevent bucket corruption
-- Java 8+ treeification protects against worst-case performance
## Understanding hash buckets is crucial for optimizing performance when using Java's hash-based collections.
