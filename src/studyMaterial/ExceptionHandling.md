## Exception handling in Java is a mechanism to handle runtime errors or exceptional conditions that disrupt the 
   normal flow of a program. It ensures that the program can gracefully handle unexpected situations, such as invalid 
   input, file not found, or network issues, without crashing.

1. try: Defines a block of code to be tested for errors.
2. catch: Defines a block of code to handle the exception.
3. finally: Defines a block of code that is always executed, regardless of whether an exception occurs.
4. throw: Used to explicitly throw an exception.
5. throws: Declares exceptions that a method might throw.

## How Exception Handling Works
-- The code that might throw an exception is placed inside a try block.
-- If an exception occurs, the corresponding catch block is executed to handle it.
-- The finally block is executed after the try and catch blocks, regardless of whether an exception occurred.
-- Exceptions can be explicitly thrown using the throw keyword.
-- Methods can declare exceptions they might throw using the throws keyword.

-- Syntax of Exception Handling
try {
// Code that might throw an exception
} catch (ExceptionType1 e1) {
// Handle ExceptionType1
} catch (ExceptionType2 e2) {
// Handle ExceptionType2
} finally {
// Code that always executes
}

-- Example of Exception Handling

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
Output:
Error: Division by zero is not allowed.
This block always executes.

## Types of Exceptions
1. Checked Exceptions:Checked at compile-time.
   Must be handled using try-catch or declared with throws.
   Examples: IOException, SQLException.
2. Unchecked Exceptions:Checked at runtime.
   Do not need to be explicitly handled.
   Examples: NullPointerException, ArithmeticException.

## Key Concepts in Exception Handling

1. Multiple Catch Blocks: You can have multiple catch blocks to handle different types of exceptions.
try {
int[] numbers = {1, 2, 3};
System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out of bounds: " + e.getMessage());
} catch (ArithmeticException e) {
System.out.println("Arithmetic error: " + e.getMessage());
}
2. Finally Block : The finally block is used for cleanup activities, such as closing files or releasing resources. 
   It always executes, even if an exception occurs or a return statement is encountered.

try {
// Code that might throw an exception
} catch (Exception e) {
System.out.println("Exception caught: " + e.getMessage());
} finally {
System.out.println("Finally block executed.");
}
3. Throw Keyword: The throw keyword is used to explicitly throw an exception.

if (age < 18) {
throw new ArithmeticException("Age must be 18 or older.");
}
4. Throws Keyword: The throws keyword is used in a method signature to declare that the method might throw an exception.

public void readFile(String filePath) throws IOException {
// Code that might throw IOException
}

## Custom Exceptions : You can create your own exceptions by extending the Exception class (for checked exceptions) or 
   the RuntimeException class (for unchecked exceptions).

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
-- Do Not Swallow Exceptions: Avoid empty catch blocks that hide errors.

## Common Exception Handling Scenarios

1. File Handling:
try {
FileReader file = new FileReader("file.txt");
} catch (FileNotFoundException e) {
System.out.println("File not found: " + e.getMessage());
}
2. Database Operations:
try {
// Database connection and query execution
} catch (SQLException e) {
System.out.println("Database error: " + e.getMessage());
}
3. Input Validation:
try {
int age = Integer.parseInt("abc"); // Throws NumberFormatException
} catch (NumberFormatException e) {
System.out.println("Invalid input: " + e.getMessage());
}
