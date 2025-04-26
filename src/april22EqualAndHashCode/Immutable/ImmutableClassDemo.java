package april22EqualAndHashCode.Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ImmutableClassDemo {
    private final  String name;
    private final  Date birthDate;
    private final List<String> hobbies;


    public ImmutableClassDemo(String name, Date birthDate, List<String> hobbies) {
        this.name = name;
        this.birthDate = birthDate == null ? null : new Date(birthDate.getTime()); // Defensive copy
        // this.birthDate = new Date(birthDate.getTime()); // Defensive copy
        //this.hobbies = new ArrayList<>(hobbies);

        // Defensive copy of mutable List parameter
        /*if (hobbies == null) {
            this.hobbies = List.of();  // empty unmodifiable list (Java 9+)
        } else {
            // Use ArrayList copy and then wrap as unmodifiable
            this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies));
        }*/

        this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies)); // Defensive copy

    }
        public String getName () {
            return name;
        }

        public Date getBirthDate () {
            return new Date(birthDate.getTime()); // Defensive copy
        }

        public List<String> getHobbies () {
            return hobbies; // Already unmodifiable
        }
}
