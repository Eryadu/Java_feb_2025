package Mar8_Inheritance.Inheritance.SuperKeyword;

public class FunctionOfCalculator extends Calculator {
    int z;
    int x=10, y=20;

    @Override
    public void calculation() {
        System.out.println("This is method of Calculator's function class.");
    }

    public void addition(int x , int y){
        z= x+y;
        System.out.println("Sum is : " + z);
    }

    public void multiplication(int x , int y){
        z= x*y;
        System.out.println("Multiplication is : " + z);
    }

    public void subtraction(int x , int y){
        z = x-y;
        System.out.println("Subtraction is :" + z);
    }
    public void division(int x , int y){
        z = x/y;
        System.out.println("Division is :" + z);
    }
    public void super_class(){
        FunctionOfCalculator fn = new FunctionOfCalculator();
        fn.calculation();
        System.out.println("Value of X and Y in Function's class is :" + fn.x + "," + fn.y);

        super.calculation();
        System.out.println("Value of X and Y in calculation class is :" + super.x + "," + super.y);

        fn.addition(10,5);
        fn.multiplication(10,2);
        fn.subtraction(10,4);
        fn.division(32,2);
    }

}

