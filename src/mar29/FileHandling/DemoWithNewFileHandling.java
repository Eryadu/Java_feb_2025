package mar29.FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class DemoWithNewFileHandling
{
        public static void main(String[] args) {

            writeToFile();
            readFromFile();

        }

        public static void writeToFile(){
            Path path = Paths.get("Somefile.txt");

            try {
                Files.write(path, "Hello this is new type of file handling".getBytes());
                System.out.println("File has been written");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void readFromFile(){
            Path path = Paths.get("Somefile.txt");

            try {
                List<String> list = Files.readAllLines(path);
                System.out.println(list);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

}
