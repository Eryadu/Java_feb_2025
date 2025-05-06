package april29Streams;

import java.util.List;
import java.util.Optional;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // We can directly declare optional
   /* public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }*/

    public String getEmail() {
        return email;
    }
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
