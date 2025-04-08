package practice;


import java.io.*;


class Person implements Serializable {
    private String Name;
    private int age;

    // @Constructor
    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    // @Getter Setter
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SerializationPractice{
    public static void main(String[] args) {
        Person person = new Person("Yad", 21);

        try (
                // Create a file to store serialized object
            FileOutputStream fileOut = new FileOutputStream("person.ser");

            // pass that file to ObjectOutPutStream
            ObjectOutputStream out =  new ObjectOutputStream (fileOut)){

            // Pass the object to serialized
            out.writeObject(person);
            System.out.println("Object Serialized to person.ser");
            }

         catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}