package Mar18InterfaceMultipleInheritance;

public abstract class DemiAbstract {
    abstract void show();
    private int x=10;

    public DemiAbstract() {
    }
}
abstract class Demo1 extends DemiAbstract{

}

abstract class Demo2 extends Demo1{

}