package practice.genericClass;

// Bounded Generic Class , only accept String
public class BoundedGeneric <T extends String>{
    private T name;
    private T email;

    public BoundedGeneric(T name, T email) {
        this.name = name;
        this.email = email;
    }

    public T getName() {
        return name;
    }

    public T getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "BoundedGeneric{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        BoundedGeneric<String> bounded = new BoundedGeneric<>("Abc", "abc@gmail.com");
        System.out.println(bounded);
         //BoundedGeneric<Interger> bounded1 = new BoundedGeneric<>(123,342); // Generic Restrict up to string only
    }
}
