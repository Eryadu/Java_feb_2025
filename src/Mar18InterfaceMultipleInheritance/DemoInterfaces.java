package Mar18InterfaceMultipleInheritance;
interface Demo {
    void show();
    String display();

    default void hello(){
        System.out.println("Hello Default Method");
    }
    static void hello1(){
        System.out.println("Hello Static Method");
    }

}
class Meth implements Demo{
    @Override
    public void show() {
        System.out.println("Meth Class");
    }

    @Override
    public String display() {
        return "Meth";
    }
}
class Meth2 extends Meth{
    @Override
    public void show() {
        System.out.println("Meth2 Class");
        super.show();
    }

    @Override
    public String display() {
        super.display();
        return "Meth2";

    }
}

public class DemoInterfaces{
    public static void main(String[] args) {
        Meth meth = new Meth2();
        System.out.println(meth.display());
        meth.show();
        meth.hello();

        Demo.hello1(); // Static method always called with Interface name, we can't create object of static method.
    }
}
