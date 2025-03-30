## Defensive Copy for Mutable Objects in Java
   A defensive copy is a technique where we create a new copy of a mutable object (like Date, List, Map, or custom objects)
   instead of using the original reference. This prevents external code from modifying the internal state of an immutable class.

## Why is Defensive Copy Needed?
   Mutable objects can be modified after creation. If an immutable class stores a reference to a mutable object, changes 
   to the original object outside the class will affect the immutable object—breaking immutability.

Example Without Defensive Copy (Problem)

import java.util.Date;

public final class ImmutablePerson {
private final Date birthDate; // Mutable object

    public ImmutablePerson(Date birthDate) {
        this.birthDate = birthDate; // ❌ Bad: Direct reference
    }

    public Date getBirthDate() {
        return birthDate; // ❌ Bad: Returns original reference
    }

    public static void main(String[] args) {
        Date date = new Date();
        ImmutablePerson person = new ImmutablePerson(date);

        System.out.println("Original birthDate: " + person.getBirthDate());
        
        // External modification affects the immutable object!
        date.setTime(0); // Changes birthDate inside `person`
        System.out.println("After modification: " + person.getBirthDate());
    }
}
Output:

Original birthDate: Wed Mar 31 15:30:45 IST 2023  
After modification: Thu Jan 01 05:30:00 IST 1970  // ❌ Changed!
👉 Problem: The birthDate inside ImmutablePerson was modified externally.

## Solution: Defensive Copy

To fix this, we:

1. Create a copy in the constructor (so changes to the input don’t affect the class).
2. Return a copy in getters (so changes to the returned object don’t affect the class).

Fixed Example (Using Defensive Copy)

import java.util.Date;

public final class ImmutablePerson {
private final Date birthDate;

    public ImmutablePerson(Date birthDate) {
        this.birthDate = new Date(birthDate.getTime()); // ✅ Defensive copy
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime()); // ✅ Defensive copy
    }

    public static void main(String[] args) {
        Date date = new Date();
        ImmutablePerson person = new ImmutablePerson(date);

        System.out.println("Original birthDate: " + person.getBirthDate());
        
        // Try modifying the external date
        date.setTime(0); // Does NOT affect `person`
        System.out.println("After modification: " + person.getBirthDate()); // ✅ Unchanged
    }
}
Output:

Original birthDate: Wed Mar 31 15:30:45 IST 2023  
After modification: Wed Mar 31 15:30:45 IST 2023  // ✅ Unchanged!
👉 Now, ImmutablePerson is truly immutable!

## When to Use Defensive Copy?

Scenario	                                     Example	                             Solution
Mutable objectsin constructors	          Date, List, Map, arrays	                Create a copy in constructor
Returning mutable objects in getters	Returning a List, Map, or custom object	   Return a copy/unmodifiable view
Collections (List, Set, Map)	              ArrayList, HashMap	            Use Collections.unmodifiableList() or List.copyOf()

## Example with Collections (Defensive Copy + Unmodifiable List)


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableStudent {
private final List<String> subjects;

    public ImmutableStudent(List<String> subjects) {
        this.subjects = Collections.unmodifiableList(new ArrayList<>(subjects)); // ✅ Defensive + Unmodifiable
    }

    public List<String> getSubjects() {
        return subjects; // Already unmodifiable
    }

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Math");
        
        ImmutableStudent student = new ImmutableStudent(originalList);
        System.out.println(student.getSubjects()); // [Math]

        originalList.add("Science"); // Does NOT affect `student`
        System.out.println(student.getSubjects()); // Still [Math]
    }
}
Summary

-- Defensive copy = Creating a new copy of a mutable object to prevent external modifications.
-- Use in constructors → To avoid changes from input references.
-- Use in getters → To avoid changes from returned references.
-- For collections → Use Collections.unmodifiableX() or List.copyOf() (Java 10+).
-- This ensures true immutability even with mutable objects! 
