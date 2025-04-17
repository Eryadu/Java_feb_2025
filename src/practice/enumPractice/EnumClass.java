package practice.enumPractice;

// Enum class with method
enum Size1 {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize(){
        switch (this){
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extra large";

            default:
                return null;
        }
    }
}
public class EnumClass {
    public static void main(String[] args) {
        // call getSize()
        System.out.println(Size1.MEDIUM.getSize());


    }

}
