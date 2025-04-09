String and integer string has comparable interface by default to compare 
## Comparable<> ? give natural order sorting
## Compare two integer by natural order by implementing Comparable interface and use compareto() method, 
-- fix first element like this.id and compare it with others like this.id- employee.id
   if this.id < employee.id  -vs (means less than second)
   if this.id = employee.id  0 (means equal to second)
   if this.id > employee.id  +vs (means greater than second)

## Collection.sort() by default sort String and Integer if we have to sort custom type list then use Comparable interface
-- Comparable<> interface is not good practice cause everytime we need to change main code, to make search based on which we have to sort.

## Comparator give custom sorting order
So we use other option
Comparator Interface : we can compare everything in one without changing the main code
In Comparator, without changing main class code we can just create new comparator class and add functionality
(based on SOLID principle Single Class has single responsibility and Open to modify and close to ext. )

FunctionalInterface() ?
have one abstract method and all other default method

## HashMap ??
## TreeMap??
## LinkedListMap??
Concurrent HashMap
IdentityHashMap
EnumMap

Equal and hashcode
if two objects are equal, they should have same hashcode
if two objects have same hashcode, they may not be equal .


