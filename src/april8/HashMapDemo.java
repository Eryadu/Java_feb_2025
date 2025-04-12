package april8;
import java.util.*;

public class HashMapDemo {
        public static void main(String[] args) {

            // initial cap , Load factor
            // 16 - Array, .50
            Map<String, Integer> map = new HashMap<>();
            // Product Name = quantity

            // list.add(10);
        /*

        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(20);
        list.add(1430);
        list.add(1340);
        list.add(110);
         */

            map.put("Iphone", 2);  // Entry - a key value pair is called as Entry
            map.put("Laptop", 2);
            map.put("Ipad", 5);
            map.put("Tablet", 14);
            map.put("Monitor", 10);
            map.put("Monitor", 12);
            map.put(null, 12);


            System.out.println(map);

            //Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            Collection<Integer> values = map.values();
            System.out.println("All the values :  " + values);

            Set<String> allKeys = map.keySet();
            System.out.println("All keys set : "+allKeys);


            // fetch the value from map
            Integer qty = map.get("Monitor");
            System.out.println("Number of Monitors in qty : "+ qty);


            Integer result = map.getOrDefault("Monitor", 0);

            System.out.println(result);


            System.out.println(map.containsKey("Monitor"));



            // How to loop over a map

            System.out.println();
            System.out.println();

            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

            for (Map.Entry<String, Integer> entry: entrySet ) {
                //System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }




        /*
        Order is random
        duplicate keys are not allowed

            HashMap   , HashSet


            TreeMap  , TreeSet



            LinkedHashMap , LinkedHashSet


ConcurrentHashMap
IdentityHashmap
EnumMap


Equals and Hashcode
if two objects are equal, they should have same hashcode
if two objects have same hashcode, they may not be equal.





         */




        }
}
