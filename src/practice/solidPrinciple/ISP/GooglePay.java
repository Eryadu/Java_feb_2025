package practice.solidPrinciple.ISP;

public class GooglePay implements UPIPayments, CashBackManager{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
// all functions are supported by googlePay
    }
}
