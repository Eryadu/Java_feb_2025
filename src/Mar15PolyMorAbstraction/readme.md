
java compiler written in which language?
compiler?


## Upcasting -- child class object assigned to parent class ref
i.e. Shape sh = new Rectangle();
Reference type             Object type
Remember, the compiler looks at the reference type to decide whether you can call a particular method on that reference.
With a "sh" reference to a "Shape", the compiler cares only if class "Shape" has the method you’re invoking on a "sh" reference. 
But at runtime, the JVM does not look at the reference type ("sh") but at the actual Rectangle object on the heap.
So if the compiler has already approved the method call, the only way it override!

## Compile time (Static polymorphism) to check signature or methode (method overloading happen in same class)
javac test.java -----> test.class // to compile the code // command used in terminal to compile program

## Run time -- to check actual logic or output (method overriding happen during inheritance, dynamic polymorphism)
java test ------> to run the class // command used in terminal to run program 

## Polymorphism
Compile time
Run time -- > check type of method and type of object which is being called

## annotation used at compile time to check either we are overriding (any other) the correct method 

## Method overridden --same name but different implementation. It achieved only when we do inheritance

## SOLID Principal
S- Single responsibility
O- open close principal --- open for extension but close for modification 

 ## IS_A relationship inheritance work on this relationship.

## Has_A_relationship -->composition i.e. name(composite) -- firstname middlename lastname(entity-- cannot break further)

## Composition
## Abstraction showing only essential details

1. abstract class [0-100%]
2. Interface [100%]

## Property of abstract 

-- Object can not be created for abstract class
-- abstract methods does not have body
-- if a class contains abstract method, class must be abstract
-- an abstract class may or may not have abstract methods...
-- if any class inherits from abstract class it must implement all abstract methods.
   any non-abstract class inherit from abstract class , must implement all abstract method

## concrete methode(Have body) opposite to abstract method (Without body)