package practice.GenericClass.Interface;

public class InterfaceMain implements GenericInterface <String> {
    @Override
    public void show(String name) {
        System.out.println(name);
    }

    @Override
    public String display(String n) {
        return n;
    }

    public static void main(String[] args) {
        InterfaceMain inte = new InterfaceMain();
        inte.show("ABC");
        System.out.println(inte.display("Hello"));
    }
}
