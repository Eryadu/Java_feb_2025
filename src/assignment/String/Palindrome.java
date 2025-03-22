package assignment.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check Palindrome : ");
        String str = sc.next();
        int len = str.length();
        for(int i =0 ; i< len ; i++)
        {
            if(str.charAt(i)== str.charAt(len-1))
            {
                len --;
            }
            else
            {
                System.out.println("No Palindrome.");
                System.exit(0);
            }
        }  System.out.println("String is Palindrome.");


    }
}
