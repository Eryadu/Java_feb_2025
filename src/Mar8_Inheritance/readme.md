Garbage Collector --> it has no specific time, when it will run, it runs at any time before, middle,end of program.

String ---> thread safe
String Buffer ---> thread safe (Sync)----- if two treads are accessing at same time then its inconsistency
String Builder ---> not thread safe( do not sync) --->

## OOPS - Object -- real world entity - physical entity
          Class -- logical entity
          Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.
          It simplifies software development and maintenance by providing some concepts.


-- The implementations of OOPs concepts are easier.
-- The execution of the OOPs is faster than procedural-oriented programming.
-- OOPs provide code reusability so that a programmer can reuse an existing code.
-- OOPs help us to keep the important data hidden.

## Pillar of OOP
1. Inheritance
   something which can be inherited from previous generation
-- Code Reusability: The basic need of an inheritance is to reuse the features. 
   If you have defined some functionality once, by using the inheritance you can easily use them in other classes 
   and packages.
-- Extensibility: The inheritance helps to extend the functionalities of a class. If you have a base class with 
   some functionalities, you can extend them by using the inheritance in the derived class.
-- Implantation of Method Overriding: Inheritance is required to achieve one of the concepts of Polymorphism 
   which is Method overriding.
-- Achieving Abstraction: Another concept of OOPs that is abstraction also needs inheritance.

Note − A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
Constructors are not members, so they are not inherited by subclasses, 
but the constructor of the superclass can be invoked from the subclass.

2. Polymorphism
   Poly -- Many, morphism -- Forms (On thing behave differently in diff situation)

## Method overloading - Compile time polymorphism
## Method Overriding - Runtime polymorphism

3. Abstraction -- Hiding complex detail from user, only showing whatever is necessary i.e. Mobile Phone
 abstract -- some form of idea , overview

4. Encapsulation
 wrapping up the data into single unit
 you are only allowing user to access the data which you only want them to access
 Whatsapp --> status ---> number of users who can see the status
 banking app --- you can see only your detail.

## Data Hiding - these two come under Data hiding
1. Abstraction
2. Encapsulation


## Multi-level inheritance is not supported in Java directly
## Multiple inheritance is not supported in Java directly. These can be accessed by interfaces (which support it)