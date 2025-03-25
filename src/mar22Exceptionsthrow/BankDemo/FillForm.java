package mar22Exceptionsthrow.BankDemo;

public class FillForm extends RuntimeException{
    public FillForm(String message) {
        super(message);
    }
}
