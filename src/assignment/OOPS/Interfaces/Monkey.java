package assignment.OOPS.Interfaces;

public class Monkey implements Animal, Climbable{
    @Override
    public void feed() {
        System.out.println("Monkey eat plants");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey make ch-ch-ch-ch");
    }

    @Override
    public void climb() {
        System.out.println("Monkey can climb on heights");
    }
}
