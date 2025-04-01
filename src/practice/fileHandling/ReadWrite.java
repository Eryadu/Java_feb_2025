package practice.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
        writeWithoutReference();
        writeWithReference();
        readFromFIle();
    }

    // write method without reference (write code in general way)
    public static void writeWithoutReference() {
        try {
            FileWriter fileWriter = new FileWriter("writeWithoutref.txt");
            fileWriter.write("Try to write file without reference");
            System.out.println("Testing");
            fileWriter.close(); // until we close the file, it doesn't write anything

        } catch (
                IOException e) {
            System.out.println(e.getStackTrace());
            throw new RuntimeException(e);

        }
    }

    // write method with reference (write code in try())
    public static void writeWithReference() {
        try (FileWriter fileWriter1 = new FileWriter("writeWithRef.txt")) {
            fileWriter1.write("Try to write file with ref");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
            throw new RuntimeException();
        }
    }


    // Read data from file
public static void readFromFIle() {
    try {
        FileReader fileReader = new FileReader("writeWithoutref.txt");
        int ch;
        while((ch = fileReader.read()) != -1){
            System.out.print((char)ch);
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

}

