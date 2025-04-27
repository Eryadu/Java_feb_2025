package studyMaterial.String.stringBuilder.Immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {

        // Original mutable objects
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");
        Date birthDate = new Date();

        // Create ImmutablePerson instance
        ImmutableClassDemo immutableClassDemo = new ImmutableClassDemo("Yad", birthDate,hobbies);

        // Display initial state
        System.out.println("Name: " + immutableClassDemo.getName());
        System.out.println("Birth Date: " + immutableClassDemo.getBirthDate());
        System.out.println("Hobbies: " + immutableClassDemo.getHobbies());

        // Attempt to modify original mutable objects
        birthDate.setTime(0);
        hobbies.add("Running");

        // Display state after external modifications
        System.out.println("\nAfter external modifications:");
        System.out.println("Birth Date: " + immutableClassDemo.getBirthDate());
        System.out.println("Hobbies: " + immutableClassDemo.getHobbies());

        // Attempt to modify internal state via getters
        immutableClassDemo.getBirthDate().setTime(0);
        immutableClassDemo.getHobbies().add("Dancing"); // throw UnsupportedOperationException


        /*immutableClassDemo.getBirthDate().setTime(0);
        try {
            immutableClassDemo.getHobbies().add("Dancing");
        } catch (UnsupportedOperationException e) {
            System.out.println("\nCaught exception while modifying hobbies: " + e);
        }*/

        // Display final state
        System.out.println("\nFinal state:");
        System.out.println("Birth Date: " + immutableClassDemo.getBirthDate());
        System.out.println("Hobbies: " + immutableClassDemo.getHobbies());

    }
}
