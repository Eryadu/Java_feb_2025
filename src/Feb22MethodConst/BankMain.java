package Feb22MethodConst;

public class BankMain {
    public static void main(String[] args) {
        BankDemo bankDemo = new BankDemo(100, 2222);
        bankDemo.deposit(100);
        bankDemo.withDraw(200);
        bankDemo.balance();

    }
}
