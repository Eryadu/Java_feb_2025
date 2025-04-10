package practice.Collections.ArrayList;
import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorPractice {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        // Using the next() method
        int number1 = iterate.next();
        System.out.println("Next Element: " + number1);

        // Using the previous() method
        int number2 = iterate.previous(); // it returned the element last returned by next()
        System.out.println("Previous Element: " + number2);

        // Using the previousIndex()
        int index2 = iterate.previousIndex(); // return the index of element before the previous element
        System.out.println("Position of the Previous element: " + index2);

        // Using the nextIndex()
        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        // Using the hasNext() method
        System.out.println("Is there any next element? " + iterate.hasNext());


        iterate.next();
        iterate.next();

       /* // Using the previous() method
        int number2 = iterate.previous();
        System.out.println("Previous Element: " + number2);

        // Using the previousIndex()
        int index2 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index2);*/

    }
}
