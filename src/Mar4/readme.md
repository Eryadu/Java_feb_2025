## Array
--Types of Arrays
1. Single dimension
2. Multi Dimension array


## Strings
1. Character array
2. String is a class
3. Non Primitive data type

1. Using String Literal -- use the same memory called SCP (String constant pool) if string object is same.
String are immutable, so when we try to assign different value or change exiting value,then it create new reference in memory
and delete old one by garbage collector.

String name = "Pragra"
String company = "Pragra"
String orgnization = "Pragra"

2. Using new keyword -- create new memory outside SCP somewhere in heap, everytime object is created.


-- == check the reference and .equals() -- to check content comparison

## String methods

1. contain() --> string.contain("Keyword to search in given string").-- It returns boolean value.
2. replace() --> string.replace("Keyword to be replaced" , "New keyword") -- Every instance (keyword) would be changed
-- with new instance (keyword).
3. substring() --> string.substring(BeginIndex), string.substring(BeginIndex, EndIndex)
4. concatenate() --> when string conct with Primitive DataType (i.e. int, float,char) then it automatically typeCasted to
   String. --- When string conct with Non-Primitive DataType (i.e. Array), then Java try to call implicitly .tostring()
   method and the return the value