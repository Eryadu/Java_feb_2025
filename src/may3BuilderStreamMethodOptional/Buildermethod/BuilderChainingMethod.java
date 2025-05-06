package may3BuilderStreamMethodOptional.Buildermethod;

// Method chaining
final class Student{
    private int id;
    private String name;
    private String address;

    // Setter Methods
    // Note that all setters method
    // return this reference
    public Student setId(int id) {
        this.id = id;
        return this; // return "this" reference to class instance for chaining method
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


public class BuilderChainingMethod {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();


        // Chaining method
        student1.setId(12)
                .setName("ABC")
                .setAddress("XYZ");
        System.out.println(student1);

    }
}
