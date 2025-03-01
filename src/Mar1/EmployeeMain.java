package Mar1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "ab","abc@gmail.com");
        Employee employee2 = new Employee(2, "bc","def@gmail.com");
        Employee employee3 = new Employee(3, "cd","ghi@gmail.com");

        System.out.println("Employee Detail of Employee 1: ");
        employee1.empDetail();

        System.out.println("Employee Detail of Employee 2: ");
        employee2.empDetail();

        System.out.println("Employee Detail of Employee 3: ");
        employee3.empDetail();
    }
}
