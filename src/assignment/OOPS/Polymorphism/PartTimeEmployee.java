package assignment.OOPS.Polymorphism;

public class PartTimeEmployee extends Employee{
    int numberOfHours;
    double payRate;
    int bonusPay;

    public PartTimeEmployee(int numberOfHours, double payRate, int bonusPay) {
        this.numberOfHours = numberOfHours;
        this.payRate = payRate;
        this.bonusPay = bonusPay;
    }

    @Override
    double calculatePay() {
        double Salary = numberOfHours*payRate+bonusPay;
        return Salary;
    }
}
