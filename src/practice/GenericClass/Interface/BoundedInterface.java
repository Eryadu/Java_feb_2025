package practice.GenericClass.Interface;


interface Bounded <T extends Number>{
    T show (T num);
}
public class BoundedInterface implements Bounded<Integer> {
    @Override
    public Integer show(Integer num) {
        return num * num;
    }

    public static void main(String[] args) {
        BoundedInterface bound = new BoundedInterface();
        System.out.println(bound.show(5));
    }
}
