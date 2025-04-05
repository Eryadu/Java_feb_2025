package practice.Collections.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);


        // add two collection
        list.addAll(list2);
        System.out.println(list);

        // contain element or not

        boolean check = list.contains(1000);
        System.out.println(check);

        // for loop to print Array Elements
        /*for(int i =0 ; i <list.size() ; i++)
        {
            System.out.println(list.get(i));
        }*/

        //Enhanced for loop

        /*for (int e : list)
        {
            System.out.println(e);
        }*/

        // forEach (Java 8+)
        list.forEach(System.out :: println);

        list.add(110);
        System.out.println(list);


        // ArrayList to Array

        System.out.println();
        Integer[] inter = list.toArray(new Integer[0]);
        for (Integer i : inter){
            System.out.println("ArrayList converted to Array by using the Integer new Object  : " + i);
        }

        System.out.println();


        Object[] object = list.toArray();
        for (Object o : object){
            System.out.println("ArrayList converted to Array by using the Object[] ref as Object is super copy : " + o);
        }


       // Array to ArrayList

        List<Integer> list3 = Arrays.asList(inter); // Fixed-size
        System.out.println(list3);
        /*list3.add(11,120);
        System.out.println(list3);*/ //Arrays wraps only existing array, it don't allow to add or remove function on list.Allow only
                                      //  modify existing one

        System.out.println("List3 with modification is " + list3.set(0, 11));

        List<Integer> list4 = new ArrayList<>(Arrays.asList(inter)); //Mutable
        System.out.println("List4 is : " + list4);
        list4.add(11,120); // ArrayList is different from Arrays, it allowed modification of list (add, remove, modify)
        System.out.println("List4 is : " + list4);

        // Replace all elements

        List<String> list5 = new ArrayList<>();
        list5.add("Abc");
        list5.add("Cde");
        System.out.println("List5 is : " + list5);
        list5.replaceAll(String :: toUpperCase );
        System.out.println("List5 after replaceall is : " + list5);

      // create Array of other (existing) collection size

        ArrayList<Integer> list6 = new ArrayList<>(list);
        System.out.println("Size of Existing Array is  : " + list.size());
        System.out.println("Size of new Array of existing size is  : " + list6.size());



    }
}
