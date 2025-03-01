package Feb22MethodConst;

public class BankDemo {
    double accountBalance;
    double accountNumber;

    public BankDemo() {
    }

    public BankDemo(double accountBalance) {

        this.accountBalance = accountBalance;
    }

    public BankDemo(double accountBalance, double accountNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount)
    {
        accountBalance += amount;
        System.out.println("Account Balance after deposit : " + accountBalance);

    }

    public  void withDraw ( double amount)
    {
        if ( amount > accountBalance) {
            System.out.println("Not Enough Balance. Enter correct amount");
            System.exit(0);
        }
        accountBalance -= amount;
        System.out.println("Amount Withdraw : " + amount);
        System.out.println("Account balance after withdraw : " + accountBalance);
    }

    public void balance  ()
    {
        System.out.println("Account Balance for account number " + accountNumber + " is :  " + accountBalance);
    }
}
