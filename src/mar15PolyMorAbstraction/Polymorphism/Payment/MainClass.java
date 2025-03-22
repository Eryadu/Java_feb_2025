package mar15PolyMorAbstraction.Polymorphism.Payment;

public class MainClass {
    public static void main(String[] args) {

        // object of CreditCard class
        // assign to Payment class (Upcasting)

        Payment cc = new CreditCard();
        System.out.println("Payment of Credit card is : " + cc.payMent());
        /*CreditCard cc1 = new CreditCard();
        System.out.println("Method of Credit class :" + cc1.payMent());
        System.out.println("Credit fees is (Variable) :" + cc1.creditFees);
        System.out.println("Credit fees is (method of credit fees) :" + cc1.Fees());
        System.out.println("Method of Payment class : " + cc1.typeOfPayment());
        System.out.println("Variable of Payment class : " + cc1.amountPP);
*/
        Payment pp = new Paypal();
        System.out.println("Payment of Credit card is : " + pp.payMent());

        Payment up = new Upi();
        System.out.println("Payment of Credit card is : " + up.payMent());

        Payment inter = new Interact();
        System.out.println("Payment of Credit card is : " + inter.payMent());
    }
}
