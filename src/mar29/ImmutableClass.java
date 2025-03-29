package mar29;

import java.util.Objects;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final String email;

    // create constructor to initalize the private and final members
    public ImmutableClass(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // create getter to get the value of private members
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // create equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(1, "Abc", "abc@gmail.com");
        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getEmail());
        System.out.println(immutableClass.getName());

        ImmutableClass immutableClass1 = new ImmutableClass(2, "cde", "cde@gmail.com");
        System.out.println(immutableClass1.getId());
        System.out.println(immutableClass1.getName());
        System.out.println(immutableClass1.getEmail());



    }
}
