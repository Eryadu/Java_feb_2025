package Mar8.Inheritance;

public class Computer {
    String brand ;
    String specification;
    int capacity;

    public Computer() {
    }

    public Computer(String brand, int capacity, String specification) {
        this.brand = brand;
        this.capacity = capacity;
        this.specification = specification;
    }

    public void computerSpecification()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Specification : " + specification );
        System.out.println("Capacity : " + capacity);
    }

    @Override
    public String toString() {
        return "Computer Specification is : " +
                "brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                ", capacity=" + capacity;
    }
}
