package practice.solidPrinciple.ISP;

public class PhonePay implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
// not applicable for Phone pay
    }
}
