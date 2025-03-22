## inheritance

Parent class --> base class -- > super class
child class --> subclass --- >Derived Class


     Mobile    - Parent class / Super class / Base class
        
        |

     SmartPhone  - Child class / Sub class  / Derived class 

## object -- super class for every class in Java

## The super Keyword

The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used.

It is used to differentiate the members of superclass from the members of subclass, if they have same names.

It is used to invoke the superclass constructor from subclass

## Invoking Superclass constructor

If a class is inheriting the properties of another class, the subclass automatically acquires the default constructor 
of the superclass. But if you want to call a parameterized constructor of the superclass, you need to use the 
super keyword as shown below.

super(value);

## IS-A Relationship

IS-A is a way of saying: This object is a type of that object.
Animal is the superclass of Mammal class.
Animal is the superclass of Reptile class.
Mammal and Reptile are subclasses of Animal class.
Dog is the subclass of both Mammal and Animal classes.
Now, if we consider the IS-A relationship, we can say −

Mammal IS-A Animal
Reptile IS-A Animal
Dog IS-A Mammal
Hence: Dog IS-A Animal as well

## The instanceof Keyword

Let us use the instanceof operator to check determine whether Mammal is actually an Animal, 
and dog is actually an Animal.

Mammal instanceof Animal ---> it return true value if its subclass of Animal.

## HAS-A relationship

These relationships are mainly based on the usage. This determines whether a certain class HAS-A certain thing. 
This relationship helps to reduce duplication of code as well as bugs.