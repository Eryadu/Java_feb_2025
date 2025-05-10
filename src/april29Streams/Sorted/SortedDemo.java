package april29Streams.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public int getAge() {
        return age;
    }
}


public class SortedDemo {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Charlie", "Alice", "Bob");

        //Natural Order
        List<String> sortedName = name.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
        System.out.println("Natural Sorted Order : " + sortedName);

        //Reverse Natural Order
        List<String> sortedName3 = name.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Reverse Natural Sorted Order : " + sortedName3);

        // Custom Order
        List<String> sortedName1 = name.stream()
                                    .sorted(Comparator.comparingInt(String :: length))
                                    .collect(Collectors.toList());
        System.out.println("Custom Sorted Order : " + sortedName1);

        // Reverse Custom Order
        List<String> sortedName2 = name.stream()
                .sorted(Comparator.comparingInt(String :: length).reversed())
                .collect(Collectors.toList());
        System.out.println("Reverse Custom Sorted Order : " + sortedName2);

        // handling Null (Null -First)

        List<String> list1 = Arrays.asList("Charlie", null, "Alice",null, "Bob");
        List<String> sortedNull = list1.stream()
                                  .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
                                  .collect(Collectors.toList());
        System.out.println("Null First : " + sortedNull);

        // handling Null (Null -First)
        List<String> sortedNull1 = list1.stream()
                .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println("Null last : " + sortedNull1);


        // Custom Object Sorting

        List<Person> personList = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        List<Person> list = personList.stream()
                            .sorted(Comparator.comparingInt(Person::getAge))
                            .collect(Collectors.toList());

        System.out.println("Custom Sorted List :" +  list);


    }
}
