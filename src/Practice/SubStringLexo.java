package Practice;

public class SubStringLexo {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";
        System.out.println(A.length()+B.length()); // to print the length
        String A1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A1 + " " + B1); // to print first letter capital
        if (A.compareTo(B)>0) // compare lexicographically
        {
            System.out.println("Yes ");
        }
        else
            System.out.println("No");

    }

}
