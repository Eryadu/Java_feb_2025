package practice.Collections.ArrayList.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<String, Integer> numbers = new TreeMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        System.out.println("NavigableMap: " + numbers);

        // to print map in reverse order
        System.out.println("Reversed order map : " + numbers.descendingMap());

        // Access the first entry of the map
        System.out.println("First Entry: " + numbers.firstEntry());

        // Access the last entry of the map
        System.out.println("Last Entry: " + numbers.lastEntry());

        // Return Key Set
        System.out.println(numbers.navigableKeySet());

        // Return Descending Key Set
        System.out.println("Descending Key Set : " + numbers.descendingKeySet());

        // returns an entry with the lowest key among all those entries whose keys are greater than or equal to the specified key
        System.out.println("Ceiling Value : " + numbers.ceilingEntry("Three"));

        //returns an entry with the lowest key among all those entries whose keys are greater than the specified key
        System.out.println("Higher Entry is : " + numbers.higherEntry("Three"));

        // returns an entry with the highest key among all those entries whose keys are less than or equal to the specified key
        System.out.println("Floor Value is : " + numbers.floorEntry("One"));

        //returns the lowest key among those keys that are greater than or equal to the specified key
        System.out.println("Ceiling Key is : " + numbers.ceilingKey("Two"));

        //returns the highest key among those keys that are less than or equal to the specified key
        System.out.println("Floor key is  : " + numbers.floorKey("Two"));

        //Remove the first entry from the map
        System.out.println("Removed First Entry: " + numbers.pollFirstEntry());

        // Remove the last entry from the map
        System.out.println("Removed Last Entry: " + numbers.pollLastEntry());
    }
}
