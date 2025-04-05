package april5;

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

        Object[] obj = treeSet.toArray();
        for (Object o : obj) {
            System.out.print("" + o + "");
        }


        String[] str = {"ABC", "CDE", "DEF"};
        Set<String> arr = new TreeSet<>(Arrays.asList(str));
        System.out.println("Convert Array to TreeSet : " + arr);

        String[] str1 = treeSet.toArray(new String[0]);
        for (String s : str1) {
            System.out.print(" " + s + " ");
        }



    }
}
