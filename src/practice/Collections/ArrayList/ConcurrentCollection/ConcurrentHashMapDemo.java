package practice.Collections.ArrayList.ConcurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(101,"A");
        m.put(102,"B");
        System.out.println("Added Element : " + m.putIfAbsent(103, "C")); // return null if added
        System.out.println("Added Element if Absent : " + m.putIfAbsent(101, "D")); // if key exist it
                                                                                   // return the value of existing(if) key
        System.out.println("Remove Key associated with Value : " + m.remove(101, "D")); // if not exist return false
        System.out.println("Replace existing Element : " + m.replace(102, "B", "E"));
        System.out.println("Replace existing Element : " + m.replace(101, "D", "E")); // if not exist return false
        System.out.println(m);


    }
}
