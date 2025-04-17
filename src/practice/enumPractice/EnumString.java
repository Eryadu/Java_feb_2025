package practice.enumPractice;


/*enum Size2 {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}*/

enum Size2 {

    // modify toString default value
    SMALL{
        @Override
        public String toString() {
            return "This is SMALL Constant";
        }
    }

    , MEDIUM{
        @Override
        public String toString() {
            return "This is MEDIUM Constant";
        }
    }, LARGE, EXTRALARGE
}
public class EnumString {
    public static void main(String[] args) {
        System.out.println("string value of SMALL is " +Size2.SMALL.toString());
        System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());
    }
}
