## Serialization in Java
   Serialization in Java is the process of converting an object into a byte stream (sequence of bytes), which can be:
## This is a marker interface, which enable to provide information to JVM / Complier at run time that, this class/object
   should be serialized.

-- Save to a file.
-- Transmitted over a network.
-- Stored in a database.

## Deserialization is the reverse process (reconstructing the object from the byte stream).

## Why Use Serialization?

✔ Persistence – Save an object's state to disk (e.g., game progress).
✔ Networking – Send objects over a network (RMI, sockets).
✔ Caching – Store objects in memory for faster retrieval.
✔ Deep Cloning – Create a copy of an object via serialization.

## How Serialization Works in Java

Serializable Interface (Marker Interface – No methods)
import java.io.Serializable;

public class Person implements Serializable {
private String name;
private int age;
// Constructors, getters, setters...
}

## ObjectOutputStream – Converts objects to bytes.
## ObjectInputStream – Reconstructs objects from bytes.

Example: Serialization & Deserialization

1. Serialize an Object (Save to File)

import java.io.*;

public class SerializationExample {
public static void main(String[] args) {
Person person = new Person("Alice", 30);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            
            out.writeObject(person);  // Serialize
            System.out.println("Object serialized to person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

2. Deserialize an Object (Load from File)

try (FileInputStream fileIn = new FileInputStream("person.ser");
ObjectInputStream in = new ObjectInputStream(fileIn)) {

    Person deserializedPerson = (Person) in.readObject();  // Deserialize
    System.out.println("Deserialized: " + deserializedPerson.getName());  // Alice

} catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}

## Key Concepts

1. transient Keyword

Skips serialization for sensitive fields (e.g., passwords).
private transient String password;  // Won't be serialized

2. serialVersionUID

A version control mechanism (to avoid InvalidClassException).
private static final long serialVersionUID = 1L;

3. Custom Serialization (Advanced)

Override writeObject() and readObject() for custom logic.
private void writeObject(ObjectOutputStream oos) throws IOException {
oos.defaultWriteObject();  // Default serialization
// Custom logic...
}

## Java Serialization Limitations

❌ Not Secure – Serialized data can be tampered with.
❌ Versioning Issues – Changes in class structure may break deserialization.
❌ Performance Overhead – Slower than alternatives like JSON/Protobuf.
❌ Only for Java – Not interoperable with other languages.

## Alternatives to Java Serialization

Format	                                    Pros	                                    Cons
JSON (Gson/Jackson)	            Human-readable, language-independent	    No schema, slower than binary formats
Protocol Buffers (Protobuf)	    Fast, compact,schema-based	                Requires .proto definition
Apache Avro	                    Schema evolution support	                More complex setup
Kryo	                        Faster than Java serialization	            Not cross-language

## Best Practices

✔ Always declare serialVersionUID to avoid version conflicts.
✔ Use transient for sensitive fields.
✔ Prefer alternatives (JSON/Protobuf) for cross-platform use.
✔ Validate deserialized objects to prevent security risks.

## Conclusion

Serialization = Object → Byte stream.
Deserialization = Byte stream → Object.
Use Serializable for simple persistence in Java.
Consider alternatives (JSON, Protobuf) for better security & interoperability.