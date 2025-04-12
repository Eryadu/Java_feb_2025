package practice.sortingInterface;

import java.util.Comparator;

public class VowelComparator implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        return o1.numberVowel.compareTo(o2.numberConsonent);
    }
}
