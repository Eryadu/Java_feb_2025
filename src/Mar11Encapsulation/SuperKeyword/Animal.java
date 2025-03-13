package Mar11Encapsulation.SuperKeyword;

public class Animal {
    String sound = "Huu";

    public void Sound()
    {
        System.out.println("Animal Sounds like");
    }
}
 class Cat extends Animal{
    String sound = "Meow";
    public void Sound()
    {
        super.Sound(); // Super keyword is used to call the parent class method if method or variable name is same.
        System.out.println("Sound of cat is Meoww.");
        System.out.println("sound variable of parent class." + super.sound);
        System.out.println("sound variable of child class " + sound);
    }
 }

 class Main extends Animal{
     public static void main(String[] args) {
         Cat cat = new Cat();
         cat.Sound();


     }
 }