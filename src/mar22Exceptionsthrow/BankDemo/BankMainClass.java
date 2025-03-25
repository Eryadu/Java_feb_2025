package mar22Exceptionsthrow.BankDemo;

public class BankMainClass{
    public static void main(String[] args) {
        SavingAccount sb = new SavingAccount();
        sb.accountBalance = 100;
        sb.Deposit();
        System.out.println("New Account balance for saving account number " + sb.accountNumber + " is :" + sb.accountBalance);

    }
}
