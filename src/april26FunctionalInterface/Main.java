package april26FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        IUtil iUtil =  x -> {
            if(x%2==0)
            {
                return  true;
            }
            return false;
        };

        System.out.println(iUtil.Abs(45));

    Test test = x -> x;
        System.out.println(test.display(12));

        UtilityC utilityC = new UtilityC();
        // CustomValidator customValidator = new CustomValidator();

        // Traditional approach
        /*IValidate validate = new IValidate() {
            @Override
            public boolean validate(Integer i){
                return i%45 ==0;
            }
        };*/

        IValidate validate = i -> i%45==0;
        //utilityC.validator(customValidator , 45);

        // We can pass variable of Interface
        //utilityC.validator(validate , 45);

        // We can also pass only logic
        utilityC.validator(i -> i%45==0, 45);

    }
}
