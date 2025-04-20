package practice.solidPrinciple.ISP;

public class Paytm implements UPIPayments {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

   /* @Override
    public void getCashBackAsCreditBalance() {
// this function is not applicable in Paytm   // It violate the Interface principle
    }
*/
}
