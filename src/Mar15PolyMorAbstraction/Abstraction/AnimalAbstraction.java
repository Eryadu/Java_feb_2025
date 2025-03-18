package Mar15PolyMorAbstraction.Abstraction;

public abstract class AnimalAbstraction {
    String AnimalName;
    public abstract void animalSound();
    public abstract void animalFood();
    public void eat()
    {
        System.out.println("Animal eating time : ");
    }
    public  void sleep()
    {
        System.out.println("Animal Sleeping time :");
    }
}
class Dog extends AnimalAbstraction{
    @Override
    public void animalSound() {
        System.out.println("Bark");
    }

    @Override
    public void animalFood() {
        System.out.println("NonVeg");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eating time is 10s.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleeping time is 1 hour.");
    }
}

class Main{
    public static void main(String[] args) {
        AnimalAbstraction animal = new Dog();
        animal.animalFood();
        animal.animalSound();
        animal.eat();
        animal.sleep();
    }
}