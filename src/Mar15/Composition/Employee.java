package Mar15.Composition;

import java.util.stream.StreamSupport;

public class Employee {
    private String id;
    private NameComposition name ; // FirstName MiddleName LastName
    private String email;
    private String address;
    private double salary;

    public Employee(String id, NameComposition name, String email, String address, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
