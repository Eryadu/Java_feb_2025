package assignment.OOPS.Interfaces;

public class Penguin implements Animal, Swimmable {
    @Override
    public void feed() {
        System.out.println("Penguin Eat sea food");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin make sounds like Haaaank! Haaaank!");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can Swim");
    }
}
