package mar22Exceptionsthrow.BankDemo;

public class BankMember {
    double accountBalance;
    private String accountNumber;

    public BankMember() {
    }

    public BankMember(double bankBalance) {
        this.accountBalance = bankBalance;
    }

    public BankMember(double bankBalance, String accountNumber) {
        this.accountBalance = bankBalance;
        this.accountNumber = accountNumber;
    }

    /*public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }*/

    public String getAccountNumber() { // You can just check account number.
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

