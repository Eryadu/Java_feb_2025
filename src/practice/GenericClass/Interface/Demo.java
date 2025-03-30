package practice.GenericClass.Interface;


interface  Test <T> {
     String show (T other);
}
public class Demo implements Test<Demo> {
    public String id;

    public Demo(String id) {
        this.id = id;
    }

    @Override
    public String show(Demo other) {
        return this.id + other.id;
    }

    public static void main(String[] args) {
        Demo d = new Demo("A");
        Demo d1 = new Demo("B");
        System.out.println(d.show(d1));
    }
}
