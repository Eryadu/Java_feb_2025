package Mar1.Blocks;

public class BlockMain {
    public static void main(String[] args) {


        // new BlockDemo(); --// Anonymous object, when created without refrence.
        BlockDemo blockDemo = new BlockDemo();
        blockDemo.set();
        BlockDemo.show();
    }
}
