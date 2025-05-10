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

3. Instance Method Reference of an Arbitrary Object of a Particular Type (Class)
-- You use ClassName::instanceMethod when the instance is passed implicitly (e.g., through a stream or lambda).
-- Java understands that the method will be called on each object passed in.
check example : we create object and passed as Argument
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


## what is the major difference between lambda and method reference?

The major difference between a lambda expression and a method reference in Java 8 is mainly syntactic clarity and 
intentionality, not functionality. Both are used to pass behavior (i.e., functions) as arguments, but they
differ in how that behavior is expressed.

🔑 Key Differences
Feature	        Lambda Expression	                        Method Reference
Syntax	        Explicit and flexible	                    Concise shorthand
Readability	S   lightly more verbose	                    More readable when only calling a method
Use Case	    Good for inline logic or custom behavior	Best when reusing existing methods
Structure	    args -> method(args)	                    ClassName::methodName

✅ Example
Lambda:
list.forEach(s -> System.out.println(s));

Method Reference (shorthand):
list.forEach(System.out::println);

Both are functionally the same, but:

-- Use lambdas when you want to write custom behavior inline.
-- Use method references when you're simply delegating to an existing method — it’s cleaner and easier to read.

🧠 Think of it this way:
Lambdas: You describe what to do.
Method references: You say which existing method should be used.


🧾 Method Reference vs Lambda Cheat Sheet
Use Case	                                              Method Reference	            Lambda Equivalent
1. Static method	                                    ClassName::staticMethod	        (args) -> ClassName.staticMethod(args)
2. Instance method of a specific object	                instance::instanceMethod	    (args) -> instance.instanceMethod(args)
3. Instance method of an arbitrary object (from class)	ClassName::instanceMethod	    (obj, args) -> obj.instanceMethod(args)
4. Constructor (no args)	                            ClassName::new	                () -> new ClassName()
5. Constructor (with args)	                            ClassName::new	                (args) -> new ClassName(args)
   
