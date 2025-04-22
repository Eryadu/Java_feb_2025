package assignment.OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("LION : ");
        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();
        System.out.println();

        System.out.println("MONKEY : ");
        Monkey monkey = new Monkey();
        monkey.climb();
        monkey.feed();
        monkey.makeSound();
        System.out.println();

        System.out.println("Penguin");
        Penguin penguin = new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();
    }
}
