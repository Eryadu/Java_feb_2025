package practice.enumPractice;
// import java.util.Enumeration;

    enum Size4 {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    class Test{
        Size4 pizzaSize;

        public Test(Size4 pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public void Order(){
            switch (pizzaSize){
                case SMALL:
                    System.out.println("I ordered a small size pizza.");
                    break;
                case MEDIUM:
                    System.out.println("I ordered a medium size pizza.");
                    break;
                default:
                    System.out.println("I don't know which one to order.");
                    break;
            }
        }
    }
public class EnumDemo {

    // printing Enum constants
    public static void main(String[] args) {

        // Declare Enum Variable
        /*Size pizzaSize;
        pizzaSize = Size4.SMALL;
        pizzaSize = Size4.MEDIUM;
        pizzaSize = Size4.LARGE;
        pizzaSize = Size4.EXTRALARGE;*/
        System.out.println(Size4.LARGE);
        //System.out.println("Pizza size is : " + pizzaSize);


        // calling enum method
        Test t = new Test(Size4.LARGE);
        t.Order();

        // use Values method of Enum, return array of all enum constant

        Size4[] enumArray = Size4.values();
            System.out.println(enumArray);

            // Use ValueOf method of Enum return Enum Constant based on String input
        System.out.println(Size4.valueOf("SMALL"));

        // Ordinal method return position of Constant
        System.out.println("Position of Constant : " + Size4.MEDIUM.ordinal());

        // compareTo method return position of Size.MEDIUM - Size.LARGE
        System.out.println(Size4.MEDIUM.compareTo(Size4.LARGE));

    }
}
