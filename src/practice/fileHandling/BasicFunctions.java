package practice.fileHandling;

import java.io.File;
import java.io.IOException;

public class BasicFunctions {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try { // Create file
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        // check exist of file
        boolean exist = file.exists();
        System.out.println(exist);

        // to rename the file
         file.renameTo(new File("RenamedFile.txt"));

       /* //delete file and check again exist of file
        file.delete();
        boolean exist1 = file.exists();
        System.out.println(exist1);*/

    }
}
