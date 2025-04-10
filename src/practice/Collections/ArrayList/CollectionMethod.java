package practice.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // using shuffle() method
        Collections.shuffle(numbers);
        System.out.println("Shuffled ArrayList: " + numbers);

        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // Using swap()
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        // Using addAll
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers); // to replace all elements with specified value

        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);

        // Using binarySearch()

        ArrayList<Integer> numbers2 = new ArrayList<>();

        // Add elements
        numbers2.add(4);
        numbers2.add(2);
        numbers2.add(3);
        System.out.println("Unsorted ArrayList: " + numbers2);
        int pos = Collections.binarySearch(numbers2, 3);
        System.out.println("The position of 3 is " + pos); // returns the position of the element in the specified collections.


        // composition of collection
        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count); // return occurence of element

        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");
        List<String> list3 = Arrays.asList("A", "E", "G");

        System.out.println(Collections.disjoint(list1, list2)); // true - no common elements
        System.out.println(Collections.disjoint(list1, list3)); // false - "A" is common

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}
