package april8Comparator_Comparable_HashDemo.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<BankClass> {
    @Override
    public int compare(BankClass o1, BankClass o2) {
        return o1.accountHolderName.compareTo(o2.getAccountHolderName());
    }
}
