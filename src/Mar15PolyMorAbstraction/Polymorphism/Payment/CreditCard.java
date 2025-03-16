package Mar15PolyMorAbstraction.Polymorphism.Payment;

public class CreditCard extends Payment{
    public double payMent(){
        double amount =100.00;
        return amount;
    }
    double creditFees = 12.00;
    public double Fees(){
        return creditFees;
    }
}
