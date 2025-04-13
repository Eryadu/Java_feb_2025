package practice.Collections.ArrayList.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        System.out.println(hashSet);
        System.out.println(hashSet.add(40)); // When try to insert duplicate value , it returned boolean 'False'.

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.addAll(hashSet);
        System.out.println(hashSet2);


        hashSet.contains(10);

        System.out.println("Size : " + hashSet.size());

        System.out.println("Collection 1 is contained in Other Collection : " + hashSet2.containsAll(hashSet));

        System.out.println("Collection 1 is equal to Collection 2 : " +  hashSet.equals(hashSet2));


        Set<Integer> hashSet3 = new HashSet<>();
        hashSet3.add(20);
        hashSet3.add(40);
        hashSet3.add(50);
        hashSet3.add(60);
        System.out.println("Obtain elements which contain in other Collection (hashSet2) " + hashSet3.retainAll(hashSet2));
        System.out.println("HashSet3 return elements which only contains in hashSet2 : " + hashSet3);


        Object[] obj =  hashSet.toArray();
        for(Object e : obj){
            System.out.print(" " + e + " ");
        }
        System.out.println();


        Integer[] arr = hashSet.toArray(new Integer[0]);
        for(Integer i : arr){
            System.out.print(" " + i + " ");
        }
        System.out.println();


      // Problem to solve to remove duplicate elements from Array

        //Method 1

       Integer[] arr1 = {10,23,34,54,65,43,43,34,23,22,35,65,76,65,87};
        Set<Integer> hashSet4 = new HashSet<>(Arrays.asList(arr1));
        System.out.println("Array with unique elements : " + hashSet4);

       // We can convert Array to List, then pass the list to perform different method
        // Cause Array is not a collection, so to use the method of collection we first convert Array to List.

        //Method 2
       List<Integer> list = Arrays.asList(10,23,34,54,65,43,43,34,23,22,35,65,76,65,87);
        Set<Integer> hashSet5 = new HashSet<>(list);
        System.out.println("Array with unique elements : " + hashSet5);


        //Set<Integer> arr1 = new HashSet<>();
        // by add all elements and print set it automatically remove duplicates


    }




}
