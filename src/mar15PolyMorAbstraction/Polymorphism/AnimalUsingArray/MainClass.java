package mar15PolyMorAbstraction.Polymorphism.AnimalUsingArray;

public class MainClass {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];

        animal[0] = new Dog();
        animal[1] = new Cat();

        for (int i =0 ; i < 2 ; i++)
        {
            System.out.println("Animal Type is " + animal[i].Type());
        }
    }
}
