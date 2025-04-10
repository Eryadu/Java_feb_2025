package practice.Collections.ArrayList.LinkedList;

import java.util.Arrays;
import java.util.Collections;
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

        // Replace all elements :Java 8 +

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

        // Using Collection class to Sort the ArrayList

        Collections.sort(list);
        System.out.println(list);

        // to ensure(Increase) the capacity of list for add() or addALl()

        ArrayList<Integer> list7 = new ArrayList<Integer>();
        list7.ensureCapacity(15);
        for (int i = 1; i <= 15; i++) {
            list7.add(i);
        }
        System.out.println(list7);


        // trimToSize() to trim the size of list to actual fit size, by-default its 10
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.trimToSize();
        System.out.println("Cars : " + cars);

        // Clone methode -- create a copy of collection, return output as Object[] type.
        /*The clone() method returns a copy of the ArrayList as an Object.
        This creates a "shallow" copy, which means that copies of objects in the list are not created, instead the
        list has references to the same objects that are in the original list.
        Note: Since the return type is Object, it must be type casted in order to use it as an ArrayList as shown in the
        example.*/

        ArrayList cars2 = (ArrayList) cars.clone();

        cars2.set(0, "Toyota");

        System.out.println("Cars before clone : " + cars);
        System.out.println("Cars after clone : " + cars2);

        // Create Unmodifiable list with Collection class method
        List<String> list8  = Collections.unmodifiableList(cars);
        list8.add("Ford2");
        System.out.println("Cars after unmodifiable collection :" + list8); // it's throw UnsupportedOperationException
    }
}
