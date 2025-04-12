package practice.sortingInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Number {
    int a ;
    String numberVowel;
    String numberConsonent;

    public Number(int a, String numberVowel, String numberConsonent) {
        this.a = a;
        this.numberVowel = numberVowel;
        this.numberConsonent = numberConsonent;
    }

    @Override
    public String toString() {
        return "Number{" +
                "a=" + a +
                ", numberVowel='" + numberVowel + '\'' +
                ", numberConsonent='" + numberConsonent + '\'' +
                '}';
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Number> numberList =  new ArrayList<>();
        numberList.add(new Number(30, "A" , "B"));
        numberList.add(new Number(30, "E" , "G"));
        numberList.add(new Number(30, "I" , "V"));
        numberList.add(new Number(30, "O" , "T"));
        numberList.add(new Number(30, "U" , "W"));


        System.out.println("Number List before Sorting : " + numberList);

        // Sorting based on Numbers using Comparator
        Collections.sort(numberList, new NumberComparator());
        Collections.sort(numberList, Collections.reverseOrder(new NumberComparator()));

        System.out.println("Number List after Sorting : " + numberList);

        // to compare based on Vowel just new Functionality, no need to change main class (SOLID Principle)
        Collections.sort(numberList, new VowelComparator());
        System.out.println("Number List Sorted based on Vowel : " + numberList);


    }
}
