package practice.enumPractice;

/*enum Size4{

    // enum constants calling the enum constructors
    SMALL("This is Small"), MEDIUM, LARGE, EXTRALARGE;


    private final Size4 pizzaSize;

    // private enum constructor
    private Size4(Size4 pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public Size4 getPizzaSize() {
        return pizzaSize;
    }
}*/

enum Size {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}


public class EnumConstructor {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.getSize());
    }
}
