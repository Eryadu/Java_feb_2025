package april29Streams.MethodReference;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book{
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
public class InstanceMethodArbitrary {
    public static void main(String[] args) {
        List<Book> list = Arrays.asList(new Book ("Leader"), new Book("GodMan")); // Arbitrary objects

        // Apply Arbitrary method on each object
         List<String>  book = list.stream().map(Book :: getTitle).collect(Collectors.toList());
        System.out.println(book);


    }
}
