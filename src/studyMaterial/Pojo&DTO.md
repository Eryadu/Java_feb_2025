🧱 What is a POJO?
  POJO stands for Plain Old Java Object.
  It’s just a simple Java class that doesn’t extend or implement any special Java framework classes or interfaces —
  it’s just a clean, straightforward object with fields, constructors, getters, and setters.

## Characteristics of a POJO

-- No Framework Dependency: It does not extend or implement framework-specific classes/interfaces.
-- No Annotations Required: It does not need annotations (like @Entity, @Component, etc.) to function.
-- Follows Standard Java Conventions:
   Has private fields.
   Provides getters and setters (if mutable).
   May override equals(), hashCode(), and toString().
-- No Restrictions on Naming: Unlike JavaBeans, POJOs do not strictly require a no-arg constructor or specific method naming.

🔧 Example of a POJO (Without Lombok)
public class User {
private String name;
private int age;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

## ⚡ POJO with Lombok
   Lombok helps you cut down all that boilerplate code:

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
private String name;
private int age;
}
With just a few annotations:

@Data: Generates getters, setters, toString(), equals(), hashCode()
@NoArgsConstructor: No-argument constructor
@AllArgsConstructor: All-arguments constructor

## POJO vs JavaBean

Feature	               POJO	                                    JavaBean
Constructor	           Can have any constructor	                Must have a no-arg constructor
Access Modifiers	   Fields can be public, private, etc.	    Fields are private, accessed via getters/setters
Serializable	       Not required	                            Should implement Serializable
Annotations	           No annotations needed	                May use annotations (e.g., @Component)
Framework Dependency   None	                                    Often used in frameworks (Spring, Jakarta EE)

## Why Use POJOs?

-- Simplicity : Easy to create and understand.
-- Reusability: Can be used across different frameworks.
-- Testability: Easier to unit test since they don’t depend on external libraries.
-- Flexibility: Can be enhanced later (e.g., converted to a JavaBean or JPA entity).

## POJOs in Modern Frameworks

-- Spring: Uses POJOs as @Component, @Service, etc.
-- Hibernate/JPA: POJOs become entities with @Entity.
-- Jackson: POJOs are used for JSON serialization/deserialization.

## Conclusion
   A POJO is a simple, lightweight Java object without framework constraints, making it highly versatile in different
   programming scenarios. It forms the basis for many enterprise applications when combined with frameworks like Spring,
   Hibernate, etc.

-----------------------------------------------------------------------------------------------------------------------
## "DTO" stands for Data Transfer Object.

It’s a design pattern used mainly to transfer data between different layers of an application, especially in situations like:
-- Between the backend and frontend of a web app
-- Between microservices
-- When interacting with a database

## Why use a DTO?
-- To encapsulate data in a clean, structured way
-- To avoid exposing internal data structures (like database models) directly
-- To control what data is sent and received (security & performance)
-- To optimize payloads (e.g., exclude unnecessary fields)
Example (in TypeScript/JavaScript):
// User entity (from database)
class User {
id: number;
username: string;
password: string;
email: string;
}

// User DTO (sent to frontend)
class UserDTO {
id: number;
username: string;
email: string;
}
You’d map a User object to a UserDTO before sending it to the frontend, excluding sensitive data like password.

----------------------------------------------------------------------------------------------------------------------