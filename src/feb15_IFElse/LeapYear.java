package feb15_IFElse;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean result = year % 4 == 0;
        if (result) {
            System.out.println("This is Leap Year.");
        }
        else {
            System.out.println("This is not Leap Year");
        }
    }
}
