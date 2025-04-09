package april8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
       // BankClass bankClass = new BankClass(123, "Yad", 120.0);

        List<BankClass> bankClass = new ArrayList<>();
        bankClass.add(new BankClass(102, "CDE", 120.0 ));
        bankClass.add(new BankClass(101, "FDE", 110.0 ));
        bankClass.add(new BankClass(105, "ACT", 100.0 ));
        bankClass.add(new BankClass(103, "GVE", 130.0 ));

        System.out.println("Bank List Sorted based on Account Holder name  (before sorting) " + bankClass);
        Collections.sort(bankClass, new NameComparator());
        System.out.println("Bank List Sorted based on Account Holder name  (after sorting) " + bankClass);

        System.out.println();
        System.out.println("Bank List Sorted based on Account Balance (before sorting) : " + bankClass);
        Collections.sort(bankClass, new AccountbalanceComparator());
        System.out.println("Bank List Sorted based on Account Balance (After sorting): " + bankClass);
    }
}
