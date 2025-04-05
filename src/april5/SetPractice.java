package april5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        System.out.println(hashSet);

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

       // int[] arr1 = {10,23,34,54,65,43,43,34,23,22,35,65,76,65,87};
        //Set<Integer> arr1 = new HashSet<>();
        // by add all elements and print set it automatically remove duplicates


    }




}
