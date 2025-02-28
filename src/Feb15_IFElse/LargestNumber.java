package Feb15_IFElse;

public class LargestNumber {
    public static void main(String[] args) {
        int x = 50;
        int y = 20;
        int z = 60;

        if(x > y && x >z) {
            System.out.println("X is Largest Number.");
        }
        else if (y > z) {
            System.out.println("Y is Largest Number");
        }
        else
            System.out.println("Z is Largest Number");
    }
}
