## refer to book
## default is new keyword in Java 8 . Default method are neither Static method nor instance
method. To use default method, we override the method
-- In functional interface, variables are by-default public, static, final

we use functional programming because in this we can pass logic / method directly instead of
objects. Advantage of passing logic/method directly is that, we don't need to create different
classes to implement different methods/ideas. With method passing, we can change it in single
line. refer validator example

## what is difference between default and instant variable ?

## Instance Variable:
-- A variable that belongs to an object (instance) of a class.
-- Each object gets its own copy of the instance variables.
Example:
class Car {
String color;  // instance variable
}

Car car1 = new Car();
car1.color = "Red";

Car car2 = new Car();
car2.color = "Blue";
Here, car1 and car2 have different color values.

## Default Value:
This is what Java automatically assigns to a variable if you don't explicitly set a value.
For instance variables:
int ➔ 0
float ➔ 0.0f
boolean ➔ false
object references ➔ null
Example:

class Bike {
int speed;  // instance variable
}

Bike b = new Bike();
System.out.println(b.speed);  // prints 0, the default value for int
🔵 In short:

"Instance variable" talks about where the variable belongs (inside an object).
"Default value" talks about what value it gets if you don't manually set one.


## default and static variable

Default Value (not a variable type!)
"Default" just means:
➔ If you don't manually assign a value, Java automatically gives it a default value based on the type.
Example:

class Test {
int num;    // no value assigned
}

Test t = new Test();
System.out.println(t.num);  // prints 0
Here, num gets 0 because int's default value is 0.

Default values:

Data Type	Default Value
int	0
float	0.0f
boolean	false
object ref.	null
⚡ Note: Local variables (inside methods) do not get default values — you must initialize them.

## Static Variable
-- A static variable is shared among all objects of a class.
-- Belongs to the class itself, not to instances.
-- Only one copy exists in memory.
Example:

class Student {
static String schoolName = "ABC School"; // static variable
String studentName;                       // instance variable
}

Student s1 = new Student();
Student s2 = new Student();

System.out.println(s1.schoolName);  // ABC School
System.out.println(s2.schoolName);  // ABC School

Student.schoolName = "XYZ School";   // changed at class level

System.out.println(s1.schoolName);  // XYZ School
System.out.println(s2.schoolName);  // XYZ School
Here, changing the static variable changes it for all objects.

## Anonymous Class
An anonymous class is an inner class without a name, which means that we can declare and
instantiate a class at the same time. An anonymous class is used primarily when we want to
use the class declaration once. Anonymous classes usually extend a subclass or implement an
interface.

Example:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>(
Arrays.asList(1, 3, 4, 5, 2)
);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        list.sort(comparator);

        System.out.println(Arrays.toString(list.toArray())); 
    }
}

Output

[1, 2, 3, 4, 5]

Explanation:

In this example, we created an anonymous inner class i.e. new Comparator<Integer>() {}
that implements the Comparator interface and overrides the compare() method.

## Introduction to Programming Paradigm
Programming Paradigm is a way or style of programming. The programming paradigm can be
classified into two types:

1. Imperative programming paradigm
2. Declarative programming paradigm

1. Imperative Programming Paradigm
   Imperative programming paradigm consists of a sequence of statements that changes the
   program's state until the target result is achieved. The main focus is on how to achieve
   the goal. It consists of three main programming approaches:
   -- Procedural programming
   -- Object-Oriented programming
   -- Parallel Processing Approach
2. Declarative Programming Paradigm
   Declarative programming is a paradigm in which we define what needs to be accomplished without
   defining how it has to be implemented. In the declarative programming paradigm, for the same
   input arguments, the program produces the same result. The order of execution of statements
   is not important in the declarative programming paradigm. It consists of three main programming
   approaches:
   -- Logic programming paradigm
   -- Functional programming
   -- Database processing approach


## What Is a Lambda Expression?
A lambda expression is an unnamed block of code (or an unnamed function) with a list of formal
parameters and a body. Sometimes a lambda expression is simply called a lambda. The body of a
lambda expression can be a block statement or an expression. An arrow (->) is used to separate
the list of parameters and the body. The term “lambda” in "lambda expression" has its origin in
Lambda calculus that uses the Greek letter lambda (l) to denote a function
abstraction. The following are some examples of lambda expressions in Java:
// Takes an int parameter and returns the parameter value incremented by 1
(int x) -> x + 1
// Takes two int parameters and returns their sum
(int x, int y) -> x + y
// Takes two int parameters and returns the maximum of the two
(int x, int y) -> { int max = x > y ? x : y;
return max;
}
// Takes no parameters and returns void
() -> { }

## Tip : Java is a strongly-typed language, which means that the compiler must know the type of
all expressions used in a Java program. A lambda expression by itself does not have a type,
and therefore, it cannot be used as a standalone expression. The type of a lambda expression
is always inferred by the compiler by the context in which it is used.

## Tip : a lambda expression is not a method, although its declaration looks similar to a method.
As the name suggests, a lambda expression is an expression that represents an instance of a
functional interface.

## Type of lambda ?
Every expression in Java has a type; so does a lambda expression. The type of a lambda expression
is a functional interface type. When the abstract method of the functional interface is called,
the body of the lambda expression is executed.
Consider the lambda expression that takes a String parameter and returns its length:
(String str) -> str.length()
What is the type of this lambda expression? The answer is that we do not know. By looking at the
lambda expression, all you can say is that it takes a String parameter and returns an int,
which is the length of the String. Its type can be any functional interface type with an
abstract method that takes a String as a parameter and returns an int. The following is an example of such a functional interface:
@FunctionalInterface
interface StringToIntMapper {
int map(String str);
}
The lambda expression represents an instance of the StringToIntMapper functional interface when
it appears in the assignment statement, like so:
StringToIntMapper mapper = (String str) -> str.length();
In this statement, the compiler finds that the right-hand side of the assignment operator is a
lambda expression. To infer its type, it looks at the left-hand side of the assignment operator
that expects an instance of the StringToIntMapper interface; it verifies that the lambda
expression conforms to the declaration of the map() method in the StringToIntMapper interface;
finally, it infers that the type of the lambda expression is the StringToIntMapper interface type.
## Why do we need lambda ?
Java has supported object-oriented programming since the beginning. In object-oriented
programming, the program logic is based on mutable objects. Methods of classes contain the
logic. Methods are invoked on objects, which typically modify their states. In object-oriented
programming, the order of method invocation matters as each method invocation may potentially
modify the state of the object, thus producing side effects. Static analysis of the program
logic is difficult as the program state depends on the order in which the code will be executed
but in lambda, they don't care about the execution order of statement.

Java 8 introduced lambda expressions that represent an instance of a functional interface. You
were able to do everything prior to Java 8 using anonymous classes what you can do with lambda
expressions. Functional interfaces are not a new addition in Java 8; they have existed since the
beginning.
So why and where do we need lambda expressions? Anonymous classes use a bulky syntax. Lambda
expressions use a very concise syntax to achieve the same result. Lambda expressions are not a
complete replacement for anonymous classes. You will still need to use anonymous classes in a
few situations. Just to appreciate the conciseness of the lambda expressions, compare the
following two statements from the previous section that create an instance of the StringToIntMapper
interface; one uses an anonymous class, taking six lines of code, and another uses a lambda
expression, taking just one line of code:
// Using an anonymous class
StringToIntMapper mapper = new StringToIntMapper() {
@Override
public int map(String str) {
return str.length();
}
};
// Using a lambda expression
StringToIntMapper mapper = (String str) -> str.length();