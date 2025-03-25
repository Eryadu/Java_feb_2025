package mar22Exceptionsthrow.BankDemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SavingAccount  extends BankMember implements BankMethod  {
    double depositAmount;

    @Override
    public double Deposit()  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account number : ");
        accountNumber = scanner.nextInt();
        System.out.println("Enter the amount to deposit : ");
        depositAmount = scanner.nextInt();
        try {
            if (depositAmount >= 10000) {
                throw new FillForm("You have to visit Bank branch and fill authorization form.");
            }
        }catch (FillForm f)
        {
            System.out.println(f.getMessage());
            System.exit(0);
        }
        accountBalance = accountNumber + depositAmount;
        return accountBalance + accountNumber;
    }

    @Override
    public double Withdraw() {
        return 0;
    }

    @Override
    public double CheckBalance() {
        return 0;
    }
}
