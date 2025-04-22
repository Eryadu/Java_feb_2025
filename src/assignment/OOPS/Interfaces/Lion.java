package assignment.OOPS.Interfaces;

public class Lion implements Animal{
    @Override
    public void feed() {
        System.out.println("Lion is carnivores");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion make Roaring sound");
    }
}
