## Representing an Optional Value
In Java, null is used to represent “nothing” or an “empty” result. Most often, a method returns null if it does not have
a result to return. This has been a source of frequent NullPointerException in Java programs. Consider printing the
year of birth of a person, like so:

Person ken = new Person(1, "Ken", Person.Gender.MALE, null, 6000.0);
int year = ken.getDob().getYear(); // Throws a NullPointerException
System.out.println("Ken was born in the year " + year);
T
he code throws a NullPointerException at runtime. The problem is in the return value of the ken.getDob()
method that returns null. Calling the getYear() method on a null reference results in the NullPointerException.
So, what is the solution? In fact, there is no real solution to this. Java 8 has introduced an Optional<T> class in the
java.util package to deal with NullPointerException gracefully. Methods that may return nothing should return an
Optional instead of null.

An Optional is a wrapper for a non-null value that may or may not contain a non-null value. Its isPresent()
method returns true if it contains a non-null value, false otherwise. Its get() method returns the non-null value if
it contains a non-null value, and throws a NoSuchElementException otherwise. This implies that when a method
returns an Optional, you must, as a practice, check if it contains a non-null value before asking it for the value. If
you use the get() method before making sure it contains a non-null value, you may get a NoSuchElementException
instead of getting a NullPointerException. This is why I said in the previous paragraph that there is no real solution
to the NullPointerException. However, returning an Optional is certainly a better way to deal with nulls as
developers will get used to using the Optional objects in the way they are designed to be used.

How do you create an Optional<T> object? The Optional<T> class provides three static factory methods to create
its objects.
• <T> Optional<T> empty(): Returns an empty Optional. That is, the Optional<T> returned
from this method does not contain a non-null value.
• <T> Optional<T> of(T value): Returns an Optional containing the specified value as the
non-null value. If the specified value is null, it throws a NullPointerException.  ---->Used only when sure about non-null value
-- under the hood it checks for null value .
• <T> Optional<T> ofNullable(T value): Returns an Optional containing the specified value
if the value is non-null. If the specified value is null, it returns an empty Optional.
-- Under the hood ofNullable is combination of empty() + of().

The following snippet of code shows how to create Optional objects:
// Create an empty Optional
Optional<String> empty = Optional.empty();

## You can use the ifPresent(Consumer<? super T> action) method of the Optional class to take an action on
the value contained in the Optional. If the Optional is empty, this method does not do anything. You can rewrite the
previous code to print the value in an Optional as follows:
// Create an Optional for the string "Hello"
Optional<String> str = Optional.of("Hello");
// Print the value in the Optional, if present
str.ifPresent(value -> System.out.println("Optional contains " + value));

## Note that if the Optional were empty, the code would not print anything.
The following are four methods to get the value of an Optional:
• T get(): Returns the value contained in the Optional. If the Optional is empty, it throws a
NoSuchElementException.
• T orElse(T defaultValue): Returns the value contained in the Optional. If the Optional is
empty, it returns the specified defaultValue.
• T orElseGet(Supplier<? extends T> defaultSupplier): Returns the value contained
in the Optional. If the Optional is empty, it returns the value returned from the specified
defaultSupplier.
• <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)
throws X extends Throwable: Returns the value contained in the Optional. If the Optional
is empty, it throws the exception returned from the specified exceptionSupplier.

-------------------------------------------------------------------------------------------------
In Java 8, the Optional class is a container object used to represent the presence or absence of a value. It helps 
avoid NullPointerException and makes your code more readable by explicitly handling null values.

✅ Why Use Optional?
Traditionally, Java APIs returned null to indicate the absence of a value, which often led to bugs. Optional provides
a better alternative by making it explicit whether a value might be missing.

📦 Declaration
Optional<String> name = Optional.of("Alice");
Optional<String> empty = Optional.empty();

🔍 Common Methods

        Method	                Description
Optional.of(value)	            Returns an Optional with a non-null value (throws if null).
Optional.ofNullable(value)	    Returns an Optional that may be null.
Optional.empty()	            Returns an empty Optional.
isPresent()	                    Returns true if a value is present.
ifPresent(Consumer)	            Executes code if value is present.
get()	                        Returns the value if present, else throws.
orElse(value)	                Returns the value if present, else returns default.
orElseGet(Supplier)	            Lazy version of orElse().
orElseThrow()	                Throws if no value is present.

-- Optional helps avoid null checks and NullPointerException.
-- Use it as a return type, not for fields or parameters.
-- Use Optional to force the caller to think about missing values.