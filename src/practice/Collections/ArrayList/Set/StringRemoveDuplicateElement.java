package practice.Collections.ArrayList.Set;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StringRemoveDuplicateElement {
    public static void main(String[] args) {

        // Method 1 using Java 8+ File handling

        try {
            Files.write(Paths.get("TestingString.txt"),
                    ("The Fibonacci each sequence is a mathematical sequence in which each number is the sum of " +
                            "the two preceding numbers, where 0 and 1 are the sequence The Fibonacci each first mathematical Fibonacci two numbers. ").getBytes());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> listString = null;
        try {
            listString =  Files.readAllLines(Paths.get("TestingString.txt"));
            System.out.println("Original List is: " + listString);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] str3 = listString.toArray(new String[0]);
        for(String s1 : str3){
            String[] str4 = s1.split(" ");

            List<String> list2 = Arrays.asList(str4);
            Set<String>  hashset2 = new HashSet<>(list2);
            System.out.println("String after removing duplicate elements is :" + hashset2);

        }

        // Method 2
        System.out.println();
        System.out.println();
        System.out.println("Method 2 is : ");
        System.out.println();
        String str = "The Fibonacci each sequence is a mathematical sequence in The Fibonacci each which each number is the sum of ";

       // use split method to break single string into parts
        String[] strElement = str.split(" ");

        System.out.println("Original String: " + Arrays.toString(strElement));

        // to print duplicate elements
        Set<String> original = new HashSet<>();
        Set<String > duplicates = new HashSet<>();

        for (String s1 : strElement)
        {
            if(!original.add(s1)){  // If already seen, it's a duplicate
                duplicates.add(s1);
            }
            else {
                original.add(s1);
            }
        }

        System.out.println("After Removing Duplicates: " + original);
        System.out.println("Duplicate Characters: " + duplicates);
    }
}
