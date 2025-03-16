package Mar15PolyMorAbstraction.Polymorphism.Payment;

public class Upi extends Payment{
    @Override
    public double payMent() {
        double amount = 130.00;
        return amount;
    }
}
