## Access modifier are divide modifiers into two groups: ref w3c 

1. Access Modifiers - controls the access level
2. Non-Access Modifiers - do not control access level, but provides other functionality

## AccessModifier
## Classes
- public	The class is accessible by any other class
- default	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. 
## method
- public	The code is accessible for all classes
- private	The code is only accessible within the declared class
- default	The code is only accessible in the same package. This is used when you don't specify a modifier. 
- protected	The code is accessible in the same package and subclasses. 

## Non-Access Modifiers
For classes, you can use either final or abstract:

- final	The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)
- abstract	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. 

For attributes and methods, you can use the one of the following:

- final	Attributes and methods cannot be overridden/modified
- static	Attributes and methods belongs to the class, rather than an object
- abstract	Can only be used in an abstract class, and can only be used on methods. 
  The method does not have a body, for example abstract void run();. 
  The body is provided by the subclass (inherited from). 
- transient	Attributes and methods are skipped when serializing the object containing them
- synchronized	Methods can only be accessed by one thread at a time
- volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"


## Protected
The protected access modifier in object-oriented programming (OOP) provides a balance between private and public access. 
It allows controlled access to class members while maintaining encapsulation.
When to Use Protected:

Use protected when you want to allow access to class members only within the class itself and its subclasses.
It is ideal for designing class hierarchies where subclasses need to access or modify the internal state of the parent class.

##Comparison with Other Access Modifiers:

Access Modifier	  Class	    Subclass	  Package	World
Private	           Yes	       No	        No	      No
Protected	       Yes	       Yes	        Yes    	  No
Public	           Yes	       Yes	        Yes	      Yes
Default	           Yes	       No	        Yes	      No