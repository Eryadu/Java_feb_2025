## ConcurrentHashMap 
-- Underlying Data Structure is HashTable.
-- ConcurrentHashMap allows Concurrent Read and Thread Safe Update operations.
-- To perform Read Operation Thread Won't require any Lock. but to perform Update Operation Thread requires Lock, But it 
   is Lock of only a particular part of Map (Bucket Level Lock/Segment Level Lock). 
-- Instead of Whole Map, Concurrent Update achieved by Internally dividing Map into Smaller portion which is defined by 
   Concurrency Level.
-- The Default Concurrency Level is 16. Based on initial capacity of HashMap. Most of the time Concurrency level and
   Bucket Level Lock/Segment Level Lock are equal but if Concurrency level increase or decreases than it's adjusted with
   Bucket Level Lock/Segment Level Lock. i.e. if Concurrent level locks are 32 then each Bucket has 2 locks and if Concurrent
   locks are 8 then every two Buckets have one lock.
-- That is ConcurrentHashMap allows simultaneous Read operation and Simultaneously 16 Write (Update) Operations.
-- "Null" is not Allowed for Both Keys and values.
-- While One Thread iterating the other Thread can Perform Update Operation and ConcurrentHashMap never throw
   ConcurrentModificationException.

## Constructors : Total Five Constructor and Three Parameters (intInitialCapacity, Float fillRatio, intConcurrencyLevel)
1. ConcurrentHashMap m = new ConcurrentHashMap();
   Creates an Empty with default initial capacity 16 and Default Fill Ratio 0.75 and Default Concurrency Level 16.
2. ConcurrentHashMap m = new ConcurrentHashMap(intInitialCapacity);
3. ConcurrentHashMap m = new ConcurrentHashMap(intInitialCapacity, Float fillRatio);
4.  ConcurrentHashMap m = new ConcurrentHashMap(intInitialCapacity, Float fillRatio, intConcurrencyLevel);
5.  ConcurrentHashMap m = new ConcurrentHashMap(Map m);

## Difference between HashMap and ConcurrentHashMap

HashMap ConcurrentHashMap
It is not ThreadSafe.