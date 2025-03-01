package Mar1;

public class ProductDemo {

    int x =10;

    public ProductDemo() {
        System.out.println(x);
        x++;
    }

    public static void main(String[] args) {
        new ProductDemo(); // everytime its initialize new memory. Its give same output x=10;
        new ProductDemo();
        new ProductDemo();
    }
}
