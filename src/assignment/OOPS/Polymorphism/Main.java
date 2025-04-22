package assignment.OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(40, 17.34, 50);
        System.out.println("Salary of Full time Employee Per Week is : " + fullTimeEmployee.calculatePay());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(24, 17.20, 30);
        System.out.println("Salary of Full time Employee Per Week is : " + partTimeEmployee.calculatePay());
    }
}
