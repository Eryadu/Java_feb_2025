package practice.Collections.ArrayList.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveOperationOnCOWAL {
    public static void main(String[] args) {
       // List<String> list = new CopyOnWriteArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("Milk");
        list.add("Butter");
        list.add("Eggs");
        list.add("Bread");
        list.add("Jam");
        System.out.println("Original list is :" + list);

        Iterator it = list.iterator();
        while (it.hasNext()){
            String item1 = (String) it.next();
            if( item1.equals("Jam")){
                it.remove(); // Exception in thread "main" java.lang.UnsupportedOperationException, cause COWAL. don't
                             // support remove operation.
            }
        }
        System.out.println("Updated List." + list); // Arraylist support remove operation
    }
}
