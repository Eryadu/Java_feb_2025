package Mar8_Inheritance;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("----- String--------");
        String s1 = "Pragra";
        System.out.println(s1);
        String s2 = s1.concat("Corporation");
        System.out.println(s1); // Strings are immutables
        System.out.println(s2); // it creates new object

        System.out.println(" -------- String Buffer ------");
        StringBuffer sb = new StringBuffer("Pragra");
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuffer sb2 = sb.append("Corporation");
        System.out.println(sb); // StringBuffer are mutable
        System.out.println(sb2); // it refers to same object sb.
        System.out.println(sb.length());
        System.out.println(sb2.length());

        System.out.println(" -------- String Builder------");
        StringBuilder sb1 = new StringBuilder("Pragra");
        System.out.println(sb);
        System.out.println(sb1.length());
        StringBuilder sb3 = sb1.append("Corporation");
        System.out.println(sb1); // StringBuilder are mutable
        System.out.println(sb3); // it refers to same object sb.
        System.out.println(sb1.length());
        System.out.println(sb3.length());


    }
}

