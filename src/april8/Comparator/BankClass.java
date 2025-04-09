package april8.Comparator;

import java.util.Comparator;

public class BankClass {
    public int accountID;
    public String accountHolderName;
    public double accountBalance;

    public BankClass(int accountID, String accountHolderName, double accountBalance) {
        this.accountID = accountID;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankClass{" +
                "accountID=" + accountID +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
