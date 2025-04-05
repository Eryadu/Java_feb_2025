package mar22Exceptionsthrow.BankDemo;

public class BankMainClass{
    public static void main(String[] args) {
        SavingAccount sb = new SavingAccount();
        sb.accountBalance = 100;
        sb.setAccountNumber("ABC123");
        sb.Deposit();
        System.out.println("New Account balance for saving account number " + sb.getAccountNumber() + " is :" + sb.accountBalance);

        sb.Withdraw();
        System.out.println("Remaining Balance in account " + sb.getAccountNumber() + " is " + sb.accountBalance);

        sb.CheckBalance();
        System.out.println(sb.getAccountNumber() + "account has " + sb.accountBalance + "balance");

    }
}
