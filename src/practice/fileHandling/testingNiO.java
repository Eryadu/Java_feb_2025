package practice.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testingNiO {
    public static void main(String[] args) {
        byte[] data = null;
        try {
            data = Files.readAllBytes(Paths.get("IMG_1025.PNG"));
            Files.write(Paths.get("copy.jpg"), data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
