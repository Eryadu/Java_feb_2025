## In Java, errors and exceptions are types of throwable objects that indicate abnormal conditions during program 
   execution. They are part of Java's exception-handling mechanism, which helps manage runtime errors and maintain 
   program flow. Here's a detailed explanation of errors and exceptions:

1. Errors
-- Definition: Errors represent serious problems that are typically beyond the control of the application. 
   They are usually caused by the environment in which the application is running (e.g., JVM or system resources).
-- Nature: Errors are unchecked (do not need to be declared or handled explicitly).
-- When they occur: Errors occur at runtime and are generally irrecoverable.
   Examples:
-- OutOfMemoryError: Thrown when the JVM runs out of memory.
-- StackOverflowError: Thrown when the stack overflows due to excessive recursion.
-- NoClassDefFoundError: Thrown when the JVM cannot find a class definition.

-- Example of an Error:

public class ErrorExample {
public static void main(String[] args) {
recursiveMethod(); // Causes StackOverflowError
}

    static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }
}

2. Exceptions
-- Definition: Exceptions represent conditions that a program might want to catch and handle. They are typically caused
   by the application's logic.
-- Nature: Exceptions can be checked (must be handled or declared) or unchecked (do not need to be handled explicitly).
-- When they occur: Exceptions occur at runtime or compile-time (for checked exceptions).

## Types of Exceptions:

1. Checked Exceptions:These are exceptions that are checked at compile-time.
   The programmer must handle them using try-catch blocks or declare them using the throws keyword.
   Examples:
-- IOException: Thrown during input/output operations.
-- SQLException: Thrown during database access.
-- FileNotFoundException: Thrown when a file is not found.

Example of a Checked Exception:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
public static void main(String[] args) {
try {
File file = new File("nonexistent.txt");
Scanner scanner = new Scanner(file); // Throws FileNotFoundException
} catch (FileNotFoundException e) {
System.out.println("File not found: " + e.getMessage());
}
}
}

2. Unchecked Exceptions:These are exceptions that are checked at runtime.
   They are subclasses of RuntimeException and do not need to be explicitly handled.
Examples:
-- NullPointerException: Thrown when trying to access a null object.
-- ArithmeticException: Thrown during invalid arithmetic operations (e.g., division by zero).
-- ArrayIndexOutOfBoundsException: Thrown when accessing an invalid array index.

Example of an Unchecked Exception:

public class UncheckedExceptionExample {
public static void main(String[] args) {
int[] numbers = {1, 2, 3};
System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
}
}

## Key Differences Between Errors and Exceptions

Feature	                                        Errors	                                Exceptions
Type	                                       Unchecked	                        Checked or Unchecked
Cause	                            External factors (e.g., JVM, system)	          Application logic
Recoverable	                               Usually irrecoverable	                  Often recoverable
Handling	                                Not typically handled	            Must be handled (checked exceptions)
Examples	                        OutOfMemoryError, StackOverflowError	      IOException, NullPointerException

## Exception Handling in Java
   Java provides a robust mechanism to handle exceptions using the following keywords:

1. try: Defines a block of code to be tested for errors.
2. catch: Defines a block of code to handle the exception.
3. finally: Defines a block of code that is always executed, regardless of whether an exception occurs.
4. throw: Used to explicitly throw an exception.
5. throws: Declares exceptions that a method might throw.

Example of Exception Handling:

public class ExceptionHandlingExample {
public static void main(String[] args) {
try {
int result = divide(10, 0); // Throws ArithmeticException
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
} finally {
System.out.println("This block always executes.");
}
}

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

## Custom Exceptions
   You can create your own exceptions by extending the Exception class (for checked exceptions) or the RuntimeException class
   (for unchecked exceptions).

Example of a Custom Exception:
class CustomException extends Exception {
public CustomException(String message) {
super(message);
}
}

public class CustomExceptionExample {
public static void main(String[] args) {
try {
throw new CustomException("This is a custom exception.");
} catch (CustomException e) {
System.out.println(e.getMessage());
}
}
}

## Best Practices for Exception Handling

-- Catch Specific Exceptions: Avoid catching generic exceptions like Exception or Throwable.
-- Use Finally for Cleanup: Use the finally block to release resources (e.g., closing files or database connections).
-- Avoid Silent Catches: Always log or handle exceptions properly instead of ignoring them.
-- Use Custom Exceptions: Create custom exceptions for better readability and maintainability.
