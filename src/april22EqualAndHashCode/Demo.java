package april22EqualAndHashCode;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        boolean result1 = sb1.toString().equals(sb2.toString());
        boolean result2 = sb1.equals(sb2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
