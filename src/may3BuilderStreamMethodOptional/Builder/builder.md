
https://refactoring.guru/design-patterns/builder // Builder design pattern
https://www.geeksforgeeks.org/builder-pattern-in-java/. // Builder method
https://www.geeksforgeeks.org/builder-design-pattern/ // Builder design pattern
## The Builder Design Pattern is a creational pattern used in software design to construct a complex object step by step.
It allows the construction of a product in a step-by-step manner, where the construction process can change based on the
type of product being built. This pattern separates the construction of a complex object from its representation, 
allowing the same construction process to create different representations.

## Components of the Builder Design Pattern
1. Product
-- The Product is the complex object that the Builder pattern is responsible for constructing.
-- It may consist of multiple components or parts, and its structure can vary based on the implementation.
-- The Product is typically a class with attributes representing the different parts that the Builder constructs.

2. Builder
-- The Builder is an interface or an abstract class that declares the construction steps for building a complex object.
-- It typically includes methods for constructing individual parts of the product.
-- By defining an interface, the Builder allows for the creation of different concrete builders that can produce 
   variations of the product.

3. ConcreteBuilder
-- ConcreteBuilder classes implement the Builder interface, providing specific implementations for building each part
   of the product.
-- Each ConcreteBuilder is custmized to create a specific variation of the product.
-- It keeps track of the product being constructed and provides methods for setting or constructing each part.

4. Director
-- The Director is responsible for managing the construction process of the complex object.
-- It collaborates with a Builder, but it doesn’t know the specific details about how each part of the object is constructed.
-- It provides a high-level interface for constructing the product and managing the steps needed to create the complex object.

5. Client
-- The Client is the code that initiates the construction of the complex object.
-- It creates a Builder object and passes it to the Director to initiate the construction process.
-- The Client may retrieve the final product from the Builder after construction is complete.

## Steps to implement Builder Design Pattern
Below are the steps to implement Builder Design Pattern:
-- Create the Product Class: Define the object (product) that will be built. This class contains all the fields that 
   make up the object.
-- Create the Builder Class: This class will have methods to set the different parts of the product. Each method returns
   the builder itself to allow method chaining.
-- Add a Build Method: In the builder class, add a method called build() (or similar) that assembles the product and 
   returns the final object.
-- Use the Director (Optional): If needed, you can create a director class to control the building process and decide
   the order in which parts are constructed.
-- Client Uses the Builder: The client will use the builder to set the desired parts step by step and call the build()
   method to get the final product.

## When to use Builder Design Pattern?
The Builder design pattern is used when you need to create complex objects with a large number of optional components 
or configuration parameters. This pattern is particularly useful when an object needs to be constructed step by step, 
some of the scenarios where the Builder design pattern is beneficial are:

-- Complex Object Construction: When you have an object with many optional components or configurations and you want to 
   provide a clear separation between the construction process and the actual representation of the object.
-- Step-by-Step Construction: When the construction of an object involves a step-by-step process where different 
   configurations or options need to be set at different stages.
-- Avoiding constructors with multiple parameters: When the number of parameters in a constructor becomes too large, 
   and using telescoping constructors (constructors with multiple parameters) becomes unwieldy and error-prone.
-- Configurable Object Creation: When you need to create objects with different configurations or variations, and you 
   want a more flexible and readable way to specify these configurations.
-- Common Interface for Multiple Representations: When you want to provide a common interface for constructing different
   representations of an object.

## Note Tip : A builder doesn’t expose the unfinished product while running construction steps. 
              This prevents the client code from fetching an incomplete result.
## When not to use Builder Design Pattern?
-- While the Builder design pattern is beneficial in many scenarios, there are situations where it might be unnecessary.
   Here are some cases when you should avoid the Builder pattern:

1. Simple Object Construction:
   If the object you are constructing has only a few simple parameters or configurations, and the construction process 
    is straightforward, using a builder might be unnecessary.
2. Performance Concerns:
   In performance-critical applications, the additional overhead introduced by the Builder pattern might be a concern. 
   The extra method calls and object creations involved in the builder process could impact performance, especially if 
   the object construction is frequent.
3. Immutable Objects with Final Fields:
   While working with a language that supports immutable objects with final fields (e.g., Java’s final keyword), and the
   object’s structure is relatively simple, you might prefer using constructors with parameters or static factory methods.
4. Increased Code Complexity:
   Introducing a builder class for every complex object can lead to an increase in code complexity.
   If the object being constructed is simple and doesn’t benefit significantly from a step-by-step construction process,
   using a builder might add unnecessary complexity to the codebase.
5. Tight Coupling with Product:
   If the builder is tightly coupled with the product it constructs, and changes to the product require corresponding 
   modifications to the builder, it might reduce the flexibility and maintainability of the code.

