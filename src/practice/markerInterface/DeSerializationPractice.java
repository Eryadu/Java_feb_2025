package practice.markerInterface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationPractice implements Serializable {
    public static void main(String[] args) {


        try (
                // Read the file
                FileInputStream fileInput = new FileInputStream("person.ser");
                ObjectInputStream in = new ObjectInputStream(fileInput);) {

            // DeSerialized to Object Type
            Person deSerialized =  (Person) in.readObject();
            System.out.println("Deserialized file is " + deSerialized);
        }

        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
