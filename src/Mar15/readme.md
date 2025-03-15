typescript to go ?
Why use string instead of int??

java compiler written in which language?
compiler?
Diff between method overloading and overriding?

Upcasting ?? child class object assigned to parent class ref

//upcasting (create the object of child class, but it refers to parent class during compile time)
// but at run time it ref to actual (child class (method or variable)).
// System.out.println(rectangle.perimeter); // we can't access rectangle variable, just access whatever (method or variable)     
//  in shape class (parent class) else other all variable or method are hidden. Property of PolyMorphism to hide data.

## Compile time (Static polymorphism) to check signature or methode (method overloading happen in same class)
javac test.java -----> test.class // to compile the code

## Run time -- to check actual logic or output (method overriding happen during inheritance, dynamic polymorphism)
java test ------> to run the class

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


## Abstraction showing only essential details
