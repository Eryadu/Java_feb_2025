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
        System.out.println("Hello show");
    }

    @Override
    public String display() {
        return "Hello";
    }
}

public class DemoInterfaces{
    public static void main(String[] args) {
        Meth meth = new Meth();
        System.out.println(meth.display());
        meth.show();
        meth.hello();
        Demo.hello1(); // Static method always called with Interface name, we can't create object of static method.
    }
}
