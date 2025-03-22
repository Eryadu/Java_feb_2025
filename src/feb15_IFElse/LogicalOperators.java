package feb15_IFElse;

public class LogicalOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int a = 30;
        int b = 20;

        boolean result1 = (x>y) && (x==10);
        boolean result2 = (a>y) || (x<a);
        boolean result3 = (x<y) && (x>b);
        boolean result4 = (x>y) || (y>a);
        boolean result5 = (a>y) && (y==20);
        boolean result6 = (x>=10) && (a==b);
        boolean result7 = (a>x) && (x<=10);

        System.out.println("Result1 : " + result1);
        System.out.println("Result2 : " + result2);
        System.out.println("Result3 : " + result3);
        System.out.println("Result4 : " + result4);
        System.out.println("Result5 : " + result5);
        System.out.println("Result6 : " + result6);
        System.out.println("Result7 : " + result7);


    }
}
