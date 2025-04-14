package april8Comparator_Comparable_HashDemo.Comparator;

import java.util.Comparator;

public class AccountbalanceComparator implements Comparator<BankClass> {
    @Override
    public int compare(BankClass o1, BankClass o2) {
        return (int) o1.getAccountBalance()- (int)o2.getAccountBalance();
    }
}
