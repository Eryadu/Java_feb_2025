package studyMaterial.String.stringBuilder;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        boolean result1 = sb1.toString().equals(sb2.toString());
        boolean result2 = sb1.equals(sb2);

        System.out.println(result1);
        System.out.println(result2);

        String s = "Yad";
        System.out.println(s.length()); // length() is property of String class

       String[] s1 = {"a","b","c"};
        System.out.println(s1.length); // length is property of Array class

        StringBuffer sb3 = new StringBuffer();
        System.out.println("Origibnal capacity :" + sb3.capacity()); //16
        sb3.append("abcdefghijklmnop"); //16
        System.out.println("capacity : " + sb3.capacity());
        sb3.append("qqq");
        System.out.println("New Capacity : " + sb3.capacity()); //34

        StringBuffer sb4 = new StringBuffer(s);
        System.out.println("Origibnal capacity sb4 :" + sb4.capacity()); //s.length() +16 -- 3+16=19


    }
}
