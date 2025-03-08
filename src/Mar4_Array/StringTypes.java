package Mar4_Array;

public class StringTypes {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Orange";
        String s3 = "Apple";
        String s4 = new String("Apple");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2.equals(s4));
    }
}
