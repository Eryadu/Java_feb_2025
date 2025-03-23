## In Java, the throws keyword is used in method signatures to declare that a method might throw one or more 
   exceptions. It indicates to the caller of the method that they need to handle these exceptions (using try-catch) or 
   propagate them further up the call stack (by declaring throws in their own method signature).

## How throws Works

1. Declaration: The throws keyword is used in a method signature to specify the exceptions that the method might throw.
2. Propagation: If a method declares an exception using throws, the caller of the method must either:
   Handle the exception using a try-catch block.
   Declare the same exception using throws in their own method signature.
3. Checked Exceptions: The throws keyword is primarily used for checked exceptions (exceptions that are checked at compile-time).
   Unchecked exceptions (e.g., NullPointerException, ArithmeticException) do not need to be declared.

Syntax of throws

returnType methodName(parameters) throws ExceptionType1, ExceptionType2, ... {
// Method body
}
-- Example of throws
1. Declaring throws in a Method
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
// Method declares that it might throw IOException
public static void readFile(String filePath) throws IOException {
FileReader file = new FileReader(filePath); // Might throw IOException
// Perform file operations
file.close();
}

    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt"); // Caller handles the exception
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
Explanation:
The readFile method declares that it might throw an IOException using the throws keyword.
The caller (main method) must handle the exception using a try-catch block.

2. Propagating Exceptions with throws
   If the caller does not want to handle the exception, they can propagate it further up the call stack by declaring 
   throws in their own method signature.

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
// Method declares that it might throw IOException
public static void readFile(String filePath) throws IOException {
FileReader file = new FileReader(filePath); // Might throw IOException
// Perform file operations
file.close();
}

    // Caller propagates the exception instead of handling it
    public static void main(String[] args) throws IOException {
        readFile("nonexistent.txt"); // Exception is propagated
    }
}
Explanation:
The main method propagates the IOException instead of handling it.
If the exception occurs, the program will terminate and print the stack trace.

## Key Points About throws

1. Checked Exceptions: The throws keyword is mainly used for checked exceptions. Unchecked exceptions 
   (e.g., NullPointerException, ArithmeticException) do not need to be declared.
2. Multiple Exceptions: A method can declare multiple exceptions using throws. Separate the exceptions with commas.

public void myMethod() throws IOException, SQLException {
// Method body
}
3. Propagation: If a method declares an exception using throws, the caller must handle or propagate it.
4. Method Overriding: When overriding a method in a subclass, the overriding method can:
-- Throw the same exception as the superclass method.
-- Throw a subclass exception of the superclass method's exception.
-- Not throw any exception.

Example of Multiple Exceptions with throws
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleThrowsExample {
// Method declares that it might throw multiple exceptions
public static void processFile(String filePath) throws IOException, SQLException {
FileReader file = new FileReader(filePath); // Might throw IOException
// Simulate a SQL operation that might throw SQLException
if (filePath.isEmpty()) {
throw new SQLException("File path is empty.");
}
file.close();
}

    public static void main(String[] args) {
        try {
            processFile("nonexistent.txt"); // Caller handles the exceptions
        } catch (IOException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

## Difference Between throw and throws

Feature	                                      throw	                                           throws
Usage	                      Used to explicitly throw an exception.	    Used to declare exceptions in a method signature.
Location	                            Inside a method body.	                        In a method signature.
Purpose	                            To throw a specific exception.	        To indicate that a method might throw exceptions.
Example                       throw new IOException("File not found");	      public void myMethod() throws IOException;

## Best Practices for Using throws

-- Declare Specific Exceptions: Avoid declaring generic exceptions like Exception or Throwable.
-- Handle or Propagate: Always handle exceptions using try-catch or propagate them using throws.
-- Document Exceptions: Use JavaDoc to document the exceptions a method might throw.
-- Avoid Overusing throws: Only declare exceptions that are likely to occur and are meaningful to the caller.
