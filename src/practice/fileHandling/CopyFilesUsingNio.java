package practice.fileHandling;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class CopyFilesUsingNio {
    public static void main(String[] args) {

        //Path source = Paths.get("SourceFile.txt");
        Path target = Paths.get("TargetFile.txt");

        try {
            Files.write(Paths.get("SourceFile.txt"),"Source Hello Testing".getBytes() );
            //Files.writeString(Paths.get("SourceFile.txt"),"Source Hello Testing");


           // Files.write(source, "Source Hello Testing".getBytes());
            Files.write(target, "Target World".getBytes());
            //Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); // first method to copy file content to other

            // Files.copy(source, target, StandardCopyOption.COPY_ATTRIBUTES); for Copy_Attributes just file write for source
            //Files.write(source, "Source Hello".getBytes());
            //Files.write(target, "Target World".getBytes()); don't write this one

         //  Files.move(source, target, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("Content is copied");
        } catch (IOException e) {
            System.out.println("Copying Failed : " + e.getMessage());
            throw new RuntimeException(e);
        }



    }
}




/*
        Path source = Paths.get("SourceFile.txt");
        try {
                Files.write(source, "Source Hello Testing".getBytes());

            List <String> str = Files.readAllLines(Paths.get("SourceFile.txt")); // Second method to copy file content to other
            Files.write(Paths.get("TargetFile.txt"), str);
            System.out.println("Content is copied");
           }
           catch (IOException e) {
            System.out.println("Copying Failed : " + e.getMessage());
            throw new RuntimeException(e);
        }
*/
