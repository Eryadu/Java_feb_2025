package practice.fileHandling;

// .nio package/API is advance version of .io, usages Files
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DemoWithNewFileHandling {
    public static void main(String[] args) {
        writeToFile();
        readFromFile();

    }

    // using Files (Java 7+) before uses FileReader
    public static void writeToFile(){
        Path path = Paths.get("nioTest.txt");

        try {
            Files.write(path, "We are trying to write with nio package".getBytes());
            System.out.println("File has been written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readFromFile(){
         Path path1 = Paths.get("nioTest.txt");

        try {
            List<String> st = Files.readAllLines(path1);
            System.out.println(st);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
