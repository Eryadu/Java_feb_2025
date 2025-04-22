package assignment.OOPS.Polymorphism;

public class FullTimeEmployee extends Employee{
    int numberOfHours;
    double payRate;
    int bonusPay;

    public FullTimeEmployee(int numberOfHours, double payRate, int bonusPay) {
        this.numberOfHours = numberOfHours;
        this.payRate = payRate;
        this.bonusPay = bonusPay;
    }

    @Override
    double calculatePay() {
        Salary = numberOfHours*payRate+bonusPay;
        //super.calculatePay();
        return super.calculatePay();
    }
}
