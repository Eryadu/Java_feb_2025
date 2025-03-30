## An immutable class is a class whose state (data) cannot be modified after it is created. Java's built-in classes like 
   String, Integer, and LocalDate are immutable. Creating an immutable class involves certain design principles.

## Rules for Creating an Immutable Class

1. Declare the class as final → Prevents subclassing (to avoid mutable subclasses).
2. Make all fields private and final → Ensures direct modification is blocked.
3. No setter methods → Prevents external modification.
4. Initialize fields via constructor → Ensures controlled object creation.
5. Perform deep copy for mutable objects → Prevents modification via references.
6. Return defensive copies of mutable objects → Avoids exposing internal state.

Example: Immutable Class in Java

import java.util.Date;

public final class ImmutablePerson {
private final String name;
private final int age;
private final Date birthDate; // Mutable object (requires special handling)

    // Constructor (initializes all fields)
    public ImmutablePerson(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Defensive copy for mutable objects
        this.birthDate = new Date(birthDate.getTime());
    }

    // Only getters (NO setters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return defensive copy (not the original reference)
    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }

    // Test the immutable class
    public static void main(String[] args) {
        Date birthDate = new Date();
        ImmutablePerson person = new ImmutablePerson("Alice", 30, birthDate);

        System.out.println("Original: " + person);

        // Attempting to modify birthDate (should not affect the immutable object)
        birthDate.setTime(0);
        System.out.println("After modifying external date: " + person); // Unchanged
    }
}

Output:
Original: ImmutablePerson{name='Alice', age=30, birthDate=Wed Mar 31 14:45:20 IST 2023}
After modifying external date: ImmutablePerson{name='Alice', age=30, birthDate=Wed Mar 31 14:45:20 IST 2023}

Observation: Even if the original Date is modified, the ImmutablePerson remains unchanged.

## Why Immutable Classes?

✅ Thread-safe (no synchronization needed).
✅ Safe for caching (hash code remains constant).
✅ Better for HashMap keys (since they can't change).
✅ Prevents unintended side effects (defensive copying).

## Common Mistakes to Avoid

❌ Exposing mutable references (e.g., returning an array or Date directly).
❌ Allowing subclassing (make the class final).
❌ Adding setter methods.

## Final Thoughts : Immutable classes are widely used in Java for security, concurrency, and design simplicity. 
   Examples include String, Integer, BigDecimal, and LocalDate.

