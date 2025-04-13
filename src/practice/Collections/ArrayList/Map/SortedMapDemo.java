package practice.Collections.ArrayList.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // Creating SortedMap using TreeMap
        SortedMap<String, Integer> numbers = new TreeMap<>(); //Natural Ascending Order
       // SortedMap<String, Integer> numbers = new TreeMap<>(Comparator.reverseOrder()); // Reverse order

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        System.out.println("SortedMap: " + numbers);


        // Access the first key of the map
        System.out.println("First Key: " + numbers.firstKey());

        // Access the last key of the map
        System.out.println("Last Key: " + numbers.lastKey());

//        // Remove elements from the map
//        int value = numbers.remove("One");
//        System.out.println("Removed Value: " + value);


        // Return HeadMap( return all the elements before entered value)
        System.out.println("HeadMap is : " + numbers.headMap("Two"));


        // Return TailMap( return all the elements equal and after then entered value)
        System.out.println("TailMap is : " + numbers.tailMap("One"));

        // SubMap, Optional one is True(include) by default, Optional second is False(not include)
        System.out.println("SubMap is : " + numbers.subMap("One","Two"));

    }
}
