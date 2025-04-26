Rules to Create Immutable class 
1. Don't allow other classes to override the methods
2. Don't allow to create subclass
3. All fields should be Private and Final
4. Use Parameterized constructor to initialize fields
5. Don't allow direct access to Mutable Instance variables
6. Don't provide methods to update fields (like setter methods)


🔐 Principles of Immutability

-- Declare the class as final: Prevents subclassing, which could introduce mutability.
-- Make all fields private and final: Ensures fields are assigned once and not accessible directly.
-- No setter methods: Avoid methods that modify fields after object creation.
-- Initialize all fields via constructor: Set all fields during object creation.
-- Perform deep copies of mutable objects in the constructor: Prevents external references from modifying internal state.
-- Return copies or unmodifiable views in getters: Avoid exposing internal mutable objects.

🛡️ Defensive Copying

When dealing with mutable objects (e.g., Date, List), it's crucial to prevent external modifications

In Constructor: Create a new instance or deep copy of the mutable object.
In Getter Methods: Return a new instance or an unmodifiable view.
This approach ensures that the internal state remains unchanged regardless of external actions. 

🧪 Example: Immutable Class with Mutable Fields
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {
private final String name;
private final Date birthDate;
private final List<String> hobbies;

    public ImmutablePerson(String name, Date birthDate, List<String> hobbies) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime()); // Defensive copy
        this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies)); // Defensive copy
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime()); // Defensive copy
    }

    public List<String> getHobbies() {
        return hobbies; // Already unmodifiable
    }
}


🚀 Modern Java Recommendations

-- Use java.time API: Classes like LocalDate and LocalDateTime are immutable and thread-safe, making them preferable over 
   Date.
-- Utilize List.of() and Collections.unmodifiableList(): These methods create immutable lists, reducing the need for manual 
   copying.
-- Consider Java Records (Java 14+): Records are immutable data carriers by default, simplifying the creation of immutable
   classes.



## An immutable class is one whose instances cannot change state after construction

-- Initialize all fields in the constructor (or factory). Every field (especially final ones) must be initialized at object 
   creation. Use constructor parameters (or a builder) to supply values
-- Perform deep copies of mutable inputs. In the constructor, if a parameter is a mutable object (e.g. a Date, a List, etc.), 
  copy its contents into a new object and store that new object. Never keep a direct reference to a caller’s mutable object
-- InGetters, return copies or unmodifiable views. When returning a field that holds a mutable object, do not return 
   the object itself. Instead return a copy (e.g. new Date(date.getTime())) or a wrapped unmodifiable view (e.g. 
   Collections.unmodifiableList(list))

##Defensive Copying of Mutable Fields

For example, consider a field of type java.util.Date (which is mutable). The immutable-class constructor should do:
public final class ImmutablePerson {
private final Date birthDate;
public ImmutablePerson(Date birthDate) {
// Defensive copy of mutable Date in constructor
this.birthDate = (birthDate == null ? null : new Date(birthDate.getTime()));
}
public Date getBirthDate() {
// Return a copy so caller cannot mutate the original
return (birthDate == null ? null : new Date(birthDate.getTime()));
}
}
Here, new Date(birthDate.getTime()) clones the Date. If we instead stored the incoming Date directly, the caller could
do birthDate.setTime(...) after construction and change our internal state. 

Similarly, for a mutable List<String> field hobbies, you would do in the constructor:
public ImmutablePerson(String name, List<String> hobbies) {
this.name = name;
// Copy the list to prevent external modification
this.hobbies = (hobbies == null ? List.of() : new ArrayList<>(hobbies));
}
And in the getter:
public List<String> getHobbies() {
// Return an unmodifiable view or copy
return Collections.unmodifiableList(hobbies);
}
This way, even if the caller tries getHobbies().add("x"), it will throw an exception and not affect the internal list. 

In summary, defensive copying means deeply copying any mutable component:
In constructor: this.field = new ArrayList<>(incomingList) or this.date = new Date(incomingDate.getTime()).
In getters: return new Date(field.getTime()) or return Collections.unmodifiableList(field) or return List.copyOf(field).

Example: Immutable Class with Mutable Fields

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {
private final String name;
private final Date birthDate;
private final List<String> hobbies;

    public ImmutablePerson(String name, Date birthDate, List<String> hobbies) {
        // Assign immutable fields directly
        this.name = name;
        
        // Defensive copy of mutable Date parameter
        this.birthDate = (birthDate == null ? null
                            : new Date(birthDate.getTime()));
        
        // Defensive copy of mutable List parameter
        if (hobbies == null) {
            this.hobbies = List.of();  // empty unmodifiable list (Java 9+)
        } else {
            // Use ArrayList copy and then wrap as unmodifiable
            this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies));
        }
    }
    
    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        // Return a copy so callers can't modify our private date
        return (birthDate == null ? null 
                : new Date(birthDate.getTime()));
    }
    
    public List<String> getHobbies() {
        // Already unmodifiable, safe to return directly
        return hobbies;
    }
}

.
Avoiding Common Pitfalls
-- Always return a copy/wrapper (see above)
   Forgetting defensive copy on input. If you do this.date = incomingDate (instead of copying), changes to the 
   incomingDate afterwards will sneakily change your object. Always clone the mutable parameter in the constructor
-- Not declaring fields final. Without final, other methods (or a subclass, if you didn’t make the class final) could 
   reassign fields. Marking fields final enforces assignment-once, aiding immutability
-- Using arrays without care. Arrays are mutable, so if a class has a private final int[] data, even without setters 
   someone could do instance.getData()[0] = .... Instead, copy arrays (e.g. using Arrays.copyOf) and return copies.
-- Assuming wrapper or utility annotations are enough. Tools like Lombok’s @Value generate an immutable-like class, 
   but you must still manually copy mutable components. There is no built-in annotation that magically deep-clones 
   collections or dates.

## Java continues to evolve better support for immutability:
-- Use java.time instead of java.util.Date. The new date/time classes (e.g. LocalDate, LocalDateTime) are immutable by 
   design
. For example, if your class has a birth date, use LocalDate dateOfBirth; then no defensive copy is needed. 

-- Immutable collections. Since Java 9 there are factory methods List.of(...), Set.of(...), Map.of(...) that produce 
   truly unmodifiable collections. Also List.copyOf(collection) (Java 10+) makes an unmodifiable copy of an existing list
. For example: this.tags = List.copyOf(tags) or this.tags = Collections.unmodifiableList(new ArrayList<>(tags)). 

-- Records (Java 16+). Java records are a language feature that automatically gives you a final class with private final 
   fields and a constructor. They are intended for immutable data carriers. If you can use records, you get immutability
   by default (though you still must defensively copy any mutable components).
