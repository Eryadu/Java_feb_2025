package practice.Collections.ArrayList.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap <String,Integer> weakHashMap = new WeakHashMap<>();

        String key1 = new String("One");
        Integer value1 = 1;

        String key2 = new String("Two");
        Integer value2 = 2;

        weakHashMap.put(key1, value1);
        weakHashMap.put(key2, value2);

        System.out.println("Weak HashMap is : " +  weakHashMap); // output {One=1, Two=2}

        key1= null;
        System.gc();
        System.out.println("Weak HashMap after garbage removal : " +  weakHashMap);// output {Two=2}

        // In this key has a weak reference type, if key value is null (means not in use, need) than it remove,
        // but hashmap don't because they have strong reference type

        HashMap<String, Integer> hashMap = new HashMap<>();
        String key3 = new String("One");
        Integer value3 = 1;

        String key4 = new String("Two");
        Integer value4 = 2;

        hashMap.put(key3, value3);

        hashMap.put(key4, value4);

        System.out.println("HashMap is : " +  hashMap);// output {One=1, Two=2}

        key1= null;
        System.gc();
        System.out.println("HashMap after garbage removal : " +  hashMap); // output {One=1, Two=2}

    }
}
