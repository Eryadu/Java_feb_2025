package mar15PolyMorAbstraction.Composition;

public class Employee {
    private String id;
    private NameComposition name ; // FirstName MiddleName LastName (break the Name using composition)
    private String email;
    private AddressComposition addressComposition; // break the Address using composition
    private double salary;

    // Create constructor to declare variable
    // Create getter & setter to access private variables
    // declare toString method to display string output
    public Employee(String id, NameComposition name, String email, AddressComposition addressComposition, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addressComposition = addressComposition;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NameComposition getName() {
        return name;
    }

    public void setName(NameComposition name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressComposition getAddress() {
        return addressComposition;
    }

    public void setAddress(AddressComposition addressComposition) {
        this.addressComposition = addressComposition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Detail is " +
                "id='" + id + '\'' +
                ", name=" + name +
                ", email='" + email + '\'' +
                ", address='" + addressComposition + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
