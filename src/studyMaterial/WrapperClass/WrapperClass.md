## Wrapper classes are a fundamental concept in object-oriented programming that provide a way to use primitive data types
   as objects. Wrapper class add a layer of protection and presentation.
-- Wrapper classes are classes that "wrap" primitive data types into objects. They allow primitives to be used in contexts 
   where objects are required, such as in collections.
-- A wrapper class is typically used to wrap a primitive value or an object to provide additional functionality, immutability, 
   or utility methods.

-- Common Wrapper Classes

Integer    wraps   int
Double     wraps   double
Boolean    wraps   boolean
Character  wraps   char
Byte       wraps   byte
Short      wraps   short
Long       wraps   long
Float      wraps   float

## Key Features

- Object Conversion: Convert primitives to objects and vice versa
- Utility Methods: Provide useful methods for working with the data
- Collection Compatibility: Enable primitives to be used in collections
- Null Handling: Can represent null values unlike primitives
- Synchronization : Java Sync. works with objects in Multi-threading i.e int x =5; (If multiple thread try to access this 
  it may in inconsistent condition, so we need wrapper class Integer x =5; , Wrapper class add a layer of protection as we 
  can create multi objects as needed.) 

## Autoboxing is the automatic conversion that the java compiler make between primitive data type and their corresponding 
   objects wrapper class.
   i.e. int x =5;
        Integer intObj = x;

## UnBoxing is the automatic conversion that the java compiler make between objects wrapper class and their corresponding
   primitive data type. 
   i.e. Integer intObj = 5;;
        int x = intObj; 
## Advantage of UnBoxing it provide code optimization, improve the performance
Example Usage (Java)

// Boxing: converting primitive to wrapper
Integer num = Integer.valueOf(42);

// Unboxing: converting wrapper to primitive
int primitiveNum = num.intValue();

// Autoboxing (automatic conversion)
Integer autoBoxed = 42;  // primitive to object
int autoUnboxed = autoBoxed;  // object to primitive

// Using utility methods
String binary = Integer.toBinaryString(42);

## Benefits

Enables primitives to be used in object-oriented contexts
Provides utility methods for conversion and manipulation
Allows null values for primitive types
Essential for working with collections like ArrayList

## Wrapper classes bridge the gap between primitive types and objects, combining the efficiency of primitives with the
   flexibility of objects when needed.