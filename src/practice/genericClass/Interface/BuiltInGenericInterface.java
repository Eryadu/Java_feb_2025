package practice.genericClass.Interface;


    interface Comparable<T> {
        int compareTo(T other);
    }

    class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return this.age - other.age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

public class BuiltInGenericInterface {
        public static void main(String[] args) {
            Person alice = new Person("Alice", 30);
            Person bob = new Person("Bob", 25);

            System.out.println(alice.compareTo(bob)); // 5 (Alice is older)
        }
    }

