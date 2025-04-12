package practice.sortingInterface;

import java.util.Comparator;

public class NumberComparator implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        return o1.a - o2.a;
    }

    }

