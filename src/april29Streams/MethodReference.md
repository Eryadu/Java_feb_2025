## In Java 8, method references provide a concise way to refer to methods or constructors without invoking them. 
They are a shorthand for lambda expressions that simply call a method.

Note : Used mostly for Utility method as they used everywhere, and not gonna change typically

Syntax
ClassName::methodName
Or for instance methods:

object::methodName

## Types of Method References
1. Static Method Reference
(args) -> ClassName.staticMethod(args)
ClassName::staticMethod
Example:

List<String> list = Arrays.asList("a", "b", "c");
list.forEach(System.out::println);  // Calls System.out.println(s)

2. Instance Method Reference of a Particular Object
(args) -> instance.method(args)
instance::method
Example:

Consumer<String> printer = System.out::println;
printer.accept("Hello");  // Prints: Hello

3. Instance Method Reference of an Arbitrary Object of a Particular Type
(arg1, arg2) -> arg1.instanceMethod(arg2)
ClassName::instanceMethod
Example:

List<String> list = Arrays.asList("b", "a", "c");
list.sort(String::compareTo);  // Calls a.compareTo(b)

4. Constructor Reference
() -> new ClassName()
ClassName::new
Example:

Supplier<List<String>> listSupplier = ArrayList::new;
List<String> list = listSupplier.get();

## Why Use Method References?
-- Cleaner and more readable code.
-- Avoids boilerplate code in lambda expressions.