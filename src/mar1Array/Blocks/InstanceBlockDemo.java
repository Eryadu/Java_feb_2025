package mar1Array.Blocks;

public class InstanceBlockDemo {
    static int x;

    {
        System.out.println("You are in First Instance Block.");
        x=10;
    }

    {
        System.out.println("You are in second Instance Block.");
        x +=10;
    }

    public static void main(String[] args) {
        InstanceBlockDemo instanceBlockDemo = new InstanceBlockDemo();
        System.out.println("Value of X using Static variable is :" + x);
        System.out.println("Value of X using object refrence is : " + instanceBlockDemo.x);
    }
}
