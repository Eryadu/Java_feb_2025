Package ??
Full qualified class
differentiate classes
for external code or class we export packages

## Packages
User defined
In-Build --> i.e. util, lang, io, nio,sql
i.e. System comes from lang package (by default)

optimise the code by import class /package
i.e. import static java.lang.System.*;
we dont need to write System.out.println, write out.println; --> it help to optimise the code.
## Packages follow name convention. It should be small letters.

## Exception --> which break the normal flow of  execution of the problem
## keyword to handle exception
try 
catch
finally
throw
throws

## Types of exceptions
1. Compile time
2. Run time

Throwable is super class in exception
   |
Exception
    |
RunTimeException
   |
ArithmeticException

## if it found any exception, it stops there, don't move to next statement until it fixed

## Error - we can't handle (downtime) i.e. memory error, power error (Any situation we can't recover gracefully)

## Point to note
-- Finally block
   Whatever you print in finally block, it will print. But it works only after try or catch block. We can't write finally block
   at top.
-- we can write super class (Exception e) to handle all type of exception but always write at last cause if we write at
   top then it would not allow other exception to work and run time it load all the class, so it effect on optimization.

## to create custom exception
   throw ----> to create a new exception (write logic actually)
   throws ---> added to the method signature // delicating your responsibility to someone else // someone will handle it
   
## Singlton class??
-- Set heap size ??
## In-term of garbage collector Enhancement in java 8 or java 11?