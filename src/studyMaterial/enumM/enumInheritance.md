
## Inheriting a Class from an enum Class
   In Java, enum classes are final by default. Hence, we cannot inherit other classes from it. For example,

enum A {
// enum constants
// fields and methods
}

class B extends A {
public static void main(String[] args) {
// statements
}
}

# Error: cannot inherit from final A
Inheriting an enum Class from Another Class
We cannot extend enum classes in Java. It is because all enums in Java are inherited from java.lang.Enum. 
And extending multiple classes (multiple inheritance) is not allowed in Java.

For example,

class A {
// class body
}

enum B extends A {
// class body
}
This will generate an error.

## Java Enum and Interface
   We cannot inherit enum classes in Java. However, enum classes can implement interfaces.

## Example: enum implementing interface

interface Pizza {
public void displaySize();
}

enum Size implements Pizza {
SMALL, MEDIUM, LARGE, EXTRALARGE;

public void displaySize() {
System.out.println("The size is " + this);
}
}


class Main {
public static void main(String[] args) {
Size.MEDIUM.displaySIze();
}
}

Output

The size is MEDIUM
In the above example, we have created an enum class Size. This class is implementing the Pizza interface.

Since we are implementing an interface, we have provided an implementation of the abstract method displaySize() inside the enum class.