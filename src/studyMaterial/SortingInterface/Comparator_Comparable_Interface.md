## Comparable/ Comparator interface is a very important interface which can be used by Java Collections to compare 
   custom objects and sort them. Using comparable interface, we can sort our custom objects in the same way how wrapper
   classes, string objects get sorted using Collections sorting methods.

## To sort objects you need to specify a rule that decides how objects should be sorted. For example, if you have a 
   list of cars you might want to sort them by year, the rule could be that cars with an earlier year go first.
-- The Comparator and Comparable interfaces allow you to specify what rule is used to sort objects.
-- Being able to specify a sorting rule also allows you to change how strings and numbers are sorted.

## Java Comparator Interface
   In Java, the Comparator interface is a part of java.util package and it defines the order of the objects of user-defined classes.

## Methods of Comparator Interface
   The Comparator interface defines two methods: compare() and equals(). The compare() method, shown here, compares 
   two elements for order −
1. The compare() Method
   int compare(Object obj1, Object obj2)
   obj1 and obj2 are the objects to be compared. 
-- This method returns zero if the objects are equal.
-- It returns a positive value if obj1 is greater than obj2. 
-- Otherwise, a negative value is returned.

-- By overriding compare(), you can alter the way that objects are ordered. For example, to sort in a reverse order,
   you can create a comparator that reverses the outcome of a comparison.

2. The equals() Method
   The equals() method, shown here, tests whether an object equals the invoking comparator −
   boolean equals(Object obj)
   obj is the object to be tested for equality. The method returns true if obj and the invoking object are both
   Comparator objects and use the same ordering. Otherwise, it returns false.
-- Overriding equals() is unnecessary, and most simple comparators will not do so.

## Comparators : An object that implements the Comparator interface is called a comparator.
   The Comparator interface allows you to create a class with a compare() method that compares two objects to decide 
   which one should go first in a list.

A class that implements the Comparator interface might look something like this:

// Sort Car objects by year
class SortByYear implements Comparator {
public int compare(Object obj1, Object obj2) {
// Make sure that the objects are Car objects
Car a = (Car) obj1;
Car b = (Car) obj2;

    // Compare the objects
    if (a.year < b.year) return -1; // The first car has a smaller year
    if (a.year > b.year) return 1;  // The first car has a larger year
    return 0; // Both cars have the same year

return obj1.a-obj2.b; // other way to return
}
}
To use the comparator, pass it as an argument into a sorting method:

// Use a comparator to sort the cars
Comparator myComparator = new SortByYear();
Collections.sort(myCars, myComparator);
Collections.sort(myCars, new SortByYear); // other way to declare 


## Comparable : The Comparable Interface
-- The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.
-- The compareTo() method takes an object as an argument and compares the comparable with the argument to decide which
   one should go first in a list.
-- Like the comparator, the compareTo() method returns a number which is:
-- Negative if the comparable should go first in a list.
-- Positive if the other object should go first in a list.
-- Zero if the order does not matter.

## Many native Java classes implement the Comparable interface, such as String and Integer.
   This is why strings and numbers do not need a comparator to be sorted.

## An object that implements the Comparable interface might look something like this:

class Car implements Comparable {
public String brand;
public String model;
public int year;

// Decide how this object compares to other objects
public int compareTo(Object obj) {
Car other = (Car)obj;
if(year < other.year) return -1; // This object is smaller than the other one
if(year > other.year) return 1;  // This object is larger than the other one
return 0; // Both objects are the same

return this.year - other.year; // other way to define
}
}

## Comparator vs. Comparable
-- A comparator is an object with one method that is used to compare two different objects.
-- A comparable is an object which can compare itself with other objects.
-- It is easier to use the Comparable interface when possible, but the Comparator interface is more powerful because 
   it allows you to sort any kind of object even if you cannot change its code.

Comparator is better than Comparable, don't need to change main class code if add more functionality (SOLID Principle) i.e. 
compare based on other elements. In Comparable, do need to change main code everytime.

## https://www.w3schools.com/java/java_advanced_sorting.asp

