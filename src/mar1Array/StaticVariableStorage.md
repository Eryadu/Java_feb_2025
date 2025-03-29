## Static Variable storage
In Java, static variables are stored in the method Area of the JVM (Java Virtual Machine) memory. 
The method Area is a part of the heap memory and is shared among all threads. 
It is used to store class-level data, including:

- Static variables
- Class metadata (e.g., class name, method information, field information)
- Constant pool (e.g., string literals, constants)

Key Points:

- Static variables are allocated memory when the class is loaded by the JVM.
- They remain in memory for the entire duration of the application, as long as the class is loaded.
- Static variables are shared across all instances of the class.

## Memory Breakdown in JVM:

- Heap Memory: Stores objects and arrays.
 Includes the method Area (for static variables and class metadata).
- Stack Memory: Stores local variables and method call frames.
- PC Register: Tracks the current execution point.
- Native method Stack: Used for native method calls.
- Static variables are not stored in the stack or heap (for objects) but specifically in the method Area within the heap.

## what is method call frames
A method call frame (also known as an activation record or stack frame) is a data structure used by the Java Virtual 
Machine (JVM) to store information about a method's execution. Each time a method is called, a new frame is created 
and pushed onto the call stack (part of the JVM's stack memory). When the method completes execution, its frame is 
popped off the stack.

Components of a method Call Frame:

A method call frame typically contains the following information:

- Local Variables:
Stores the method's local variables, including parameters passed to the method.
Each variable is stored in a slot within the frame.
Primitive types (e.g., int, boolean) store their values directly, while object references store the memory addressComposition of the
object in the heap.
- Operand Stack:
Used for intermediate calculations during method execution.
The JVM uses this stack to push and pop values while executing bytecode instructions (e.g., arithmetic operations, 
- method calls).
Reference to the Runtime Constant Pool:
Provides access to the class's constant pool, which contains symbolic references to classes, methods, fields, and 
constants.
- Return Address:
Stores the location in the program where execution should continue after the method completes.
This is necessary for the JVM to know where to return control after the method finishes.
- Dynamic Linking:
Contains information to resolve symbolic references to actual memory addresses during runtime.
- Frame Data:
Additional metadata about the method's execution, such as exception handling information.
How method Call Frames Work:

When a method is called, a new frame is created and pushed onto the call stack.
The frame stores all the necessary information for the method to execute, including local variables and the operand stack.
As the method executes, it uses the operand stack for calculations and the local variables for storing data.
When the method completes, its frame is popped off the stack, and control returns to the calling method using the 
return addressComposition.
Example:


Each thread in Java has its own call stack, and each method call creates a new frame on that stack.
Frames are destroyed when the method completes, freeing up memory.
The stack size is limited, and excessive recursion or deep method calls can lead to a StackOverflowError.

## what is Native method Stack?
The Native method Stack is a memory area in the Java Virtual Machine (JVM) that is used to support the execution of 
native methods. Native methods are methods written in languages other than Java (typically C or C++) and are accessed 
via the Java Native Interface (JNI). These methods are often used to interact with system-level libraries or perform 
low-level operations that cannot be done directly in Java.

Key Characteristics of the Native method Stack:

Purpose:
It stores information about native method calls, such as local variables, parameters, and return addresses.
It is analogous to the Java stack, but it is used exclusively for native code.
- Memory Allocation:
The Native method Stack is allocated per thread, meaning each thread has its own native method stack.
The size of the stack can be configured using JVM options (e.g., -XX:ThreadStackSize).
- Language Independence:
Since native methods are written in languages like C or C++, the Native method Stack must handle the calling conventions
and memory management of those languages.
- Interaction with the JVM:
When a Java program calls a native method, the JVM transitions from Java code to native code.
The Native method Stack is used to manage the execution context of the native code.
- Potential Issues:
If the native method stack is exhausted (e.g., due to deep recursion or large local variables), it can result in 
a stack overflow error.
Native methods can introduce stability and security risks if not implemented carefully, as they operate outside the 
JVM's managed environment.

How It Works:

When a Java program calls a native method, the JVM creates a frame on the Native method Stack for that method.
The frame stores the native method's local variables, parameters, and other execution details.
The native method executes using the native code (e.g., C/C++), and the results are returned to the Java program.
Once the native method completes, its frame is removed from the Native method Stack.
Example of Native method Usage:

