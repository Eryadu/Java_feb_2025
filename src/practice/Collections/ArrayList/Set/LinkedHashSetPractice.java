package practice.Collections.ArrayList.Set;

import java.util.*;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        // LinkedList 1
        Set<Integer> linkedHashSetPractice = new LinkedHashSet<>();
        linkedHashSetPractice.add(10);
        linkedHashSetPractice.add(20);
        linkedHashSetPractice.add(30);
        linkedHashSetPractice.add(40);

        // LinkedList 2
        Set<Integer> linkedHashSetPractice1 = new LinkedHashSet<>();
        linkedHashSetPractice1.add(10);
        linkedHashSetPractice1.add(20);


        System.out.println("Linked HashSet is : " + linkedHashSetPractice);

        /*linkedHashSetPractice.clear();
        System.out.println("Linked HashSet is : " + linkedHashSetPractice);*/

        // remove-all : remove only elements that present in other collection
        linkedHashSetPractice.removeAll(linkedHashSetPractice1);
        System.out.println("Linked HashSet is : " + linkedHashSetPractice);


        // convert to array
        Integer[] arr = linkedHashSetPractice.toArray(new Integer[0]);
        for( Integer i : arr){
            System.out.println(i);
        }

        // convert to array with object type as Array is backed by object[] in Collections
        Object[] obj = linkedHashSetPractice.toArray();
        for( Object i2 : obj) {
            System.out.println(i2);

            // Array to mutable linked hashset
            Set<Integer> hashSet = new HashSet<>( Arrays.asList(arr));
            System.out.println("HashSet is : " + hashSet);

            // Array to fixed size list
            List<Integer> list = Arrays.asList(arr);
            System.out.println("List is :" + list);
        }
    }
}
