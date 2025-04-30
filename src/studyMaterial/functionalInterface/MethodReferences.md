## Method References

Let’s consider an example before I explain the syntax for method references. Consider the following snippet of code:
import java.util.function.ToIntFunction;
...
ToIntFunction<String> lengthFunction = str -> str.length();
String name = "Ellen";
int len = lengthFunction.applyAsInt(name);
System.out.println("Name = " + name + ", length = " + len);
Name = Ellen, length = 5

## rewrite the above lambda expression using a method reference to the length() method of
the String class, as shown:
import java.util.function.ToIntFunction;
...
ToIntFunction<String> lengthFunction = String::length;
String name = "Ellen";
int len = lengthFunction.applyAsInt(name);
System.out.println("Name = " + name + ", length = " + len);
Name = Ellen, length = 5
149
Chapter 5 ■ Lambda Expressions

## The general syntax for a method reference is
   <Qualifier>::<MethodName>
The <Qualifier> depends on the type of the method reference. Two consecutive colons act as a separator.
The <MethodName> is the name of the method. For example, in the method reference String::length, String is the
qualifier and length is the method name.

## Tip■ ■ a method reference does not call the method when it is declared. The method is called later when the method
   of its target type is called.
   The syntax for method references allows specifying only the method name. You cannot specify the parameter
   types and return type of the method.
   
----------------------------------------------------------------------------------------------------------------
## Static Method References
A static method reference is used to use a static method of a type as a lambda expression. The type could be a class, 
an interface, or an enum. Consider the following static method of the Integer class:
• static String toBinaryString(int i)

// Using a lambda expression
Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
System.out.println(func1.apply(17));
10001
 
Rewrite this statement using a static method reference, as shown:
// Using a method reference
Function<Integer, String> func2 = Integer::toBinaryString;
System.out.println(func2.apply(17));
10001

The compiler finds a static method reference to the toBinaryString() method of the Integer class on the
right-hand side of the assignment operator. The toBinaryString() method takes an int as an argument and returns
a String. The target type of the method reference is a function that takes an Integer as an argument and returns a
String. The compiler verifies that after unboxing the Integer argument type of the target type to int, the method
reference and target type are assignment compatible.

Consider another static method sum() in the Integer class:
static int sum(int a, int b)

Function<Integer, Integer> func2 = Integer::sum; // A compile-time error
The compiler generates the following error message when you compile this code:
Error: incompatible types: invalid method reference
Function<Integer, Integer> func2 = Integer::sum;
method sum in class Integer cannot be applied to given types
required: int,int
found: Integer
reason: actual and formal argument lists differ in length

The error message is stating that the method reference Integer::sum is not assignment compatible with the
target type Function<Integer, Integer>. The sum(int, int) method takes two int arguments whereas the target
type takes only one Integer argument. The mismatch in the number of arguments caused the compile-time error.

To fix the error, the target type of the method reference Integer::sum should be a functional interface whose
abstract method takes two int arguments and returns an int. Using a BiFunction<Integer, Integer, Integer> as
the target type will work. The following snippet of code shows how to use a method reference Integer::sum as well as
the equivalent lambda expression:

// Uses a lambda expression
BiFunction<Integer, Integer, Integer> func1 = (x, y) -> Integer.sum(x, y);
System.out.println(func1.apply(17, 15));
// Uses a method reference
BiFunction<Integer, Integer, Integer> func2 = Integer::sum;
System.out.println(func2.apply(17, 15));
32