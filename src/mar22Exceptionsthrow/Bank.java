package mar22Exceptionsthrow;

public class Bank {
    double accountBalance;
    double accountNumber;

    public Bank() {
    }

    public Bank(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Bank(double accountBalance, double accountNumber) {
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
            throw  new InsufficientBalance ("You have not enough balance");
        }else {
            accountBalance -= amount;
            System.out.println("Amount Withdraw : " + amount);
            System.out.println("Account balance after withdraw : " + accountBalance);
        }
    }

    public void balance  ()
    {
        System.out.println("Account Balance for account number " + accountNumber + " is :  " + accountBalance);
    }
}
