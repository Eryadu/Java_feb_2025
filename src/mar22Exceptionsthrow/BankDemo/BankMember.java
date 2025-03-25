package mar22Exceptionsthrow.BankDemo;

public class BankMember {
    double accountBalance;
    int accountNumber;

    public BankMember() {
    }

    public BankMember(double bankBalance) {
        this.accountBalance = bankBalance;
    }

    public BankMember(double bankBalance, int accountNumber) {
        this.accountBalance = bankBalance;
        this.accountNumber = accountNumber;
    }

    /*public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public double getAccountNumber() { // You can just check account number.
        return accountNumber;
    }*/

    /*public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }*/
}

