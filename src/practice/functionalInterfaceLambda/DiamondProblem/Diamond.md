## What is the Diamond Problem generally?
The "diamond problem" happens in multiple inheritance (like in C++) where a class inherits from two classes that 
have the same method.
It creates confusion: which version of the method should the subclass inherit?
It looks like a diamond:

      A
     / \
    B   C
     \ /
      D
Where D inherits from both B and C, and both B and C inherited from A.

❓ Diamond Problem in Functional Interfaces?
In Java, classes cannot do multiple inheritance (no multiple class inheritance).
However, interfaces can be multiple inherited — and that's where the diamond problem could happen.

BUT, Java avoids the diamond problem with default methods in interfaces.

✅ Example:

interface A {
default void show() {
System.out.println("A's show");
}
}

interface B {
default void show() {
System.out.println("B's show");
}
}

@FunctionalInterface
interface C extends A, B {
// Compilation error unless you explicitly handle the conflict
void doSomething();
}
🔴 Problem:

C inherits two different show() default methods (A's and B's).
Java needs you to override and resolve which show() you want.
🛠 How to fix it?
You must override the conflicting method manually:

@FunctionalInterface
interface C extends A, B {
void doSomething(); // functional interface: exactly one abstract method

    @Override
    default void show() {
        A.super.show(); // or B.super.show(), you must choose
    }
}
Here, in C, we decide which show() we want (A's or B's).

⚡ Important:
Functional Interface ➔ only one abstract method is allowed.
Default methods don't count as abstract — so multiple interfaces with default methods can still be combined.
Conflict happens only if same signature exists, and you must resolve it.

Concept	                  Explanation
Diamond problem	         Multiple inheritance causes confusion about method to inherit
Java solution	         Interfaces require you to override and resolve conflict manually
Functional interface	 Must still have exactly one abstract method, default methods don't count
How to resolve	         Use InterfaceName.super.methodName() inside override