package april5Set_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List : " + list);

        // iterate using for loop
        for (Integer i : list) {
            System.out.print(" " + i + " ");
            // list.remove(0); // it gave exception, we can't perform concurrent operation
        }
        System.out.println();
        // Iterate using Iterator
        /*Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            if(next == 10)
            {
                iterator.remove();
            }
        }
        System.out.println("Iterator : " + list);*/


        // Create ListIterator


        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer next = listIterator.next();
            if (next == 10) {
                //listIterator.remove();
                listIterator.add(110);
            }
        }
        System.out.println("ListIterator : " + list);


        ListIterator<Integer> listIterator1 = list.listIterator();
        while (listIterator1.hasPrevious()) {
            Integer previous = listIterator1.previous();

            if (previous == 10) {
                //listIterator.remove();
                //listIterator.add(120);*/
            }
        }

        System.out.println("ListIterator : " + list);
    }
}


