package mar22Exceptionsthrow.BankDemo;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SavingAccount  extends BankMember implements BankMethod  {
    double depositAmount;

    @Override
    public double Deposit() throws FillForm {


        try {
            Scanner scanner = new Scanner(System.in);
            /*System.out.println("Enter the Account number : ");
            accountNumber = scanner.nextInt();*/
            System.out.println("Enter the amount to deposit : ");
            depositAmount = scanner.nextInt();
            if (depositAmount >= 10000) {
                throw new FillForm("You have to visit Bank branch and fill authorization form.");
            }
        }catch (FillForm f )
        {
            System.out.println(f.getMessage());
            System.exit(0);
        }catch (InputMismatchException m)
        {
            m.getMessage();
        }
        accountBalance = accountBalance + depositAmount;
        return accountBalance;
    }

    @Override
    public double Withdraw() throws InvalidAmount {
        double withDrawAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount to withdraw : ");
        withDrawAmount = scanner.nextInt();
        try{
            if(withDrawAmount > accountBalance)
            {
                throw new InvalidAmount ("Enter the valid amount to withdraw.");
            }
        }catch (InvalidAmount I){
            System.out.println(I.getMessage());
            System.exit(0);
        }

        accountBalance = accountBalance-withDrawAmount;
        return accountBalance;
    }

    @Override
    public double CheckBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account number to check Balance : " );
        //accountNumber = scanner.nextInt();
        return accountBalance;
    }
}
