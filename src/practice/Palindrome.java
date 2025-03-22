package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check Palindrome");
        String A = sc.next();
        int len = A.length();
        for( int i =0;i< len ; i++)
        {
            if (A.charAt(i)==A.charAt(len-1)) {
                len--;
                continue;
            }
            else
                System.out.println("No Palindrome");
                System.exit(0);
        }
    System.out.println("Palindrome");
    }
}
