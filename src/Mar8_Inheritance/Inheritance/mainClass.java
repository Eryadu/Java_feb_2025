package Mar8_Inheritance.Inheritance;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("----Parent class (Computer)-----");
        Computer computer = new Computer("Dell" ,256, "i7 6th gen");
        //System.out.println(computer);
        computer.computerSpecification();
        System.out.println("     ");


        Laptop laptop = new Laptop();
        laptop.laptopSpecification();
        laptop.brand = "Apple";
        laptop.capacity = 520;
        laptop.specification = "i5 7th gen";
        laptop.computerSpecification();
        System.out.println( "     ");


        Mobile mobile = new Mobile();
        mobile.mobileSpecification();
        mobile.brand = "Samsung";
        mobile.capacity = 1000;
        mobile.specification = "i3 5th gen";
        mobile.computerSpecification();
    }
}
