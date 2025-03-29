package mar1Array.Blocks;

public class BlockDemo {
    // Constructor -3 (output sequence)
    BlockDemo(){
        System.out.println("Inside the constructor...");
    }

    // static block -1
    static {
        System.out.println("Static Block ");
    }

    // instance block-2
    {
        System.out.println("Instance Block");
    }

    // normal method -4
    public void set(){
        System.out.println("Inside non static method");
    }
    // static method-5
    public static void show(){
        System.out.println("Static Normal Method.");
    }
}
