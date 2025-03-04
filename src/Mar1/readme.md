## variables
1. local variable
-- local to method or constructor

public void show (int x, int y)
{ int x;
}

2. instance variable
-- inside the class or outside method or constructor

class test{
int x;
}

3. static variable

-- static variable belongs to class rather than object of class. Its give the memory once.
-- static variable is shared among all the instances.
i.e. internet -- everyone is sharing single variable to save memory/ dividing speed among all
-- static variable are not stored in heap or stack, they are stored somewhere outside.

static int x =10;

-- Static Method -- We don't need to create object to call static method as it belongs to class not object of class.

## Memory
stack and heap

-- Stack -- is a data structure which work on FILO. It stores all the local variables


-- Heap -- it store object. Whenever obj are going to be refer it store in heap and variable in stack.
--Instance variable store in heap, cause it initialise by const by creating object, that's why they are in heap. // refer to ppt.

## object

Test test = new Test(int x ); -- whole is called object.
-- new keyword is used to give memory
-- test is reference variable only

## JVM, JRE (Java Run time Environment), JDK (Java Development Kit)??
## JVM (Java virtual machine) ----> jvm wants to call the main method
 that's why main method is static

## In Java, static variables are stored in the Method Area of the JVM (Java Virtual Machine) memory. 
-- The Method Area is a part of the heap memory and is shared among all threads. 
-- It is used to store class-level data, including:
a. Static variables
b. Class metadata (e.g., class name, method information, field information)
c. Constant pool (e.g., string literals, constants)

## Key Points:

-- Static variables are allocated memory when the class is loaded by the JVM.
-- They remain in memory for the entire duration of the application, as long as the class is loaded.
-- Static variables are shared across all instances of the class.

## Memory Breakdown in JVM:

1. Heap Memory: Stores objects and arrays.
   Includes the Method Area (for static variables and class metadata).
2. Stack Memory: Stores local variables and method call frames.
3. PC Register: Tracks the current execution point.
4. Native Method Stack: Used for native method calls.


## Static bLock
-- When ever load class, static block call first then any static method
-- useful to create connection
-- Static blocks are executed only once when the class is loaded.
-- They are useful for static initialization and one-time setup tasks.
-- They cannot access instance variables or methods.
-- Multiple static blocks are executed in the order they appear.

## Instance block
-- whenever object will creat. Instance block can be called without creating objects.

--Static
1.variable
2.method
3.classes  -- static inner class, Inner class, Anonymous inner class
4.blocks