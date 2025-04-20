package practice.solidPrinciple.DIP;

public class DebitCard implements Bankcard {
    public void doTransaction (long amount){
        System.out.println("Payment using Debit card");
    }
}
