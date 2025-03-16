package Mar15PolyMorAbstraction.Polymorphism;

public class MainCLass {
    public static void main(String[] args) {
        Shape sh = new Rectangle();
        System.out.println(sh.perimeter); // access variable of parent class only
        System.out.println("Area of Rectangle is : " + sh.area());

    }
}