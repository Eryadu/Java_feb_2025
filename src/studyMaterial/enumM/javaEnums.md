## https://www.programiz.com/java-programming/enums

## Java enums
   In Java, an enum (short for enumeration) is a type that has a fixed set of constant values. We use the enum keyword 
   to declare enums. For example,

enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}
Here, we have created an enum named Size. It contains fixed values SMALL, MEDIUM, LARGE, and EXTRALARGE.
These values inside the braces are called enum constants (values).
Note: The enum constants are usually represented in uppercase.

## Example 1: Java Enum

enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
public static void main(String[] args) {
System.out.println(Size.SMALL);
System.out.println(Size.MEDIUM);
}
}
Output:
SMALL
MEDIUM
As we can see from the above example, we use the enum name to access the constant values.
Also, we can create variables of enum types. For example,

Size pizzaSize;
Here, pizzaSize is a variable of the Size type. It can only be assigned with 4 values.

pizzaSize = Size.SMALL;
pizzaSize = Size.MEDIUM;
pizzaSize = Size.LARGE;
pizzaSize = Size.EXTRALARGE;

## Example 2: Java Enum with the switch statement

enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
Size pizzaSize;
public Test(Size pizzaSize) {
this.pizzaSize = pizzaSize;
}
public void orderPizza() {
switch(pizzaSize) {
case SMALL:
System.out.println("I ordered a small size pizza.");
break;
case MEDIUM:
System.out.println("I ordered a medium size pizza.");
break;
default:
System.out.println("I don't know which one to order.");
break;
}
}
}

class Main {
public static void main(String[] args) {
Test t1 = new Test(Size.MEDIUM);
t1.orderPizza();
}
}

Output:
I ordered a medium size pizza.
In the above program, we have created an enum type Size. We then declared a variable pizzaSize of the Size type.
Here, the variable pizzaSize can only be assigned with 4 values (SMALL, MEDIUM, LARGE, EXTRALARGE).
Notice the statement,

Test t1 = new Test(Size.MEDIUM);
It will call the Test() constructor inside the Test class. Now, the variable pizzaSize is assigned with the MEDIUM constant.

Based on the value, one of the cases of the switch case statement is executed.

## Enum Class in Java
   In Java, enum types are considered to be a special type of class. It was introduced with the release of Java 5.
   An enum class can include methods and fields just like regular classes.

enum Size {
constant1, constant2, …, constantN;

    // methods and fields	
}
## Note : When we create an enum class, the compiler will create instances (objects) of each enum constants. 
   Also, all enum constant is always public static final by default.

## Example 3: Java Enum Class

enum Size{
SMALL, MEDIUM, LARGE, EXTRALARGE;

public String getSize() {

    // this will refer to the object SMALL
    switch(this) {
      case SMALL:
        return "small";

      case MEDIUM:
        return "medium";

      case LARGE:
        return "large";

      case EXTRALARGE:
        return "extra large";

      default:
        return null;
      }
}

public static void main(String[] args) {

    // call getSize()
    // using the object SMALL
    System.out.println("The size of the pizza is " + Size.SMALL.getSize());
}
}

## Methods of Java Enum Class
There are some predefined methods in enum classes that are readily available for use.

1. Java Enum ordinal()
The ordinal() method returns the position of an enum constant. For example,

ordinal(SMALL)
// returns 0

2. Enum compareTo()

The compareTo() method compares the enum constants based on their ordinal value. For example,

Size.SMALL.compareTo(Size.MEDIUM)
// returns ordinal(SMALL) - ordinal(MEDIUM)

3. Enum toString()

The toString() method returns the string representation of the enum constants. For example,

SMALL.toString()
// returns "SMALL"

4. Enum name()

The name() method returns the defined name of an enum constant in string form. The returned value from the name() 
method is final. For example,

name(SMALL)
// returns "SMALL"

5. Java Enum valueOf()

The valueOf() method takes a string and returns an enum constant having the same string name. For example,

Size.valueOf("SMALL")
// returns constant SMALL.

6. Enum values()

The values() method returns an array of enum type containing all the enum constants. For example,

Size[] enumArray = Size.value();

## Why Java Enums?
In Java, enum was introduced to replace the use of int constants.
Suppose we have used a collection of int constants.

class Size {
public final static int SMALL = 1;
public final static int MEDIUM = 2;
public final static int LARGE = 3;
public final static int EXTRALARGE = 4;
}
Here, the problem arises if we print the constants. It is because only the number is printed which might not be helpful.
So, instead of using int constants, we can simply use enums. For example,

enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}
This makes our code more intuitive.
## Also, enum provides compile-time type safety.
If we declare a variable of the Size type. For example,
Size size;
Here, it is guaranteed that the variable will hold one of the four values. Now, If we try to pass values other than 
those four values, the compiler will generate an error.

