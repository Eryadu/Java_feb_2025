package april1_Lists_ArrayList;

public class Employee {
    String empName;
    int empID;
    Double empSalary;

    public Employee(String empName, int empID, Double empSalary) {
        this.empName = empName;
        this.empID = empID;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", empSalary=" + empSalary +
                '}';
    }
}
