## File Handling in Java: A Comprehensive Guide
Java provides robust APIs for file operations through:

-- Legacy java.io package (Stream-based)
-- Modern java.nio package (Non-blocking, buffer-oriented)

Utility classes (Files, Paths)
1. Basic File Operations
a. Check if File Exists

import java.io.File;

File file = new File("test.txt");
boolean exists = file.exists();

b. Create New File

boolean created = file.createNewFile(); // Throws IOException

c. Delete File

boolean deleted = file.delete();
 
2. Reading Files

a. Using FileReader (Old Way)

try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
String line;
while ((line = br.readLine()) != null) {
System.out.println(line);
}
}

b. Using Files (Java 7+)
List<String> lines = Files.readAllLines(Paths.get("test.txt"));
String content = Files.readString(Paths.get("test.txt")); // Java 11+

3. Writing Files

a. Using FileWriter

try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
bw.write("Hello World");
bw.newLine();
}

b. Using Files

Files.write(Paths.get("output.txt"), "Hello World".getBytes());
Files.writeString(Paths.get("output.txt"), "Hello Java 11+"); // Java 11+

4. Modern NIO (New I/O) API

a. Path Operations

Path path = Paths.get("folder", "file.txt"); // Platform-independent path

// Convert between File and Path
File file = path.toFile();
Path newPath = file.toPath();

b. Copy/Move Files

Files.copy(sourcePath, targetPath);
Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);

5. Working with Directories

a. List Files

Files.list(Paths.get("."))
.filter(Files::isRegularFile)
.forEach(System.out::println);

b. Create Directory

Files.createDirectories(Paths.get("new/folder/structure"));

6. Advanced Features

a. File Attributes
BasicFileAttributes attrs = Files.readAttributes(
path,
BasicFileAttributes.class
);
System.out.println("Size: " + attrs.size());
System.out.println("Last Modified: " + attrs.lastModifiedTime());

b. WatchService (File Change Notifications)

WatchService watcher = FileSystems.getDefault().newWatchService();
Path dir = Paths.get(".");
dir.register(watcher, StandardWatchEventKinds.ENTRY_MODIFY);

WatchKey key;
while ((key = watcher.take()) != null) {
for (WatchEvent<?> event : key.pollEvents()) {
System.out.println("Changed: " + event.context());
}
key.reset();
}

7. Common File Operations Cheat Sheet

Operation	        java.io Approach	        java.nio Approach
Read file	        FileInputStream	            Files.readAllBytes()
Write file	        FileOutputStream	        Files.write()
Copy file	        Manual byte copying	        Files.copy()
Move file	        File.renameTo()	            Files.move()
Delete file	        File.delete()	            Files.delete()
Check exists	    File.exists()	            Files.exists()

8. Best Practices

-- Always close resources (use try-with-resources)
-- Prefer NIO for new projects (better performance)
-- Handle exceptions properly (IOException, SecurityException)
-- Use buffers for large files (memory efficiency)
-- Consider character encoding (specify charset)

9. Complete Example: File Copy Utility

import java.nio.file.*;

public class FileCopier {
public static void main(String[] args) {
Path source = Paths.get("source.txt");
Path target = Paths.get("backup.txt");

        try {
            long bytesCopied = Files.copy(
                source, 
                target, 
                StandardCopyOption.REPLACE_EXISTING
            );
            System.out.println("Copied " + bytesCopied + " bytes");
        } catch (IOException e) {
            System.err.println("Copy failed: " + e.getMessage());
        }
    }
}

10. Handling Different File Types

a. Binary Files

byte[] data = Files.readAllBytes(Paths.get("image.jpg"));
Files.write(Paths.get("copy.jpg"), data);

b. CSV Files

List<String> lines = Files.readAllLines(Paths.get("data.csv"));
lines.forEach(line -> {
String[] values = line.split(",");
// Process CSV data
});

c. JSON Files (with Gson)

import com.google.gson.Gson;

String json = Files.readString(Paths.get("data.json"));
MyObject obj = new Gson().fromJson(json, MyObject.class);

11. Temporary Files

Path tempFile = Files.createTempFile("prefix", ".suffix");
System.out.println("Temp file: " + tempFile);

// Delete on exit
tempFile.toFile().deleteOnExit();

12. Error Handling Patterns

a. Traditional Approach
try {
Files.readAllBytes(Paths.get("missing.txt"));
} catch (NoSuchFileException e) {
System.err.println("File doesn't exist");
} catch (AccessDeniedException e) {
System.err.println("No permission");
} catch (IOException e) {
System.err.println("General I/O error");
}

b. Java 7+ Multi-catch

try {
Files.readAllBytes(Paths.get("missing.txt"));
} catch (NoSuchFileException | AccessDeniedException e) {
System.err.println("File access problem");
} catch (IOException e) {
System.err.println("General I/O error");
}

13. Performance Considerations

For small files: Files.readAllBytes()/readAllLines() are convenient
For large files: Use buffered streams

try (BufferedReader br = Files.newBufferedReader(path)) {
// Process line by line
}