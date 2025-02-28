infinite loop
for(; ;)
{
}

Try for loop

and Do calculator using Method

## Method
-- declare inside the parentheses of methode called "Parameters" , which are used to pass value to method
i.e. public void Test(int num)
-- Information can be passed to methods as a parameter. Parameters act as variables inside the method.
-- the value passed to Parameters is called "Arguments"
i.e. num =10;
-- When a parameter is passed to the method, it is called an argument.

## Method overloading
-- Method overloading, multiple methods can have the same name with different parameters:

## Constructor
-- Two types of Constructor 1. Default 2. Parameterized
-- A constructor in Java is a special method that is used to initialize objects. The constructor is called when 
  an object of a class is created.It can be used to set initial values for object attributes:
i.e. int x =10;
Scanner sc  = new Scanner(); // compare both statements int as Scanner, x as sc and 10 as new Scanner.
sc is object of class Scanner which is initialized by calling constructor Scanner().

Note --
-- the constructor name must match the class name, and it cannot have a return type (like void).
-- Also note that the constructor is called when the object is created.
-- All classes have constructors by default: if you do not create a class constructor yourself, 
Java creates one for you. However, then you are not able to set initial values for object attributes.
-- Constructors can also take parameters, which is used to initialize attributes.

## Class and Objects
-- A class is a template for objects, and an object is an instance of a class.
   When the individual objects are created, they inherit all the variables and methods from the class.

## Static vs. Public
-- Created a static method, which means that it can be accessed without creating an object of the class, 
   unlike public, which can only be accessed by objects.