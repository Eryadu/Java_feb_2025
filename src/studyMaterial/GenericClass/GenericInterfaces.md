## Generic Interfaces in Java : Just like generic classes, Java allows generic interfaces to define type-safe contract
   that can work with different data types. Common examples include Comparable<T>, Comparator<T>, and List<T>.

1. Basic Generic Interface Example

Syntax:

interface InterfaceName<T> {
void method(T item);
}
Example: A Generic Storage Interface

interface Storage<T> {
void store(T item);
T retrieve();
}

// Implementing the generic interface
class Box<T> implements Storage<T> {
private T content;

    @Override
    public void store(T item) {
        this.content = item;
    }

    @Override
    public T retrieve() {
        return content;
    }
}

public class Main {
public static void main(String[] args) {
Box<String> stringBox = new Box<>();
stringBox.store("Hello, Generics!");
System.out.println(stringBox.retrieve()); // Hello, Generics!

        Box<Integer> intBox = new Box<>();
        intBox.store(100);
        System.out.println(intBox.retrieve()); // 100
    }
}
Key Points:
Storage<T> is a generic interface.
Box<T> implements it for any type T.

2. Real-World Example: Comparable<T>
   Java's built-in Comparable<T> interface is generic:

public interface Comparable<T> {
int compareTo(T other);
}

Example: A Person Class Implementing Comparable<Person>

class Person implements Comparable<Person> {
private String name;
private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Compare by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
public static void main(String[] args) {
Person alice = new Person("Alice", 30);
Person bob = new Person("Bob", 25);

        System.out.println(alice.compareTo(bob)); // 5 (Alice is older)
    }
}

3. Multiple Type Parameters in Interfaces

Interfaces can also have multiple generic types.

Example: Pair<K, V> Interface

interface Pair<K, V> {
K getKey();
V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
private K key;
private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() { return key; }

    @Override
    public V getValue() { return value; }
}

public class Main {
public static void main(String[] args) {
Pair<String, Integer> student = new OrderedPair<>("John", 25);
System.out.println(student.getKey() + ": " + student.getValue());
}
}
Output:
John: 25

4. Bounded Generics in Interfaces
   You can restrict generic types in interfaces using extends.

Example: NumberProcessor Interface
interface NumberProcessor<T extends Number> {
double process(T num);
}

class SquareProcessor implements NumberProcessor<Integer> {
@Override
public double process(Integer num) {
return num * num;
}
}

public class Main {
public static void main(String[] args) {
SquareProcessor processor = new SquareProcessor();
System.out.println(processor.process(5)); // 25.0
}
}
Key Restriction:
NumberProcessor only accepts Number types (Integer, Double, etc.).
