package practice.enumPractice;
import java.util.EnumSet;
import java.util.Iterator;


enum Size5{
    SMALL, MEDIUM, LARGE, EXTRALARGE
}


public class EnumSetDemo {

    public static void main(String[] args) {
        // Creating an EnumSet using allOf()
        EnumSet <Size5> sizes1 = EnumSet.allOf(Size5.class);
        System.out.println("EnumSet is using allOf : " + sizes1);

        // Creating an EnumSet using noneOf()
        EnumSet<Size5> sizes2 = EnumSet.noneOf(Size5.class);
        System.out.println("EnumSet using noneOf is : " + sizes2);

        // Creating an EnumSet using range(), range include
        EnumSet<Size5> sizes = EnumSet.range(Size5.MEDIUM, Size5.EXTRALARGE);
        System.out.println("EnumSet using range: " + sizes);

        // Using of() with a two parameter, return set of particular elements
        EnumSet<Size5> sizes3 = EnumSet.of(Size5.SMALL, Size5.LARGE);
        System.out.println("EnumSet2: " + sizes3);

        // Using add method
        sizes2.add(Size5.MEDIUM);
        System.out.println("EnumSet Using add(): " + sizes2);

        // Using addAll() method
        sizes2.addAll(sizes1);
        System.out.println("EnumSet Using addAll(): " + sizes2);


        // use iterator to iterate over Enum Set elements
        Iterator<Size5> iterator = sizes1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(", ");
        }

        // Using remove()
        boolean value1 = sizes1.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? " + value1);

        // Using removeAll()
        boolean value2 = sizes1.removeAll(sizes1);
        System.out.println("Are all elements removed? " + value2);

    }
}
