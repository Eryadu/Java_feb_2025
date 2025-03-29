package mar1;

public class ProductDemo {

    /*int x =10;

    public ProductDemo() {
        System.out.println(x);
        x++;
    }

    public static void main(String[] args) {
        new ProductDemo(); // everytime its initialize new memory. Its give same output x=10;
        new ProductDemo();
        new ProductDemo();
    }*/
    static int x =10;

    public ProductDemo() {
        System.out.println(x);
        x++;
    }

    public static void main(String[] args) {
        new ProductDemo(); // in case of static variable it shares the same memory. Its give diff output x=10;
        new ProductDemo();
        new ProductDemo();
    }
}
