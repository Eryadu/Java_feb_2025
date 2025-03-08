package Mar8.Inheritance;

public class main {
    public static void main(String[] args) {
        System.out.println("----Parent class (Computer)-----");
        Computer computer = new Computer("Dell" ,256, "i7 6th gen");
        //System.out.println(computer);
        computer.computerSpecification();
        System.out.println("     ");

        System.out.println("-----Child Class (Laptop) from Computer-----");
        Laptop laptop = new Laptop();
        laptop.brand = "Apple";
        laptop.capacity = 520;
        laptop.specification = "i5 7th gen";
        laptop.computerSpecification();
        System.out.println( "     ");

        System.out.println("----Child Class (Mobile) from Laptop -----");
        Mobile mobile = new Mobile();
        mobile.brand = "Samsung";
        mobile.capacity = 1000;
        mobile.specification = "i3 5th gen";
        mobile.computerSpecification();
    }
}
