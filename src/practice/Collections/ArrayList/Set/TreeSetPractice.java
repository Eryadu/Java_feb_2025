package practice.Collections.ArrayList.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    // to represent converted TreeSet to String type of Array
    @Override
    public String toString() {
        return "TreeSetPractice{}";
    }

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        System.out.println("TreeSet is : " + treeSet);

        System.out.println("HashCode is : " + treeSet.hashCode());

        // Convert TreeSet to Array of object[] type.
        Object[] obj = treeSet.toArray();
        for (Object o : obj) {
            System.out.print("" + o + "");
        }

        // Convert TreeSet to Array of String[] type.
        String[] str1 = treeSet.toArray(new String[0]);
        for (String s : str1) {
            System.out.print(" " + s + " ");
        }

        // // Convert Array to TreeSet
        String[] str = {"ABC", "CDE", "DEF"};
        Set<String> arr = new TreeSet<>(Arrays.asList(str));
        System.out.println("Convert Array to TreeSet : " + arr);


        TreeSet<Integer> treeset2 = new TreeSet<>();
        treeset2.add(10);
        treeset2.add(20);
        treeset2.add(30);
        treeset2.add(40);
        treeset2.add(50);

        // First element : first() is method of TreeSet not Set
        Integer first = treeset2.first();
        System.out.println("First Element is :" + first);

        // Last element : last() is method of TreeSet not Set
        Integer last = treeset2.last();
        System.out.println("Last Element is : " + last);

        // Using higher()
        System.out.println("using Higher : " + treeset2.higher(30));// check higher than passed element and return lowest among them

        // Using lower()
        System.out.println("using Lower : " + treeset2.lower(30)); // check lower than passed element and return highest among them

        // Using ceiling()
        System.out.println("using Ceiling : " + treeset2.ceiling(5)); // Check higher than passed element and return lowest among them

        // Using flooring()
        System.out.println("using Flooring : " + treeset2.floor(60)); //Check lower than passed element and return highest among them


        // pollFirst() - returns and removes the first element from the set
        System.out.println("Original TreeSet is : " + treeset2);
        System.out.println("using PollFirst : " + treeset2.pollFirst());
        System.out.println("TreeSet After PollFirst is : " + treeset2);


        // pollLast() - returns and removes the first element from the set
        System.out.println();
        System.out.println("Original TreeSet is : " + treeset2);
        System.out.println("using PollLast : " + treeset2.pollLast());
        System.out.println("TreeSet After PollLast is : " + treeset2);

        // Using headSet() with default boolean value
        System.out.println("Original TreeSet is : " + treeset2);
        System.out.println("Using headSet without boolean value: " + treeset2.headSet(30)); // return all value before
                                                    // passed value, boolean is optional and it by default false

        // Using headSet() with specified boolean value
        System.out.println("Using headSet with boolean value: " + treeset2.headSet(30, true));
                    // if boolean set to True then it returned passed elements along with elements before that

        // Using tailSet() with default boolean value
        System.out.println();
        System.out.println("Original TreeSet is : " + treeset2);
        System.out.println("Using tailSet without boolean value: " + treeset2.tailSet(20));
        // return all value after the passed element, boolean is True by default so, passed element is also included in return
        // if present in Set

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + treeset2.tailSet(20, false));
        // if boolean set to False then it returned  elements after the passed element


        // Using subSet() with default boolean value
        System.out.println();
        System.out.println("Original TreeSet is : " + treeset2);
        System.out.println("Using subSet without boolean value: " + treeset2.subSet(20, 40));

        /*The subSet() method returns all the elements between e1 and e2 including e1.
          The bv1 and bv2 are optional parameters. The default value of bv1 is true, and the default value of bv2 is false.
          If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.
          If true is passed as bv2, the method returns all the elements between e1 and e2, including e2.*/

        // Using subSet() with specified boolean value
        System.out.println("Using subSet with boolean value: " + treeset2.subSet(20, false, 40, true));
    }
}

