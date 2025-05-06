package april29Streams;

import java.util.Arrays;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        Customer customer = new Customer(101, "John", "test@gmail.com", Arrays.asList("12333", "12233"));

        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

       // Optional<String> emailOptional = Optional.of(customer.getEmail()); // it checks null internally
        //System.out.println(emptyOptional);  //NullPointerException

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail()); // null?empty():of()
        //System.out.println(emailOptional2);

        //System.out.println(emailOptional2.get()); // NoSuchElementException
        // so first we check with isPresent().
        /*if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }
        else {
            System.out.println("value not present");
        }*/

        // orElse for default value
        //System.out.println(emailOptional2.orElse("Default@gmail.com"));

        // orElseThrow() --> for custom Exception
        System.out.println(emailOptional2.orElseThrow( () -> new IllegalArgumentException("email not present")));
                                            // IllegalArgumentException: email not present

        /*// orElseGet for default value
        System.out.println(emailOptional2.orElseGet(() ->));*/

        // map() and orElseGet()
        System.out.println(emailOptional2.map(String :: toUpperCase).orElseGet(() -> "Default email ..."));
        // if value present -- > TEST@GMAIL.COM
        // if value not present --> "Default email"


    }
}
