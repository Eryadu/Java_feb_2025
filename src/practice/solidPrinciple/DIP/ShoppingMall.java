package practice.solidPrinciple.DIP;

public class ShoppingMall {

    /*private DebitCard debitCard;
    // private CreditCard creditCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }*/

    private Bankcard bankcard;

    public ShoppingMall(Bankcard bank) {
        this.bankcard = bank;
    }

    public void doPurchaseSomething (long amount){
        bankcard.doTransaction(amount);
    }


    /*public ShoppingMall(CreditCard creditCard) {
            this.creditCard = creditCard;
        }*//*
    public void doPurchaseSomething (long amount){
        debitCard.doTransaction(amount);
    }
*/
    public static void main(String[] args) {
        // DebitCard debitCard = new DebitCard();

        // here class shopping mall is tightly coupled with debit card, if we need
        // change the payment method to credit card we need to change everything. This violate Dependency inversion principle
        // CreditCard creditCard = new CreditCard();
        // shopping mall is tightly coupled with debit card and credit card

        Bankcard bankcard = new DebitCard(); // just create the instance which method we want to use, no need to change all code
        ShoppingMall shoppingMall = new ShoppingMall(bankcard);
        //ShoppingMall shoppingMall = new ShoppingMall(creditCard);


        //Bankcard bankcard = new DebitCard();
        shoppingMall.doPurchaseSomething(5000);

    }
}
