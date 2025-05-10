package april29Streams.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

class Student{
    public static void studentInfo(String s){
        System.out.println("Display Static Method of StudentInfo : " + s);
    }

    public void studentInstance(String s){
        System.out.println(" Display Instance Method of StudentInstance :  " + s);
    }
}

class Person{
    String name;

    Person(){
        this.name = "Constructor  Calling ...... ";
    }
    public Person(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob");
        //Method reference
        list.forEach(Student::studentInfo);
        // Method reference With lambda
        list.forEach(s -> Student.studentInfo(s));

        // Instance Method reference
        Student student = new Student();
        list.forEach(student:: studentInstance);

        // Instance Method reference with Lambda
        list.forEach(s -> student.studentInstance(s));

        // Instance Methode with reference to Arbitrary object
        list.forEach(String :: toUpperCase);
        System.out.println(list);

        // Instance Methode with Arbitrary object using Lambda
        list.forEach(s -> System.out.println(s.toUpperCase()));

        // no arg Constructor
        Supplier<Person> name = Person::new;
        Person p1 = name.get();

        // Arg Constructor
        Function<String, Person> name1 = Person::new;
        Person p2 = name1.apply("Hello");

        System.out.println("Constructor with No Arg : " + p1);
        System.out.println("Constructor with Arg : " + p2);

    }
}
