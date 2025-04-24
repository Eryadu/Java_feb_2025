package april22EqualAndHashCode;

import java.util.Objects;

public class Employee { // POJO Class

       private int eId;
       private String firstName;
       private String lastName;
       private String emialID;

    public Employee(int eId, String firstName, String lastName, String emialID) {
        this.eId = eId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emialID = emialID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emialID='" + emialID + '\'' +
                '}';
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmialID() {
        return emialID;
    }

    public void setEmialID(String emialID) {
        this.emialID = emialID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eId == employee.eId && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(emialID, employee.emialID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, firstName, lastName, emialID);
    }
}
