package practice;

import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str); // create string builder to make string mutable.
        sb.reverse();

        String rev = sb.toString(); // convert back to immutable string.
        System.out.println(rev);

        if (str.equals(rev))
        {
            System.out.println("Palindrome String");
        }
        else
            System.out.println("Not a Palindrome String");
    }
}
