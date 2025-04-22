

## Generics in Java allow you to create type-safe classes, interfaces, and methods that can work with different data
   types while providing compile-time type checking. This avoids runtime errors like ClassCastException and eliminates
   the need for explicit type casting.

1. Basic Generic Class Example

Syntax:
class ClassName<T> {  
// T is a type parameter (can be any identifier like E, K, V, etc.)
private T data;

    public ClassName(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

Example: A Generic Box Class

public class Box<T> {
private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        // Integer Box
        Box<Integer> intBox = new Box<>(100);
        System.out.println("Integer Box: " + intBox.getContent());

        // String Box
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Box: " + strBox.getContent());
    }
}
Output:
Integer Box: 100
String Box: Hello, Generics!

2. Multiple Type Parameters
You can define multiple generic types in a class.
Example: Pair Class with Two Generics (K, V)

public class Pair<K, V> {
private K key;
private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("John", 25);
        System.out.println("Key: " + student.getKey() + ", Value: " + student.getValue());
    }
}
Output:
Key: John, Value: 25

3. Bounded Generics (Restricting Types)
You can restrict generics to certain types using extends (for classes/interfaces).

Example: Number-Bounded Generic

public class NumericBox<T extends Number> { // Only accepts Number types (Integer, Double, etc.)
private T number;

    public NumericBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public static void main(String[] args) {
        NumericBox<Integer> intBox = new NumericBox<>(10); // ✅ Valid
        NumericBox<Double> doubleBox = new NumericBox<>(3.14); // ✅ Valid
        // NumericBox<String> strBox = new NumericBox<>("Test"); // ❌ Compile-time error
    }
}

4. Generic Methods
You can also define generic methods inside a non-generic class.

Example: Generic swap Method

public class GenericMethods {
// Generic method to swap two elements
public static <T> void swap(T[] array, int i, int j) {
T temp = array[i];
array[i] = array[j];
array[j] = temp;
}

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        swap(nums, 0, 2); // Swaps 1 and 3
        System.out.println("Swapped Array: " + Arrays.toString(nums));
    }
}
Output:
Swapped Array: [3, 2, 1]

5. Wildcards (?) in Generics
Wildcards (?) allow flexibility when working with unknown types.

Wildcard Type	        Meaning	                       Example
<?>	                    Any type	                    List<?>
<? extends T>	     Any subtype of T	          List<? extends Number>
<? super T>	        Any supertype of T	           List<? super Integer>

Example: Wildcard in a Method

public class WildcardExample {
    // Accepts any List of Numbers or its subclasses (Integer, Double, etc.)
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        System.out.println("Sum: " + sumOfList(intList)); // Sum: 6.0
    }
}

6. Generic Class vs. Non-Generic Class

Feature	                        Generic Class	                Non-Generic Class
Type Safety             	✅ Compile-time checks	        ❌ Runtime errors possible
Type Casting	            ❌ Not needed	                    ✅ Required
Flexibility             	✅ Works with any type	         ❌ Works only with Object

## When to Use Generics?

✔ Collections (List<T>, Map<K,V>)
✔ Custom data structures (e.g., Stack<T>, Queue<T>)
✔ Utility classes (e.g., Comparator<T>, Optional<T>)

## Summary
-- Generic classes allow type-safe reusable code.
-- Bounded generics (<T extends Class>) restrict types.
-- Wildcards (?) provide flexibility.
-- Generic methods can be used in non-generic classes.
-- Generics improve type safety and code reusability while reducing runtime errors. 🚀


