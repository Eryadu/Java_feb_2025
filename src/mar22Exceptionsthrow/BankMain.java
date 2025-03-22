package mar22Exceptionsthrow;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(100, 12345);
        bank.balance();
        bank.deposit(10);
        bank.withDraw(200);

    }
}
