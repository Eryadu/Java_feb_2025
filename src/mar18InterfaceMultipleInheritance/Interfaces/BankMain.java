package mar18InterfaceMultipleInheritance.Interfaces;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Scotia();
        Bank bank2 = new BMO();
        Bank bank3 = new RBC();
        bank1.getRateOfInterest();
        bank2.getRateOfInterest();
        bank3.getRateOfInterest();

    }
}
