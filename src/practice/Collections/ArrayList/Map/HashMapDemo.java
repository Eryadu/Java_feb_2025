package practice.Collections.ArrayList.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // get() method to get value
        String value = languages.get(1);
        System.out.println("Value at index 1: " + value);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + languages.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

        // change element with key 2
        languages.replace(2, "C++");
        System.out.println("HashMap using replace(): " + languages);

        System.out.println(languages.isEmpty());
        System.out.println("Size is : " + languages.size());

        HashMap<Integer, String> cloneLanguages = (HashMap<Integer, String>)languages.clone();
        System.out.println("Clone is : " + cloneLanguages);

        // Iterate through Elements of map

        for(Integer k : languages.keySet()){
            System.out.println("KeySet is : " + k);
        }

        for (String s : languages.values()){
            System.out.println("Values are : " + s);
        }

        for(Map.Entry<Integer, String> entry : languages.entrySet()){
            System.out.print(entry);
            System.out.print(",");
        }


        // Print EntrySet
        System.out.println();
        Set<Map.Entry<Integer,String> > entrySet = languages.entrySet();
        System.out.println("Entry Set is : " + entrySet);

        /*Note that we have used the Map.Entry in the above example. It is the nested class of the Map interface that
          returns a view (elements) of the map.We first need to import the java.util.Map.Entry package in order to use
          this class.This nested class returns a view (elements) of the map.*/

        // Creating HashMap from Other Maps
        // create a treemap
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        // create hashmap from the treemap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

    }
}
