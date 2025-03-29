package mar1.Blocks;

public class StaticBlockDemo {
    static int x;

    static {
        System.out.println("You are in static block.");
        x=10;
    }

    {
        System.out.println("You are in Instance block");
    }
    public StaticBlockDemo() {
        System.out.println("You are in Constructor.");
    }

    public static void main(String[] args) {

       /* StaticBlockDemo staticBlockDemo = new StaticBlockDemo(); // Static method call after static block before
                                                                      anything else executed i.e. instance block, const.
        System.out.println("Value of x is :" + x);*/

        System.out.println("Value of x is :" + x);
        StaticBlockDemo staticBlockDemo = new StaticBlockDemo();
    }
}
