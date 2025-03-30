package mar29.FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

public class FileTest {
        public static void main(String[] args) {

            // How to create file , nio
            // io
            File file = new File("Myfile.js");

            try {
                if (file.createNewFile()) {
                    System.out.println(file.getName());
                    System.out.println(file.exists());

                }
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
}
