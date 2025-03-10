package Mar8_Inheritance.Inheritance;

public class InstanceOf {
    public static void main(String[] args) {
        Sedan sed = new Sedan();
        Suv su = new Suv();
        Luxury lux = new Luxury();

        System.out.println(sed instanceof Car);
        System.out.println(su instanceof Car);
        System.out.println(lux instanceof Sedan);
        System.out.println(lux instanceof Car);
    }

}
class Car{
}
class Sedan extends Car{
}
class Suv extends Sedan{
}
class Luxury extends Suv{
}
