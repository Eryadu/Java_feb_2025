package practice.Collections.ArrayList.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();

        String obj1 = new String("Key");
        String obj2 = new String("Key");// Same content, different object

        identityHashMap.put(obj1,1);
        identityHashMap.put(obj2,2);
        System.out.println("Identity HashMap : " + identityHashMap); // Output {Key=1, Key=2}
        // note the output {Key=1, Key=2} look like key are same but in actual hashmap contain unique key, in internal
        // implementation both key have different object reference
        // Two keys are considered equal only if they are the exact same object reference

        System.out.println(identityHashMap.get(obj1));
        System.out.println(identityHashMap.get(obj2));
        System.out.println(System.identityHashCode(obj1)); // Output 1975012498
        System.out.println(System.identityHashCode(obj2));// Output 1808253012 // different due to ==
        System.out.println(obj1.hashCode());// Output 75327
        System.out.println(obj2.hashCode());//Output 75327 same due to equal() , values are same

    }
}
