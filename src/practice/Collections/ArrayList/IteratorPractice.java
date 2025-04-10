package practice.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =  new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Array List is : " + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        int nextElement = iterator.next();
        System.out.println("Next Element is : " +  nextElement);

        iterator.remove(); // it removed the element last returned by next()
        System.out.println("Removed number is : " +  nextElement);
        System.out.println("Array after remove is : " + numbers);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*while(iterator.hasNext()){
            int i = iterator.next();
            numbers.remove(i); // this gives me an exception "IndexOutOfBoundsException" due to concurrent operation,
            // while iterator is iterating , we try to remove element from list. Because remove is only possible with iterator itself.
            System.out.println(iterator.next());*/



        }
    }

