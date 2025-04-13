package practice.Collections.ArrayList.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {


        /*Addres addres1 = new Addres("AB", "CD"); // Try to implement Custom Class
        Addres addres2 = new Addres("AB", "CD");
        Addres addres3 = new Addres("AB", "CD");
        Map<Addres, Integer> numbers = new HashMap<>();
        numbers.put(addres1, 1);
        numbers.put(addres2, 2);
        numbers.put(addres3, 3);
        System.out.println(addres1.getFirstName());*/

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.put("Six",null);
        numbers.put(null, null);
        System.out.println("Map is :" + numbers);



        // to print the keys of map
        System.out.println("Keys are : " + numbers.keySet());

        // to print the values of map
        System.out.println("Values are : " + numbers.values());

        System.out.println("Fetch the value associated with key: " + numbers.get("One"));

        System.out.println("If key not present : " + numbers.getOrDefault( "Eight", 0));

        System.out.println("EntrySet are : " + numbers.entrySet());

        /*System.out.println("Try to enter value : " + numbers.putIfAbsent("Six", 5));
        System.out.println("Map is :" + numbers);*/

        System.out.println("Remove Key : " + numbers.remove("Four"));
        System.out.println("Values are : " + numbers.values());


    }
}
