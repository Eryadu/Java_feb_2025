package practice.Collections.ArrayList.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
       /* List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Butter");
        list.add("Eggs");
        list.add("Bread");
        list.add("Jam");
        System.out.println("Original list is :" + list);

        for(String item : list)
        {
            System.out.println(item);

            // try to modify the list when reading

            if( item.equals("Eggs")){
                list.add("MoreEggs");
                System.out.println("Added moreEggs");
            }
        }
        System.out.println("Updated list :" +  list);*/ // Exception in thread "main" java.util.ConcurrentModificationException

        // to avoid this exception we use COWAL.
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Butter");
        list.add("Eggs");
        list.add("Bread");
        list.add("Jam");
        System.out.println("Original list is :" + list);

        for(String item : list)
        {
            System.out.println(item);

            // try to modify the list when reading

            if( item.equals("Eggs")){
                list.add("MoreEggs");
                System.out.println("Added moreEggs");
            }
        }
        System.out.println("Updated list :" +  list);
    }
}
