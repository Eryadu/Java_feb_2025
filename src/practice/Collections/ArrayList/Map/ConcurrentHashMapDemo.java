package practice.Collections.ArrayList.Map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Creating ConcurrentMap using ConcurrentHashMap
        /*ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("ConcurrentMap: " + numbers);

        // Access the value of specified key
        int value = numbers.get("One");
        System.out.println("Accessed Value: " + value);

        // Remove the value of specified key
        int removedValue = numbers.remove("Two");
        System.out.println("Removed Value: " + removedValue);*/

        // Other functions i.e. compute, computeIfPresent will try after lambda

// for ConCurrent Hashmap

        // Creating ConcurrentHashMap of even numbers
        ConcurrentHashMap<String, Integer> evenNumbers = new ConcurrentHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        evenNumbers.put("Six", 6);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Seven", 7);
        System.out.println("ConcurrentHashMap of even numbers: " + evenNumbers);


        //Creating ConcurrentHashMap of numbers
        ConcurrentHashMap<String, Integer> numbers1 = new ConcurrentHashMap<>();
        numbers1.put("One", 1);

        // Using putAll()
        numbers1.putAll(evenNumbers);
        System.out.println("ConcurrentHashMap of numbers: " + numbers1);

        numbers1.put("Two", 2);
        numbers1.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers1);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers1.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers1.keySet());

        // Using values()
        System.out.println("Values: " + numbers1.values());

        // Using get()
        int value1 = numbers1.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers1.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);

        // remove method with single parameter
        int value = numbers1.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers1.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        System.out.println("Updated ConcurrentHashMap: " + numbers1);

    }
}
