
## https://www.scaler.com/topics/functional-interface-in-java/
## Functional Interfaces introduced in Java 8 allow us to use a lambda expression to initiate the interface's method 
   and avoid using lengthy codes for the anonymous class implementation. Various built-in interfaces were declared with 
   @FunctionalInterface annotation and made functional from Java 8. They are of 4 types, Function, Consumer, Predicate, 
   and Supplier.
 // By default variable declared in Functional Interface are public, Static, final

## Variables are public static final.
That means:
public → visible everywhere.
static → belongs to the interface itself (not to any instance).
final → cannot be changed after being assigned (it's a constant).
This is true for all variables in interfaces, not just functional interfaces.

## What is Functional Interface in Java?
   Java is an object-oriented programming language i.e. everything in java rotates around the java classes and their objects.
   No function is independently present on its own in java. They are part of classes or interfaces. And to use them we
   require either the class or the object of the respective class to call that function.

## Functional interfaces were introduced in Java 8. A functional interface can contain only one abstract method and it 
   can contain any number of static and default (non-abstract) methods.
-- Abstract methods are methods that do not require implementation during their declaration and must be overridden by 
   the class implementing the interface.
-- Default methods can be directly used in a class implementing the interface as well as can be overridden and redefined.
-- Static methods are required to be called using the name of the interface preceding the method name. These cannot be 
   overridden by the classes implementing the interface.

-- Functional Interface in Java is also called Single Abstract Method (SAM) interface. From Java 8 onwards, to represent
   the instance of functional interfaces, lambda expressions are used.

## Implementation Approach
-- Lambda can only implement the abstract method (square in this case)
-- Default and static methods come with the interface and don't need implementation
-- We'll create an instance using lambda for the abstract method while keeping the default and static methods
   check example Using StaticAndDefaultMethod

## Lambda expressions are anonymous (don't have names) shortcode blocks that can take parameters and return a value 
   just like methods.

Syntax:

// interface
@FunctionalInterface   // annotation
interface interfaceName{
// abstract method
abstract returnType methodName( /* parameters */);

    // default or static methods
    
    int method1(){
        // ....
    }
    String method2(int x, float y){
        // ....
    }
}

// public class
public class className{
// main method
public static void main(String[] args){
interfaceName temp = (/*parameters*/) -> {
// perform operations
};

        temp.methodName(); // call abstract method of the interface
    }
}

## The functional interface in Java is defined just like normal interfaces. It should only have one abstract method. 
   Though it can contain multiple default or static methods.

## Abstract keyword: Though from Java 8, interfaces can have static and default methods. By default, methods in interfaces
   are abstract only. So it is not mandatory to mention the abstract keyword before the method.

## @FunctionalInterface Annotation @FunctionalInterface Annotation is written above the interface declaration. It 
   effectively acts as a function thus, it can be passed as a parameter to a method or can be returned as a value by a 
   method. It is optional, but when mentioned java compiler ensures that the interface has only one abstract method.
-- If we try to add more than one abstract method, the compiler flags an Unexpected @FunctionalInterface annotation message.
-- To implement the abstract method of a functional interface in Java, we can either use lambda expression or we can 
   implement the interface to our class and override the method. In the syntax above we are using a lambda expression.

## Annotation we used just if any other developer come to work on same code, so they know its functional interface,
because if there is no annotation system will not show any error if more than one abstract method would be added but 
compile time it show error. With Annotation mentioned , dev immidiately get error
## Let us understand the syntax of functional interfaces with a simple example.

// interface
@FunctionalInterface
interface Sample{
// abstract method
int calculate(int val);
}
// public class
public class Main{
public static void main(String[] args){

        // implementing the abstract method of the interface
        Sample solution = (int val) -> val+51;
        
        // calling the method
        System.out.println("Ans = "+ solution.calculate(51));
    }
}
Output:
Ans = 102
-- Explanation: In the Main class, note that we didn't override the calculate method. We used lambda expression to 
   implement calculation method of the Sample interface. The target type of lambda must be an interface, thus we are using
   Sample solution = // lambda expression
   Lastly to call and use lambda_expression_name.method_name i.e. solution.calculate().

## Two Ways to Use Functional Interfaces in a Class

1. Using Lambda Expression
   Here, we just have to import the interface. We are not required to implement it in our class to use the Functional 
   Interface in Java.
-- Lambda expressions are just like methods in java, but they make the code short, clean, and readable. They are also 
   called anonymous functions. Thus, they are used more frequently with functional interfaces in Java.
Syntax:

InterfaceName tempName = (<parameters>) -> {
// implementation of the abstract method of the Functional Interface
};
// to use this method
tempName.absName();

-- InterfaceName is the functional interface we are going to use in our main method. We neither have to implement an 
   interface nor have to override the abstract method.
-- We can directly give implementation to the abstract method using a lambda expression. To call this temporarily 
   implemented method we have to use the syntax tempName.AbstractMethod().

Example: Let's take an example where we take a user's name and Greet them with a message.

import java.util.*;
@FunctionalInterface
interface PersonalGreet{
String greeting(String name);
}
public class MyClass {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("May I please know your Name?");
String name = sc.next();
PersonalGreet hello = (String temp) -> "Hello! "+temp;
System.out.println(hello.greeting(name));
}
}

Output:

May I please know your Name?
Potter
Hello! Potter
-- Explanation: In the example above, we are not required to override any method. We can give implementation to the 
   abstract method of the functional interface in the main method itself using a lambda expression. It takes one String 
   variable as an argument and returns another String.

2. By Implementing the Interface
   Another way is to implement the interface in our class. By doing so we will have to override the abstract method. 
   Then to call the method we are supposed to create the object of our class and use the following syntax obj.AbstractMethod().

Syntax:

@FunctionalInterface
interface Sample{
void absMethod();
}
public class className implements Sample{
@Override
public static void absMethod(){
// implementation
}
public static void main(String[] args){
className object = new className();
object.absMethod();
}
}
Explanation: In the example above Sample is an interface. Our class Main implements the interface, thus it has to override 
the abstract method of the interface. To call this abstract method in our main method we have to create the object of our 
Main class.

Example: Let us take the same example as above and implement it by overriding the method.

import java.util.*;
@FunctionalInterface
interface PersonalGreet{
String greeting(String name);
}
public class MyClass implements PersonalGreet{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("May I please know your Name?");
String name = sc.next();
MyClass obj = new MyClass();
System.out.println(obj.greeting(name));
}
@Override
public String greeting(String name){
return "Hello! "+name;
}
}

Output:

May I please know your Name?
Potter
Hello! Potter

Explanation: In the example above, rather than implementing the abstract method of the functional interface in the main 
method, we are overriding it in our class. Then we create an object of our class to call this method greeting.

## More Examples
1. A Functional Interface Can Have Methods of Object Class
Example: Let us take an example of a functional interface in Java having a single abstract method and multiple methods 
of the object class.

// means functional interface have more than one abstract method but condition is that, other methods should be redefined
in their parent class. like equal() and hashcode().

@FunctionalInterface
interface ObjectClassMethods{
// abstract method
int abstractMethod(int val);
// methods of the object class
int hashCode();
String toString();
boolean equals(Object obj);
}

Explanation: In the interface above, hashCode(),toString(), and equals() are the methods of the Object class of Java. 
We can have any number of methods of object classes in our Functional Interface. These object classes don't have an 
implementation in the interface as well.

2. Functional Interface Having Multiple Default and Static Classes
Let us see an example of a Functional interface in Java having default and static classes.

// interface implementation
@FunctionalInterface
interface StaticAndDefaultMethods{
// abstract method
int square(int x);
// default methods
default int add(int a, int b){
return a+b;
}
default int sub(int a, int b){
return a-b;
}
// static methods
static int multiply(int a, int b){
return a*b;
}
static int divide(int a, int b){
return a/b;
}
}

// public class
public class Test implements StaticandDefaultMethods{
public static void main(String[] args){
int a = 8;
int b = 6;
// object of test class
Test t = new Test();
// default method called using class object
int add = t.add(a,b);
int sub = t.sub(a,b);
// static methods called directly by the interface name
int mul = StaticandDefaultMethods.multiply(a,b);
int div = StaticandDefaultMethods.divide(a,b);
}
// abstract method
@Override
public int square(int x) {
return x*x;
}
}

Explanation: In the example above, square is an abstract method, add and sub are default methods, and multiply and 
divide are static methods. We override the square() method in the Test class. Also, add() and sub() can be overridden 
by the respective class and are called using the object of the Test class. multiply() and divide() is called using the 
name of the interface in the main method.

## Functional Interface Extending to a Non-Functional Interface.
   A functional interface in Java can extend other Interfaces. The extends keyword is used after the name of the child 
   interface to extend another interface known as the parent interface. The child interface inherits the methods of the 
   parent interface. 
   Note : The parent interface must not be functional as well as it should not have any abstract method. 
   The functional interface i.e. our child interface can have a single abstract method and multiple default and static methods.

## Note : The child and parent interfaces can have the same abstract method, or the child interface can have no methods 
   if both interfaces are Functional.

## Example - 1

For instance, let there be a BookStore interface with few methods and a Library interface as a Functional Interface.

interface BookStore{
int sell();
int buy();
List<String> customers();
//    boolean issue_book();
}

@FunctionalInterface
interface Library extends BookStore{
boolean issue_book();
}

The compiler throws an exception, as the BookStore interface has 3 abstract methods. Thus, the Library interface can't \
extend BookStore.

## Example - 2

With the same example as the previous one, let the Bookstore interface extend Library.

@FunctionalInterface
interface Library{
boolean issue_book();
}

interface BookStore extends Library{
int sell();
int buy();
List<String> customers();
//    boolean issue_book();
}

The BookStore interface can extend Library as BookStore is a normal Interface. There is no compilation error.

## Example - 3

In the same example as before, let BookStore and Library both have the abstract method but with the same name.

@FunctionalInterface
interface BookStore extends Library{
boolean issue_book();
}

@FunctionalInterface
interface Library{
boolean issue_book();
}

In case, BookStore has only one method same as Library issue_book or no method, then BookStore can extend Library.

## Built-in Java Functional Interfaces
Java has pre-defined or built-in functional interfaces for commonly occurring cases.
-- Many interfaces converted into functional interfaces using @FunctionalInterface Annotation. A few of these interfaces 
   are as follows-

1. Runnable - It contains only the run() method. It is used to write applications that can run on a separate thread.
2. Comparable - This interface contains only the compareTo() method. The objects of the class that implements the 
   Comparable interface can be compared the objects of the class that implements Comparable interface can be compared 
   and sorted.
3. ActionListener - It contains only actionPerformed() method. It is responsible for handling all the action events like 
   a mouse click on a component.
4. Callable - It only contains the call() method. This method is used to monitor the progress of a function being 
   executed by a thread.

-- The most frequently used among these interfaces is comparable. Let us take an example of a Candidate class and its 
   object to understand this Functional Interface. Using a functional interface we will compare objects of the Candidate class.

public class Candidate implements Comparable<Candidate>{
int id;
int year;
String name;
String College;

    // constructor method
    public Candidate(int id, int yr, String name, String College){
        this.id = id;
        this.year = yr;
        this.name = name;
        this.College = College;
    }
    
    // compareTo method 
    @Override
    public int compareTo(Candidate o) {
        if(this.year == o.year){
            return this.name.compareTo(o.name);
        }
        else{
            if(this.year < o.year) return 1;
            if(this.year > o.year) return -1;
            else return 0;
        }
    }
}

Explanation: In the example above, the Candidate class implements the Comparable interface.
Candidate class has 4 attributes, id, name, college, and year. The constructor method assigns values to the object 
variables. As we are implementing a Comparable interface, it is mandatory to implement the compareTo() method. We can 
use this method to compare two candidates. It will return a positive value if the first candidate is greater than the 
second one. Negative if the second one is greater and zeroes if both are the same.

## Types of Functional interfaces
   Functional interfaces in Java are mainly of four types:
1. Function
2. Supplier
3. Consumer
4. Predicate

1. Function
   The function type functional interface receives a single argument, processes it, and returns a value. One of the 
   applications of this type of functional interface is taking the key from the user as input and searching for the value 
   in the map for the given key.

Syntax:

@FunctionalInterface
public interface Function<T, R>{
R apply(T t);
}
Explanation: @FunctionalInterface is an annotation to ensure our interface is functional only. The function takes two 
generic types. The first one T is the type it takes a parameter and R is the return type of the abstract method. 

## Abstract Method : apply() is the abstract method of the Function.

Example:

For instance, say we have data of employees. In this data, we can add new employees using the add() method, and we can 
search for existing employees using the Function interface.

import java.util.function.Function;
import java.util.*;
public class Sample{

    // to store details of the employee
    private static HashMap<Integer, String> Employee = new HashMap<>();
    // add method to add employee details to the hashmap
    public static void add(String name, int ID){
        if(!Employee.containsKey(ID)){
            Employee.put(ID,name);
        }else
            System.out.println("Employee already Registered");
    }
    
    // main method
    public static void main(String[] args){
        
        // function to get the name of the employee name from its id
        Function<Integer, String> getEmploye = (Integer ID) -> {
            if(Employee.containsKey(ID)) return Employee.get(ID);
            else
                return "Invalid ID";
        };

        
        // adding elements to the hashmap
        add("Tom Jones",1045);
        add("Nancy Smith", 1065);
        add("Deborah Sprightly", 1029);
        add("Ethan Hardy", 1025);
        
        // using getEmploye method (of Function) of Function to fetch name of the employee
        System.out.println("ID = 1029, Name = "+getEmploye.apply(1029));
    }
}

Output:

ID = 1029, Name = Deborah Sprightly // when we try to search using key it always return value associated with key.

We are importing Function, a functional interface in our class. Employee HashMap stores the id and name of the employee. 
add() method checks if the id already exists, else it adds it to the hashmap. In the main method, we are using the Function
interface to define get that returns the name of the employee from their id. We are using a lambda expression to implement
the logic for get. apply() is the name of the abstract method of the Function interface.

1.1 Bi-Function
    Bi-function is just like a function except it takes two arguments. Two arguments are must in Bi-function. Just like 
    a function it also returns a value.

## UnaryOperator and BinaryOperator Interfaces
   Unary and Binary are two functional interfaces. Unary extends Function and Binary extends Bi-function functional 
   interface. Thus, Unary excepts one argument and returns a value, Binary takes two arguments but they must be of the 
   same type. Also, the return value must be of the same type as the argument(s) for Unary and Binary operators.
A. UnaryOperator Interface
Syntax:

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T>{
// add methods here
}

Example: Let us take an example of not operator. It takes 1 or 0 and returns its complement.

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main{
public static void main(String args[]){
UnaryOperator<Integer> not = a -> a ^ 1;
System.out.println(not.apply(0));
}
}
Output:
1
Explanation: Xor with 1 returns the complement of the number. Thus, UnaryOperator takes a single integer value and 
returns its complement integer.

B. BinaryOperator Interface
Syntax:

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T>{
// add methods here
}

Example:

Given two numbers, let us take an example where the bitwise logical operator & (and) will perform the logical operation 
between two numbers.

import java.util.function.Function;
import java.util.function.BinaryOperator;

public class Main{
public static void main(String args[]){
BinaryOperator<Integer> and = (a,b) -> a & b;
System.out.println(and.apply(12, 4));
}
}
Output:
4
BinaryOperator takes two values of the same type i.e. Integer. It performs AND (&) operation on these two numbers and 
returns the result of it.

2. Supplier
   The supplier functional interface in Java is much like a functional interface, the only difference is it doesn't 
   take any arguments. On calling the supplier it simply returns a value. Supplier is a generic interface thus, it takes 
   the type of value in <> (Angular brackets) while implementing to be returned by the get() method.

## Abstract method : get() is the abstract method of the Supplier.
Syntax:
@FunctionalInterface
public interface Supplier<T>{
T get();
}

The supplier takes only one generic type, the type of data it is going to return. 

Example:

import java.util.function.Supplier;

public class Test {
public static void main(String[] args) {
Supplier<String> message = () -> "Hello There!";
System.out.println(message.get());
}
}

Output:
Hello There!
The supplier functional Interface is imported in our example above. We are using a lambda expression to implement the 
message of Supplier. It takes no parameters and returns a String. get() is the abstract method of the Supplier interface. 
Thus, to call message we have to use message.get().

3. Consumer
   The Consumer functional interface in Java accepts a single gentrified argument and doesn't return any value.
## Abstract Method : accept() is the abstract method of the Consumer.
Syntax:


@FunctionalInterface
public interface Consumer<T>{
void accept(T t);
}

The consumer takes one generic type, the type of data it is going to take as a parameter. 

A. BiConsumer
   It takes two arguments one generic, and the other of primitive type. It also doesn't return a value.

Example:

import java.util.function.BiConsumer;

public class Test {
public static void main(String[] args) {
BiConsumer<Integer, Integer> eligibility = (Integer age, Integer percentage) -> {
if (age > 14 && percentage > 75)
System.out.println("You're eligible to participate in school elections");
else
System.out.println("The eligibility criteria is Age > 14 and Percentage > 75");
};

        eligibility.accept(16, 89);
    }  
}

Output:
You're eligible to participate in school elections

-- To stand in school elections, one must be above the age of 14 and must be at least scoring 75 in the previous grade. 
   To ensure this, we are using Bi-consumer which takes two integer values. It checks for the condition and prints the 
   result. Bi-consumer doesn't return a value just like the Consumer functional interface.

4. Predicate
   The predicate functional interface in Java takes a single argument and returns a boolean value.
   It is usually used in filtering values from the collection. It is also a specialization of a Function that takes a 
   gentrified argument or a single argument and returns a boolean.
   The predicate is much like a metal detecting machine. It tests each object. If the object is detected to be metal,
   it sends signals in the form of sound or light, i.e. returns true. If the object is not metal, it simply checks 
   another object or returns false.

-- Predicate interface in Java has 3 default methods and(),negate(), and or and 1 static method isEqual() other than 
   abstract method test.

## Abstract method : test() is the name given to its abstract method.
Syntax:

public interface Predicate<T>{
boolean test(T t);
}

Predicate's abstract method returns a boolean value. It takes a parameters of the type T. 

Example:

import java.util.*;
import java.util.function.Predicate;

public class Test {
public static void main(String[] args) {
Predicate<String> checkLength = (String s) -> s.length() == 8;
System.out.println("Functional Interfaces having length 8 are:-");
List<String> FunctionalInterfaces = Arrays.asList("Predicate", "Function", "Consumer", "Supplier");
FunctionalInterfaces.forEach(x -> {
if (checkLength.test(x)) {
System.out.println(x);
}
}
);
}
}

Output:

Functional Interfaces having length 8 are:-
Function
Consumer
Supplier

In the above example, we use a predicate functional interface. It takes a string and returns a boolean. It is mostly 
used to filter the list. We are printing the elements whose length is 8. checkLength returns true if the length is 8, 
else it returns false.

B. Bi-Predicate
   It is an extension of the Predicate Functional Interface. It takes two arguments instead of one and returns a 
   boolean value. Bi-Predicate can be implemented just like Predicate, the only difference being that we will have to 
   import BiPredicate and pass two parameters instead of one.

## Primitive Function Specializations
   Since primitive data type cannot be passed as a parameter to a generic type argument. For instance, instead of T, 
   R of R apply (T t) of Function <T, R> we cannot pass int, double, float, etc primitive types.

-- In functional interfaces and Streams, some classes are specifically defined so that int, long, and double can be 
   operated like generics i.e. without boxing in the wrapper class. This is called a type with primitive specialization.

-- There are various versions of the Function interface for frequently used primitive data types such as int, double, 
   long, and their combinations in argument as well as return types.

-- IntFunction, LongFunction, DoubleFunction: argument type is specified in the Function name, return type is parameterized.
-- ToIntFunction, ToLongFunction, ToDoubleFunction: return type is mentioned in the function name, arguments are parameterized.
-- DoubleToIntFunction, DoubleToLongFunction, IntToDoubleFunction, IntToLongFunction, LongToIntFunction, LongToDoubleFunction: 
   argument and return type are specified in the function itself.

## key Points
Functional interface can have only one abstract method. It can contain multiple default and static methods. We use
@FunctionalInterface Annotation is not mandatory, but it is useful to ensure that the interface has only one abstract method.
abstract keyword is optional as by default all the methods of the interface are abstract only.

## The java.util.function contains various in-built functional interfaces from Java 8 onwards like Function, Consumer, 
Supplier, etc.
