package practice.markerInterface;


import java.io.*;


class Person implements Serializable {
    private String Name;
    private int age;
    transient private String password;

    public Person(String name, int age, String password) {
        Name = name;
        this.age = age;
        this.password = password;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}


public class SerializationPractice{
    public static void main(String[] args) {
        Person person = new Person("Yad", 21, "ABC");

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