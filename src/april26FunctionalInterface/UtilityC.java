package april26FunctionalInterface;

public class UtilityC {
    public void validator (IValidate validate, Integer number){

        System.out.println("Result = " +validate.validate(number));

    }
}
